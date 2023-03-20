package com.mikekrysan.module29_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flyingX = FlingAnimation(airPlane, DynamicAnimation.SCROLL_X).apply {
            friction = 1.1f
//            minimumVisibleChange = DynamicAnimation.MIN_VISIBLE_CHANGE_ALPHA
        }
        val flyingY = FlingAnimation(airPlane, DynamicAnimation.SCROLL_Y).apply {
            friction = 1.1f
        }

        //Чтобы все заработало, нам нужен GuesterDetector и его слушатель жестов
        //Мы будем использовать класс SimpleOnGestureListener, который позволит нам переопределить
        //только тот метод, который нам нужен, потому как он уже наследует OnGestureListener и переопределил
        //их за нас, а мы переопределяем только то, что нужно
        val gesturesListener = object : GestureDetector.SimpleOnGestureListener() {
            override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
                flyingX.setStartVelocity(velocityX )
                flyingY.setStartVelocity(velocityY)

                flyingX.start()
                flyingY.start()

                return true
            }
        }

        val gestureDetector = GestureDetector(this, gesturesListener)

        airPlane.setOnTouchListener { v, event ->
            v.performClick()
            gestureDetector.onTouchEvent(event)
        }
    }


}