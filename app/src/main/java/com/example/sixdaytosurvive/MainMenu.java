package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_name);

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

    public void closeGame(View view) {
        // Закрытие игры
        finishAndRemoveTask();
    }

    public void startGame(View view) {
        // // Новый intent для открытия главного меню
        Intent intent = new Intent(MainMenu.this, Disclaimer.class);

        // Открываем новое активити
        MainMenu.this.startActivity(intent);

        // Завершаем текущее активити
        MainMenu.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}