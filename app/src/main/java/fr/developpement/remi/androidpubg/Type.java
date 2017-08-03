package fr.developpement.remi.androidpubg;

import java.util.ArrayList;

/**
 * Created by REMI on 01/08/2017.
 */

public class Type {

    private String laRegion;
    private String laSeason;
    private String leType;
    private ArrayList<Stat> mesStats;

    public Type(String laRegion, String laSeason, String leType){
        this.setLaRegion(laRegion);
        this.setLaSeason(laSeason);
        this.setLeType(leType);
    }

    public String getLaRegion() {
        return laRegion;
    }

    public void setLaRegion(String laRegion) {
        this.laRegion = laRegion;
    }

    public String getLaSeason() {
        return laSeason;
    }

    public void setLaSeason(String laSeason) {
        this.laSeason = laSeason;
    }

    public String getLeType() {
        return leType;
    }

    public void setLeType(String leType) {
        this.leType = leType;
    }

    public ArrayList<Stat> getMesStats() {
        return mesStats;
    }

    public void setMesStats(ArrayList<Stat> mesStats) {
        this.mesStats = mesStats;
    }
}


class Stat{

    private String killDeathRatio;
    private String winRatio; // en %
    private String timeSurvived; // en min
    private String roundsPlayed;
    private String wins;
    private String moveDistancePg;
    private String timeSurvivedPg; // en min
    private String kills;
    private String assists;
    private String headshotKills;
    private String vehicleDestroys;
    private String roadKills;
    private String mostKills;
    private String killStreaks;
    private String longestTimeSurvived; // en min
    private String avgSurvivalTime; // en min
    private String winRating;
    private String walkDistance;
    private String rideDistance;
    private String totalDistanceTravalled;
    private String longestKill;
    private String totalHeals;
    private String totalRevives;
    private String totalBoosts;
    private String damageDealt;
    private String dBNOs;

    public Stat (String killDeathRatio,
                 String winRatio,
                 String timeSurvived,
                 String roundsPlayed,
                 String wins,
                 String moveDistancePg,
                 String timeSurvivedPg,
                 String kills,
                 String assists,
                 String headshotKills,
                 String vehicleDestroys,
                 String roadKills,
                 String mostKills,
                 String killStreaks,
                 String longestTimeSurvived,
                 String avgSurvivalTime,
                 String winRating,
                 String walkDistance,
                 String rideDistance,
                 String totalDistanceTravalled,
                 String longestKill,
                 String totalHeals,
                 String totalRevives,
                 String totalBoosts,
                 String damageDealt,
                 String dBNOs){


        this.setKillDeathRatio(killDeathRatio);
        this.setWinRatio(winRatio); // en %
        this.setTimeSurvived(timeSurvived); // en min
        this.setRoundsPlayed(roundsPlayed);
        this.setWins(wins);
        this.setMoveDistancePg(moveDistancePg);
        this.setTimeSurvivedPg(timeSurvivedPg); // en min
        this.setKills(kills);
        this.setAssists(assists);
        this.setHeadshotKills(headshotKills);
        this.setVehicleDestroys(vehicleDestroys);
        this.setRoadKills(roadKills);
        this.setMostKills(mostKills);
        this.setKillStreaks(killStreaks);
        this.setLongestTimeSurvived(longestTimeSurvived); // en min
        this.setAvgSurvivalTime(avgSurvivalTime); // en min
        this.setWinRating(winRating);
        this.setWalkDistance(walkDistance);
        this.setRideDistance(rideDistance);
        this.setTotalDistanceTravalled(totalDistanceTravalled);
        this.setLongestKill(longestKill);
        this.setTotalHeals(totalHeals);
        this.setTotalRevives(totalRevives);
        this.setTotalBoosts(totalBoosts);
        this.setDamageDealt(damageDealt);
        this.setdBNOs(dBNOs);
    }

    public String getKillDeathRatio() {
        return killDeathRatio;
    }

    public void setKillDeathRatio(String killDeathRatio) {
        this.killDeathRatio = killDeathRatio;
    }

    public String getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(String winRatio) {
        this.winRatio = winRatio;
    }

    public String getTimeSurvived() {
        return timeSurvived;
    }

    public void setTimeSurvived(String timeSurvived) {
        this.timeSurvived = timeSurvived;
    }

    public String getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(String roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getMoveDistancePg() {
        return moveDistancePg;
    }

    public void setMoveDistancePg(String moveDistancePg) {
        this.moveDistancePg = moveDistancePg;
    }

    public String getTimeSurvivedPg() {
        return timeSurvivedPg;
    }

    public void setTimeSurvivedPg(String timeSurvivedPg) {
        this.timeSurvivedPg = timeSurvivedPg;
    }

    public String getKills() {
        return kills;
    }

    public void setKills(String kills) {
        this.kills = kills;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getHeadshotKills() {
        return headshotKills;
    }

    public void setHeadshotKills(String headshotKills) {
        this.headshotKills = headshotKills;
    }

    public String getVehicleDestroys() {
        return vehicleDestroys;
    }

    public void setVehicleDestroys(String vehicleDestroys) {
        this.vehicleDestroys = vehicleDestroys;
    }

    public String getRoadKills() {
        return roadKills;
    }

    public void setRoadKills(String roadKills) {
        this.roadKills = roadKills;
    }

    public String getMostKills() {
        return mostKills;
    }

    public void setMostKills(String mostKills) {
        this.mostKills = mostKills;
    }

    public String getKillStreaks() {
        return killStreaks;
    }

    public void setKillStreaks(String killStreaks) {
        this.killStreaks = killStreaks;
    }

    public String getLongestTimeSurvived() {
        return longestTimeSurvived;
    }

    public void setLongestTimeSurvived(String longestTimeSurvived) {
        this.longestTimeSurvived = longestTimeSurvived;
    }

    public String getAvgSurvivalTime() {
        return avgSurvivalTime;
    }

    public void setAvgSurvivalTime(String avgSurvivalTime) {
        this.avgSurvivalTime = avgSurvivalTime;
    }

    public String getWinRating() {
        return winRating;
    }

    public void setWinRating(String winRating) {
        this.winRating = winRating;
    }

    public String getWalkDistance() {
        return walkDistance;
    }

    public void setWalkDistance(String walkDistance) {
        this.walkDistance = walkDistance;
    }

    public String getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(String rideDistance) {
        this.rideDistance = rideDistance;
    }

    public String getTotalDistanceTravalled() {
        return totalDistanceTravalled;
    }

    public void setTotalDistanceTravalled(String totalDistanceTravalled) {
        this.totalDistanceTravalled = totalDistanceTravalled;
    }

    public String getLongestKill() {
        return longestKill;
    }

    public void setLongestKill(String longestKill) {
        this.longestKill = longestKill;
    }

    public String getTotalHeals() {
        return totalHeals;
    }

    public void setTotalHeals(String totalHeals) {
        this.totalHeals = totalHeals;
    }

    public String getTotalRevives() {
        return totalRevives;
    }

    public void setTotalRevives(String totalRevives) {
        this.totalRevives = totalRevives;
    }

    public String getTotalBoosts() {
        return totalBoosts;
    }

    public void setTotalBoosts(String totalBoosts) {
        this.totalBoosts = totalBoosts;
    }

    public String getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(String damageDealt) {
        this.damageDealt = damageDealt;
    }

    public String getdBNOs() {
        return dBNOs;
    }

    public void setdBNOs(String dBNOs) {
        this.dBNOs = dBNOs;
    }
}

