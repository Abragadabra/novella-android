package com.example.sixdaytosurvive;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HelperClass {
    public static MediaPlayer menuSound;        // Фоновая музыка меню
    public static MediaPlayer alarmSound;       // Звук будильника

    // Остановка анимации с проверкой на то, что анимация существует и остановлена
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

//    public static void addPhrase(Button out_button1, Button out_button2, Button in_button1,
//                                 Button in_button2, TypewriterEffect phrase,
//                                 Animation in_right, Animation out_right, TextView TV) {
//        out_button.setEnabled(false);
//        out_button.startAnimation(out_right);
//
//        out_right.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                out_button.setVisibility(View.GONE);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//
//        TV.setText("");
//
//        phrase.animateText();
//
//        phrase.setListener(new TypewriterListener() {
//            @Override
//            public void onAnimationEnd() {
//                in_button.setVisibility(View.VISIBLE);
//                in_button.startAnimation(in_right);
//
//                in_right.setAnimationListener(new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        in_button.setEnabled(true);
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animation animation) {
//
//                    }
//                });
//            }
//        });
//    }
}
