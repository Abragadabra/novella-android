package com.example.sixdaytosurvive;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;

public class HelperClass {
    public static MediaPlayer menuSound;        // Фоновая музыка меню
    public static MediaPlayer alarmSound;       // Звук будильника

    // Остановка анимации с проверка на то, что анимация существует и остановлена
    public static void stopAnimation(TypewriterEffect typewriterEffect) {
        if (typewriterEffect != null && typewriterEffect.animationRunning) {
            typewriterEffect.completeTextAnimation();
        }
    }

    // Функция анимации фона
    public static void animBackground(RelativeLayout layout, Drawable bg_out, Drawable bg_in) {
        TransitionDrawable fade = new TransitionDrawable(new Drawable[]{bg_out, bg_in});
        layout.setBackground(fade);
        fade.startTransition(1000);
    }
}
