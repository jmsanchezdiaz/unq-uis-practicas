package org.unq.uis.arena.practica1.ej2

import org.unq.uis.arena.practica1.ej2.models.Calculadora
import org.unq.uis.arena.practica1.ej2.windows.MainWindow
import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window

class App : Application() {
    override fun createMainWindow(): Window<*> {
        return MainWindow(this, Calculadora())
    }
}

fun main() = App().start()