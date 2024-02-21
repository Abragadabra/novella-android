package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SecondDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button day2MonologNextButton;                     // Кнопка "далее"
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
    TypewriterEffect day2_monolog_effect;
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_day);

        // --------- Получение кнопок по id "далее" ---------
        day2MonologNextButton = findViewById(R.id.next_button_day2);
        nextButton_2 = findViewById(R.id.next_button_2_day2);
        nextButton_3 = findViewById(R.id.next_button_3_day2);
        nextButton_4 = findViewById(R.id.next_button_4_day2);
        nextButton_5 = findViewById(R.id.next_button_5_day2);
        nextButton_6 = findViewById(R.id.next_button_6_day2);
        nextButton_7 = findViewById(R.id.next_button_7_day2);
        nextButton_8 = findViewById(R.id.next_button_8_day2);
        nextButton_9 = findViewById(R.id.next_button_9_day2);
        nextButton_10 = findViewById(R.id.next_button_10_day2);
        nextButton_11 = findViewById(R.id.next_button_11_day2);
        nextButton_12 = findViewById(R.id.next_button_12_day2);
        nextButton_13 = findViewById(R.id.next_button_13_day2);
        nextButton_14 = findViewById(R.id.next_button_14_day2);
        // --------- Получение кнопок по id "далее" ---------

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        // Получение по id основного TextView
        mainTV = findViewById(R.id.second_day_TV);

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

        // ------------------- Эффект печати для day2_monolog -------------------
        day2_monolog_effect = new TypewriterEffect(mainTV, Dialogues.day2_monolog, 60);
        day2_monolog_effect.animateText();
        // ------------------- Эффект печати для day2_monolog -------------------


        // ------------------- Событие для окончания печати для day2_monolog -------------------
        day2_monolog_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Вызов кнопки
                day2MonologNextButton.setVisibility(View.VISIBLE);
                day2MonologNextButton.startAnimation(anim_button_in_right);

                // Активация кнопки по окончания анимации
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        day2MonologNextButton.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // ------------------- Событие для окончания печати для day2_monolog -------------------
    }
}