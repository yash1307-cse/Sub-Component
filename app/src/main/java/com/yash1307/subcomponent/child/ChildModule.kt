package com.yash1307.subcomponent.child

import com.yash1307.subcomponent.ActivityScoped
import dagger.Module
import dagger.Provides

@Module
class ChildModule {

    @ActivityScoped
    @Provides
    fun sendMsg(msg:String): ChildInterface {
        return ImplChildInterface(msg)
    }
}