package com.yash1307.subcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yash1307.subcomponent.child.Message
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var message: Message
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentComponent = (application as BaseApplication).parentComponent

        val component = parentComponent.getChildComponentFactory().create("Hello")
        component.inject(this)

        message.message()
    }
}