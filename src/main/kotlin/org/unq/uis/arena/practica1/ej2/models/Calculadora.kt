package org.unq.uis.arena.practica1.ej2.models

import org.uqbar.commons.model.annotations.Observable

@Observable
class Calculadora {
    var resultado = 0.0;
    var primerNumero = 0.0;
    var segundoNumero = 0.0;

    fun sumar() {resultado = primerNumero + segundoNumero}
    fun restar() {resultado = primerNumero - segundoNumero}
    fun dividir() {resultado = primerNumero / segundoNumero}
    fun multiplicar() {resultado = primerNumero * segundoNumero}
}