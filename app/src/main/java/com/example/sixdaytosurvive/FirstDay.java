package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FirstDay extends AppCompatActivity {

    Button nextButton;
    Animation anim_button_in;
    Animation anim_button_out;
    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

        // Кнопка "далее"
        nextButton = findViewById(R.id.next_button);
        anim_button_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in);
        anim_button_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out);
        mainText = findViewById(R.id.first_day_text);

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

        // Анимация текста
        TypewriterEffect day1_dialog1_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog1, 60);
        day1_dialog1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Вызов кнопки "далее"
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim_button_in);
            }
        });
        day1_dialog1_effect.animateText();
    }

    public void nextPhrase(View view) {
        // Прячем кнопку
        nextButton.startAnimation(anim_button_out);
        anim_button_out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                nextButton.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mainText.setText("");
        TypewriterEffect day1_dialog2_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog2, 60);
        day1_dialog2_effect.animateText();

        day1_dialog2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                RelativeLayout layout = findViewById(R.id.first_day_layout);
                layout.setBackgroundResource(R.drawable.garderob);
                Toast.makeText(getApplicationContext(), "Текст завершился!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}