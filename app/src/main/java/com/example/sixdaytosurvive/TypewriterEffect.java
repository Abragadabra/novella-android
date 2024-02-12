package com.example.sixdaytosurvive;

import android.os.Handler;
import android.widget.TextView;

public class TypewriterEffect {

    private TextView textView;
    private String text;
    private long delay;

    public TypewriterEffect(TextView textView, String text, long delay) {
        this.textView = textView;
        this.text = text;
        this.delay = delay;
    }

    public void animateText() {
        textView.setText("");
        animateText(0);
    }

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
        }
    }
}