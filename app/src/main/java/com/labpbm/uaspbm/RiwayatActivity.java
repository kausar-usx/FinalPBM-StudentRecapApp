package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RiwayatActivity extends AppCompatActivity {

    private ImageButton profil, kursus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        profil = findViewById(R.id.profile);
        kursus = findViewById(R.id.book);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiwayatActivity.this, ProfilActivity.class);
                startActivity(intent);
            }});

        kursus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiwayatActivity.this, KursusActivity.class);
                startActivity(intent);
            }});
    }
}