package com.microsoft.demo;

public class Player {

    private final String name;
    private final String position;
    private final double battingAverage;

    public Player(String name, String position, double battingAverage) {
        this.name = name;
        this.position = position;
        this.battingAverage = battingAverage;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public double getBattingAverage() {
        return this.battingAverage;
    }
}