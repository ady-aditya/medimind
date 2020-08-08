package com.epmp.medireminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        

        getstarted = findViewById(R.id.textViewGetStarted);

        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GetStartedActivity.class));
                overridePendingTransition(R.anim.abc_slide_in_bottom,R.anim.abc_slide_out_top);
                finish();
            }
        });

    }
}
