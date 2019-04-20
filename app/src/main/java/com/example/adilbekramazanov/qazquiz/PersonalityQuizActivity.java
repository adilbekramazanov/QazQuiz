package com.example.adilbekramazanov.qazquiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import java.util.List;

import java.util.ArrayList;

public class PersonalityQuizActivity extends AppCompatActivity {
    Animation animScale;
    Animation animFadeout;
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

    String personality1Name = "Вы Баке";
    String personality2Name = "Вы Олимпер";
    String personality3Name = "Вы Мажор";
    String personality4Name = "Вы Доттер";
    String personality5Name = "Вы Тайсн";
    String personality6Name = "Вы Студент";
    String personality7Name = "Вы Братишка";
    String personality8Name = "Вы Бизнес тренер";
    String personality9Name = "Вы Татешка";
    String personality10Name = "Вы Инста блоггер";

    String personality1Description = "Свои проблемы вы решаете сами. И не свои проблемы, решаете тоже вы. Телефон звонит, просьбы идут, а тендер решается";
    String personality2Description = "\"Я не азартный человек, просто слежу за собачьими бегами\"\n" +
            "Если вы начинаете что то делать, то делаете это до самого конца. Вы эмоциональный человек, главной целью которого является получение удовольствия от жизни." +
            " Вы стремитесь к лидерству. Часто готовы поспорить и любите чувствовать себя главным. " +
            "Скорее всего вы умны и образованы, более того уверены в себе и вам бывает " +
            "тяжело принять поражение.";
    String personality3Description = "\"Откройте рты, сорвите уборы, по улице чешут мальчики- мажоры!\" \nУ вас всегда много историй. В основном они связаны с тем сколько вы потратили денег." +
            "Вы тратите больше всех, даже когда у вас меньше всех. Часто вас можно увидеть на различных тусовках.";
    String personality4Description = "Вы предпочитаете маленькие компании, либо вовсе находиться в одиночку. А то и правильно, ведь гораздо легче общаться по интернету! Главное помните, что есть и реальный мир :)";
    String personality5Description = "Гроза района. По вашим словам, вы участник 100500 драк, а 50 силовых подтягиваний для вас лишь разминка.";
    String personality6Description = "Вы всегда учитесь чему то новому, экономите деньги и не понимаете что будет в будущем";
    String personality7Description = "Вам всегда рассказывают как жить и что делать. Оно и правильно, сами вы мало что сделаете. Лучше бы вы прошли тест заного.";
    String personality8Description = "Вы всегда рассказываете другим как жить. Иногда вы правы, а иногда вы уже всем надоели";
    String personality9Description = "Вы заботитесь обо всех вокруг, даже когда стоило бы позаботиться о себе. Компенсируете вы это чувством ответственности за других и личным авторитетом. Вас уважают и к вам прислушиваются.";
    String personality10Description = "Вы самоуверенны и дерзки. Это позволяет вам добиваться того, что другие считают невозможным. Люди говорят, что нельзя проснуться популярным. Вы с эти согласиться не можете.";

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

        Category1variant1.add("Инспектор дорожной полиции вас остановил, что вы сделаете?");
        Category1variant1.add("Это невозможно"); //баке
        Category1variant1.add("Вы позвоните агашке"); //блоггер
        Category1variant1.add("Похвалите инспектора"); //татешка
        Category1variant1.add("Договориться"); //бизнестренер

        Category1variant2.add("Во сколько часов вы встаете по выходным?");
        Category1variant2.add("До обеда");
        Category1variant2.add("После обеда");
        Category1variant2.add("Раньше всех");
        Category1variant2.add("Сплю пока не разбудят");

        Category1variant3.add("Занимались ли вы пожертвованиями?");
        Category1variant3.add("Периодически, но сумму не оглашаю");
        Category1variant3.add("Редко, но даю всем об этом знать");
        Category1variant3.add("Иногда");
        Category1variant3.add("Никогда");

        Category1variant4.add("Инспектор дорожной полиции не берет взятку. Каковы твои действия?");
        Category1variant4.add("Это невозможно");
        Category1variant4.add("Вы позвоните агашке");
        Category1variant4.add("Похвалите инспектора");
        Category1variant4.add("Договориться");

        Category1variant5.add("Инспектор дорожной полиции не берет взятку. Каковы твои действия?");
        Category1variant5.add("Это невозможно");
        Category1variant5.add("Вы позвоните агашке");
        Category1variant5.add("Похвалите инспектора");
        Category1variant5.add("Договориться");

