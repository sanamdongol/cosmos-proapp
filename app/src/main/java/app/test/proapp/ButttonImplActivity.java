package app.test.proapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButttonImplActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttton_impl);

//        Button btnTop= findViewById(R.id.btnTop);
//        btnTop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        Button btnTop = findViewById(R.id.btnTop);
        Button btnShakeIt = findViewById(R.id.btnShakeIt);
        Button btnDown = findViewById(R.id.btnDown);
        btnTop.setOnClickListener(this);
        btnShakeIt.setOnClickListener(this);
        btnDown.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnTop:
                Toast.makeText(this, "Top Button Implementation", Toast.LENGTH_LONG).show();

                break;
            case R.id.btnShakeIt:
                Toast.makeText(this, "Shake It Button Implementation", Toast.LENGTH_LONG).show();

                break;
            case R.id.btnDown:
                Toast.makeText(this, "Down To earth Button Implementation", Toast.LENGTH_LONG).show();

                break;
        }
    }
}