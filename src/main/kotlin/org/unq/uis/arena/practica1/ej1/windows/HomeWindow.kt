package org.unq.uis.arena.practica1.ej1.windows

import org.unq.uis.arena.practica1.ej1.models.UserModel
import org.uqbar.arena.bindings.ValueTransformer
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.*
import java.awt.Color

class HomeWindow(parent: WindowOwner, model: UserModel) : SimpleWindow<UserModel>(parent,model) {
    override fun addActions(panel: Panel) {
        Button(panel) with {
            caption = "Log In"
            onClick { modelObject.checkInputValidation() }
        }
    }

    override fun createFormPanel(panel: Panel) {
        title = "Log in"

        Label(panel) withText "Username:"
        TextBox(panel) with {
            bindTo("username")
        }

        Label(panel) withText "Password:"
        PasswordField(panel) with {
            bindTo("password")
        }

        Label(panel) with {
            width = 100
            bindBackgroundTo("validPassword").setTransformer(PassWordTransformer())
            bindTo("validPassword")
            color = Color.WHITE
        }
    }

}

class PassWordTransformer: ValueTransformer<Boolean, Color> {
    override fun viewToModel(color: Color?): Boolean = color == Color.GREEN

    override fun modelToView(valueFromModel: Boolean): Color = if(valueFromModel) Color.GREEN else Color.ORANGE

    override fun getModelType(): Class<Boolean> = Boolean::class.java

    override fun getViewType(): Class<Color> = Color::class.java

}
