package org.unq.uis.arena.practica1.ej1.models

import org.uqbar.commons.model.annotations.Observable

@Observable
class UserModel {
    var username: String = ""
    var password: String = ""
    var validPassword : Boolean = false;

    fun checkInputValidation(){
        validPassword = username.isNotBlank() && password.isNotBlank()
    }
}