package app.test.proapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
    }

    public void sendMessage(View view) {
       /* int btnId = view.getId();
        if (btnId == R.id.btnTop) {
            Toast.makeText(this, "Top Button", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Button down", Toast.LENGTH_LONG).show();
        }*/

        switch (view.getId()) {
            case R.id.btnTop:
                Toast.makeText(this, "Top Button switch", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnSecond:
                Toast.makeText(this, "Button down switch", Toast.LENGTH_LONG).show();
                break;
        }


    }
}