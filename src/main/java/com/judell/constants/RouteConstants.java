package com.judell.constants;

import lombok.Getter;

@Getter
public class RouteConstants {
    private final static String[] SECURED_ROUTES = {};

    private final static String[] PUBLIC_ROUTES = {};

    public final static String HEALTH = EnvironmentConstants.BASE_URL + "/health";
}
