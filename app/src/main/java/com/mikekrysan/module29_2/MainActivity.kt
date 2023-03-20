package com.mikekrysan.module29_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Toast
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var diffX = 0f
    private var diffY = 0f

    //fling-animation
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val flyingX = FlingAnimation(airPlane, DynamicAnimation.SCROLL_X).apply {
//            friction = 1.1f
////            minimumVisibleChange = DynamicAnimation.MIN_VISIBLE_CHANGE_ALPHA
//        }
//        val flyingY = FlingAnimation(airPlane, DynamicAnimation.SCROLL_Y).apply {
//            friction = 1.1f
//        }
//
//        //Чтобы все заработало, нам нужен GuesterDetector и его слушатель жестов
//        //Мы будем использовать класс SimpleOnGestureListener, который позволит нам переопределить
//        //только тот метод, который нам нужен, потому как он уже наследует OnGestureListener и переопределил
//        //их за нас, а мы переопределяем только то, что нужно
//        val gesturesListener = object : GestureDetector.SimpleOnGestureListener() {
//            override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
//                flyingX.setStartVelocity(velocityX )
//                flyingY.setStartVelocity(velocityY)
//
//                flyingX.start()
//                flyingY.start()
//
//                return true
//            }
//        }
//
//        val gestureDetector = GestureDetector(this, gesturesListener)
//
//        airPlane.setOnTouchListener { v, event ->
//            v.performClick()
//            gestureDetector.onTouchEvent(event)
//        }
//    }


    //spring-animation
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val springForce = SpringForce(0f).apply {
//            stiffness = SpringForce.STIFFNESS_MEDIUM
//            dampingRatio = SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY
//
//
//        }
//
//        val springAnimationX = SpringAnimation(ball, DynamicAnimation.TRANSLATION_X).setSpring(springForce)
//        val springAnimationY = SpringAnimation(ball, DynamicAnimation.TRANSLATION_Y).setSpring(springForce)
//
//        //Два слушателя у spring-animation: на изменение анимации и на конец анимации
////        springAnimationX.addEndListener { animation, canceled, value, velocity ->
////            Toast.makeText(this, "Animation end", Toast.LENGTH_SHORT).show()
////        }
//
//        //чтобы получать данные в реальном времени есть updateListener, который в реальном времени прослушивает все эти действия
//        springAnimationX.addUpdateListener { animation, value, velocity ->
//            println(value)
//            println(velocity)
//        }
//
//        ball.setOnTouchListener { v, event ->
//            v.performClick()
//            //Проверяем какое действие у нас произошло
//            when(event.action) {
//                //MotionEvent.ACTION_DOWN - вызывается, когда ваш палец коснулся экрана, то есть как бы опустился
//                //вниз, поэтому и DOWN
//                MotionEvent.ACTION_DOWN -> {
//                    //Устанавливаем координаты для корректного перемещения
//                    diffX = event.rawX - v.x
//                    diffY = event.rawY - v.y
//
//                    //Отменяем анимацию, если к примера нашу view еще "пружинит" с предыдущего раза
//                    springAnimationX.cancel()
//                    springAnimationY.cancel()
//                }
//                //MotionEvent.ACTION_MOVE - вызывается, когда мы перемещаем view, то есть меняются координаты
//                //view
//                MotionEvent.ACTION_MOVE -> {
//                    //rawX, rawY текущие координаты view
//                     ball.x = event.rawX - diffX
//                    ball.y = event.rawY - diffY
//                }
//                //MotionEvent.ACTION_UP - вызывается, когда палец перестал касаться экрана
//                MotionEvent.ACTION_UP -> {
//                    //Стартуем анимацию возвращения в прежнее положение
//                    springAnimationX.start()
//                    springAnimationY.start()
//                }
//            }
//            true
//        }
//
//    }

    //конвертация картинки формата svg в android vector drawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android_dance.setImageResource(R.drawable.android_dance)

    }

}