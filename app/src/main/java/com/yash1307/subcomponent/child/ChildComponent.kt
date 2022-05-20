package com.yash1307.subcomponent.child

import com.yash1307.subcomponent.ActivityScoped
import com.yash1307.subcomponent.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScoped
@Subcomponent(modules = [ChildModule::class])
interface ChildComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface ChildFactory {
        fun create(@BindsInstance msg: String): ChildComponent
    }
}