package com.example.amrapigo.apigo;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Apigo extends AppCompatActivity {

    Button st, qt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apigo);

        st = (Button) findViewById(R.id.start1);
        qt = (Button) findViewById(R.id.quit);

    st.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent myIntent = new Intent(Apigo.this, MainActivity2.class);
            Apigo.this.startActivity(myIntent);
        }
    });

        qt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
                System.exit(0);

            }
        });

    }


}
