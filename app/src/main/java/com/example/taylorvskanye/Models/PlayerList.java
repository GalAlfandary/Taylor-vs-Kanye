package com.example.taylorvskanye.Models;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PlayerList {
    private String name;
    private ArrayList<Player> players;

    public PlayerList() {
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public PlayerList setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public PlayerList addPlayer(Player player) {
        this.players.add(player);
        return this;
    }

    @NonNull
    @Override
    public String toString() {
        return "PlayerList{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
