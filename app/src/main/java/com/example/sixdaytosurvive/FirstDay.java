package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

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
        TextView mainText = findViewById(R.id.first_day_text);
        TypewriterEffect typewriterEffect = new TypewriterEffect(mainText, Dialogues.day1_dialog1, 60);
        typewriterEffect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Вызов кнопки "далее"
                Button nextButton = findViewById(R.id.next_button);
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in);
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim);
            }
        });
        typewriterEffect.animateText();
    }
}