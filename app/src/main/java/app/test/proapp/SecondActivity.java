package app.test.proapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Intent data = getIntent();
//        String resultEmail = data.getStringExtra("key_email");
//        String resultPassword = data.getStringExtra("key_password");
//        Log.e("TAG", resultEmail);
//        Log.e("TAG_PASSWORD", resultPassword);
//
//        TextView tvEmail = findViewById(R.id.textView4);
//        TextView tvPassword = findViewById(R.id.tvPass);
//
//        tvEmail.setText(resultEmail);
//        tvPassword.setText(resultPassword);
    }

    public void showDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
        builder.setTitle("Quit App")
                .setMessage("Are you sure you want to quit app?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNeutralButton("I am not sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });


        builder.create();
        builder.show();
    }
}