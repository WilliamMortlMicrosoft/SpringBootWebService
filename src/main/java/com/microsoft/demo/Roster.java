package com.microsoft.demo;

public class Roster {

    private final String city;
    private final String nickname;
    private final Player[] roster;

    public Roster(String city, String nickname, Player[] roster) {
        this.city = city;
        this.nickname = nickname;
        this.roster = roster;
    }

    public String getCity() {
        return this.city;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Player[] getRoster() {
        return this.roster;
    }
}