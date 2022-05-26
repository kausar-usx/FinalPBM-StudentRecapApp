package com.labpbm.uaspbm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetstartedActivity extends AppCompatActivity {
    private Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);
        mulai = findViewById(R.id.btn_getstarted);

        mulai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetstartedActivity.this, DaftarActivity.class );
                startActivity(intent);
            }
        });
    }
}