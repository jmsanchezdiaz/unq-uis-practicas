package org.unq.uis.arena.practica1.ej1

import org.unq.uis.arena.practica1.ej1.models.UserModel
import org.unq.uis.arena.practica1.ej1.windows.HomeWindow
import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class MainApp : Application() {
    override fun createMainWindow(): Window<UserModel> {
        return HomeWindow(this, UserModel())
    }
}

fun main() = MainApp().start()