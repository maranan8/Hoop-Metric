package com.nba.hoop_metrics.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="player_stats")
public class Player {
    @Column(name = "\"Rk\"")
    private Integer rank;

    @Id
    @Column(name = "\"Player\"", unique = true)
    private String name;

    @Column(name = "\"Age\"")
    private Integer age;

    @Column(name = "\"Team\"")
    private String team;

    @Column(name = "\"Pos\"")
    private String position;


    @Column(name = "\"G\"")
    private Integer games_played;

    @Column(name = "\"GS\"")
    private Integer games_start;

    @Column(name = "\"MP\"")
    private Integer min_played;

    @Column(name = "\"FG\"")
    private Integer field_goals;

    @Column(name = "\"FGA\"")
    private Integer field_goal_attempts;

    @Column(name = "\"FG%\"")
    private Double field_goal_percent;

    @Column(name = "\"3P\"")
    private Integer three_point;

    @Column(name = "\"3PA\"")
    private Integer three_point_attempts;

    @Column(name = "\"3P%\"")
    private Double three_point_percent;

    @Column(name = "\"2P\"")
    private Integer two_point;

    @Column(name = "\"2PA\"")
    private Integer two_point_attempts;

    @Column(name = "\"2P%\"")
    private Double two_point_percent;

    @Column(name = "\"FT\"")
    private Integer free_throw;

    @Column(name = "\"FTA\"")
    private Integer free_throw_attempts;

    @Column(name = "\"FT%\"")
    private Double free_throw_percent;

    @Column(name = "\"ORB\"")
    private Integer o_rebound;

    @Column(name = "\"DRB\"")
    private Integer d_rebound;

    @Column(name = "\"TRB\"")
    private Integer t_rebound;

    @Column(name = "\"AST\"")
    private Integer assists;

    @Column(name = "\"STL\"")
    private Integer steals;

    @Column(name = "\"BLK\"")
    private Integer blocks;

    @Column(name = "\"TOV\"")
    private Integer turnovers;

    @Column(name = "\"PF\"")
    private Integer personal_fouls;

    @Column(name = "\"PTS\"")
    private Integer points;

    @Column(name = "\"Trp-Dbl\"")
    private Integer triple_doubles;

    public Player() {
    }

    public Player(Integer rank, String name, Integer age, String team, String position, Integer games_played, Integer games_start, Integer min_played, Integer field_goals, Integer field_goal_attempts, Integer three_point, Integer three_point_attempts, Double three_point_percent, Integer two_point, Integer two_point_attempts, Double two_point_percent, Integer free_throw, Integer free_throw_attempts, Double free_throw_percent, Integer o_rebound, Integer d_rebound, Integer t_rebound, Integer assists, Integer steals, Integer blocks, Integer turnovers, Integer personal_fouls, Integer points, Integer triple_doubles, Double field_goal_percent) {
        this.rank = rank;
        this.name = name;
        this.age = age;
        this.team = team;
        this.position = position;
        this.games_played = games_played;
        this.games_start = games_start;
        this.min_played = min_played;
        this.field_goals = field_goals;
        this.field_goal_attempts = field_goal_attempts;
        this.three_point = three_point;
        this.three_point_attempts = three_point_attempts;
        this.three_point_percent = three_point_percent;
        this.two_point = two_point;
        this.two_point_attempts = two_point_attempts;
        this.two_point_percent = two_point_percent;
        this.free_throw = free_throw;
        this.free_throw_attempts = free_throw_attempts;
        this.free_throw_percent = free_throw_percent;
        this.o_rebound = o_rebound;
        this.d_rebound = d_rebound;
        this.t_rebound = t_rebound;
        this.assists = assists;
        this.steals = steals;
        this.blocks = blocks;
        this.turnovers = turnovers;
        this.personal_fouls = personal_fouls;
        this.points = points;
        this.triple_doubles = triple_doubles;
        this.field_goal_percent = field_goal_percent;
    }

    public Player(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getGames_start() {
        return games_start;
    }

    public void setGames_start(Integer games_start) {
        this.games_start = games_start;
    }

    public Integer getMin_played() {
        return min_played;
    }

    public void setMin_played(Integer min_played) {
        this.min_played = min_played;
    }

    public Integer getField_goals() {
        return field_goals;
    }

    public void setField_goals(Integer field_goals) {
        this.field_goals = field_goals;
    }

    public Integer getField_goal_attempts() {
        return field_goal_attempts;
    }

    public void setField_goal_attempts(Integer field_goal_attempts) {
        this.field_goal_attempts = field_goal_attempts;
    }

    public Integer getThree_point() {
        return three_point;
    }

    public void setThree_point(Integer three_point) {
        this.three_point = three_point;
    }

    public Integer getThree_point_attempts() {
        return three_point_attempts;
    }

    public void setThree_point_attempts(Integer three_point_attempts) {
        this.three_point_attempts = three_point_attempts;
    }

    public Double getThree_point_percent() {
        return three_point_percent;
    }

    public void setThree_point_percent(Double three_point_percent) {
        this.three_point_percent = three_point_percent;
    }

    public Integer getTwo_point() {
        return two_point;
    }

    public void setTwo_point(Integer two_point) {
        this.two_point = two_point;
    }

    public Integer getTwo_point_attempts() {
        return two_point_attempts;
    }

    public void setTwo_point_attempts(Integer two_point_attempts) {
        this.two_point_attempts = two_point_attempts;
    }

    public Double getTwo_point_percent() {
        return two_point_percent;
    }

    public void setTwo_point_percent(Double two_point_percent) {
        this.two_point_percent = two_point_percent;
    }

    public Integer getFree_throw() {
        return free_throw;
    }

    public void setFree_throw(Integer free_throw) {
        this.free_throw = free_throw;
    }

    public Integer getFree_throw_attempts() {
        return free_throw_attempts;
    }

    public void setFree_throw_attempts(Integer free_throw_attempts) {
        this.free_throw_attempts = free_throw_attempts;
    }

    public Double getFree_throw_percent() {
        return free_throw_percent;
    }

    public void setFree_throw_percent(Double free_throw_percent) {
        this.free_throw_percent = free_throw_percent;
    }

    public Integer getO_rebound() {
        return o_rebound;
    }

    public void setO_rebound(Integer o_rebound) {
        this.o_rebound = o_rebound;
    }

    public Integer getD_rebound() {
        return d_rebound;
    }

    public void setD_rebound(Integer d_rebound) {
        this.d_rebound = d_rebound;
    }

    public Integer getT_rebound() {
        return t_rebound;
    }

    public void setT_rebound(Integer t_rebound) {
        this.t_rebound = t_rebound;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    public Integer getPersonal_fouls() {
        return personal_fouls;
    }

    public void setPersonal_fouls(Integer personal_fouls) {
        this.personal_fouls = personal_fouls;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getTriple_doubles() {
        return triple_doubles;
    }

    public void setTriple_doubles(Integer triple_doubles) {
        this.triple_doubles = triple_doubles;
    }

    public Double getField_goal_percent() {
        return field_goal_percent;
    }

    public void setField_goal_percent(Double field_goal_percent) {
        this.field_goal_percent = field_goal_percent;
    }
}
