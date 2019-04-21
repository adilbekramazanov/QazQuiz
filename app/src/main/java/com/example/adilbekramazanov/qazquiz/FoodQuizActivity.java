package com.example.adilbekramazanov.qazquiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FoodQuizActivity extends AppCompatActivity {
    Animation animScale;
    Animation animFadeout;
    Animation rotate;
    TextView question;
    int max;
    LinearLayout myQuizLinearLayout;
    AnimationDrawable animationDrawable;
    TextView countTextView;

    Button answerButton1;
    Button answerButton2;
    Button answerButton3;
    Button answerButton4;

    int numberOfresults = 10;
    int numberOfQuestionsInPool = 12;
    int countQuestion;

    int personality1Count;
    int personality2Count;
    int personality3Count;
    int personality4Count;
    int personality5Count;
    int personality6Count;
    int personality7Count;
    int personality8Count;
    int personality9Count;
    int personality10Count;



    String familyMember1 = "Ага";

    String personality1Name = "Бешпармак";
    String personality2Name = "Куырдак";
    String personality3Name = "Баурсаки";
    String personality4Name = "Лагман";
    String personality5Name = "Сумалак";
    String personality6Name = "Кеспе";
    String personality7Name = "Коже";
    String personality8Name = "Манты";
    String personality9Name = "Айран";
    String personality10Name = "Борщ";

    String personality1Description = "Это любимое национальное блюдо казахов. Название его переводится как «пять пальцев» по причине того, что кушать бешбаршмак принято именно руками.  И, разумеется, облизывать пальцы от удовольствия!";
    String personality2Description = "\"Кавардак\"\nЖаркое из мяса и субпродуктов. В различных вариантах блюда как гарнир  используют картофель, рис, зеленый горох.";
    String personality3Description = "А это блюдо представляет собой национальное жареное печенье, причем готовится оно как из кислого, так и из пресного теста, подают в виде шариков или «кирпичиков» — кому что больше нравится.";
    String personality4Description = "Сложно сказать первое это блюдо или второе, скорее заменяет оба, так как очень сытное.";
    String personality5Description = "Сумаляк — это сладкая, питательная, сметанообразная масса коричневатого цвета, особенно любимая детьми.Готовят это блюдо именно весной, когда наш организм особенно нуждается в питательных веществах.";
    String personality6Description = "Казахская домашняя лапша, приготовленная в мясном бульоне с добавлением овощей и специй.";
    String personality7Description = "7 обязательных компонентов \"Наурыз коже\": вода, мясо, соль, жир, мука, злаки и молоко. Эти компоненты символизируют счастье, удачу, мудрость, здоровье, богатство, быстрый рост, покровительство неба.";
    String personality8Description = "Это название наверняка слышали многие, а то и видели такой продукт в магазине в замороженном виде. Однако, чтобы по-настоящему оценить вкус этих «больших пельменей», готовить их стоит исключительно дома! Попробуйте.";
    String personality9Description = "Свежий прохладный айран. Айран — прародитель современных йогуртов, кисломолочный продукт, популярный на Кавказе, Балканах и у тюркских народов.";
    String personality10Description = "Борщ — разновидность супа на основе свёклы, которая придаёт ему характерный красный цвет. Традиционное блюдо восточных славян, основное первое блюдо украинской и южно-русской кухонь.";
    //Three dimensional arrayList  ********************** Outer Questions

    ArrayList<ArrayList<ArrayList<String>>> questionCategory = new ArrayList<ArrayList<ArrayList<String>>>();

    //Two dimensional arrayList    ********************** Types of one Category

    ArrayList<ArrayList<String>> Category1Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category2Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category3Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category4Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category5Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category6Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category7Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category8Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category9Variants = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Category10Variants = new ArrayList<ArrayList<String>>();

    //ArrayList

    ArrayList<String> Category1variant1 = new ArrayList<String>();
    ArrayList<String> Category1variant2 = new ArrayList<String>();
    ArrayList<String> Category1variant3 = new ArrayList<String>();
    ArrayList<String> Category1variant4 = new ArrayList<String>();
    ArrayList<String> Category1variant5 = new ArrayList<String>();

    ArrayList<String> Category2variant1 = new ArrayList<String>();
    ArrayList<String> Category2variant2 = new ArrayList<String>();
    ArrayList<String> Category2variant3 = new ArrayList<String>();
    ArrayList<String> Category2variant4 = new ArrayList<String>();
    ArrayList<String> Category2variant5 = new ArrayList<String>();

    ArrayList<String> Category3variant1 = new ArrayList<String>();
    ArrayList<String> Category3variant2 = new ArrayList<String>();
    ArrayList<String> Category3variant3 = new ArrayList<String>();
    ArrayList<String> Category3variant4 = new ArrayList<String>();
    ArrayList<String> Category3variant5 = new ArrayList<String>();

    ArrayList<String> Category4variant1 = new ArrayList<String>();
    ArrayList<String> Category4variant2 = new ArrayList<String>();
    ArrayList<String> Category4variant3 = new ArrayList<String>();
    ArrayList<String> Category4variant4 = new ArrayList<String>();
    ArrayList<String> Category4variant5 = new ArrayList<String>();

    ArrayList<String> Category5variant1 = new ArrayList<String>();
    ArrayList<String> Category5variant2 = new ArrayList<String>();
    ArrayList<String> Category5variant3 = new ArrayList<String>();
    ArrayList<String> Category5variant4 = new ArrayList<String>();
    ArrayList<String> Category5variant5 = new ArrayList<String>();

    ArrayList<String> Category6variant1 = new ArrayList<String>();
    ArrayList<String> Category6variant2 = new ArrayList<String>();
    ArrayList<String> Category6variant3 = new ArrayList<String>();
    ArrayList<String> Category6variant4 = new ArrayList<String>();
    ArrayList<String> Category6variant5 = new ArrayList<String>();

    ArrayList<String> Category7variant1 = new ArrayList<String>();
    ArrayList<String> Category7variant2 = new ArrayList<String>();
    ArrayList<String> Category7variant3 = new ArrayList<String>();
    ArrayList<String> Category7variant4 = new ArrayList<String>();
    ArrayList<String> Category7variant5 = new ArrayList<String>();

    ArrayList<String> Category8variant1 = new ArrayList<String>();
    ArrayList<String> Category8variant2 = new ArrayList<String>();
    ArrayList<String> Category8variant3 = new ArrayList<String>();
    ArrayList<String> Category8variant4 = new ArrayList<String>();
    ArrayList<String> Category8variant5 = new ArrayList<String>();

    ArrayList<String> Category9variant1 = new ArrayList<String>();
    ArrayList<String> Category9variant2 = new ArrayList<String>();
    ArrayList<String> Category9variant3 = new ArrayList<String>();
    ArrayList<String> Category9variant4 = new ArrayList<String>();
    ArrayList<String> Category9variant5 = new ArrayList<String>();

    ArrayList<String> Category10variant1 = new ArrayList<String>();
    ArrayList<String> Category10variant2 = new ArrayList<String>();
    ArrayList<String> Category10variant3 = new ArrayList<String>();
    ArrayList<String> Category10variant4 = new ArrayList<String>();
    ArrayList<String> Category10variant5 = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        //// set text animation
        TextSwitcher textSwitcher = new TextSwitcher(this);




        //// set text animation

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        myQuizLinearLayout = findViewById(R.id.quiz_linear_layout);

        animationDrawable = (AnimationDrawable) myQuizLinearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(0);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        animFadeout = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        Category1variant1.clear();
        Category1variant2.clear();
        Category1variant3.clear();
        Category1variant4.clear();
        Category1variant5.clear();
        Category1Variants.clear();

        Category2variant1.clear();
        Category2variant2.clear();
        Category2variant3.clear();
        Category2variant4.clear();
        Category2variant5.clear();
        Category2Variants.clear();

        Category3variant1.clear();
        Category3variant2.clear();
        Category3variant3.clear();
        Category3variant4.clear();
        Category3variant5.clear();
        Category3Variants.clear();

        Category4variant1.clear();
        Category4variant2.clear();
        Category4variant3.clear();
        Category4variant4.clear();
        Category4variant5.clear();
        Category4Variants.clear();

        Category5variant1.clear();
        Category5variant2.clear();
        Category5variant3.clear();
        Category5variant4.clear();
        Category5variant5.clear();
        Category5Variants.clear();

        Category6variant1.clear();
        Category6variant2.clear();
        Category6variant3.clear();
        Category6variant4.clear();
        Category6variant5.clear();
        Category6Variants.clear();

        Category7variant1.clear();
        Category7variant2.clear();
        Category7variant3.clear();
        Category7variant4.clear();
        Category7variant5.clear();
        Category7Variants.clear();

        Category8variant1.clear();
        Category8variant2.clear();
        Category8variant3.clear();
        Category8variant4.clear();
        Category8variant5.clear();
        Category8Variants.clear();

        Category9variant1.clear();
        Category9variant2.clear();
        Category9variant3.clear();
        Category9variant4.clear();
        Category9variant5.clear();
        Category9Variants.clear();

        Category10variant1.clear();
        Category10variant2.clear();
        Category10variant3.clear();
        Category10variant4.clear();
        Category10variant5.clear();
        Category10Variants.clear();

        questionCategory.clear();


        question = findViewById(R.id.question_text_view);
        answerButton1 = findViewById(R.id.answer_button1);
        answerButton2 = findViewById(R.id.answer_button2);
        answerButton3 = findViewById(R.id.answer_button3);
        answerButton4 = findViewById(R.id.answer_button4);
        countTextView = findViewById(R.id.count_text_view);

        //First category

        Category1variant1.add("Сколько вам лет?");
        Category1variant1.add("до 13");
        Category1variant1.add("14-25");
        Category1variant1.add("26-37");
        Category1variant1.add("37 и старше");

        Category1variant2.add("Сколько вам лет?");
        Category1variant2.add("до 13");
        Category1variant2.add("14-25");
        Category1variant2.add("26-37");
        Category1variant2.add("37 и старше");

        Category1variant3.add("Сколько вам лет?");
        Category1variant3.add("до 13");
        Category1variant3.add("14-25");
        Category1variant3.add("26-37");
        Category1variant3.add("37 и старше");

        Category1variant4.add("Сколько вам лет?");
        Category1variant4.add("до 13");
        Category1variant4.add("14-25");
        Category1variant4.add("26-37");
        Category1variant4.add("37 и старше");

        Category1variant5.add("Сколько вам лет?");
        Category1variant5.add("до 13");
        Category1variant5.add("14-25");
        Category1variant5.add("26-37");
        Category1variant5.add("37 и старше");

        Category1Variants.add( Category1variant1);
        Category1Variants.add( Category1variant2);
        Category1Variants.add( Category1variant3);
        Category1Variants.add( Category1variant4);
        Category1Variants.add( Category1variant5);

        //SecondCategory

        Category2variant1.add("Любите ли вы сладкое?");
        Category2variant1.add("Очень люблю");
        Category2variant1.add("Нравиться");
        Category2variant1.add("Не люблю");
        Category2variant1.add("Терпеть не могу");

        Category2variant2.add("Любите ли вы сладкое?");
        Category2variant2.add("Очень люблю");
        Category2variant2.add("Нравиться");
        Category2variant2.add("Не люблю");
        Category2variant2.add("Терпеть не могу");

        Category2variant3.add("Любите ли вы сладкое?");
        Category2variant3.add("Очень люблю");
        Category2variant3.add("Нравиться");
        Category2variant3.add("Не люблю");
        Category2variant3.add("Терпеть не могу");

        Category2variant4.add("Любите ли вы сладкое?");
        Category2variant4.add("Очень люблю");
        Category2variant4.add("Нравиться");
        Category2variant4.add("Не люблю");
        Category2variant4.add("Терпеть не могу");

        Category2variant5.add("Любите ли вы сладкое?");
        Category2variant5.add("Очень люблю");
        Category2variant5.add("Нравиться");
        Category2variant5.add("Не люблю");
        Category2variant5.add("Терпеть не могу");

        Category2Variants.add( Category2variant1);
        Category2Variants.add( Category2variant2);
        Category2Variants.add( Category2variant3);
        Category2Variants.add( Category2variant4);
        Category2Variants.add( Category2variant5);

        //Third Category

        Category3variant1.add("Ваше любимое время года?");
        Category3variant1.add("Лето");
        Category3variant1.add("Осень");
        Category3variant1.add("Зима");
        Category3variant1.add("Весна");

        Category3variant2.add("Ваше любимое время года?");
        Category3variant2.add("Лето");
        Category3variant2.add("Осень");
        Category3variant2.add("Зима");
        Category3variant2.add("Весна");

        Category3variant3.add("Ваше любимое время года?");
        Category3variant3.add("Лето");
        Category3variant3.add("Осень");
        Category3variant3.add("Зима");
        Category3variant3.add("Весна");

        Category3variant4.add("Ваше любимое время года?");
        Category3variant4.add("Лето");
        Category3variant4.add("Осень");
        Category3variant4.add("Зима");
        Category3variant4.add("Весна");

        Category3variant5.add("Ваше любимое время года?");
        Category3variant5.add("Лето");
        Category3variant5.add("Осень");
        Category3variant5.add("Зима");
        Category3variant5.add("Весна");

        Category3Variants.add( Category3variant1);
        Category3Variants.add( Category3variant2);
        Category3Variants.add( Category3variant3);
        Category3Variants.add( Category3variant4);
        Category3Variants.add( Category3variant5);

        //Fourth Category

        Category4variant1.add("Среди детей вы");
        Category4variant1.add("Старший");
        Category4variant1.add("Средний");
        Category4variant1.add("Кенже бала");
        Category4variant1.add("Единственный");

        Category4variant2.add("Среди детей вы");
        Category4variant2.add("Старший");
        Category4variant2.add("Средний");
        Category4variant1.add("Кенже бала");
        Category4variant2.add("Единственный");

        Category4variant3.add("Среди детей вы");
        Category4variant3.add("Старший");
        Category4variant3.add("Средний");
        Category4variant3.add("Кенже бала");
        Category4variant3.add("Единственный");

        Category4variant4.add("Среди детей вы");
        Category4variant4.add("Старший");
        Category4variant4.add("Средний");
        Category4variant4.add("Кенже бала");
        Category4variant4.add("Единственный");

        Category4variant5.add("Среди детей вы");
        Category4variant5.add("Старший");
        Category4variant5.add("Средний");
        Category4variant5.add("Кенже бала");
        Category4variant5.add("Единственный");

        Category4Variants.add( Category4variant1);
        Category4Variants.add( Category4variant2);
        Category4Variants.add( Category4variant3);
        Category4Variants.add( Category4variant4);
        Category4Variants.add( Category4variant5);


        //Fifth Category

        Category5variant1.add("Среди друзей вы");
        Category5variant1.add("Лидер");
        Category5variant1.add("Хороший друг");
        Category5variant1.add("Умный");
        Category5variant1.add("Смешной");

        Category5variant2.add("Среди друзей вы");
        Category5variant2.add("Лидер");
        Category5variant2.add("Хороший друг");
        Category5variant2.add("Умный");
        Category5variant2.add("Смешной");

        Category5variant3.add("Среди друзей вы");
        Category5variant3.add("Лидер");
        Category5variant3.add("Хороший друг");
        Category5variant3.add("Умный");
        Category5variant3.add("Смешной");

        Category5variant4.add("Среди друзей вы");
        Category5variant4.add("Лидер");
        Category5variant4.add("Хороший друг");
        Category5variant4.add("Умный");
        Category5variant4.add("Смешной");

        Category5variant5.add("Среди друзей вы");
        Category5variant5.add("Лидер");
        Category5variant5.add("Хороший друг");
        Category5variant5.add("Умный");
        Category5variant5.add("Смешной");

        Category5Variants.add( Category5variant1);
        Category5Variants.add( Category5variant2);
        Category5Variants.add( Category5variant3);
        Category5Variants.add( Category5variant4);
        Category5Variants.add( Category5variant5);

        //Sixth category

        Category6variant1.add("Что вас мотивирует?");
        Category6variant1.add("Внутреннее спокойствие");
        Category6variant1.add("Успех");
        Category6variant1.add("Семья");
        Category6variant1.add("Конкуренция");

        Category6variant2.add("Что вас мотивирует?");
        Category6variant2.add("Внутреннее спокойствие");
        Category6variant2.add("Успех");
        Category6variant2.add("Семья");
        Category6variant2.add("Конкуренция");

        Category6variant3.add("Что вас мотивирует?");
        Category6variant3.add("Внутреннее спокойствие");
        Category6variant3.add("Успех");
        Category6variant3.add("Семья");
        Category6variant3.add("Конкуренция");

        Category6variant4.add("Что вас мотивирует?");
        Category6variant4.add("Внутреннее спокойствие");
        Category6variant4.add("Успех");
        Category6variant4.add("Семья");
        Category6variant4.add("Конкуренция");

        Category6variant5.add("Что вас мотивирует?");
        Category6variant5.add("Внутреннее спокойствие");
        Category6variant5.add("Успех");
        Category6variant5.add("Семья");
        Category6variant5.add("Конкуренция");

        Category6Variants.add( Category6variant1);
        Category6Variants.add( Category6variant2);
        Category6Variants.add( Category6variant3);
        Category6Variants.add( Category6variant4);
        Category6Variants.add( Category6variant5);

        //Seventh category

        Category7variant1.add("Много ли вы кушаете?");
        Category7variant1.add("Кушаю когда голодный");
        Category7variant1.add("Кушаю как и все");
        Category7variant1.add("Люблю вкусно покушать");
        Category7variant1.add("Очень много кушаю");

        Category7variant2.add("Много ли вы кушаете?");
        Category7variant2.add("Кушаю когда голодный");
        Category7variant2.add("Кушаю как и все");
        Category7variant2.add("Люблю вкусно покушать");
        Category7variant2.add("Очень много кушаю");

        Category7variant3.add("Много ли вы кушаете?");
        Category7variant3.add("Кушаю когда голодный");
        Category7variant3.add("Кушаю как и все");
        Category7variant3.add("Люблю вкусно покушать");
        Category7variant3.add("Очень много кушаю");

        Category7variant4.add("Много ли вы кушаете?");
        Category7variant4.add("Кушаю когда голодный");
        Category7variant4.add("Кушаю как и все");
        Category7variant4.add("Люблю вкусно покушать");
        Category7variant4.add("Очень много кушаю");

        Category7variant5.add("Много ли вы кушаете?");
        Category7variant5.add("Кушаю когда голодный");
        Category7variant5.add("Кушаю как и все");
        Category7variant5.add("Вы действительно не знали");
        Category7variant5.add("Очень много кушаю");

        Category7Variants.add( Category7variant1);
        Category7Variants.add( Category7variant2);
        Category7Variants.add( Category7variant3);
        Category7Variants.add( Category7variant4);
        Category7Variants.add( Category7variant5);

        //Eight category

        Category8variant1.add("В какой части Казахстана вы родились?");
        Category8variant1.add("Север / Центр");
        Category8variant1.add("Запад");
        Category8variant1.add("Восток");
        Category8variant1.add("Юг");

        Category8variant2.add("В какой части Казахстана вы родились?");
        Category8variant2.add("Север / Центр");
        Category8variant2.add("Запад");
        Category8variant2.add("Восток");
        Category8variant2.add("Юг");

        Category8variant3.add("В какой части Казахстана вы родились?");
        Category8variant3.add("Север / Центр");
        Category8variant3.add("Запад");
        Category8variant3.add("Восток");
        Category8variant3.add("Юг");

        Category8variant4.add("В какой части Казахстана вы родились?");
        Category8variant4.add("Север / Центр");
        Category8variant4.add("Запад");
        Category8variant4.add("Восток");
        Category8variant4.add("Юг");

        Category8variant5.add("В какой части Казахстана вы родились?");
        Category8variant5.add("Север / Центр");
        Category8variant5.add("Запад");
        Category8variant5.add("Восток");
        Category8variant5.add("Юг");

        Category8Variants.add( Category8variant1);
        Category8Variants.add( Category8variant2);
        Category8Variants.add( Category8variant3);
        Category8Variants.add( Category8variant4);
        Category8Variants.add( Category8variant5);

        //Nine category

        Category9variant1.add("Ваш любимый казахстанский национальный праздик?");
        Category9variant1.add("Козы-Корпеш - Баян-Сулу");
        Category9variant1.add("День столицы");
        Category9variant1.add("Наурыз");
        Category9variant1.add("Пасха");

        Category9variant2.add("Ваш любимый казахстанский национальный праздик?");
        Category9variant2.add("Козы-Корпеш - Баян-Сулу");
        Category9variant2.add("День столицы");
        Category9variant2.add("Наурыз");
        Category9variant2.add("Пасха");

        Category9variant3.add("Ваш любимый казахстанский национальный праздик?");
        Category9variant3.add("Козы-Корпеш - Баян-Сулу");
        Category9variant3.add("День столицы");
        Category9variant3.add("Наурыз");
        Category9variant3.add("Пасха");

        Category9variant4.add("Ваш любимый казахстанский национальный праздик?");
        Category9variant4.add("Козы-Корпеш - Баян-Сулу");
        Category9variant4.add("День столицы");
        Category9variant4.add("Наурыз");
        Category9variant4.add("Пасха");

        Category9variant5.add("Ваш любимый казахстанский национальный праздик?");
        Category9variant5.add("Козы-Корпеш - Баян-Сулу");
        Category9variant5.add("День столицы");
        Category9variant5.add("Наурыз");
        Category9variant5.add("Пасха");

        Category9Variants.add( Category9variant1);
        Category9Variants.add( Category9variant2);
        Category9Variants.add( Category9variant3);
        Category9Variants.add( Category9variant4);
        Category9Variants.add( Category9variant5);

        //Seventh category

        Category10variant1.add("Где самая вкусная еда?");
        Category10variant1.add("В ресторане");
        Category10variant1.add("Дома");
        Category10variant1.add("Әжесінің үйінде");
        Category10variant1.add("В турецких отелях");

        Category10variant2.add("Где самая вкусная еда?");
        Category10variant2.add("В ресторане");
        Category10variant2.add("Дома");
        Category10variant2.add("Әжесінің үйінде");
        Category10variant2.add("В турецких отелях");

        Category10variant3.add("Где самая вкусная еда?");
        Category10variant3.add("В ресторане");
        Category10variant3.add("Дома");
        Category10variant3.add("Әжесінің үйінде");
        Category10variant3.add("В турецких отелях");

        Category10variant4.add("Где самая вкусная еда?");
        Category10variant4.add("В ресторане");
        Category10variant4.add("Дома");
        Category10variant4.add("Әжесінің үйінде");
        Category10variant4.add("В турецких отелях");

        Category10variant5.add("Где самая вкусная еда?");
        Category10variant5.add("В ресторане");
        Category10variant5.add("Дома");
        Category10variant5.add("Әжесінің үйінде");
        Category10variant5.add("В турецких отелях");

        Category10Variants.add( Category10variant1);
        Category10Variants.add( Category10variant2);
        Category10Variants.add( Category10variant3);
        Category10Variants.add( Category10variant4);
        Category10Variants.add( Category10variant5);



        //Add categories
        questionCategory.add( Category1Variants);
        questionCategory.add( Category2Variants);
        questionCategory.add( Category3Variants);
        questionCategory.add( Category4Variants);
        questionCategory.add( Category5Variants);
        questionCategory.add( Category6Variants);
        questionCategory.add( Category7Variants);
        questionCategory.add( Category8Variants);
        questionCategory.add( Category9Variants);
        questionCategory.add( Category10Variants);


        personality1Count = 0;
        personality2Count = 0;
        personality3Count = 0;
        personality4Count = 0;
        personality5Count = 0;
        personality6Count = 0;
        personality7Count = 0;
        personality8Count = 0;
        personality9Count = 0;
        personality10Count = 0;


        countQuestion = 0;
        nextQuestion();
    }

    public void testFinished(){

        List<Integer> personalityCounts= new ArrayList<Integer>();
        personalityCounts.add(personality1Count);
        personalityCounts.add(personality2Count);
        personalityCounts.add(personality3Count);
        personalityCounts.add(personality4Count);
        personalityCounts.add(personality5Count);
        personalityCounts.add(personality6Count);
        personalityCounts.add(personality7Count);
        personalityCounts.add(personality8Count);
        personalityCounts.add(personality9Count);
        personalityCounts.add(personality10Count);

        List<String> personalityNames = new ArrayList<>();
        personalityNames.add(personality1Name);
        personalityNames.add(personality2Name);
        personalityNames.add(personality3Name);
        personalityNames.add(personality4Name);
        personalityNames.add(personality5Name);
        personalityNames.add(personality6Name);
        personalityNames.add(personality7Name);
        personalityNames.add(personality8Name);
        personalityNames.add(personality9Name);
        personalityNames.add(personality10Name);

        List<String> personalityDescriptions = new ArrayList<>();
        personalityDescriptions.add(personality1Description);
        personalityDescriptions.add(personality2Description);
        personalityDescriptions.add(personality3Description);
        personalityDescriptions.add(personality4Description);
        personalityDescriptions.add(personality5Description);
        personalityDescriptions.add(personality6Description);
        personalityDescriptions.add(personality7Description);
        personalityDescriptions.add(personality8Description);
        personalityDescriptions.add(personality9Description);
        personalityDescriptions.add(personality10Description);

        String resultPersonality = personality2Name;
        String resultPersonalityDescription = personality2Description;
        for (int i = 1; i < personalityCounts.size(); i++){
            if (personalityCounts.get(i) > personalityCounts.get(i-1)){
                max = personalityCounts.get(i);
                resultPersonality = personalityNames.get(i);
                resultPersonalityDescription = personalityDescriptions.get(i);
            }
        }
        Intent intent = new Intent(FoodQuizActivity.this, ResultActivity.class);
        intent.putExtra("RESULT_PERSONALITY", resultPersonality);
        intent.putExtra("RESULT_PERSONALITY_DESCRIPTION", resultPersonalityDescription);
        startActivity(intent);


    }

    public void answer1Clicked(View view){
        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality1Count++; //бешпармак
                        break;
                    case 2:

                        personality2Count++; //куырдак
                        break;
                    case 3:

                        personality3Count++; //баурсаки
                        break;
                    case 4:

                        personality4Count++; //лагман
                        break;
                    case 5:

                        personality5Count++; //сумалак
                        break;
                    case 6:

                        personality6Count++; //кеспе
                        break;
                    case 7:

                        personality7Count++; //коже
                        break;
                    case 8:

                        personality8Count++; //манты
                        break;
                    case 9:

                        personality9Count++; //айран
                        break;
                    case 10:

                        personality10Count++; //борщ
                        break;
                }
                nextQuestion();
            }
        }, 400);
    }

    public void answer2Clicked(View view){
        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality10Count++; //борщ
                        break;
                    case 2:

                        personality1Count++; //бешпармак
                        break;
                    case 3:

                        personality2Count++; //куырдак
                        break;
                    case 4:

                        personality3Count++; //баурсаки
                        break;
                    case 5:

                        personality4Count++; //лагман
                        break;
                    case 6:

                        personality5Count++; //сумалак
                        break;
                    case 7:

                        personality6Count++; //кеспе
                        break;
                    case 8:

                        personality7Count++; //коже
                        break;
                    case 9:

                        personality8Count++; //манты
                        break;
                    case 10:

                        personality9Count++; //айран
                        break;
                }
                nextQuestion();

            }
        }, 400);
    }

    public void answer3Clicked(View view){
        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality9Count++; //айран
                        break;
                    case 2:

                        personality10Count++; ///борщ
                        break;
                    case 3:

                        personality1Count++; //бешпармак
                        break;
                    case 4:

                        personality2Count++; //куырдак
                        break;
                    case 5:

                        personality3Count++; //баурсаки
                        break;
                    case 6:

                        personality4Count++; //лагман
                        break;
                    case 7:

                        personality5Count++; //сумалак
                        break;
                    case 8:

                        personality6Count++; //кеспе
                        break;
                    case 9:
                        personality7Count++; //коже
                        break;
                    case 10:

                        personality8Count++; //манты
                        break;
                }
                nextQuestion();
            }
        }, 400);
    }

    public void answer4Clicked(View view){

//        view.startAnimation(animScale);
        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality8Count++; //манты
                        break;
                    case 2:

                        personality9Count++; //айран
                        break;
                    case 3:

                        personality10Count++; //борщ
                        break;
                    case 4:

                        personality1Count++; //бешпармак
                        break;
                    case 5:

                        personality2Count++; //куырдак
                        break;
                    case 6:

                        personality3Count++; //баурсаки
                        break;
                    case 7:

                        personality4Count++; //лагман
                        break;
                    case 8:

                        personality5Count++; //сумалак
                        break;
                    case 9:

                        personality6Count++; //кеспе
                        break;
                    case 10:

                        personality7Count++; //коже
                        break;
                }
                nextQuestion();

            }
        }, 400);

    }

    public void back(View view){
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
    }



    public void nextQuestion(){


        try {
            if (countQuestion < 10) {
                int x = random(0, 4);
                countTextView.setText(countQuestion + 1 + "/10");
                question.setText(questionCategory.get(countQuestion).get(x).get(0));
                answerButton1.setText(questionCategory.get(countQuestion).get(x).get(1));
                answerButton2.setText(questionCategory.get(countQuestion).get(x).get(2));
                answerButton3.setText(questionCategory.get(countQuestion).get(x).get(3));
                answerButton4.setText(questionCategory.get(countQuestion).get(x).get(4));
                countQuestion++;
            } else {
                testFinished();
            }
        } catch (Exception ArrayIndexOutOfBoundsException){
        }
    }


    public int random(int minNumber, int maxNumber){
        int randomNumber = (int)(Math.random() * maxNumber + minNumber);;
        return randomNumber;
    }

}
