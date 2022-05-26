package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class KursusActivity extends AppCompatActivity {

    private ImageButton tugas, kesehatan, pencapaian, catatan, jadwal, profil, riwayat;

    public KursusActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kursus);

        tugas = findViewById(R.id.btn_tugas);
        kesehatan = findViewById(R.id.btn_kesehatan);
        pencapaian = findViewById(R.id.btn_pencapaian);
        catatan = findViewById(R.id.btn_catatan);
        jadwal = findViewById(R.id.btn_jadwal);
        profil = findViewById(R.id.profile);
        riwayat = findViewById(R.id.history);

        tugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, TugasActivity.class);
                startActivity(intent);
            }
        });

        kesehatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, KesehatanActivity.class);
                startActivity(intent);
            }});

        tugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, TugasActivity.class);
                startActivity(intent);
            }});

        pencapaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, PencapaianActivity.class);
                startActivity(intent);
            }});

        catatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, CatatanActivity.class);
                startActivity(intent);
            }});

        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, JadwalActivity.class);
                startActivity(intent);
            }});

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, ProfilActivity.class);
                startActivity(intent);
            }});

        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KursusActivity.this, RiwayatActivity.class);
                startActivity(intent);
            }});
    }
}