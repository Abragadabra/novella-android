package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button nextButton;                                // Кнопка "далее"
    Button nextButton_2;                              // Кнопка "далее" 2
    Button nextButton_3;                              // Кнопка "далее" 3
    Button nextButton_4;                              // Кнопка "далее" 4
    Button nextButton_5;                              // Кнопка "далее" 5
    Button nextButton_6;                              // Кнопка "далее" 6
    Button nextButton_7;                              // Кнопка "далее" 7
    Button nextButton_8;                              // Кнопка "далее" 8
    Button nextButton_9;                              // Кнопка "далее" 9
    Button nextButton_10;                             // Кнопка "далее" 10
    Button nextButton_11;                             // Кнопка "далее" 11
    Button nextButton_12;                             // Кнопка "далее" 12
    Button nextButton_13;                             // Кнопка "далее" 13
    Button nextButton_14;                             // Кнопка "далее" 14
    Button nextButton_15;                             // Кнопка "далее" 14
    Button nextButton_16;                             // Кнопка "далее" 14
    Button nextButton_17;                             // Кнопка "далее" 14

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    TextView mainText;                              // Поле с текстом
    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day3_dialog1_effect;           // Эффект диалога 1
    TypewriterEffect day3_dialog2_effect;           // Эффект диалога 2
    TypewriterEffect day3_dialog3_effect;           // Эффект диалога 3
    TypewriterEffect day3_dialog4_effect;           // Эффект диалога 4
    TypewriterEffect day3_dialog5_effect;           // Эффект диалога 5
    TypewriterEffect day3_dialog6_effect;           // Эффект диалога 6
    TypewriterEffect day3_dialog7_effect;           // Эффект диалога 7
    TypewriterEffect day3_dialog8_effect;           // Эффект диалога 8
    TypewriterEffect day3_dialog9_effect;           // Эффект диалога 9
    TypewriterEffect day3_dialog10_effect;           // Эффект диалога 10
    TypewriterEffect day3_dialog11_effect;           // Эффект диалога 11
    TypewriterEffect day3_dialog12_effect;           // Эффект диалога 12
    TypewriterEffect day3_dialog13_effect;           // Эффект диалога 13
    TypewriterEffect day3_dialog14_effect;           // Эффект диалога 14
    TypewriterEffect day3_dialog15_effect;           // Эффект диалога 15
    TypewriterEffect day3_dialog16_effect;           // Эффект диалога 16
    TypewriterEffect day3_dialog17_effect;           // Эффект диалога 17
    TypewriterEffect day3_dialog18_effect;           // Эффект диалога 18
    TypewriterEffect day3_dialog19_effect;           // Эффект диалога 19
    TypewriterEffect day3_dialog20_effect;           // Эффект диалога 20
    // ------------------------------ Диалоги ------------------------------

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_day);

        // --------- Получение кнопок "далее" ---------
        nextButton = findViewById(R.id.next_button);
        nextButton_2 = findViewById(R.id.next_button_2);
        nextButton_3 = findViewById(R.id.next_button_3);
        nextButton_4 = findViewById(R.id.next_button_4);
        nextButton_5 = findViewById(R.id.next_button_5);
        nextButton_6 = findViewById(R.id.next_button_6);
        nextButton_7 = findViewById(R.id.next_button_7);
        nextButton_8 = findViewById(R.id.next_button_8);
        nextButton_9 = findViewById(R.id.next_button_9);
        nextButton_10 = findViewById(R.id.next_button_10);
        nextButton_11 = findViewById(R.id.next_button_11);
        nextButton_12 = findViewById(R.id.next_button_12);
        nextButton_13 = findViewById(R.id.next_button_13);
        nextButton_14 = findViewById(R.id.next_button_14);
        nextButton_15 = findViewById(R.id.next_button_15);
        nextButton_16 = findViewById(R.id.next_button_16);
        nextButton_17 = findViewById(R.id.next_button_17);


        // --------- Получение кнопок "далее" ---------

        // ------------------------------ Получение анимации справа экрана ------------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ------------------------------ Получение анимации справа экрана ------------------------------


        // ------------------------------ Получение анимации слева экрана ------------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ------------------------------ Получение анимации слева экрана ------------------------------

        // Получени поля с тектом
        mainText = findViewById(R.id.first_day_text);

        // Получение основной вёрстки
        relativeLayout = findViewById(R.id.first_day_layout);

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

        // Анимация первой фразы (мы проснулись в понедельник)
        day3_dialog1_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_1, 60);
        day3_dialog1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // Старт анимации
        day3_dialog1_effect.animateText();

    }

    // Скип анимации на каждый диалог
    public void skipAnimation(View view) {
        HelperClass.stopAnimation(day3_dialog1_effect);
        HelperClass.stopAnimation(day3_dialog2_effect);
        HelperClass.stopAnimation(day3_dialog3_effect);
        HelperClass.stopAnimation(day3_dialog4_effect);
        HelperClass.stopAnimation(day3_dialog5_effect);
        HelperClass.stopAnimation(day3_dialog6_effect);
        HelperClass.stopAnimation(day3_dialog7_effect);
        HelperClass.stopAnimation(day3_dialog8_effect);
        HelperClass.stopAnimation(day3_dialog9_effect);
        HelperClass.stopAnimation(day3_dialog10_effect);
        HelperClass.stopAnimation(day3_dialog11_effect);
        HelperClass.stopAnimation(day3_dialog12_effect);
        HelperClass.stopAnimation(day3_dialog13_effect);
        HelperClass.stopAnimation(day3_dialog14_effect);
        HelperClass.stopAnimation(day3_dialog15_effect);
        HelperClass.stopAnimation(day3_dialog16_effect);
        HelperClass.stopAnimation(day3_dialog17_effect);
        HelperClass.stopAnimation(day3_dialog18_effect);
        HelperClass.stopAnimation(day3_dialog19_effect);
        HelperClass.stopAnimation(day3_dialog20_effect);
    }

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
                nextButton.setVisibility(View.GONE);

                // Меняем фон при завершении анимации
                Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.bedroom);
                Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
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
        day3_dialog2_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_2, 60);

        // Старт анимции
        day3_dialog2_effect.animateText();

        // События анимации
        day3_dialog2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_2.setVisibility(View.VISIBLE);
                nextButton_2.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_2.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

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
                nextButton_2.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog3_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_test_false, 60);

        // Старт анимции
        day3_dialog3_effect.animateText();

        // События анимации
        day3_dialog3_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_3.setVisibility(View.VISIBLE);
                nextButton_3.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_3.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

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
                nextButton_3.setVisibility(View.GONE);

                // Меняем фон при завершении анимации
                Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
                Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.dushnya_class);
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
        day3_dialog4_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_1, 60);

        // Старт анимции
        day3_dialog4_effect.animateText();

        // События анимации
        day3_dialog4_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_4.setVisibility(View.VISIBLE);
                nextButton_4.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_4.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_4(View view) {
        // Прячем кнопку
        nextButton_4.setEnabled(false);
        nextButton_4.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_4.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog5_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_2, 60);

        // Старт анимции
        day3_dialog5_effect.animateText();

        // События анимации
        day3_dialog5_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_5.setVisibility(View.VISIBLE);
                nextButton_5.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_5.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_5(View view) {
        // Прячем кнопку
        nextButton_5.setEnabled(false);
        nextButton_5.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_5.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog6_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_3, 60);

        // Старт анимции
        day3_dialog6_effect.animateText();

        // События анимации
        day3_dialog6_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_6.setVisibility(View.VISIBLE);
                nextButton_6.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_6.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_6(View view) {
        // Прячем кнопку
        nextButton_6.setEnabled(false);
        nextButton_6.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_6.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog7_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_4, 60);

        // Старт анимции
        day3_dialog7_effect.animateText();

        // События анимации
        day3_dialog7_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_7.setVisibility(View.VISIBLE);
                nextButton_7.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_7.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_7(View view) {
        // Прячем кнопку
        nextButton_7.setEnabled(false);
        nextButton_7.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_7.setVisibility(View.GONE);

                // Смена фона
                Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.dushnya_class);
                Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kastryuleva_class);
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
        day3_dialog8_effect = new TypewriterEffect(mainText, Dialogues.day3_class_3_1, 60);

        // Старт анимции
        day3_dialog8_effect.animateText();

        // События анимации
        day3_dialog8_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_8.setVisibility(View.VISIBLE);
                nextButton_8.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_8.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_8(View view) {
        // Прячем кнопку
        nextButton_8.setEnabled(false);
        nextButton_8.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_8.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog9_effect = new TypewriterEffect(mainText, Dialogues.day3_class_3_2, 60);

        // Старт анимции
        day3_dialog9_effect.animateText();

        // События анимации
        day3_dialog9_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_9.setVisibility(View.VISIBLE);
                nextButton_9.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_9.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_9(View view) {
        // Прячем кнопку
        nextButton_9.setEnabled(false);
        nextButton_9.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_9.setVisibility(View.GONE);

                // Смена фона
                Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kastryuleva_class);
                Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.garderob);
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
        day3_dialog10_effect = new TypewriterEffect(mainText, Dialogues.day3_warderobe, 60);

        // Старт анимции
        day3_dialog10_effect.animateText();

        // События анимации
        day3_dialog10_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_10.setVisibility(View.VISIBLE);
                nextButton_10.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_10.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    // Кнопка смены дня, если отношения = 0, если они больше 0, продолжается день
    public void nextPhrase_10(View view) {
        // Прячем кнопку
        nextButton_10.setEnabled(false);
        nextButton_10.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_10.setVisibility(View.GONE);

                if (PlayerData.loveLevel > 0) {
                    Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.garderob);
                    Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.home_computer);
                    HelperClass.animBackground(relativeLayout, bg1, bg2);
                }

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });
        if (PlayerData.loveLevel > 0) {
            mainText.setText("");

            // Анимация второй фразы
            day3_dialog11_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_1, 60);

            // Старт анимции
            day3_dialog11_effect.animateText();

            // События анимации
            day3_dialog11_effect.setListener(new TypewriterListener() {
                @Override
                public void onAnimationEnd() {
                    // По окончанию анимация печатания вызываем кнопку "далее"
                    nextButton_11.setVisibility(View.VISIBLE);
                    nextButton_11.startAnimation(anim_button_in_right);

                    anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            nextButton_11.setEnabled(true);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                }
            });
        } else {
            setDay4();
        }

    }


    public void nextPhrase_11(View view) {
        // Прячем кнопку
        nextButton_11.setEnabled(false);
        nextButton_11.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_11.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog12_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_2, 60);

        // Старт анимции
        day3_dialog12_effect.animateText();

        // События анимации
        day3_dialog12_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_12.setVisibility(View.VISIBLE);
                nextButton_12.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_12.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_12(View view) {
        // Прячем кнопку
        nextButton_12.setEnabled(false);
        nextButton_12.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_12.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog13_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_3, 60);

        // Старт анимции
        day3_dialog13_effect.animateText();

        // События анимации
        day3_dialog13_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_13.setVisibility(View.VISIBLE);
                nextButton_13.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_13.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_13(View view) {
        // Прячем кнопку
        nextButton_13.setEnabled(false);
        nextButton_13.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_13.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog14_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_4, 60);

        // Старт анимции
        day3_dialog14_effect.animateText();

        // События анимации
        day3_dialog14_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_14.setVisibility(View.VISIBLE);
                nextButton_14.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_14.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_14(View view) {
        // Прячем кнопку
        nextButton_14.setEnabled(false);
        nextButton_14.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_14.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog15_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_5, 60);

        // Старт анимции
        day3_dialog15_effect.animateText();

        // События анимации
        day3_dialog15_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_15.setVisibility(View.VISIBLE);
                nextButton_15.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_15.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_15(View view) {
        // Прячем кнопку
        nextButton_15.setEnabled(false);
        nextButton_15.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_15.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog16_effect = new TypewriterEffect(mainText, Dialogues.day3_home_stepanida_6, 60);

        // Старт анимции
        day3_dialog16_effect.animateText();

        // События анимации
        day3_dialog16_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_16.setVisibility(View.VISIBLE);
                nextButton_16.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        nextButton_16.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_16(View view) {
        // Прячем кнопку
        nextButton_16.setEnabled(false);
        nextButton_16.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_16.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });
        setDay4();
    }

    // СМЕНА ДНЯ (на данный момент этого дня нет, поэтому игра завершится)
    public void setDay4() {
        Toast.makeText(this, "Тупик! Четвёрга пока нет!!!", Toast.LENGTH_SHORT).show();
    }
}