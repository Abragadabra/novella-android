package com.example.sixdaytosurvive;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.widget.TextView;

public class TypewriterEffect {

    private final TextView textView;
    private final String text;
    private final long delay;
    private TypewriterListener listener; // Добавляем поле для listener

    public TypewriterEffect(TextView textView, String text, long delay) {
        this.textView = textView;
        this.text = text;
        this.delay = delay;
    }

    public void setListener(TypewriterListener listener) {
        this.listener = listener;
    }

    public void animateText() {
        textView.setText("");
        animateText(0);
    }

    @SuppressLint("SetTextI18n")
    private void animateText(final int index) {
        if (index < text.length()) {
            textView.setText(textView.getText().toString() + text.charAt(index));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    animateText(index + 1);
                }
            }, delay);
        } else {
            if (listener != null) {
                listener.onAnimationEnd(); // Вызываем обратный вызов
            }
        }
    }
}