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

        // Задача размеров приложения на весь экран
        getWindow().setFlags(512, 512);
    }

    public void closeGame(View view) {
        // Закрытие игры
        finishAndRemoveTask();
    }

    public void startGame(View view) {
        // Открываем активити с дисклеймером
        Intent intent = new Intent(MainMenu.this, Disclaimer.class);

        MainMenu.this.startActivity(intent);
        MainMenu.this.finish();

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}