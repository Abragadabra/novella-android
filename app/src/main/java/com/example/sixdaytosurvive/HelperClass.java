package com.example.sixdaytosurvive;

import android.media.MediaPlayer;

public class HelperClass {
    public static MediaPlayer menuSound;

    public static void stopAnimation(TypewriterEffect typewriterEffect) {
        if (typewriterEffect != null && typewriterEffect.animationRunning) {
            typewriterEffect.completeTextAnimation();
        }
    }
}
