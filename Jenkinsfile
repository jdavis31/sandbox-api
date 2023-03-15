pipeline {
    agent any
    options {
        copyArtifactPermission('sandbox-api')
    }
    tools {
        gradle 'GRADLE_HOME'
    }
    stages {
        stage ('Build') {
            steps {
                script {
                    sh 'gradle clean build --info'
                }
            }
        }
        stage ('Test') {
            steps {
                script {
                    sh 'gradle test'
                }
            }
        }
        stage ('Deploy') {
            steps {
                archiveArtifacts artifacts: 'build/libs/*', fingerprint: true, followSymlinks: false
                copyArtifacts filter: 'build/libs/*',
                        fingerprintArtifacts: true,
                        flatten: true,
                        projectName: 'sandbox-api',
                        selector: workspace(),
                        target: '/opt/ec2-user/api/sandbox'
                sh 'sudo service spring-sandbox-api restart'
            }
        }
    }
}