        Category1Variants.add( Category1variant1);
        Category1Variants.add( Category1variant2);
        Category1Variants.add( Category1variant3);
        Category1Variants.add( Category1variant4);
        Category1Variants.add( Category1variant5);

        //SecondCategory

        Category2variant1.add("Как вы доказываете правоту в споре?");
        Category2variant1.add("\"Железобетонно зайдет\"");
        Category2variant1.add("С вами никто не спорит");
        Category2variant1.add("Вы избегаете споров");
        Category2variant1.add("Позовете третьего чловека");

        Category2variant2.add("Как вы доказываете правоту в споре?");
        Category2variant2.add("\"Железобетонно зайдет\"");
        Category2variant2.add("С вами никто не спорит");
        Category2variant2.add("Вы избегаете споров");
        Category2variant2.add("Позовете третьего чловека");

        Category2variant3.add("Как вы доказываете правоту в споре?");
        Category2variant3.add("\"Железобетонно зайдет\"");
        Category2variant3.add("С вами никто не спорит");
        Category2variant3.add("Вы избегаете споров");
        Category2variant3.add("Позовете третьего чловека");

        Category2variant4.add("Как вы доказываете правоту в споре?");
        Category2variant4.add("\"Железобетонно зайдет\"");
        Category2variant4.add("С вами никто не спорит");
        Category2variant4.add("Вы избегаете споров");
        Category2variant4.add("Позовете третьего чловека");

        Category2variant5.add("Как вы доказываете правоту в споре?");
        Category2variant5.add("\"Железобетонно зайдет\"");
        Category2variant5.add("С вами никто не спорит");
        Category2variant5.add("Вы избегаете споров");
        Category2variant5.add("Позовете третьего чловека");

        Category2Variants.add( Category2variant1);
        Category2Variants.add( Category2variant2);
        Category2Variants.add( Category2variant3);
        Category2Variants.add( Category2variant4);
        Category2Variants.add( Category2variant5);

        //Third Category

        Category3variant1.add("Что вы сделаете в конфликтной ситуации?");
        Category3variant1.add("Попытаюсь покинуть место");
        Category3variant1.add("Буду наблюдать");
        Category3variant1.add("Улажу конфликт");
        Category3variant1.add("Жекпе-жек");

        Category3variant2.add("Что вы сделаете в конфликтной ситуации?");
        Category3variant2.add("Попытаюсь покинуть место");
        Category3variant2.add("Буду наблюдать");
        Category3variant2.add("Улажу конфликт");
        Category3variant2.add("Жекпе-жек");

        Category3variant3.add("Что вы сделаете в конфликтной ситуации?");
        Category3variant3.add("Попытаюсь покинуть место");
        Category3variant3.add("Буду наблюдать");
        Category3variant3.add("Улажу конфликт");
        Category3variant3.add("Жекпе-жек");

        Category3variant4.add("Что вы сделаете в конфликтной ситуации?");
        Category3variant4.add("Попытаюсь покинуть место");
        Category3variant4.add("Буду наблюдать");
        Category3variant4.add("Улажу конфликт");
        Category3variant4.add("Жекпе-жек");

        Category3variant5.add("Что вы сделаете в конфликтной ситуации?");
        Category3variant5.add("Попытаюсь покинуть место");
        Category3variant5.add("Буду наблюдать");
        Category3variant5.add("Улажу конфликт");
        Category3variant5.add("Жекпе-жек");

        Category3Variants.add( Category3variant1);
        Category3Variants.add( Category3variant2);
        Category3Variants.add( Category3variant3);
        Category3Variants.add( Category3variant4);
        Category3Variants.add( Category3variant5);

        //Fourth Category

        Category4variant1.add("Как вы проводите выходной день?");
        Category4variant1.add("В кресле за компьютером");
        Category4variant1.add("Каждый день - выходной");
        Category4variant1.add("В клубе/баре");
        Category4variant1.add("На работе или с семьей");

        Category4variant2.add("Как вы проводите выходной день?");
        Category4variant2.add("В кресле за компьютером");
        Category4variant2.add("Каждый день - выходной");
        Category4variant1.add("В клубе/баре");
        Category4variant2.add("На работе или с семьей");

        Category4variant3.add("Как вы проводите выходной день?");
        Category4variant3.add("В кресле за компьютером");
        Category4variant3.add("Каждый день - выходной");
        Category4variant3.add("В клубе/баре");
        Category4variant3.add("На работе или с семьей");

