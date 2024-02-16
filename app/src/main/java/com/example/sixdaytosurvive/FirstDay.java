package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.sixdaytosurvive.HelperClass;

public class FirstDay extends AppCompatActivity {

    Button nextButton;                              // Кнопка "далее"
    Animation anim_button_in;                       // Анимация вхождения кнопки
    Animation anim_button_out;                      // Анимация выхода кнопки
    TextView mainText;                              // Поле с текстом
    TypewriterEffect day1_dialog1_effect;           // Эффект диалога 1
    TypewriterEffect day1_dialog2_effect;           // Эффект диалога 2
    RelativeLayout relativeLayout;                  // Текущий layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

        // Присвоение значений переменным
        nextButton = findViewById(R.id.next_button);
        anim_button_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in);
        anim_button_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out);
        mainText = findViewById(R.id.first_day_text);
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

        // Анимация первой фразы
        day1_dialog1_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog1, 60);
        day1_dialog1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim_button_in);
            }
        });
        // Старт анимации
        day1_dialog1_effect.animateText();
    }

    public void nextPhrase(View view) {
        // Прячем кнопку
        nextButton.startAnimation(anim_button_out);
        anim_button_out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day1_dialog2_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog2, 60);

        // Старт анимции
        day1_dialog2_effect.animateText();

        day1_dialog2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Меняем фон при завершении анимации
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.bedroom);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.garderob);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }
        });

    }

    public void skipAnimation(View view) {
        HelperClass.stopAnimation(day1_dialog1_effect);
        HelperClass.stopAnimation(day1_dialog2_effect);
    }
}