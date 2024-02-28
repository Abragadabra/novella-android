package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
    Button Day2Class2Stepanida2Button;
    Button Day2Class231Button;
    Button Day2Class2Stepanida3Button;
    Button Day2Class231AfterStepanidaButton;
    Button Day2Class232Button;
    Button Day2Class233Button;
    Button Day2Class234Button;
    Button Day2Class235Button;
    Button Day2Class236Button;
    Button Day2Home1Button;
    Button openDay3Button;

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------
    Button choiceButton1;
    Button choiceButton2;
    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------

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
        Day2Class2Stepanida2Button = findViewById(R.id.next_button_12_day4);
        Day2Class231Button = findViewById(R.id.next_button_13_day4);
        Day2Class2Stepanida3Button = findViewById(R.id.next_button_14_day4);
        Day2Class231AfterStepanidaButton = findViewById(R.id.next_button_15_day4);
        Day2Class232Button = findViewById(R.id.next_button_16_day4);
        Day2Class233Button = findViewById(R.id.next_button_17_day4);
        Day2Class234Button = findViewById(R.id.next_button_18_day4);
        Day2Class235Button = findViewById(R.id.next_button_19_day4);
        Day2Class236Button = findViewById(R.id.next_button_20_day4);
        Day2Home1Button = findViewById(R.id.next_button_21_day4);
        openDay3Button = findViewById(R.id.next_button_22_day4);

        // ---------- Получение кнопок выбора по id ---------
        choiceButton1 = findViewById(R.id.choice_button1_day4);
        choiceButton2 = findViewById(R.id.choice_button2_day4);
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
    }

    public void nextPhrase_Day4Home1(View view) {
        // Инициализация эффекта печати
        day4_class_1_effect = new TypewriterEffect(mainTV, Dialogues.day4_class_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day4Home1Button, Day4Class1Button,
                day4_class_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
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
}