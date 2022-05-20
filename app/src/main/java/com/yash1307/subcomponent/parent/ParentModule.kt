package com.yash1307.subcomponent.parent

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ParentModule {

    @Singleton
    @Provides
    fun sendMsg(): ParentInterface {
        return ImplParentInterface()
    }
}