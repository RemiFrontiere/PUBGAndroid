package fr.developpement.remi.androidpubg;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private RequestContentTask maTask;
    private TextView montext;
    public static Informations mesinfos;
    private TextView lePseudoJoueur;
    private String monURL = "https://pubgtracker.com/api/profile/pc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lePseudoJoueur = (TextView)findViewById(R.id.lePseudo);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select Player");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("VALIDER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                lePseudoJoueur.setText(input.getText().toString());

                if(lePseudoJoueur != null) {
                    monURL += lePseudoJoueur.getText();
                    maTask = new RequestContentTask();
                    maTask.execute(monURL);
                }
            }
        });
        builder.setNegativeButton("CANCER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();

        this.montext = (TextView)findViewById(R.id.montext);
        maTask.montext = montext;


    }
}