        Category4variant4.add("Как вы проводите выходной день?");
        Category4variant4.add("В кресле за компьютером");
        Category4variant4.add("Каждый день - выходной");
        Category4variant4.add("В клубе/баре");
        Category4variant4.add("На работе или с семьей");

        Category4variant5.add("Как вы проводите выходной день?");
        Category4variant5.add("В кресле за компьютером");
        Category4variant5.add("Каждый день - выходной");
        Category4variant5.add("В клубе/баре");
        Category4variant5.add("На работе или с семьей");

        Category4Variants.add( Category4variant1);
        Category4Variants.add( Category4variant2);
        Category4Variants.add( Category4variant3);
        Category4Variants.add( Category4variant4);
        Category4Variants.add( Category4variant5);


        //Fifth Category

        Category5variant1.add("В компании наступило неловкое молчание. Что вы сделаете?");
        Category5variant1.add("Выдумаю историю");
        Category5variant1.add("Уйду");
        Category5variant1.add("Расскажу реальную историю");
        Category5variant1.add("Расскажу шутку");

        Category5variant2.add("В компании наступило неловкое молчание. Что вы сделаете?");
        Category5variant2.add("Выдумаю историю");
        Category5variant2.add("Уйду");
        Category5variant2.add("Расскажу реальную историю");
        Category5variant2.add("Расскажу шутку");

        Category5variant3.add("В компании наступило неловкое молчание. Что вы сделаете?");
        Category5variant3.add("Выдумаю историю");
        Category5variant3.add("Уйду");
        Category5variant3.add("Расскажу реальную историю");
        Category5variant3.add("Расскажу шутку");

        Category5variant4.add("В компании наступило неловкое молчание. Что вы сделаете?");
        Category5variant4.add("Выдумаю историю");
        Category5variant4.add("Уйду");
        Category5variant4.add("Расскажу реальную историю");
        Category5variant4.add("Расскажу шутку");

        Category5variant5.add("В компании наступило неловкое молчание. Что вы сделаете?");
        Category5variant5.add("Выдумаю историю");
        Category5variant5.add("Уйду");
        Category5variant5.add("Расскажу реальную историю");
        Category5variant5.add("Расскажу шутку");

        Category5Variants.add( Category5variant1);
        Category5Variants.add( Category5variant2);
        Category5Variants.add( Category5variant3);
        Category5Variants.add( Category5variant4);
        Category5Variants.add( Category5variant5);

        //Sixth category

        Category6variant1.add("Выберите место для свидания");
        Category6variant1.add("На крыше");
        Category6variant1.add("На районе");
        Category6variant1.add("Дома");
        Category6variant1.add("В ресторане");

        Category6variant2.add("Выберите место для свидания");
        Category6variant2.add("На крыше");
        Category6variant2.add("На районе");
        Category6variant2.add("Дома");
        Category6variant2.add("В ресторане");

        Category6variant3.add("Выберите место для свидания");
        Category6variant3.add("На крыше");
        Category6variant3.add("На районе");
        Category6variant3.add("Дома");
        Category6variant3.add("В ресторане");

        Category6variant4.add("Выберите место для свидания");
        Category6variant4.add("На крыше");
        Category6variant4.add("На районе");
        Category6variant4.add("Дома");
        Category6variant4.add("В ресторане");

        Category6variant5.add("Выберите место для свидания");
        Category6variant5.add("На крыше");
        Category6variant5.add("На районе");
        Category6variant5.add("Дома");
        Category6variant5.add("В ресторане");

        Category6Variants.add( Category6variant1);
        Category6Variants.add( Category6variant2);
        Category6Variants.add( Category6variant3);
        Category6Variants.add( Category6variant4);
        Category6Variants.add( Category6variant5);

        //Seventh category

        Category7variant1.add("В школу вы пришли без домашнего задания. Что вы скажете учителю?");
        Category7variant1.add("Прикитесь что не знали");
        Category7variant1.add("Решите все в классе");
        Category7variant1.add("Вы действительно не знали");
        Category7variant1.add("Скажите что были дела важнее");

        Category7variant2.add("В школу вы пришли без домашнего задания. Что вы скажете учителю?");
        Category7variant2.add("Прикитесь что не знали");
        Category7variant2.add("Решите все в классе");
        Category7variant2.add("Вы действительно не знали");
        Category7variant2.add("Скажите что были дела важнее");

        Category7variant3.add("В школу вы пришли без домашнего задания. Что вы скажете учителю?");
        Category7variant3.add("Прикитесь что не знали");
        Category7variant3.add("Решите все в классе");
        Category7variant3.add("Вы действительно не знали");
        Category7variant3.add("Скажите что были дела важнее");

