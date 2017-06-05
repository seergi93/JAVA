/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergi
 */
public class Division {

    private String name;
    List<Team> teams;

    public Division() {
        this.teams = new ArrayList<>();

    }

    public Division(String name) {
        this.teams = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
