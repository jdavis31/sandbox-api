package com.judell.constants;

public class RouteConstants {
    private final static String[] SECURED_ROUTES = {};

    private final static String[] PUBLIC_ROUTES = {};

    public final static String HEALTH = EnvironmentConstants.BASE_URL + "/health";

    public static String[] getPublicRoutes() {
        return PUBLIC_ROUTES;
    }

    public static String[] getSecuredRoutes() {
        return SECURED_ROUTES;
    }
}
