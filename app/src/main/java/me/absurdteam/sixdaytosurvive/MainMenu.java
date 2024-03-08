package me.absurdteam.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import me.absurdteam.sixdaytosurvive.R;

public class MainMenu extends AppCompatActivity {

    private static final String PREFS_FILE = "saves";
    SharedPreferences saves;

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

        // Создание файла сохранения
        saves = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
    }

    public void closeGame(View view) {
        // Выключаем музыку всего приложения
        MusicClass.stopMusic();

        // Закрытие игры
        finishAndRemoveTask();
    }

    public void startGame(View view) {
        boolean approvedDisclaimer = saves.getBoolean("disclaimer", false);
        int savedDay = saves.getInt("level", 1);

        if (approvedDisclaimer) {
            MusicClass.stopMusic();
            loadDay(savedDay);
        }
        else {
            // Новый intent для открытия главного меню
            Intent intent = new Intent(MainMenu.this, Disclaimer.class);

            // Открываем новое активити
            MainMenu.this.startActivity(intent);

            // Плавный переход между активити
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }

    }

    public void loadDay(int loadedDay) {
        Intent intent;

        switch (loadedDay) {
            case 1:
                intent = new Intent(MainMenu.this, SplashScreenMonday.class);
                break;
            case 2:
                intent = new Intent(MainMenu.this, SplashScreenTuesday.class);
                break;
            case 3:
                intent = new Intent(MainMenu.this, SplashScreenWednesday.class);
                break;
            case 4:
                intent = new Intent(MainMenu.this, SplashScreenThursday.class);
                break;
            case 5:
                intent = new Intent(MainMenu.this, SplashScreenFriday.class);
                break;
            case 6:
                intent = new Intent(MainMenu.this, SplashScreenSaturday.class);
                break;
            default:
                intent = new Intent(MainMenu.this, SplashScreenMonday.class);
        }

        // Открываем новое активити
        MainMenu.this.startActivity(intent);

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}