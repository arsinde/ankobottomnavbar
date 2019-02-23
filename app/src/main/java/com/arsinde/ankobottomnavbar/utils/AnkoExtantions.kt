package com.arsinde.ankobottomnavbar.utils

import android.view.ViewManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.jetbrains.anko.custom.ankoView

inline fun ViewManager.bottomNavigation(init: BottomNavigationView.() -> Unit = {}) =
    ankoView({ BottomNavigationView(it) }, theme = 0, init = init)