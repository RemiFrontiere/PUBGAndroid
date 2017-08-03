package fr.developpement.remi.androidpubg;

import android.os.AsyncTask;
import android.widget.TextView;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

import fr.developpement.remi.androidpubg.ResultatGet;

/**
 * Created by REMI on 01/08/2017.
 */

public class RequestContentTask extends AsyncTask<String, Void, String> {

    public static TextView montext;

    @Override
    protected String doInBackground(String... url) {

        HttpClient httpclient = new DefaultHttpClient();
        String result = null;
        HttpGet getHttp = new HttpGet(url[0]);
        HttpResponse response = null;
        InputStream inStream = null;

        getHttp.setHeader("TRN-API-KEY", "a16c7c6c-bdbe-4996-a4ad-8206f380dadd");

        try {

            response = httpclient.execute(getHttp);
            HttpEntity entity = response.getEntity();
            if (entity !=null){
                inStream = entity.getContent();
                result = ResultatGet.convetStreamToString(inStream);
            }
        } catch (Exception e) {
            result = null;
        }
        return result;
    }

    @Override
    protected void onPostExecute(String s) {

        try {
            if (s != null) {
                JSONObject json = new JSONObject(s);
                Informations informations = new Informations(
                        json.getInt("platformId"),
                        json.getString("AccountId"),
                        json.getString("Avatar"),
                        json.getString("selectedRegion"),
                        json.getString("defaultSeason"),
                        json.getString("seasonDisplay"),
                        json.getString("LastUpdated"),
                        json.getString("PlayerName"),
                        json.getInt("PubgTrackerId"));



                JSONArray type = json.getJSONArray("Stats");
                ArrayList<Type> mesTypes = new ArrayList<>();
                Type monType;

                for(int i = 0; i < type.length(); i++){

                            monType = new Type(
                                    type.getJSONObject(i).getString("Region"),
                                    type.getJSONObject(i).getString("Season"),
                                    type.getJSONObject(i).getString("Match")
                            );

                    JSONArray stat = type.getJSONObject(i).getJSONArray("Stats");
                    ArrayList<Stat> mesStats = new ArrayList<>();


                        mesStats.add(new Stat(
                                stat.getJSONObject(0).getString("displayValue"),
                                stat.getJSONObject(1).getString("displayValue"),
                                stat.getJSONObject(2).getString("displayValue"),
                                stat.getJSONObject(3).getString("displayValue"),
                                stat.getJSONObject(4).getString("displayValue"),
                                stat.getJSONObject(15).getString("displayValue"),
                                stat.getJSONObject(19).getString("displayValue"),
                                stat.getJSONObject(21).getString("displayValue"),
                                stat.getJSONObject(22).getString("displayValue"),
                                stat.getJSONObject(25).getString("displayValue"),
                                stat.getJSONObject(27).getString("displayValue"),
                                stat.getJSONObject(28).getString("displayValue"),
                                stat.getJSONObject(31).getString("displayValue"),
                                stat.getJSONObject(32).getString("displayValue"),
                                stat.getJSONObject(35).getString("displayValue"),
                                stat.getJSONObject(37).getString("displayValue"),
                                stat.getJSONObject(38).getString("displayValue"),
                                stat.getJSONObject(39).getString("displayValue"),
                                stat.getJSONObject(40).getString("displayValue"),
                                stat.getJSONObject(41).getString("displayValue"),
                                stat.getJSONObject(44).getString("displayValue"),
                                stat.getJSONObject(45).getString("displayValue"),
                                stat.getJSONObject(46).getString("displayValue"),
                                stat.getJSONObject(47).getString("displayValue"),
                                stat.getJSONObject(48).getString("displayValue"),
                                stat.getJSONObject(49).getString("displayValue")));

                    monType.setMesStats(mesStats);
                    mesTypes.add(monType);
                }

                informations.setMesTypesDeClassement(mesTypes);



                        montext.setText("[platformId : " + informations.getPlatformId().toString() + "]\n" +
                        "[AccountId : " + informations.getAccountId() + "]\n" +
                        "[selectedRegion : " + informations.getSelectedRegion() + "]\n" +
                        "[defaultSeason : " + informations.getDefaultSeason() + "]\n" +
                        "[seasonDisplay : " + informations.getSeasonDisplay() + "]\n" +
                        "[LastUpdated : " + informations.getLastUpdated() + "]\n" +
                        "[PlayerName : " + informations.getPlayerName() + "]\n" +
                        "[Region : " + informations.getMesTypesDeClassement().get(0).getLaRegion() + "]\n" +
                        "[Season : " + informations.getMesTypesDeClassement().get(0).getLaSeason() + "]\n" +
                        "[Match : " + informations.getMesTypesDeClassement().get(0).getLeType() + "]\n" +
                                "[Win : " + informations.getMesTypesDeClassement().get(0).getMesStats().get(0).getWins().toString() + "]\n" +
                                "[Kill : " + informations.getMesTypesDeClassement().get(0).getMesStats().get(0).getKills().toString() + "]\n" +
                                "[TimeSurvived : " + informations.getMesTypesDeClassement().get(0).getMesStats().get(0).getTimeSurvived().toString() + "]\n" +

                        "[PubgTrackerId : " + informations.getPubgTrackerId().toString() + "]\n");
            }

        }
        catch (Exception e){
            montext.setText(e.getMessage());
        }
    }
}
