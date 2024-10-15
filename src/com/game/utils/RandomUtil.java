package com.game.utils;

import java.util.Random;

public class RandomUtil {
    private static final Random random = new Random();

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int getRandomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static boolean shouldSpawn(int probability) {
        return getRandomInt(100) < probability;
    }
}