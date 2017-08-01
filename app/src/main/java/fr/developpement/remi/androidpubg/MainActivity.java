package fr.developpement.remi.androidpubg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private Button btAfficher;
    private RequestContentTask maTask;
    private TextView montext;
    public static Informations mesinfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
