package com.example.sixdaytosurvive;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FifthDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button Day5Class11Button;
    Button Day5Class21Button;
    Button Day5Class31Button;
    Button Day5Class32Button;
    Button Day5Class3StepanidaButton;
    Button Day5Class3EvgeyButton;
    Button Day5Class3VatilaveButton;
    Button nextDayButton;
    Button reserv;
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day5_class_1_1_effect;
    TypewriterEffect day5_class_2_1_effect;
    TypewriterEffect day5_class_3_1_effect;
    TypewriterEffect day5_class_3_2_effect;
    TypewriterEffect day5_class_3_stepanida_effect;
    TypewriterEffect day5_class_3_evgey_effect;
    TypewriterEffect day5_class_3_vatilave_effect;
    TypewriterEffect day5_home_effect;
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_day);

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

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        Day5Class11Button = findViewById(R.id.next_button_day4);
        Day5Class21Button = findViewById(R.id.next_button_2_day4);
        Day5Class31Button = findViewById(R.id.next_button_3_day4);
        Day5Class32Button = findViewById(R.id.next_button_4_day4);
        Day5Class3StepanidaButton = findViewById(R.id.next_button_5_day4);
        Day5Class3EvgeyButton = findViewById(R.id.next_button_6_day4);
        Day5Class3VatilaveButton = findViewById(R.id.next_button_7_day4);
        nextDayButton = findViewById(R.id.next_button_8_day4);
        reserv = findViewById(R.id.next_button_9_day4);

        // Получение по id основного TextView
        mainTV = findViewById(R.id.fifth_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.fifth_day_layout);

        day5_class_1_1_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_1_1, 60);
        day5_class_1_1_effect.animateText();

        day5_class_1_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Day5Class11Button.setVisibility(View.VISIBLE);
                Day5Class11Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day5Class21Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void skipAnimationDay5(View view) {
        HelperClass.stopAnimation(day5_class_1_1_effect);
        HelperClass.stopAnimation(day5_class_2_1_effect);
        HelperClass.stopAnimation(day5_class_3_1_effect);
        HelperClass.stopAnimation(day5_class_3_2_effect);
        HelperClass.stopAnimation(day5_class_3_stepanida_effect);
        HelperClass.stopAnimation(day5_class_3_evgey_effect);
        HelperClass.stopAnimation(day5_class_3_vatilave_effect);
        HelperClass.stopAnimation(day5_home_effect);
    }
}