package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Disclaimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);

        // Скрытие UI элементов android
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


        // Размеры приложения занимают весь экран
        getWindow().setFlags(512, 512);
    }

    public void openMainMenu(View view) {
        // Новый intent для открытия главного меню
        Intent intent = new Intent(Disclaimer.this, MainMenu.class);

        // Открываем новое активити
        Disclaimer.this.startActivity(intent);

        // Завершаем текущее активити
        Disclaimer.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void startNewGame(View view) {
        // Новый intent для открытия главного меню
        Intent intent = new Intent(Disclaimer.this, Gosling.class);

        // Открываем новое активити
        Disclaimer.this.startActivity(intent);

        // Завершаем текущее активити
        Disclaimer.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}