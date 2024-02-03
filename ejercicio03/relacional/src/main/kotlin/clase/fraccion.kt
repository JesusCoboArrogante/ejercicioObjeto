package org.example.clase

class fraccion(var numerado:Int = 0, var denominador:Int = 0) {
    private var nC = 0
    private var dC= 0

    fun settsumar(num1: fraccion, num2: fraccion){
        var a =0
        var b = 0
        if (num1.denominador == num2.denominador){
            nC = num1.numerado + num2.numerado
            dC = num1.denominador
        }else {
            a = num1.numerado * num2.denominador
            b = num1.denominador * num2.numerado
            nC = a + b
            dC = num1.denominador * num2.denominador
        }


    }
    fun settMultiplicar(num1: fraccion,num2: fraccion){
        nC = num1.numerado * num2.numerado
        dC = num1.denominador * num2.denominador
    }


        fun getnumerador(): Int{//leer el valor
            return nC
        }

        fun getdenominador(): Int{
            return dC
        }

    override fun toString(): String {
        return ("el $numerado | $denominador ")

    }

}