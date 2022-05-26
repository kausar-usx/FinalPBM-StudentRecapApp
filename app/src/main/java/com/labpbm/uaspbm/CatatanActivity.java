package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CatatanActivity extends AppCompatActivity {

    private ImageButton profil, kursus, riwayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan);
        profil = findViewById(R.id.profile);
        kursus = findViewById(R.id.book);
        riwayat = findViewById(R.id.history);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CatatanActivity.this, ProfilActivity.class);
                startActivity(intent);
            }});

        kursus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CatatanActivity.this, KursusActivity.class);
                startActivity(intent);
            }});

        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CatatanActivity.this, RiwayatActivity.class);
                startActivity(intent);
            }});
    }
}