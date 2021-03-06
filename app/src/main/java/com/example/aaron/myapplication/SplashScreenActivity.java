package com.example.aaron.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        LogoLauncher logoLauncher= new LogoLauncher();
        logoLauncher.start();
    }


    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(SplashScreenActivity.this, logIn.class);
            startActivity(intent);

            SplashScreenActivity.this.finish();

        }

    }
}
