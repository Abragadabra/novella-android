package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;

public class SecondDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button nextButton;                                // Кнопка "далее"
    Button nextButton_2;                              // Кнопка "далее" 2
    Button nextButton_3;                              // Кнопка "далее" 3
    Button nextButton_4;                              // Кнопка "далее" 4
    Button nextButton_5;                              // Кнопка "далее" 5
    Button nextButton_6;                              // Кнопка "далее" 6
    Button nextButton_7;                              // Кнопка "далее" 7
    Button nextButton_8;                              // Кнопка "далее" 8
    Button nextButton_9;                              // Кнопка "далее" 9
    Button nextButton_10;                             // Кнопка "далее" 10
    Button nextButton_11;                             // Кнопка "далее" 11
    Button nextButton_12;                             // Кнопка "далее" 12
    Button nextButton_13;                             // Кнопка "далее" 13
    Button nextButton_14;                             // Кнопка "далее" 14
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------

    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_day);

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
}