        Category7variant4.add("В школу вы пришли без домашнего задания. Что вы скажете учителю?");
        Category7variant4.add("Прикитесь что не знали");
        Category7variant4.add("Решите все в классе");
        Category7variant4.add("Вы действительно не знали");
        Category7variant4.add("Скажите что были дела важнее");

        Category7variant5.add("В школу вы пришли без домашнего задания. Что вы скажете учителю?");
        Category7variant5.add("Прикитесь что не знали");
        Category7variant5.add("Решите все в классе");
        Category7variant5.add("Вы действительно не знали");
        Category7variant5.add("Скажите что были дела важнее");

        Category7Variants.add( Category7variant1);
        Category7Variants.add( Category7variant2);
        Category7Variants.add( Category7variant3);
        Category7Variants.add( Category7variant4);
        Category7Variants.add( Category7variant5);

        //Eight category

        Category8variant1.add("Ваше отношение к саморазвитию");
        Category8variant1.add("Вы уже знаете все что вам надо");
        Category8variant1.add("Вы всегда хотите начать завтра");
        Category8variant1.add("Вы всегда ищите чему поучиться");
        Category8variant1.add("У вас нет на это времени");

        Category8variant2.add("Ваше отношение к саморазвитию");
        Category8variant2.add("Вы уже знаете все что вам надо");
        Category8variant2.add("Вы всегда хотите начать завтра");
        Category8variant2.add("Вы всегда ищите чему поучиться");
        Category8variant2.add("У вас нет на это времени");

        Category8variant3.add("Ваше отношение к саморазвитию");
        Category8variant3.add("Вы уже знаете все что вам надо");
        Category8variant3.add("Вы иногда учитесь новому");
        Category8variant3.add("Вы всегда ищите чему поучиться");
        Category8variant3.add("У вас нет на это времени");

        Category8variant4.add("Ваше отношение к саморазвитию");
        Category8variant4.add("Вы уже знаете все что вам надо");
        Category8variant4.add("Вы иногда учитесь новому");
        Category8variant4.add("Вы всегда ищите чему поучиться");
        Category8variant4.add("У вас нет на это времени");

        Category8variant5.add("Ваше отношение к саморазвитию");
        Category8variant5.add("Вы уже знаете все что вам надо");
        Category8variant5.add("Вы иногда учитесь новому");
        Category8variant5.add("Вы всегда ищите чему поучиться");
        Category8variant5.add("У вас нет на это времени");

        Category8Variants.add( Category8variant1);
        Category8Variants.add( Category8variant2);
        Category8Variants.add( Category8variant3);
        Category8Variants.add( Category8variant4);
        Category8Variants.add( Category8variant5);

        //Nine category

        Category9variant1.add("Вы выиграли деньги в лотерее. Что вы сделаете?");
        Category9variant1.add("Вы Поделитесь");
        Category9variant1.add("Расскажите всем, но не поделитесь");
        Category9variant1.add("У вас их отбирут");
        Category9variant1.add("Инвестируете");

        Category9variant2.add("Вы выиграли деньги в лотерее. Что вы сделаете?");
        Category9variant2.add("Вы Поделитесь");
        Category9variant2.add("Расскажите всем, но не поделитесь");
        Category9variant2.add("У вас их отбирут");
        Category9variant2.add("Инвестируете");

        Category9variant3.add("Вы выиграли деньги в лотерее. Что вы сделаете?");
        Category9variant3.add("Вы Поделитесь");
        Category9variant3.add("Расскажите всем, но не поделитесь");
        Category9variant3.add("У вас их отбирут");
        Category9variant3.add("Инвестируете");

        Category9variant4.add("Вы выиграли деньги в лотерее. Что вы сделаете?");
        Category9variant4.add("Вы Поделитесь");
        Category9variant4.add("Расскажите всем, но не поделитесь");
        Category9variant4.add("У вас их отбирут");
        Category9variant4.add("Инвестируете");

        Category9variant5.add("Вы выиграли деньги в лотерее. Что вы сделаете?");
        Category9variant5.add("Вы Поделитесь");
        Category9variant5.add("Расскажите всем, но не поделитесь");
        Category9variant5.add("У вас их отбирут");
        Category9variant5.add("Инвестируете");

        Category9Variants.add( Category9variant1);
        Category9Variants.add( Category9variant2);
        Category9Variants.add( Category9variant3);
        Category9Variants.add( Category9variant4);
        Category9Variants.add( Category9variant5);

