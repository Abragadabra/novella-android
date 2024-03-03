package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FirstDay extends AppCompatActivity {

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

    // Кнопки для выбора действий в гардеробе
    Button takeJacketButton;    // Взять куртку
    Button passJacketButton;    // Сдать куртку

    // Кнопки для выбора действий в столовой
    Button takeFoodButton;      // Взять жратву от дырова
    Button passFoodButton;      // Отказаться от еды и быть сигмой


    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------


    TextView mainText;                              // Поле с текстом


    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day1_dialog1_effect;
    TypewriterEffect day1_dialog2_effect;
    TypewriterEffect day1_warderobe1_effect;
    TypewriterEffect day1_warderobe_variant1_effect;
    TypewriterEffect day1_warderobe_variant2_1_effect;
    TypewriterEffect day1_warderobe_variant2_2_effect;
    TypewriterEffect day1_warderobe_variant2_3_effect;
    TypewriterEffect day1_warderobe_variant2_4_effect;
    TypewriterEffect day1_warderobe_variant2_5_effect;
    TypewriterEffect day1_warderobe_variant2_6_effect;
    TypewriterEffect day1_class1_1_effect;
    TypewriterEffect day1_class1_2_effect;
    TypewriterEffect day1_class1_3_effect;
    TypewriterEffect day1_canteen_1_effect;
    TypewriterEffect day1_canteen_2_effect;
    TypewriterEffect day1_canteen_yes_effect;
    TypewriterEffect day1_canteen_no_effect;
    TypewriterEffect day1_class2_1_effect;
    TypewriterEffect day1_end_if_jacket_false_effect;
    TypewriterEffect reserve_effect;
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

        // --------- Получение кнопок "далее" ---------
        nextButton = findViewById(R.id.next_button);
        nextButton_2 = findViewById(R.id.next_button_2);
        nextButton_3 = findViewById(R.id.next_button_3);
        nextButton_4 = findViewById(R.id.next_button_4);
        nextButton_5 = findViewById(R.id.next_button_5);
        nextButton_6 = findViewById(R.id.next_button_6);
        nextButton_7 = findViewById(R.id.next_button_7);
        nextButton_8 = findViewById(R.id.next_button_8);
        nextButton_9 = findViewById(R.id.next_button_9);
        nextButton_10 = findViewById(R.id.next_button_10);
        nextButton_11 = findViewById(R.id.next_button_11);
        nextButton_12 = findViewById(R.id.next_button_12);
        nextButton_13 = findViewById(R.id.next_button_13);
        nextButton_14 = findViewById(R.id.next_button_14);
        // --------- Получение кнопок "далее" ---------


        // ------ Получение кнопок "выбора куртки" ------
        takeJacketButton = findViewById(R.id.choice_button_1);
        passJacketButton = findViewById(R.id.choice_button_2);
        // ------ Получение кнопок "выбора куртки" ------


        // ------ Получение кнопок "выбора еды" ------
        takeFoodButton = findViewById(R.id.choice_button_3);
        passFoodButton = findViewById(R.id.choice_button_4);
        // ------ Получение кнопок "выбора еды" ------


        // ------------------------------ Получение анимации справа экрана ------------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ------------------------------ Получение анимации справа экрана ------------------------------


        // ------------------------------ Получение анимации слева экрана ------------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ------------------------------ Получение анимации слева экрана ------------------------------

        // Получени поля с тектом
        mainText = findViewById(R.id.first_day_text);

        // Получение основной вёрстки
        relativeLayout = findViewById(R.id.first_day_layout);

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

    // Скип анимации на каждый диалог
    public void skipAnimation(View view) {
        HelperClass.stopAnimation(day1_dialog1_effect);
        HelperClass.stopAnimation(day1_dialog2_effect);
        HelperClass.stopAnimation(day1_warderobe1_effect);
        HelperClass.stopAnimation(day1_warderobe_variant1_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_1_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_2_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_3_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_4_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_5_effect);
        HelperClass.stopAnimation(day1_warderobe_variant2_6_effect);
        HelperClass.stopAnimation(day1_class1_1_effect);
        HelperClass.stopAnimation(day1_class1_2_effect);
        HelperClass.stopAnimation(day1_class1_3_effect);
        HelperClass.stopAnimation(day1_canteen_1_effect);
        HelperClass.stopAnimation(day1_canteen_2_effect);
        HelperClass.stopAnimation(day1_canteen_yes_effect);
        HelperClass.stopAnimation(day1_canteen_no_effect);
        HelperClass.stopAnimation(day1_class2_1_effect);
        HelperClass.stopAnimation(day1_end_if_jacket_false_effect);
        HelperClass.stopAnimation(reserve_effect);
    }


    public void nextPhrase(View view) {

    }


    // ждём в гардеробе
    public void passJacket(View view) {

    }

    // Событие на кнопку далее_2
    public void nextPhrase_2(View view) {

    }

    // Событие на кнопку 3
    public void nextPhrase_3(View view) {

    }

    // Событие на нажатие кнопки далее4
    public void nextPhrase_4(View view) {

    }

    // Событие при нажатии кнопки далее5
    public void nextPhrase_5(View view) {

    }

    public void nextPhrase_6(View view) {

    }

    public void nextPhrase_7(View view) {

    }

    // Не берём куртку
    public void takeJacket(View view) {

    }

    public void nextPhrase_8(View view) {

    }

    public void nextPhrase_9(View view) {

    }


    public void nextPhrase_10(View view) {

    }

    // Столовая и появление выбора
    public void nextPhrase_11(View view) {

    }

    // Событие при отказе от еды
    public void passFood(View view) {

    }

    // Событие при принятии еды
    public void takeFood(View view) {

    }


    public void nextPhrase_12(View view) {

    }


    public void nextPhrase_13(View view) {

    }


    public void nextPhrase_14(View view) {

    }

    public void setDay2() {
        // // Новый intent для открытия главного меню
        Intent intent = new Intent(FirstDay.this, SplashScreenTuesday.class);

        // Открываем новое активити
        FirstDay.this.startActivity(intent);

        // Завершаем текущее активити
        FirstDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}