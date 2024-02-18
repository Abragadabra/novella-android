package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FirstDay extends AppCompatActivity {

    Button nextButton;                              // Кнопка "далее"
    Button nextButton_2;                              // Кнопка "далее" 2
    Button nextButton_3;                              // Кнопка "далее" 3
    Button nextButton_4;                              // Кнопка "далее" 4

    Button takeJacketButton;
    Button passJacketButton;
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    TextView mainText;                              // Поле с текстом
    TypewriterEffect day1_dialog1_effect;           // Эффект диалога 1
    TypewriterEffect day1_dialog2_effect;           // Эффект диалога 2
    TypewriterEffect day1_dialog3_effect;           // Эффект диалога 3
    TypewriterEffect day1_dialog4_effect;           // Эффект диалога 4
    TypewriterEffect day1_dialog5_effect;           // Эффект диалога 5
    TypewriterEffect day1_dialog6_effect;           // Эффект диалога 6 (извинение за опоздание)
    TypewriterEffect day1_dialog7_effect;           // Эффект диалога 7 (Кастрюлева)
    TypewriterEffect day1_dialog8_effect;           // Эффект диалога 8 (Кастрюлева)

    TypewriterEffect day1_dialog9_effect;           // Эффект диалога 9 (Кастрюлева)
    TypewriterEffect day1_dialog10_effect;           // Эффект диалога 10 (Кастрюлева)

    RelativeLayout relativeLayout;                  // Текущий layout
    LinearLayout buttonsChoiceLayout;               // Linear с кнопками выбора

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

        // Присвоение значений переменным
        nextButton = findViewById(R.id.next_button);
        nextButton_2 = findViewById(R.id.next_button_2);
        nextButton_3 = findViewById(R.id.next_button_3);
        nextButton_4 = findViewById(R.id.next_button_4);

        takeJacketButton = findViewById(R.id.choice_button_1);
        passJacketButton = findViewById(R.id.choice_button_2);

        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);

        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);

        mainText = findViewById(R.id.first_day_text);

        relativeLayout = findViewById(R.id.first_day_layout);
        buttonsChoiceLayout = findViewById(R.id.choice_1);

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


        // Анимация первой фразы
        day1_dialog1_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog1, 60);
        day1_dialog1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim_button_in_right);
            }
        });
        // Старт анимации
        day1_dialog1_effect.animateText();
    }

    // Скип анимации на каждый диалог
    public void skipAnimation(View view) {
        HelperClass.stopAnimation(day1_dialog1_effect);
        HelperClass.stopAnimation(day1_dialog2_effect);
        HelperClass.stopAnimation(day1_dialog3_effect);
        HelperClass.stopAnimation(day1_dialog4_effect);
        HelperClass.stopAnimation(day1_dialog5_effect);
        HelperClass.stopAnimation(day1_dialog6_effect);
        HelperClass.stopAnimation(day1_dialog7_effect);
        HelperClass.stopAnimation(day1_dialog8_effect);
        HelperClass.stopAnimation(day1_dialog9_effect);
        HelperClass.stopAnimation(day1_dialog10_effect);

    }

    // Вроде тут след фраза при нажатии на кнопку (Меняет первый текст на второй)
    public void nextPhrase(View view) {
        // Прячем кнопку
        nextButton.setEnabled(false);
        nextButton.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day1_dialog2_effect = new TypewriterEffect(mainText, Dialogues.day1_dialog2, 60);

        // Старт анимции
        day1_dialog2_effect.animateText();

        // События анимации
        day1_dialog2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Меняем фон при завершении анимации
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.bedroom);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.garderob);
                HelperClass.animBackground(relativeLayout, bg1, bg2);

                // Очистка поля текста
                mainText.setText("");

                // Третья фраза главного героя
                day1_dialog3_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe1, 60);

                // Старт фразы
                day1_dialog3_effect.animateText();

                // Событие по окончанию анимации третьей фразы
                day1_dialog3_effect.setListener(new TypewriterListener() {
                    @Override
                    public void onAnimationEnd() {
                        takeJacketButton.setVisibility(View.VISIBLE);
                        passJacketButton.setVisibility(View.VISIBLE);

                        takeJacketButton.startAnimation(anim_button_in_left);
                        passJacketButton.startAnimation(anim_button_in_left);
                    }
                });
            }
        });

    }



    // Берём куртку
    public void takeJacket(View view) {
        PlayerData.jacket = true;

        takeJacketButton.setEnabled(false);
        passJacketButton.setEnabled(false);

        takeJacketButton.startAnimation(anim_button_out_left);
        passJacketButton.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                takeJacketButton.setVisibility(View.INVISIBLE);
                passJacketButton.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Когда мы берем куртку, начинается day1_dialog4_effect
        mainText.setText("");
        day1_dialog4_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant1, 60);
        day1_dialog4_effect.animateText();

        // Показываем кнопку ДАЛЕЕ, когда завершился day1_dialog_4_effect
        day1_dialog4_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_2.setVisibility(View.VISIBLE);
                nextButton_2.startAnimation(anim_button_in_right);
            }
        });


    }

    // Событие на кнопку далее_2
    public void nextPhrase_2(View view) {
        // Прячем кнопку
        nextButton_2.setEnabled(false);
        nextButton_2.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_2.setVisibility(View.INVISIBLE);

                // Меняем фон при завершении анимации
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.garderob);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.class_1);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day1_dialog6_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_2, 60);

        // Старт анимции
        day1_dialog6_effect.animateText();

        // События анимации
        day1_dialog6_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {


                // Очистка поля текста
                mainText.setText("");

                // Третья фраза главного героя
                day1_dialog7_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_3, 60);

                // Старт фразы
                day1_dialog7_effect.animateText();

                // Событие по окончанию анимации фразы
                day1_dialog7_effect.setListener(new TypewriterListener() {
                    @Override
                    public void onAnimationEnd() {
                        nextButton_3.setVisibility(View.VISIBLE);
                        nextButton_3.startAnimation(anim_button_in_right);
                    }
                });
            }
        });

    }

    // Событие на кнопку 3
    public void nextPhrase_3(View view) {
        // Прячем кнопку
        nextButton_3.setEnabled(false);
        nextButton_3.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_3.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация восьмой фразы
        day1_dialog8_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_4, 60);

        // Старт анимации
        day1_dialog8_effect.animateText();

        // События анимации
        day1_dialog8_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                day1_dialog8_effect.setListener(new TypewriterListener() {
                    @Override
                    public void onAnimationEnd() {
                        // Показываем кнопку далее4
                        nextButton_4.setVisibility(View.VISIBLE);
                        nextButton_4.startAnimation(anim_button_in_right);
                    }
                });
            }
        });

    }

    

    // Не берём куртку
    public void passJacket(View view) {
        takeJacketButton.setEnabled(false);
        passJacketButton.setEnabled(false);

        takeJacketButton.startAnimation(anim_button_out_left);
        passJacketButton.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                takeJacketButton.setVisibility(View.INVISIBLE);
                passJacketButton.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mainText.setText("");
        day1_dialog5_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_1, 60);
        day1_dialog5_effect.animateText();
    }


}