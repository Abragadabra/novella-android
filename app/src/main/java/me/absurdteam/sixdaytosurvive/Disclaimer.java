package me.absurdteam.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import me.absurdteam.sixdaytosurvive.R;

public class Disclaimer extends AppCompatActivity {

    TextView mainTV;
    private static final String PREFS_FILE = "saves";
    SharedPreferences saves;

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

        // Создание файла сохранения
        saves = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);

        mainTV = findViewById(R.id.disclaimer_text);
        mainTV.setMovementMethod(new ScrollingMovementMethod());
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
        if (HelperClass.menuSound.isPlaying()) {
            HelperClass.menuSound.stop();
            HelperClass.menuSound.release();
        }

        // Сохранение согласия на дисклеймере
        SharedPreferences.Editor editor = saves.edit();
        editor.putBoolean("disclaimer", true);
        editor.apply();

        // Новый intent для открытия главного меню
        Intent intent = new Intent(Disclaimer.this, SplashScreenMonday.class);

        // Открываем новое активити
        Disclaimer.this.startActivity(intent);

        // Завершаем текущее активити
        Disclaimer.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}