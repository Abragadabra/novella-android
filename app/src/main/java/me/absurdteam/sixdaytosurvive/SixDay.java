package me.absurdteam.sixdaytosurvive;

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

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import me.absurdteam.sixdaytosurvive.R;

public class SixDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button Day6Home1Button;
    Button Day6Class1Button;
    Button Day6Class2Button;
    Button Day6Class3Button;
    Button Day6Class4Button;
    Button Day6Class5Button;
    Button Day6Class6Button;
    Button Day6Class7Button;
    Button Day6Class8Button;
    Button Day6Class9Button;
    Button Day6Class10Button;
    Button Day6Class11Button;
    Button Day6Class12Button;
    Button Day6Class13Button;
    Button Day6Class14Button;
    Button Day6Class15Button;
    Button Day6Class233Button;
    Button Day6Class234Button;
    Button Day6Class235Button;
    Button Day6Class236Button;
    Button Day2Home1Button;
    Button openDay3Button;

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day6_home_1_effect;
    TypewriterEffect day6_class_1_effect;
    TypewriterEffect day6_class_2_effect;
    TypewriterEffect day6_class_3_effect;
    TypewriterEffect day6_class_4_effect;
    TypewriterEffect day6_class_5_effect;
    TypewriterEffect day6_class_6_effect;
    TypewriterEffect day6_class_7_effect;
    TypewriterEffect day6_class_8_effect;
    TypewriterEffect day6_class_9_effect;
    TypewriterEffect day6_class_10_effect;
    TypewriterEffect day6_class_11_effect;
    TypewriterEffect day6_class_window_is_closed_2_effect;
    TypewriterEffect day6_class_ilyaz_effect;
    TypewriterEffect day6_class_ilyaz_2_effect;
    TypewriterEffect day6_class_stepanida_1_effect;
    TypewriterEffect day6_class_stepanida_2_effect;
    TypewriterEffect day6_class_stepanida_3_effect;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_six_day);

        Day6Home1Button = findViewById(R.id.next_button_day6);
        Day6Class1Button = findViewById(R.id.next_button_2_day6);
        Day6Class2Button = findViewById(R.id.next_button_3_day6);
        Day6Class3Button = findViewById(R.id.next_button_4_day6);
        Day6Class4Button = findViewById(R.id.next_button_5_day6);
        Day6Class5Button = findViewById(R.id.next_button_6_day6);
        Day6Class6Button = findViewById(R.id.next_button_7_day6);
        Day6Class7Button = findViewById(R.id.next_button_8_day6);
        Day6Class8Button = findViewById(R.id.next_button_9_day6);
        Day6Class9Button = findViewById(R.id.next_button_10_day6);
        Day6Class10Button = findViewById(R.id.next_button_11_day6);
        Day6Class11Button = findViewById(R.id.next_button_12_day6);
        Day6Class12Button = findViewById(R.id.next_button_13_day6);
        Day6Class13Button = findViewById(R.id.next_button_14_day6);
        Day6Class14Button = findViewById(R.id.next_button_15_day6);
        Day6Class15Button = findViewById(R.id.next_button_16_day6);
        Day6Class233Button = findViewById(R.id.next_button_17_day6);
        Day6Class234Button = findViewById(R.id.next_button_18_day6);
        Day6Class235Button = findViewById(R.id.next_button_19_day6);
        Day6Class236Button = findViewById(R.id.next_button_20_day6);
        Day2Home1Button = findViewById(R.id.next_button_21_day6);
        openDay3Button = findViewById(R.id.next_button_22_day6);

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        // Получение по id основного TextView
        mainTV = findViewById(R.id.six_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.six_day_layout);

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

        day6_home_1_effect = new TypewriterEffect(mainTV, Dialogues.day6_home, 60);
        day6_home_1_effect.animateText();
        day6_home_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Day6Home1Button.setVisibility(View.VISIBLE);
                Day6Home1Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day6Home1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void skipPhrase() {
        HelperClass.stopAnimation(day6_home_1_effect);
        HelperClass.stopAnimation(day6_class_1_effect);
        HelperClass.stopAnimation(day6_class_2_effect);
        HelperClass.stopAnimation(day6_class_3_effect);
        HelperClass.stopAnimation(day6_class_4_effect);
        HelperClass.stopAnimation(day6_class_5_effect);
        HelperClass.stopAnimation(day6_class_6_effect);
        HelperClass.stopAnimation(day6_class_7_effect);
        HelperClass.stopAnimation(day6_class_8_effect);
        HelperClass.stopAnimation(day6_class_9_effect);
        HelperClass.stopAnimation(day6_class_10_effect);
        HelperClass.stopAnimation(day6_class_11_effect);
        HelperClass.stopAnimation(day6_class_window_is_closed_2_effect);
        HelperClass.stopAnimation(day6_class_ilyaz_effect);
        HelperClass.stopAnimation(day6_class_ilyaz_2_effect);
        HelperClass.stopAnimation(day6_class_stepanida_1_effect);
        HelperClass.stopAnimation(day6_class_stepanida_2_effect);
        HelperClass.stopAnimation(day6_class_stepanida_3_effect);
    }

    public void skipAnimationDay4(View view) {
        skipPhrase();
    }

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

    public void saveGame(View view) {
        HelperClass helperClass = new HelperClass();
        helperClass.saveAllGame(5, saves);

        Toast.makeText(this, "Игра сохранена!", Toast.LENGTH_SHORT).show();
    }

    public void nextPhrase_Day6_class1(View view) {
        // Инициализация эффекта печати
        day6_class_2_effect = new TypewriterEffect(mainTV, Dialogues.day6_class_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Home1Button, Day6Class1Button,
                day6_class_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.bedroom);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_Day6_class2(View view) {
        // Инициализация эффекта печати
        day6_class_3_effect = new TypewriterEffect(mainTV, Dialogues.day6_class_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class1Button, Day6Class2Button,
                day6_class_3_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kastryuleva_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }
    public void nextPhrase_Day6_class3(View view) {
        // Инициализация эффекта печати
        day6_class_4_effect = new TypewriterEffect(mainTV, Dialogues.day6_class_3_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class2Button, Day6Class3Button,
                day6_class_4_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kastryuleva_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }


    public void nextPhrase_Day6_class4(View view) {
        if (PlayerData.loveLevel > 1){
            // Плохая концовка
            day6_class_5_effect = new TypewriterEffect(mainTV, Dialogues.bad_ending_1, 60);

            // Добавление фразы
            HelperClass.addPhrase(Day6Class3Button, Day6Class4Button,
                    day6_class_5_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);

            Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
            Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.kiss);
            HelperClass.animBackground(relativeLayout, bg1, bg2);
        }else{
            // Хорошая концовка
            day6_class_10_effect = new TypewriterEffect(mainTV, Dialogues.good_ending_1, 60);

            // Добавление фразы
            HelperClass.addPhrase(Day6Class3Button, Day6Class9Button,
                    day6_class_10_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);

            Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.lososeva_class);
            Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.home_computer);
            HelperClass.animBackground(relativeLayout, bg1, bg2);
        }
    }


    public void nextPhrase_Day6_class5(View view) {
        // Плохая концовка
        day6_class_6_effect = new TypewriterEffect(mainTV, Dialogues.bad_ending_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class4Button, Day6Class5Button,
                day6_class_6_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }


    public void nextPhrase_Day6_class6(View view) {
        // Плохая концовка
        day6_class_7_effect = new TypewriterEffect(mainTV, Dialogues.bad_ending_3, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class5Button, Day6Class6Button,
                day6_class_7_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_Day6_class7(View view) {
        // Плохая концовка
        day6_class_8_effect = new TypewriterEffect(mainTV, Dialogues.bad_ending_4, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class6Button, Day6Class7Button,
                day6_class_8_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    // Финальный монолог
    public void nextPhrase_Day6_class8(View view) {
        // Плохая концовка
        day6_class_9_effect = new TypewriterEffect(mainTV, Dialogues.end, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class7Button, Day6Class8Button,
                day6_class_9_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }
    // ВЫХОД В МЕНЮ
    public void nextPhrase_Day6_ending(View view) {
        // Новый intent для открытия грустного
        Intent intent = new Intent(SixDay.this, Titres.class);

        // Открываем новое активити
        SixDay.this.startActivity(intent);

        // Завершаем текущее активити
        SixDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void nextPhrase_Day6_class9(View view) {
        day6_class_11_effect = new TypewriterEffect(mainTV, Dialogues.good_ending_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day6Class9Button, Day6Class7Button,
                day6_class_11_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }
}
