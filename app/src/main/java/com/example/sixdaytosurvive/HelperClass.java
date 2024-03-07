package com.example.sixdaytosurvive;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HelperClass {
    public static MediaPlayer menuSound;        // Фоновая музыка меню
    public static MediaPlayer alarmSound;       // Звук будильника
    public static MediaPlayer titresSound;

    // Остановка анимации с проверкой на то, что анимация существует и остановлена
    public static void stopAnimation(TypewriterEffect typewriterEffect) {
        if (typewriterEffect != null && typewriterEffect.animationRunning) {
            typewriterEffect.completeTextAnimation();
        }
    }

    public static void fadeIn(View view) {
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(500);
        fadeIn.setFillAfter(true);

        view.startAnimation(fadeIn);
    }

    public static void fadeOut(View view) {
        AlphaAnimation fadeOut = new AlphaAnimation(1f, 0f);
        fadeOut.setDuration(500);
        fadeOut.setFillAfter(true);

        view.startAnimation(fadeOut);
    }

    // Функция анимации фона
    public static void animBackground(RelativeLayout layout, Drawable bg_out, Drawable bg_in) {
        TransitionDrawable fade = new TransitionDrawable(new Drawable[]{bg_out, bg_in});
        layout.setBackground(fade);
        fade.startTransition(1000);
    }

    public static void addPhrase(Button out_button, Button in_button, TypewriterEffect phrase,
                                 Animation in_right, Animation out_right, TextView TV) {
        out_button.setEnabled(false);
        out_button.startAnimation(out_right);

        out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                out_button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        TV.setText("");

        phrase.animateText();

        phrase.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                in_button.setVisibility(View.VISIBLE);
                in_button.startAnimation(in_right);

                in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        in_button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public static void addPhrase(Button out_button, Button in_button1,
                                 Button in_button2, TypewriterEffect phrase,
                                 Animation out_right, Animation in_left,
                                 TextView TV) {

        out_button.setEnabled(false);
        out_button.startAnimation(out_right);

        out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                out_button.setVisibility(View.GONE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        TV.setText("");

        phrase.animateText();

        phrase.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                in_button1.setVisibility(View.VISIBLE);
                in_button1.startAnimation(in_left);
                in_button2.setVisibility(View.VISIBLE);
                in_button2.startAnimation(in_left);

                in_left.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        in_button1.setEnabled(true);
                        in_button2.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public static void addPhrase(Button in_button1, Button test_costil, Button out_button1,
                                 Button out_button2, TypewriterEffect phrase,
                                 Animation out_left, Animation in_right,
                                 TextView TV) {

        out_button1.setEnabled(false);
        out_button1.startAnimation(out_left);

        out_button2.setEnabled(false);
        out_button2.startAnimation(out_left);

        out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                out_button1.setVisibility(View.GONE);
                out_button2.setVisibility(View.GONE);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        TV.setText("");

        phrase.animateText();

        phrase.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                in_button1.setVisibility(View.VISIBLE);
                in_button1.startAnimation(in_right);

                in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        in_button1.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
}
