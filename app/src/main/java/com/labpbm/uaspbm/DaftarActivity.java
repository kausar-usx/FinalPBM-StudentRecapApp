package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DaftarActivity extends AppCompatActivity {

    private ImageButton daftarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        daftarButton = findViewById(R.id.btn_daftar);

        daftarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarActivity.this, KursusActivity.class );
                startActivity(intent);
            }
        });
    }
}
