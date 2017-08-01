package fr.developpement.remi.androidpubg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by olivi on 30/07/2017.
 */


public class ResultatGet {

    public static String convetStreamToString(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;

        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            sb.append(e.getMessage());
        } finally {
            try {
                is.close();
            } catch (Exception e) {
            }

            return sb.toString();
        }
    }
}