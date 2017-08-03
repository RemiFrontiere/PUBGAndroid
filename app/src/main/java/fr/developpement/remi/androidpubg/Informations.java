package fr.developpement.remi.androidpubg;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by REMI on 02/08/2017.
 */

public class Informations {

    private Integer platformId;
    private String accountId;
    private String avatar;
    private String selectedRegion;
    private String defaultSeason;
    private String seasonDisplay;
    private String lastUpdated;
    private String playerName;
    private Integer pubgTrackerId;
    private ArrayList<Type> mesTypesDeClassement; // Duo, Solo, Squad

    public Informations(Integer platformId, String accountId, String avatar, String selectedRegion,
                        String defaultSeason, String seasonDisplay, String lastUpdated, String playerName, Integer pubgTrackerId){
        this.setPlatformId(platformId);
        this.setAccountId(accountId);
        this.setAvatar(avatar);
        this.setSelectedRegion(selectedRegion);
        this.setDefaultSeason(defaultSeason);
        this.setSeasonDisplay(seasonDisplay);
        this.setLastUpdated(lastUpdated);
        this.setPlayerName(playerName);
        this.setPubgTrackerId(pubgTrackerId);
    }




    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSelectedRegion() {
        return selectedRegion;
    }

    public void setSelectedRegion(String selectedRegion) {
        this.selectedRegion = selectedRegion;
    }

    public String getDefaultSeason() {
        return defaultSeason;
    }

    public void setDefaultSeason(String defaultSeason) {
        this.defaultSeason = defaultSeason;
    }

    public String getSeasonDisplay() {
        return seasonDisplay;
    }

    public void setSeasonDisplay(String seasonDisplay) {
        this.seasonDisplay = seasonDisplay;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPubgTrackerId() {
        return pubgTrackerId;
    }

    public void setPubgTrackerId(Integer pubgTrackerId) {
        this.pubgTrackerId = pubgTrackerId;
    }

    public ArrayList<Type> getMesTypesDeClassement() {
        return mesTypesDeClassement;
    }

    public void setMesTypesDeClassement(ArrayList<Type> mesTypesDeClassement) {
        this.mesTypesDeClassement = mesTypesDeClassement;
    }
}
