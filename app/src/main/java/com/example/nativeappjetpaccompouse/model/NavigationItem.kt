package com.example.nativeappjetpaccompouse.model

import androidx.annotation.DrawableRes
import com.example.nativeappjetpaccompouse.R
import com.example.nativeappjetpaccompouse.presentation.components.Screen

enum class NavigationItem (
    val screen: Screen,
    val title: String,
    @DrawableRes val icon: Int
) {
    Home(
        screen = Screen.Home,
        icon = R.drawable.icon_home,
        title = "Home"
    ),
    Profile(
        screen = Screen.Connect,
        icon = R.drawable.icon_home,
        title = "Connect"
    ),
    Settings(
        screen = Screen.Settings,
        icon = R.drawable.icon_settings,
        title = "Settings"
    )
}

