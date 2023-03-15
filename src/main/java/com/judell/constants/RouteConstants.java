package com.judell.constants;

public class RouteConstants {
    private final static String[] SECURED_ROUTES = {};

    private final static String[] PUBLIC_ROUTES = {
            RouteConstants.ADD_USER
    };

    public final static String HEALTH = EnvironmentConstants.BASE_URL + "/health";
    public final static String ADD_USER = EnvironmentConstants.BASE_URL + "/add-user";

    public static String[] getPublicRoutes() {
        return PUBLIC_ROUTES;
    }

    public static String[] getSecuredRoutes() {
        return SECURED_ROUTES;
    }
}
