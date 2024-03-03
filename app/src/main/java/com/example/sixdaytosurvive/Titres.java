package com.example.sixdaytosurvive;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Titres extends AppCompatActivity {

    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titres);

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

        scrollView = findViewById(R.id.scrolling_TV);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                HelperClass.titresSound = MediaPlayer.create(getApplicationContext(), R.raw.titres_sound);
                HelperClass.titresSound.start();
                ObjectAnimator animator = ObjectAnimator.ofInt(scrollView, "scrollY", scrollView.getScrollY(), scrollView.getChildAt(0).getHeight() - scrollView.getHeight());
                animator.setDuration(27000); // Укажите длительность анимации в миллисекундах здесь
                animator.start();

                animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        HelperClass.titresSound.stop();
                        HelperClass.titresSound.release();

                        HelperClass.menuSound = MediaPlayer.create(getApplicationContext(), R.raw.bg_new);
                        HelperClass.menuSound.start();
                        // Новый intent для открытия главного меню
                        Intent intent = new Intent(Titres.this, MainMenu.class);

                        // Открываем новое активити
                        Titres.this.startActivity(intent);

                        // Завершаем текущее активити
                        Titres.this.finish();

                        // Плавный переход между активити
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                });
            }
        });

        scrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        scrollView.setVerticalScrollBarEnabled(false);
    }
}