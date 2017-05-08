package hendershakkon.proyecto007;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
    }

        // este método se ejecutará al presionar el ImageButton llamar
        public void llamar(View view){
            tv1.setText("Llamando...");
        }

        // este método se ejecutará al presionar el ImageButton colgar
        public void colgar(View view){
            tv1.setText("Colgando...");
        }


}
