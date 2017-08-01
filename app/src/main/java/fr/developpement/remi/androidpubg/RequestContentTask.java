package fr.developpement.remi.androidpubg;

import android.os.AsyncTask;
import android.widget.TextView;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.InputStream;
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


                        montext.setText("[platformId : " + informations.getPlatformId().toString() + "]\n" +
                        "[platformId : " + informations.getAccountId() + "]\n" +
                        "[platformId : " + informations.getSelectedRegion() + "]\n" +
                        "[platformId : " + informations.getDefaultSeason() + "]\n" +
                        "[platformId : " + informations.getSeasonDisplay() + "]\n" +
                        "[platformId : " + informations.getLastUpdated() + "]\n" +
                        "[platformId : " + informations.getPlayerName() + "]\n" +
                        "[platformId : " + informations.getPubgTrackerId().toString() + "]\n");
            }

        }
        catch (Exception e){
            montext.setText(e.getMessage());
        }
    }
}
