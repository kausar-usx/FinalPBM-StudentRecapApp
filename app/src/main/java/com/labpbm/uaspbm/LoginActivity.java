package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    private ImageButton loginButton, buatakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.masuk);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, KursusActivity.class );
                startActivity(intent);
            }
        });

        buatakun = findViewById(R.id.regis);

        buatakun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, DaftarActivity.class );
                startActivity(intent);
            }
        });
    }
}

