package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayoutMain = (LinearLayout) findViewById(R.id.linearLayoutMain);
        final EditText etNama = new EditText(this);
        linearLayoutMain.addView(etNama);
        etNama.setHint("Isikan nama anak");
        final EditText etUmur = new EditText(this);
        linearLayoutMain.addView(etUmur);
        etUmur.setHint("Isikan umur anak");
        etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);
        Button bProses = new Button(this);
        bProses.setText("Proses");
        linearLayoutMain.addView(bProses);
        final TextView tvHasil = new TextView(this);
        linearLayoutMain.addView(tvHasil);
        bProses.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String umur = etUmur.getText().toString();
                tvHasil.setText(nama +" umur "+umur+" tahun ");
            }
        });
        setContentView(R.layout.activity_main);
    }
}
