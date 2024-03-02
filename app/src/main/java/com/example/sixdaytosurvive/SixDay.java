package com.example.sixdaytosurvive;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SixDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button Day6Home1Button;
    Button Day6Class1Button;
    Button Day6Class2Button;
    Button Day6Class3Button;
    Button Day6Class4Button;
    Button Day6Class5Button;
    Button Day6Class6Button;
    Button Day6Class7Button;
    Button Day6Class8Button;
    Button Day6Class9Button;
    Button Day6Class10Button;
    Button Day6Class11Button;
    Button Day6Class12Button;
    Button Day6Class13Button;
    Button Day6Class14Button;
    Button Day6Class15Button;
    Button Day6Class233Button;
    Button Day6Class234Button;
    Button Day6Class235Button;
    Button Day6Class236Button;
    Button Day2Home1Button;
    Button openDay3Button;

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    // ---------- Кнопки для выбора в открытия окна ----------
    Button Day4Class6WindowOpenButton;
    Button Day4Class6WindowCloseButton;
    // ---------- Кнопки для выбора в открытия окна ----------

    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------
    Button choiceButton3;
    Button choiceButton4;
    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day6_home_1_effect;
    TypewriterEffect day6_class_1_effect;
    TypewriterEffect day6_class_2_effect;
    TypewriterEffect day6_class_3_effect;
    TypewriterEffect day6_class_4_effect;
    TypewriterEffect day6_class_5_effect;
    TypewriterEffect day6_class_6_effect;
    TypewriterEffect day6_class_7_effect;
    TypewriterEffect day6_class_8_effect;
    TypewriterEffect day6_class_9_effect;
    TypewriterEffect day6_class_10_effect;
    TypewriterEffect day6_class_window_is_closed_1_effect;
    TypewriterEffect day6_class_window_is_closed_2_effect;
    TypewriterEffect day6_class_ilyaz_effect;
    TypewriterEffect day6_class_ilyaz_2_effect;
    TypewriterEffect day6_class_stepanida_1_effect;
    TypewriterEffect day6_class_stepanida_2_effect;
    TypewriterEffect day6_class_stepanida_3_effect;

    // ------------------------------ Диалоги ------------------------------


    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_six_day);

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

        Day6Home1Button = findViewById(R.id.next_button_day6);
        Day6Class1Button = findViewById(R.id.next_button_2_day6);
        Day6Class2Button = findViewById(R.id.next_button_3_day6);
        Day6Class3Button = findViewById(R.id.next_button_4_day6);
        Day6Class4Button = findViewById(R.id.next_button_5_day6);
        Day6Class5Button = findViewById(R.id.next_button_6_day6);
        Day6Class6Button = findViewById(R.id.next_button_7_day6);
        Day6Class7Button = findViewById(R.id.next_button_8_day6);
        Day6Class8Button = findViewById(R.id.next_button_9_day6);
        Day6Class9Button = findViewById(R.id.next_button_10_day6);
        Day6Class10Button = findViewById(R.id.next_button_11_day6);
        Day6Class11Button = findViewById(R.id.next_button_12_day6);
        Day6Class12Button = findViewById(R.id.next_button_13_day6);
        Day6Class13Button = findViewById(R.id.next_button_14_day6);
        Day6Class14Button = findViewById(R.id.next_button_15_day6);
        Day6Class15Button = findViewById(R.id.next_button_16_day6);
        Day6Class233Button = findViewById(R.id.next_button_17_day6);
        Day6Class234Button = findViewById(R.id.next_button_18_day6);
        Day6Class235Button = findViewById(R.id.next_button_19_day6);
        Day6Class236Button = findViewById(R.id.next_button_20_day6);
        Day2Home1Button = findViewById(R.id.next_button_21_day6);
        openDay3Button = findViewById(R.id.next_button_22_day6);

        // ---------- Получение кнопок выбора по id ---------
        Day4Class6WindowOpenButton = findViewById(R.id.choice_button1_day4);
        Day4Class6WindowCloseButton = findViewById(R.id.choice_button2_day4);
        // ---------- Получение кнопок выбора по id ---------

        // ---------- Получение кнопок выбора по id ---------
        choiceButton3 = findViewById(R.id.choice_button3_day4);
        choiceButton4 = findViewById(R.id.choice_button4_day4);
        // ---------- Получение кнопок выбора по id ---------

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        // Получение по id основного TextView
        mainTV = findViewById(R.id.fourth_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.fourth_day_layout);

        day6_home_1_effect = new TypewriterEffect(mainTV, Dialogues.day6_home, 60);
        day6_home_1_effect.animateText();
        day6_home_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Day6Home1Button.setVisibility(View.VISIBLE);
                Day6Home1Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day6Home1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void skipAnimationDay4(View view) {
        HelperClass.stopAnimation(day6_home_1_effect);
        HelperClass.stopAnimation(day6_class_1_effect);
        HelperClass.stopAnimation(day6_class_2_effect);
        HelperClass.stopAnimation(day6_class_3_effect);
        HelperClass.stopAnimation(day6_class_4_effect);
        HelperClass.stopAnimation(day6_class_5_effect);
        HelperClass.stopAnimation(day6_class_6_effect);
        HelperClass.stopAnimation(day6_class_7_effect);
        HelperClass.stopAnimation(day6_class_8_effect);
        HelperClass.stopAnimation(day6_class_9_effect);
        HelperClass.stopAnimation(day6_class_10_effect);
        HelperClass.stopAnimation(day6_class_window_is_closed_1_effect);
        HelperClass.stopAnimation(day6_class_window_is_closed_2_effect);
        HelperClass.stopAnimation(day6_class_ilyaz_effect);
        HelperClass.stopAnimation(day6_class_ilyaz_2_effect);
        HelperClass.stopAnimation(day6_class_stepanida_1_effect);
        HelperClass.stopAnimation(day6_class_stepanida_2_effect);
        HelperClass.stopAnimation(day6_class_stepanida_3_effect);
    }

    public void nextPhrase_Day6_class1(View view) {
        // Инициализация эффекта печати
        day6_class_1_effect = new TypewriterEffect(mainTV, Dialogues.day6_class_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Home1Button, Day6Class1Button,
                day6_class_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.bedroom);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_Day6_class2(View view) {
        // Инициализация эффекта печати
        day6_class_2_effect = new TypewriterEffect(mainTV, Dialogues.day6_class_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Home1Button, Day6Class1Button,
                day6_class_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kastryuleva_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }
}