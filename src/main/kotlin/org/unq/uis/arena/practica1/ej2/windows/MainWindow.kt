package org.unq.uis.arena.practica1.ej2.windows

import org.unq.uis.arena.practica1.ej2.models.Calculadora
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.*
import org.uqbar.commons.model.exceptions.UserException
import java.awt.Color

class MainWindow(parent: WindowOwner, model: Calculadora) : SimpleWindow<Calculadora>(parent, model) {
    override fun addActions(panel: Panel) {
        Panel(panel) with {
            layout = VerticalLayout()
            val calculator = thisWindow.modelObject;
            Button(this) with {
                caption = "Sumar"

                onClick { calculator.sumar() }
            }

            Button(this) with {
                caption = "Restar"

                onClick { calculator.restar() }
            }

            Button(this) with {
                caption = "Multiplicar"

                onClick { calculator.multiplicar() }
            }

            Button(this) with {
                caption = "Dividir"

                background = Color.ORANGE
                color = Color.DARK_GRAY

                onClick {
                    if(calculator.segundoNumero > 0.0) calculator.dividir()
                    else throw UserException("No se puede dividir por cero")
                }
            }
        }
    }

    override fun createFormPanel(panel: Panel) {
        title = "Calculadora"
        //Primer input
        Label(panel) withText  "Primer Operando"
        NumericField(panel) with {
            bindTo("primerNumero")
        }

        //Segundo Input
        Label(panel) withText  "Segundo Operando"
        NumericField(panel) with {
            bindTo("segundoNumero")
        }

        Label(panel) with {
            bindTo("resultado")
        }
    }
}