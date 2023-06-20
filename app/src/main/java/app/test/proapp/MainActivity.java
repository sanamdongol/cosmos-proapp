package app.test.proapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myResult = findViewById(R.id.btnSignIn);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.editTextNumberPassword);

        myResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                boolean hasError = validateFields(email, password);

                if (hasError) {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("key_email", email);
                    intent.putExtra("key_password", password);
                    startActivity(intent);
                }

            }
        });

    }

    private boolean validateFields(String email, String password) {

        if (email.isEmpty()) {
            Log.e("email erro", "Email required");
            //Drawable drawable = getResources().getDrawable(R.drawable.ic_bad);
            etEmail.setError("This field is required");
            return true;
        } else if (!email.isEmpty() && !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Email not valid");
            return true;
        }

        if (password.isEmpty()) {
            Drawable drawable = getResources().getDrawable(R.drawable.ic_bad);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            etPassword.setError("Field Required", drawable);
            Log.e("passwprd error", "Password required");
            return true;
        } else {
            Log.e("password_tag", password);
            return false;
        }

    }

}
