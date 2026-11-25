package com.lumo.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.BLACK
        window.navigationBarColor = Color.BLACK

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.BLACK)
            setPadding(20, 25, 20, 15)
        }

        val title = TextView(this).apply {
            text = "LUMO"
            textSize = 32f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "اكتشف الفيديوهات"
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val video = TextView(this).apply {
            text = "🎬\n\nمرحباً بك في LUMO\n\nعالمك، فيديوهاتك"
            textSize = 25f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(30, 20, 45))
        }

        val buttons = TextView(this).apply {
            text = "⌂ الرئيسية       🔍 اكتشف       ＋ نشر       ♡ إعجاب       👤 حسابي"
            textSize = 15f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(video, LinearLayout.LayoutParams(
            -1, 0, 1f
        ).apply { setMargins(0, 25, 0, 25) })
        root.addView(buttons)

        setContentView(root)
    }
}
