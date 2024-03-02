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
import android.widget.Toast;

public class FourthDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button Day4Home1Button;
    Button Day4Class1Button;
    Button Day4Class2Button;
    Button Day4Class3Button;
    Button Day4Class4Button;
    Button Day4Class5Button;
    Button Day4Class6Button;
    Button Day4Class7Button;
    Button Day4Class8Button;
    Button Day4Class9Button;
    Button Day4Class10Button;
    Button Day4Class11Button;
    Button Day4Class12Button;
    Button Day4Class13Button;
    Button Day4Class14Button;
    Button Day4Class15Button;
    Button Day2Class233Button;
    Button Day2Class234Button;
    Button Day2Class235Button;
    Button Day2Class236Button;
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
    TypewriterEffect day4_home_1_effect;
    TypewriterEffect day4_class_1_effect;
    TypewriterEffect day4_class_2_effect;
    TypewriterEffect day4_class_3_effect;
    TypewriterEffect day4_class_4_effect;
    TypewriterEffect day4_class_5_effect;
    TypewriterEffect day4_class_6_effect;
    TypewriterEffect day4_class_7_effect;
    TypewriterEffect day4_class_8_effect;
    TypewriterEffect day4_class_9_effect;
    TypewriterEffect day4_class_10_effect;
    TypewriterEffect day4_class_window_is_closed_1_effect;
    TypewriterEffect day4_class_window_is_closed_2_effect;
    TypewriterEffect day4_class_ilyaz_effect;
    TypewriterEffect day4_class_ilyaz_2_effect;
    TypewriterEffect day4_class_stepanida_1_effect;
    TypewriterEffect day4_class_stepanida_2_effect;
    TypewriterEffect day4_class_stepanida_3_effect;
    // ------------------------------ Диалоги ------------------------------


    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_day);

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

        Day4Home1Button = findViewById(R.id.next_button_day4);
        Day4Class1Button = findViewById(R.id.next_button_2_day4);
        Day4Class2Button = findViewById(R.id.next_button_3_day4);
        Day4Class3Button = findViewById(R.id.next_button_4_day4);
        Day4Class4Button = findViewById(R.id.next_button_5_day4);
        Day4Class5Button = findViewById(R.id.next_button_6_day4);
        Day4Class6Button = findViewById(R.id.next_button_7_day4);
        Day4Class7Button = findViewById(R.id.next_button_8_day4);
        Day4Class8Button = findViewById(R.id.next_button_9_day4);
        Day4Class9Button = findViewById(R.id.next_button_10_day4);
        Day4Class10Button = findViewById(R.id.next_button_11_day4);
        Day4Class11Button = findViewById(R.id.next_button_12_day4);
        Day4Class12Button = findViewById(R.id.next_button_13_day4);
        Day4Class13Button = findViewById(R.id.next_button_14_day4);
        Day4Class14Button = findViewById(R.id.next_button_15_day4);
        Day4Class15Button = findViewById(R.id.next_button_16_day4);
        Day2Class233Button = findViewById(R.id.next_button_17_day4);
        Day2Class234Button = findViewById(R.id.next_button_18_day4);
        Day2Class235Button = findViewById(R.id.next_button_19_day4);
        Day2Class236Button = findViewById(R.id.next_button_20_day4);
        Day2Home1Button = findViewById(R.id.next_button_21_day4);
        openDay3Button = findViewById(R.id.next_button_22_day4);

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

        day4_home_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_home_1, 60);
        day4_home_1_effect.animateText();

        day4_home_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Day4Home1Button.setVisibility(View.VISIBLE);
                Day4Home1Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day4Home1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    // Скип всех анимаций
    public void skipAnimationDay4(View view) {
        HelperClass.stopAnimation(day4_home_1_effect);
        HelperClass.stopAnimation(day4_class_1_effect);
        HelperClass.stopAnimation(day4_class_2_effect);
        HelperClass.stopAnimation(day4_class_3_effect);
        HelperClass.stopAnimation(day4_class_4_effect);
        HelperClass.stopAnimation(day4_class_5_effect);
        HelperClass.stopAnimation(day4_class_6_effect);
        HelperClass.stopAnimation(day4_class_7_effect);
        HelperClass.stopAnimation(day4_class_8_effect);
        HelperClass.stopAnimation(day4_class_9_effect);
        HelperClass.stopAnimation(day4_class_10_effect);
        HelperClass.stopAnimation(day4_class_window_is_closed_1_effect);
        HelperClass.stopAnimation(day4_class_window_is_closed_2_effect);
        HelperClass.stopAnimation(day4_class_ilyaz_effect);
        HelperClass.stopAnimation(day4_class_ilyaz_2_effect);
        HelperClass.stopAnimation(day4_class_stepanida_1_effect);
        HelperClass.stopAnimation(day4_class_stepanida_2_effect);
        HelperClass.stopAnimation(day4_class_stepanida_3_effect);

    }

    public void nextPhrase_Day4Home1(View view) {
        // Инициализация эффекта печати
        day4_class_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Home1Button, Day4Class1Button,
                day4_class_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.bedroom);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.policarbonat_vatislav_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_Day4Class1(View view) {
        // Инициализация эффекта печати
        day4_class_2_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class1Button, Day4Class2Button,
                day4_class_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day4Class2(View view) {
        // Инициализация эффекта печати
        day4_class_3_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_3, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class2Button, Day4Class3Button,
                day4_class_3_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day4Class3(View view) {
        // Инициализация эффекта печати
        day4_class_4_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_4, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class3Button, Day4Class4Button,
                day4_class_4_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day4Class4(View view) {
        // Инициализация эффекта печати
        day4_class_5_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_5, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class4Button, Day4Class5Button,
                day4_class_5_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day4Class5(View view) {
        // Инициализация эффекта печати
        day4_class_6_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_6, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class5Button, Day4Class6WindowOpenButton, Day4Class6WindowCloseButton,
                day4_class_6_effect, anim_button_out_right, anim_button_in_left, mainTV);
    }

    // Кнопки на открытие окна
    public void openWindow(View view) {
        PlayerData.windowOpen = true;
        // Инициализация эффекта печати
        day4_class_7_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_7, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class6Button, Day4Class6Button, Day4Class6WindowOpenButton, Day4Class6WindowCloseButton,
                day4_class_7_effect, anim_button_out_left,
                anim_button_in_right, mainTV);
    }

    public void closeWindow(View view) {
        PlayerData.windowOpen = false;
        // Инициализация эффекта печати
        day4_class_7_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_7, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class6Button, Day4Class6Button, Day4Class6WindowOpenButton, Day4Class6WindowCloseButton,
                day4_class_7_effect, anim_button_out_left,
                anim_button_in_right, mainTV);
    }
    // Кнопки на открытие окна

    public void nextPhrase_Day4Class6(View view) {
        // Инициализация эффекта печати
        day4_class_8_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_8, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class6Button, Day4Class7Button,
                day4_class_8_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.policarbonat_vatislav_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ilyaz_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_Day4Class8(View view) {
        // Инициализация эффекта печати
        day4_class_9_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_9, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class7Button, Day4Class8Button,
                day4_class_9_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day4Class9(View view) {
        // Инициализация эффекта печати
        day4_class_10_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_10, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class8Button, Day4Class9Button,
                day4_class_10_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    // Проверка на духоту
    public void nextPhrase_Day4Class10(View view) {
        // Проверка на душность, если душно, то пора блевать
        if (PlayerData.windowOpen) {
            Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ilyaz_class);
            Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.home_computer);
            HelperClass.animBackground(relativeLayout, bg1, bg2);
            if (PlayerData.loveLevel > 0) {
                // Если окошко открыто, то идём домой с Вумен
                day4_class_stepanida_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_stepanida_1, 60);

                // Добавление кнопки на поход домой со Степанидой
                HelperClass.addPhrase(Day4Class9Button, Day4Class14Button,
                        day4_class_stepanida_1_effect, anim_button_in_right,
                        anim_button_out_right, mainTV);
            } else {
                // Если окошко открыто, то идём домой с Ильязомы
                day4_class_ilyaz_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_ilyaz_1, 60);

                // Добавление фразы
                HelperClass.addPhrase(Day4Class9Button, Day4Class11Button,
                        day4_class_ilyaz_effect, anim_button_in_right,
                        anim_button_out_right, mainTV);
            }

        } else {
            // Идём блевать
            day4_class_window_is_closed_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_window_is_closed_1, 60);
            // Добавление фразы
            HelperClass.addPhrase(Day4Class9Button, Day4Class10Button,
                    day4_class_window_is_closed_1_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);
            }
        }


    // Блюём и пришла степуха (после этого кнопка с условием на Ильяза или Степаниду)
    public void nextPhrase_Day4Class11(View view) {
        // Идём блевать
        day4_class_window_is_closed_2_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_window_is_closed_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class10Button, Day4Class13Button,
                day4_class_window_is_closed_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }


    // Продолжение разговора с Ильязом и после этого появляется кнопка смены дня
    public void nextPhrase_Day4Class12(View view) {
        // Идём блевать
        day4_class_ilyaz_2_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_ilyaz_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class11Button, Day4Class12Button,
                day4_class_window_is_closed_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }





    // Если поблевали
    public void nextPhrase_Day4Class14(View view) {
        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ilyaz_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.home_computer);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
        if (PlayerData.loveLevel > 0) {
            day4_class_stepanida_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_stepanida_1, 60);

            // Добавление кнопки на поход домой со Степанидой
            HelperClass.addPhrase(Day4Class13Button, Day4Class14Button,
                    day4_class_stepanida_1_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);
        } else {
            day4_class_ilyaz_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_ilyaz_1, 60);

            // Добавление фразы
            HelperClass.addPhrase(Day4Class13Button, Day4Class11Button,
                    day4_class_ilyaz_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);
        }
    }

    // Разговариваем со Степанидой (Хоть в игре будет девушка...)
    public void nextPhrase_Day4Class15(View view) {
        // Если окошко открыто, то идём домой с Ильязомы
        day4_class_stepanida_2_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_stepanida_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class14Button, Day4Class15Button,
                day4_class_stepanida_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    // Последняя строка разговора со Степанидой (Чувак влюбился...)
    public void nextPhrase_Day4Class16(View view) {
        // Если окошко открыто, то идём домой с Ильязомы
        day4_class_stepanida_3_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_stepanida_3, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Class15Button, Day4Class12Button,
                day4_class_stepanida_3_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }



    // ---------- НАЧИНАЕМ НОВЫЙ ДЕНЬ ------------
    public void nextPhrase_Day4Class13(View view) {
        // Новый intent для открытия главного меню
        Intent intent = new Intent(FourthDay.this, SplashScreenFriday.class);

        // Открываем новое активити
        FourthDay.this.startActivity(intent);

        // Завершаем текущее активити
        FourthDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
    // ---------- НАЧИНАЕМ НОВЫЙ ДЕНЬ ------------
}