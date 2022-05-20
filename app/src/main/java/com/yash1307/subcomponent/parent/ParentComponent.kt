package com.yash1307.subcomponent.parent

import com.yash1307.subcomponent.child.ChildComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ParentModule::class])
interface ParentComponent {

    fun getChildComponentFactory(): ChildComponent.ChildFactory
}