package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

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
}