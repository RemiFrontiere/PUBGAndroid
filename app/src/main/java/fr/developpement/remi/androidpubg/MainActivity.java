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

    private Button btAfficher;
    private RequestContentTask maTask;
    private TextView montext;
    public static Informations mesinfos;
    private TextView lePseudoJoueur;

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
            }
        });
        builder.setNegativeButton("CANCER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();

        this.btAfficher = (Button)findViewById(R.id.btafficher);
        this.montext = (TextView)findViewById(R.id.montext);
        maTask.montext = montext;


        this.btAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] monURL = null;
                maTask = new RequestContentTask();
                maTask.execute("https://pubgtracker.com/api/profile/pc/Superpom");

                try {



                }
                catch (Exception e)
                {
                    montext.setText(e.getMessage());
                }
            }
        });





    }
}