        //Seventh category

        Category10variant1.add("Где вы любите ужинать?");
        Category10variant1.add("В ресторане");
        Category10variant1.add("У себя дома");
        Category10variant1.add("Дома, но не у себя");
        Category10variant1.add("KFC");

        Category10variant2.add("Где вы любите ужинать?");
        Category10variant2.add("В ресторане");
        Category10variant2.add("У себя дома");
        Category10variant2.add("Дома, но не у себя");
        Category10variant2.add("KFC");

        Category10variant3.add("Где вы любите ужинать?");
        Category10variant3.add("В ресторане");
        Category10variant3.add("У себя дома");
        Category10variant3.add("Дома, но не у себя");
        Category10variant3.add("KFC");

        Category10variant4.add("Где вы любите ужинать?");
        Category10variant4.add("В ресторане");
        Category10variant4.add("У себя дома");
        Category10variant4.add("Дома, но не у себя");
        Category10variant4.add("KFC");

        Category10variant5.add("Где вы любите ужинать?");
        Category10variant5.add("В ресторане");
        Category10variant5.add("У себя дома");
        Category10variant5.add("Дома, но не у себя");
        Category10variant5.add("KFC");

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
        Intent intent = new Intent(PersonalityQuizActivity.this, ResultActivity .class);
        intent.putExtra("RESULT_PERSONALITY", resultPersonality);
        intent.putExtra("RESULT_PERSONALITY_DESCRIPTION", resultPersonalityDescription);
        startActivity(intent);

        Toast.makeText(this, resultPersonality, Toast.LENGTH_LONG).show();
    }

    public void answer1Clicked(View view){
        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality1Count++; //баке
                        break;
                    case 2:

                        personality2Count++; //олимпер
                        break;
                    case 3:

                        personality3Count++; //мажор
                        break;
                    case 4:

                        personality4Count++; //доттер
                        break;
                    case 5:

                        personality5Count++; //тайсн
                        break;
                    case 6:

                        personality6Count++; //студент
                        break;
                    case 7:

                        personality7Count++; //братишка
                        break;
                    case 8:

                        personality8Count++; //бизнес тренер
                        break;
                    case 9:

                        personality9Count++; //татешка
                        break;
                    case 10:

                        personality10Count++; //fashion model
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

                        personality10Count++; //insta blogger
                        break;
                    case 2:

                        personality1Count++; //баке
                        break;
                    case 3:

                        personality2Count++; //олимпер
                        break;
                    case 4:

                        personality3Count++; //мажор
                        break;
                    case 5:

                        personality4Count++; //доттер
                        break;
                    case 6:

                        personality5Count++; //тайсн
                        break;
                    case 7:

                        personality6Count++; //студент
                        break;
                    case 8:

                        personality7Count++; //братишка
                        break;
                    case 9:

                        personality8Count++; //бизнесренер
                        break;
                    case 10:

                        personality9Count++; //татешка
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

                        personality9Count++; //татешка
                        break;
                    case 2:

                        personality10Count++; //fashion model
                        break;
                    case 3:

                        personality1Count++; //баке
                        break;
                    case 4:

                        personality2Count++; //олимпер
                        break;
                    case 5:

                        personality3Count++; //мажор
                        break;
                    case 6:

                        personality4Count++; //доттер
                        break;
                    case 7:

                        personality5Count++; //тайсн
                        break;
                    case 8:

                        personality6Count++; //студент
                        break;
                    case 9:
                        personality7Count++; //братишка
                        break;
                    case 10:

                        personality8Count++; //бизнесренер
                        break;
                }
                nextQuestion();
            }
        }, 400);
    }

    public void answer4Clicked(View view){

        view.startAnimation(animScale);
        question.startAnimation(animFadeout);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (countQuestion){
                    case 1:

                        personality8Count++; //бизнесренер
                        break;
                    case 2:

                        personality9Count++; //татешка
                        break;
                    case 3:

                        personality10Count++; //insta blogger
                        break;
                    case 4:

                        personality1Count++; //баке
                        break;
                    case 5:

                        personality2Count++; //олимпер
                        break;
                    case 6:

                        personality3Count++; //мажор
                        break;
                    case 7:

                        personality4Count++; //доттер
                        break;
                    case 8:

                        personality5Count++; //тайсн
                        break;
                    case 9:

                        personality6Count++; //студент
                        break;
                    case 10:

                        personality7Count++; //братишка
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
        int randomNumber = (int)(Math.random() * maxNumber + minNumber);
        return randomNumber;
    }

}
