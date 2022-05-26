package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfilActivity extends AppCompatActivity {

    private ImageButton logout, kursus, riwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        logout = findViewById(R.id.log_out);
        riwayat = findViewById(R.id.riwayat);
        kursus = findViewById(R.id.book);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilActivity.this, LoginActivity.class);
                startActivity(intent);
            }});

        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilActivity.this, RiwayatActivity.class);
                startActivity(intent);
            }});

        kursus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilActivity.this, KursusActivity.class);
                startActivity(intent);
            }});
    }
}