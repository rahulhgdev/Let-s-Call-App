package dev.rahulhgdev.letscall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends AppCompatActivity {

    private static int Splash_Time = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent_qr = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent_qr);
                finish();
            }
        }, Splash_Time);
    }
}