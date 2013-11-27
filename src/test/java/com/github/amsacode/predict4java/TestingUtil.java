package com.github.amsacode.predict4java;

public class TestingUtil {

    public static boolean eq(Position position, double lat, double lon, double precision) {
        return Math.abs(position.getLat() - lat) <= precision
                && Math.abs(position.getLon() - lon) <= precision;
    }

}
