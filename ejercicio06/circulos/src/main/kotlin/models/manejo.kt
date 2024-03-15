
package org.example.models



class matematicas {
    fun igual(a: Array<String>,b: Array<String>) {
        println("los numeros iguales son")
        for (i in a.indices){
            for(j in b.indices){
                if (a[i] == b[j]){
                    print("[${a[i]}]")
                }
            }

        }
    }

    fun union (a: Array<String>,b: Array<String>){
        if (a.size >= b.size){
            for (i in a.indices){
                print("[${a[i]}][${b[i]}]")
            }
        }
        if (b.size > a.size){
            for (i in b.indices){
                print("[${b[i]}]")
            }
        }
    }

    fun cardinalidad (a: Array<String>){
        for (i in a.indices){
            print("[${a[i]}]")
        }
    }
}