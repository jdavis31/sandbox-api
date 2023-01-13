pipeline {
    agent any
    options {
        copyArtifactPermission('spring-sandbox-api')
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
        stage ('Deploy') {
            steps {
                archiveArtifacts artifacts: 'build/libs/*', fingerprint: true, followSymlinks: false
                copyArtifacts filter: 'build/libs/*',
                        fingerprintArtifacts: true,
                        flatten: true,
                        projectName: 'spring-sandbox-api',
                        selector: workspace(),
                        target: '/opt/api/spring/sandbox'
                sh 'sudo service spring-sandbox-api restart'
            }
        }
    }
}