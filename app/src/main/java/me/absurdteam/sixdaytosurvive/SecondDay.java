package me.absurdteam.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import me.absurdteam.sixdaytosurvive.R;

public class SecondDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button nextButton1;
    Button nextButton2;
    Button nextButton3;
    Button nextButton4;
    Button nextButton5;
    Button nextButton6;
    Button nextButton7;
    Button nextButton8;
    Button nextButton9;
    Button nextButton10;
    Button nextButton11;
    Button nextButton12;
    Button nextButton13;
    Button nextButton14;
    Button nextButton15;
    Button nextButton16;
    Button nextButton17;
    Button nextButton18;
    Button nextButton19;
    Button nextButton20;
    Button nextButton21;
    Button nextButton22;
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------
    Button choiceButton1;
    Button choiceButton2;
    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------

    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------
    Button choiceButton3;
    Button choiceButton4;
    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day2_monolog_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_1_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_2_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_3_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_4_effect;
    TypewriterEffect day2_class1_1_effect;
    TypewriterEffect day2_canteen_1_effect;
    TypewriterEffect day2_canteen_baget_effect;
    TypewriterEffect day2_canteen_sosiska_1_effect;
    TypewriterEffect day2_canteen_sosiska_2_effect;
    TypewriterEffect day2_canteen_sosiska_3_effect;
    TypewriterEffect day2_canteen_sosiska_4_effect;
    TypewriterEffect day2_class2_evlampiy_1_effect;
    TypewriterEffect day2_class2_stepanida_1_effect;
    TypewriterEffect day2_class2_stepanida_2_effect;
    TypewriterEffect day2_class2_stepanida_3_effect;
    TypewriterEffect day2_class23_1_effect;
    TypewriterEffect day2_class23_2_effect;
    TypewriterEffect day2_class23_3_effect;
    TypewriterEffect day2_class23_4_effect;
    TypewriterEffect day2_class23_5_effect;
    TypewriterEffect day2_home_1_effect;
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;

    // Фон паузы
    LinearLayout pauseBackground;
    LinearLayout pauseMenu;

    // Кнопки в меню паузы
    Button continueButton;
    Button saveButton;

    private static final String PREFS_FILE = "saves";

    SharedPreferences saves;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_day);

        // --------- Получение кнопок по id "далее" ---------
        nextButton1 = findViewById(R.id.next_button_day2);
        nextButton2 = findViewById(R.id.next_button_2_day2);
        nextButton3 = findViewById(R.id.next_button_3_day2);
        nextButton4 = findViewById(R.id.next_button_4_day2);
        nextButton5 = findViewById(R.id.next_button_5_day2);
        nextButton6 = findViewById(R.id.next_button_6_day2);
        nextButton7 = findViewById(R.id.next_button_7_day2);
        nextButton8 = findViewById(R.id.next_button_8_day2);
        nextButton9 = findViewById(R.id.next_button_9_day2);
        nextButton10 = findViewById(R.id.next_button_10_day2);
        nextButton11 = findViewById(R.id.next_button_11_day2);
        nextButton12 = findViewById(R.id.next_button_12_day2);
        nextButton13 = findViewById(R.id.next_button_13_day2);
        nextButton14 = findViewById(R.id.next_button_14_day2);
        nextButton15 = findViewById(R.id.next_button_15_day2);
        nextButton16 = findViewById(R.id.next_button_16_day2);
        nextButton17 = findViewById(R.id.next_button_17_day2);
        nextButton18 = findViewById(R.id.next_button_18_day2);
        nextButton19 = findViewById(R.id.next_button_19_day2);
        nextButton20 = findViewById(R.id.next_button_20_day2);
        nextButton21= findViewById(R.id.next_button_21_day2);
        nextButton22 = findViewById(R.id.next_button_22_day2);
        // --------- Получение кнопок по id "далее" ---------

        // ---------- Получение кнопок выбора по id ---------
        choiceButton1 = findViewById(R.id.choice_button1_day2);
        choiceButton2 = findViewById(R.id.choice_button2_day2);
        // ---------- Получение кнопок выбора по id ---------

        // ---------- Получение кнопок выбора по id ---------
        choiceButton3 = findViewById(R.id.choice_button3_day2);
        choiceButton4 = findViewById(R.id.choice_button4_day2);
        // ---------- Получение кнопок выбора по id ---------

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        // Получение по id основного TextView
        mainTV = findViewById(R.id.second_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.second_day_layout);

        // Получение фона паузы
        pauseBackground = findViewById(R.id.pause_menu_bg);

        // Получение меню паузы
        pauseMenu = findViewById(R.id.pause_menu);

        // Получение кнопок в меню паузы
        continueButton = findViewById(R.id.pause_menu_continue);
        saveButton = findViewById(R.id.pause_menu_save);

        // Экземпляр класса SharedPreferences
        saves = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);


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

        // Загрузка всех данных из сохранения в PlayerData
        HelperClass helperClass = new HelperClass();
        helperClass.loadAllGame(saves);

        day2_monolog_effect = new TypewriterEffect(mainTV, Dialogues.day2_monolog, 60);
        day2_monolog_effect.animateText();

        day2_monolog_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                nextButton1.setVisibility(View.VISIBLE);
                nextButton1.startAnimation(anim_button_in_right);
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation){nextButton1.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
            }


        });
    }

    public void skipPhrase() {
        HelperClass.stopAnimation(day2_monolog_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_1_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_2_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_3_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_4_effect);
        HelperClass.stopAnimation(day2_class1_1_effect);
        HelperClass.stopAnimation(day2_canteen_1_effect);
        HelperClass.stopAnimation(day2_canteen_baget_effect);
        HelperClass.stopAnimation(day2_canteen_sosiska_1_effect);
        HelperClass.stopAnimation(day2_canteen_sosiska_2_effect);
        HelperClass.stopAnimation(day2_canteen_sosiska_3_effect);
        HelperClass.stopAnimation(day2_canteen_sosiska_4_effect);
        HelperClass.stopAnimation(day2_class2_evlampiy_1_effect);
        HelperClass.stopAnimation(day2_class2_stepanida_1_effect);
        HelperClass.stopAnimation(day2_class2_stepanida_2_effect);
        HelperClass.stopAnimation(day2_class2_stepanida_3_effect);
        HelperClass.stopAnimation(day2_class23_1_effect);
        HelperClass.stopAnimation(day2_class23_2_effect);
        HelperClass.stopAnimation(day2_class23_3_effect);
        HelperClass.stopAnimation(day2_class23_4_effect);
        HelperClass.stopAnimation(day2_class23_5_effect);
        HelperClass.stopAnimation(day2_home_1_effect);
    }

    // Пропуск анимаций
    public void skipAnimationDay2(View view) {
        skipPhrase();
    }

    // Открытие меню паузы
    public void openPauseMenu(View view) {
        // Пропускаем текстик
        skipPhrase();

        // Включение визуально меню и его фона
        pauseBackground.setVisibility(View.VISIBLE);
        pauseMenu.setVisibility(View.VISIBLE);

        // Убираем фокус с элементов меню
        pauseBackground.setFocusable(true);
        pauseMenu.setFocusable(true);

        // Элементы меню больше не тыкательные
        pauseBackground.setClickable(true);
        pauseMenu.setClickable(true);

        // Включение кнопочек в меню, чтобы жмакались
        continueButton.setEnabled(true);
        saveButton.setEnabled(true);

        HelperClass.fadeIn(pauseBackground);
        HelperClass.fadeIn(pauseMenu);
    }

    // Закрытие меню паузы
    public void closePause(View view) {
        continueButton.setEnabled(false);
        saveButton.setEnabled(false);

        AlphaAnimation fadeOut = new AlphaAnimation(1f, 0f);
        fadeOut.setDuration(500);
        fadeOut.setFillAfter(true);

        pauseBackground.startAnimation(fadeOut);
        pauseMenu.startAnimation(fadeOut);

        fadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Включение визуально меню и его фона
                pauseBackground.setVisibility(View.INVISIBLE);
                pauseMenu.setVisibility(View.INVISIBLE);

                // Убираем фокус с элементов меню
                pauseBackground.setFocusable(false);
                pauseMenu.setFocusable(false);

                // Элементы меню больше не тыкательные
                pauseBackground.setClickable(false);
                pauseMenu.setClickable(false);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    // Сохранение игры
    public void saveGame(View view) {
        HelperClass helperClass = new HelperClass();
        helperClass.saveAllGame(2, saves);

        Toast.makeText(this, "Игра сохранена!", Toast.LENGTH_SHORT).show();
    }


    public void nextPhrase1(View view) {
        // Смена фона
        Drawable bg1 = relativeLayout.getBackground();
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.stepanida_evlampiy_corridor);
        HelperClass.animBackground(relativeLayout, bg1, bg2);

        day2_stepanida_evlampiy_ssora_effect = new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora, 60);

        HelperClass.addPhrase(nextButton1, nextButton2, day2_stepanida_evlampiy_ssora_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase2(View view) {

    }

    public void nextPhrase3(View view) {
    }

    public void nextPhrase4(View view) {
    }

    public void nextPhrase5(View view) {
    }

    public void nextPhrase6(View view) {
    }

    public void nextPhrase7(View view) {
    }

    public void nextPhrase8(View view) {
    }

    public void nextPhrase9(View view) {
    }

    public void nextPhrase10(View view) {
    }

    public void nextPhrase11(View view) {
    }

    public void nextPhrase12(View view) {
    }

    public void nextPhrase13(View view) {
    }

    public void nextPhrase14(View view) {
    }

    public void nextPhrase15(View view) {
    }

    public void nextPhrase16(View view) {
    }

    public void nextPhrase17(View view) {
    }

    public void nextPhrase18(View view) {
    }
    public void nextPhrase19(View view) {
    }

    public void nextPhrase20(View view) {
    }

    public void nextPhrase21(View view) {
    }

    public void nextPhrase22(View view) {
    }


    public void nextPhrase_OpenDay3(View view) {
        // Новый intent для открытия главного меню
        Intent intent = new Intent(SecondDay.this, SplashScreenWednesday.class);

        // Открываем новое активити
        SecondDay.this.startActivity(intent);

        // Завершаем текущее активити
        SecondDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
