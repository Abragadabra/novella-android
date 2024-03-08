package me.absurdteam.sixdaytosurvive;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.media.MediaPlayer;

public class MusicClass extends Application {
    private static MediaPlayer bgMusic;

    @Override
    public void onCreate() {
        super.onCreate();

        bgMusic = MediaPlayer.create(this, R.raw.bg_new);
    }

    public static void startMusic() {
        if (bgMusic != null && !bgMusic.isPlaying()) {
            bgMusic.start();
        }
    }

    public static void stopMusic() {
        if (bgMusic != null && bgMusic.isPlaying()) {
            bgMusic.pause();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            startMusic();
        }
    }
}
