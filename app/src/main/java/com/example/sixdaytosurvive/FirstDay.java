package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
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
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // Кнопки для выбора действий в гардеробе
    Button takeJacketButton;    // Взять куртку
    Button passJacketButton;    // Сдать куртку

    // Кнопки для выбора действий в столовой
    Button takeFoodButton;      // Взять жратву от дырова
    Button passFoodButton;      // Отказаться от еды и быть сигмой


    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------


    TextView mainText;                              // Поле с текстом


    // ------------------------------ Диалоги ------------------------------
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
    TypewriterEffect day1_dialog11_effect;           // Эффект диалога 11 (Кастрюлева)
    TypewriterEffect day1_dialog12_effect;           // Эффект диалога 12 (Сели на паре Кастрюлевой вместе со Степанидой)
    TypewriterEffect day1_dialog13_effect;           // Эффект диалога 13 (Засыпаем на паре)
    TypewriterEffect day1_dialog14_effect;           // Эффект диалога 14 (Конец первой пары... УРА)
    TypewriterEffect day1_dialog15_effect;           // Эффект диалога 15 (Столовая)
    TypewriterEffect day1_dialog16_effect;           // Эффект диалога 16 (Дыров предлагает еду)
    TypewriterEffect day1_dialog17_effect;           // Эффект диалога 17 (Мы приняли еду)
    TypewriterEffect day1_dialog18_effect;           // Эффект диалога 18 (Мы отказались от еды)
    TypewriterEffect day1_dialog19_effect;           // Эффект диалога 19 (Пара Лососевой)
    TypewriterEffect day1_dialog20_effect;           // Эффект диалога 20 (Если куртку сдана в гардероб)
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_day);

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
        // --------- Получение кнопок "далее" ---------


        // ------ Получение кнопок "выбора куртки" ------
        takeJacketButton = findViewById(R.id.choice_button_1);
        passJacketButton = findViewById(R.id.choice_button_2);
        // ------ Получение кнопок "выбора куртки" ------


        // ------ Получение кнопок "выбора еды" ------
        takeFoodButton = findViewById(R.id.choice_button_3);
        passFoodButton = findViewById(R.id.choice_button_4);
        // ------ Получение кнопок "выбора еды" ------


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
        HelperClass.stopAnimation(day1_dialog11_effect);
        HelperClass.stopAnimation(day1_dialog12_effect);
        HelperClass.stopAnimation(day1_dialog13_effect);
        HelperClass.stopAnimation(day1_dialog14_effect);
        HelperClass.stopAnimation(day1_dialog15_effect);
        HelperClass.stopAnimation(day1_dialog16_effect);
        HelperClass.stopAnimation(day1_dialog17_effect);
        HelperClass.stopAnimation(day1_dialog18_effect);
        HelperClass.stopAnimation(day1_dialog19_effect);
        HelperClass.stopAnimation(day1_dialog20_effect);
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
                nextButton.setVisibility(View.GONE);
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


    // ждём в гардеробе
    public void passJacket(View view) {
        PlayerData.jacket = false;

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
                takeJacketButton.setVisibility(View.GONE);
                passJacketButton.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // мы ждем очереди
        mainText.setText("");
        day1_dialog4_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_1, 60);
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
                nextButton_2.setVisibility(View.GONE);

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
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_3.setVisibility(View.VISIBLE);
                nextButton_3.startAnimation(anim_button_in_right);
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
                nextButton_3.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация восьмой фразы
        day1_dialog8_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_3, 60);

        // Старт анимации
        day1_dialog8_effect.animateText();

        // События анимации
        day1_dialog8_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее4
                nextButton_4.setVisibility(View.VISIBLE);
                nextButton_4.startAnimation(anim_button_in_right);
            }
        });
    }

    // Событие на нажатие кнопки далее4
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

        // Анимация восьмой фразы
        day1_dialog9_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_4, 60);

        // Старт анимации
        day1_dialog9_effect.animateText();

        // События анимации
        day1_dialog9_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее5
                nextButton_5.setVisibility(View.VISIBLE);
                nextButton_5.startAnimation(anim_button_in_right);
            }
        });
    }

    // Событие при нажатии кнопки далее5
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

        // Анимация восьмой фразы
        day1_dialog10_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_5, 60);

        // Старт анимации
        day1_dialog10_effect.animateText();

        // События анимации
        day1_dialog10_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее6
                nextButton_6.setVisibility(View.VISIBLE);
                nextButton_6.startAnimation(anim_button_in_right);
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

        // Анимация восьмой фразы
        day1_dialog11_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant2_6, 60);

        // Старт анимации
        day1_dialog11_effect.animateText();

        // События анимации
        day1_dialog11_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее7
                nextButton_7.setVisibility(View.VISIBLE);
                nextButton_7.startAnimation(anim_button_in_right);
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
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация восьмой фразы
        day1_dialog12_effect = new TypewriterEffect(mainText, Dialogues.day1_class1_1, 60);

        // Старт анимации
        day1_dialog12_effect.animateText();

        // События анимации
        day1_dialog12_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее8
                nextButton_8.setVisibility(View.VISIBLE);
                nextButton_8.startAnimation(anim_button_in_right);
            }
        });
    }

    // Не берём куртку
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
                takeJacketButton.setVisibility(View.GONE);
                passJacketButton.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        mainText.setText("");
        day1_dialog5_effect = new TypewriterEffect(mainText, Dialogues.day1_warderobe_variant1, 60);
        day1_dialog5_effect.animateText();

        day1_dialog5_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее6
                nextButton_7.setVisibility(View.VISIBLE);
                nextButton_7.startAnimation(anim_button_in_right);
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

        // Анимация восьмой фразы
        day1_dialog13_effect = new TypewriterEffect(mainText, Dialogues.day1_class1_2, 60);

        // Старт анимации
        day1_dialog13_effect.animateText();

        // События анимации
        day1_dialog13_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее8
                nextButton_9.setVisibility(View.VISIBLE);
                nextButton_9.startAnimation(anim_button_in_right);
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
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация восьмой фразы
        day1_dialog14_effect = new TypewriterEffect(mainText, Dialogues.day1_class1_3, 60);

        // Старт анимации
        day1_dialog14_effect.animateText();

        // События анимации
        day1_dialog14_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее8
                nextButton_10.setVisibility(View.VISIBLE);
                nextButton_10.startAnimation(anim_button_in_right);
            }
        });
    }

    //    ---------------------------СТОЛОВАЯ---------------------------
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
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация восьмой фразы
        day1_dialog15_effect = new TypewriterEffect(mainText, Dialogues.day1_canteen_1, 60);

        // Старт анимации
        day1_dialog15_effect.animateText();

        // События анимации
        day1_dialog15_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее8
                nextButton_11.setVisibility(View.VISIBLE);
                nextButton_11.startAnimation(anim_button_in_right);
            }
        });
    }

    // Столовая и появление выбора
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

        // Анимация восьмой фразы
        day1_dialog16_effect = new TypewriterEffect(mainText, Dialogues.day1_canteen_2, 60);

        // Старт анимации
        day1_dialog16_effect.animateText();

        // События анимации
        day1_dialog16_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопки выбора ответа в столовой
                takeFoodButton.setVisibility(View.VISIBLE);
                passFoodButton.setVisibility(View.VISIBLE);
                // Начинаем анимации на кнопки выбора ответа в столовой
                takeFoodButton.startAnimation(anim_button_in_left);
                passFoodButton.startAnimation(anim_button_in_left);
            }
        });
    }

    // Событие при отказе от еды
    public void passFood(View view) {
        takeFoodButton.setEnabled(false);
        passFoodButton.setEnabled(false);

        takeFoodButton.startAnimation(anim_button_out_left);
        passFoodButton.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                takeFoodButton.setVisibility(View.GONE);
                passFoodButton.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // мы ждем очереди
        mainText.setText("");
        day1_dialog18_effect = new TypewriterEffect(mainText, Dialogues.day1_canteen_no, 60);
        day1_dialog18_effect.animateText();

        // Показываем кнопку ДАЛЕЕ, когда завершился day1_dialog_4_effect
        day1_dialog18_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_12.setVisibility(View.VISIBLE);
                nextButton_12.startAnimation(anim_button_in_right);
            }
        });
    }

    // Событие при принятии еды
    public void takeFood(View view) {
        takeFoodButton.setEnabled(false);
        passFoodButton.setEnabled(false);

        takeFoodButton.startAnimation(anim_button_out_left);
        passFoodButton.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                takeFoodButton.setVisibility(View.GONE);
                passFoodButton.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // мы ждем очереди
        mainText.setText("");
        day1_dialog17_effect = new TypewriterEffect(mainText, Dialogues.day1_canteen_yes, 60);
        day1_dialog17_effect.animateText();

        // Показываем кнопку ДАЛЕЕ
        day1_dialog17_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_12.setVisibility(View.VISIBLE);
                nextButton_12.startAnimation(anim_button_in_right);
            }
        });
    }

    //    ---------------------------ВТОРАЯ ПАРА (ЛОСОСЕВА)---------------------------

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

        // Анимация 19 фразы
        day1_dialog19_effect = new TypewriterEffect(mainText, Dialogues.day1_class2_1, 60);

        // Старт анимации
        day1_dialog19_effect.animateText();

        // События анимации
        day1_dialog19_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Показываем кнопку далее13
                nextButton_13.setVisibility(View.VISIBLE);
                nextButton_13.startAnimation(anim_button_in_right);
            }
        });
    }

    //    ---------------------------Гардероб, если у нас куртку в гардеробе)---------------------------
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

        // Если куртка в гардеробе - ждем
        if (PlayerData.jacket == false) {
            PlayerData.oladushkinTest = true;

            // Очистка поля текста
            mainText.setText("");

            // Анимация 19 фразы
            day1_dialog20_effect = new TypewriterEffect(mainText, Dialogues.day1_end_if_jacket_false, 60);

            // Старт анимации
            day1_dialog20_effect.animateText();

            // События анимации
            day1_dialog20_effect.setListener(new TypewriterListener() {
                @Override
                public void onAnimationEnd() {
                    // Показываем кнопку далее14
                    nextButton_14.setVisibility(View.VISIBLE);
                    nextButton_14.startAnimation(anim_button_in_right);
                }
            });
        }
        // Иначе начинается новый день
        else {
            nextButton_14.setVisibility(View.VISIBLE);
            nextButton_14.startAnimation(anim_button_in_right);
        }

    }


    public void nextPhrase_14(View view) {
        // Прячем кнопку
        nextButton_12.setEnabled(false);
        nextButton_12.startAnimation(anim_button_out_right);
        setDay2();
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
    }

    public void setDay2() {
        // // Новый intent для открытия главного меню
        Intent intent = new Intent(FirstDay.this, SplashScreenTuesday.class);

        // Открываем новое активити
        FirstDay.this.startActivity(intent);

        // Завершаем текущее активити
        FirstDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}