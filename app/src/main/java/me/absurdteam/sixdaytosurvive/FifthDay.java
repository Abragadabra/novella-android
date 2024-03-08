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

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import me.absurdteam.sixdaytosurvive.R;

public class FifthDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button Day5Class11Button;
    Button Day5Class21Button;
    Button Day5Class31Button;
    Button Day5Class32Button;
    Button Day5Class3StepanidaOrEvgeyButton;
    Button Day5Class3VatilaveButton;
    Button nextDayButton;
    Button reserv;
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day5_class_1_1_effect;
    TypewriterEffect day5_class_2_1_effect;
    TypewriterEffect day5_class_3_1_effect;
    TypewriterEffect day5_class_3_2_effect;
    TypewriterEffect day5_class_3_stepanida_effect;
    TypewriterEffect day5_class_3_evgey_effect;
    TypewriterEffect day5_class_3_vatilave_effect;
    TypewriterEffect day5_home_effect;
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
        setContentView(R.layout.activity_fifth_day);

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        Day5Class11Button = findViewById(R.id.next_button_day4);
        Day5Class21Button = findViewById(R.id.next_button_2_day4);
        Day5Class31Button = findViewById(R.id.next_button_3_day4);
        Day5Class32Button = findViewById(R.id.next_button_4_day4);
        Day5Class3StepanidaOrEvgeyButton = findViewById(R.id.next_button_5_day4);
        Day5Class3VatilaveButton = findViewById(R.id.next_button_7_day4);
        nextDayButton = findViewById(R.id.next_button_8_day4);
        reserv = findViewById(R.id.next_button_9_day4);

        // Получение по id основного TextView
        mainTV = findViewById(R.id.fifth_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.fifth_day_layout);

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

        day5_class_1_1_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_1_1, 60);
        day5_class_1_1_effect.animateText();

        day5_class_1_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Day5Class11Button.setVisibility(View.VISIBLE);
                Day5Class11Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day5Class11Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void skipPhrase() {
        HelperClass.stopAnimation(day5_class_1_1_effect);
        HelperClass.stopAnimation(day5_class_2_1_effect);
        HelperClass.stopAnimation(day5_class_3_1_effect);
        HelperClass.stopAnimation(day5_class_3_2_effect);
        HelperClass.stopAnimation(day5_class_3_stepanida_effect);
        HelperClass.stopAnimation(day5_class_3_evgey_effect);
        HelperClass.stopAnimation(day5_class_3_vatilave_effect);
        HelperClass.stopAnimation(day5_home_effect);
    }

    public void skipAnimationDay5(View view) {
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

    public void nextPhrase_phrase1(View view) {
        // Инициализация эффекта печати
        day5_class_2_1_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_2_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day5Class11Button, Day5Class21Button,
                day5_class_2_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.dirov_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.dushnya_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_phrase2(View view) {
        // Инициализация эффекта печати
        day5_class_3_1_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_3_1, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day5Class21Button, Day5Class31Button,
                day5_class_3_1_effect, anim_button_in_right,
                anim_button_out_right, mainTV);

        Drawable bg1 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.dushnya_class);
        Drawable bg2 = ContextCompat.getDrawable(getApplicationContext(), R.drawable.policarbonat_vatislav_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);
    }

    public void nextPhrase_phrase3(View view) {
        // Инициализация эффекта печати
        day5_class_3_2_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_3_2, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day5Class31Button, Day5Class32Button,
                day5_class_3_2_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_phrase4(View view) {
        if (PlayerData.loveLevel >= 1) {
            // Болтаем со Степанидой
            // Инициализация эффекта печати
            day5_class_3_stepanida_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_3_stepanida, 60);

            // Добавление фразы
            HelperClass.addPhrase(Day5Class32Button, Day5Class3StepanidaOrEvgeyButton,
                    day5_class_3_stepanida_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);
        }
        else {
            // Болтаем с Евгеем
            // Инициализация эффекта печати
            day5_class_3_evgey_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_3_evgey, 60);

            // Добавление фразы
            HelperClass.addPhrase(Day5Class32Button, Day5Class3StepanidaOrEvgeyButton,
                    day5_class_3_evgey_effect, anim_button_in_right,
                    anim_button_out_right, mainTV);
        }
    }

    public void nextPhrase_phrase5(View view) {
        // Инициализация эффекта печати
        day5_class_3_vatilave_effect = new TypewriterEffect(mainTV, Dialogues.day5_class_3_vatilave, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day5Class3StepanidaOrEvgeyButton, Day5Class3VatilaveButton,
                day5_class_3_vatilave_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_phrase6(View view) {
        // Инициализация эффекта печати
        day5_home_effect = new TypewriterEffect(mainTV, Dialogues.day5_home, 60);

        // Добавление фразы
        HelperClass.addPhrase(Day5Class3VatilaveButton, nextDayButton,
                day5_home_effect, anim_button_in_right,
                anim_button_out_right, mainTV);
    }

    public void nextPhrase_nextDay(View view) {
        // Новый intent для открытия главного меню
        Intent intent = new Intent(FifthDay.this, SplashScreenSaturday.class);

        // Открываем новое активити
        FifthDay.this.startActivity(intent);

        // Завершаем текущее активити
        FifthDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}