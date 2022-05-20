package com.yash1307.subcomponent

import android.app.Application
import com.yash1307.subcomponent.parent.DaggerParentComponent
import com.yash1307.subcomponent.parent.ParentComponent

class BaseApplication : Application(){

    lateinit var parentComponent: ParentComponent
    override fun onCreate() {
        super.onCreate()

        parentComponent = DaggerParentComponent.builder().build()

    }
}