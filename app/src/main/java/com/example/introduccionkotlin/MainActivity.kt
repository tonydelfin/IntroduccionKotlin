package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout

class MainActivity : AppCompatActivity() {

    companion object{
        const val moneda= "peso"
    }
    var saldo : Float =  300.00f
    var sueldo : Float = 765.4f
    var entero : Int = 54

    override fun onCreate(savedInstanceState: Bundle?) {
        /*
            Dia 1:  Se vieron conocimientos fundamentales de la programacion, ya tenia conocimientos previos asi que no relice codigo
            - Operadores logicos
            - comparacion,
            - estructuras de control
            - etc

        */
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "05/04/23"
        var nombre = "jorge"
        var vip : Boolean = true
        var inicial : Char = 'J'

        var saludo =  "Hola " + nombre

        mostarsaldoTotal()
        //ingresarSueldo(50.0f)
        //retirarSaldo(1.0f)
        //retirarSaldo(30000f)




        // Practicas

        /*
            Uso de if - else (Sencillo)

            if(vip ==  true){
                saludo += " " + "Tu eres VIP"
            }else{
                saludo += " " + "¿Quieres ser VIP?"
            }

        */

        /*
            Uso de when
            caster = convertir de un tipo de dato a otro
            No se podia convertir a int directaente



        var mes =  fecha.subSequence(3,5).toString().toInt()

        when(mes) {
            1 -> println("Es enero")
            2, 3 -> println("Es febrero y marzo")
            else-> println("Otros meses")
        }




        println(mes)
        */

        /*
           Uso de do-While y Break
           notas: Se ejecuta primero y despues hace la comparacion de la condicion
           break: para le ejecucion del buclo o del bloque del codigo en el que este
           para pasar a la siguiente instruccion fuera del bloque




        var pin: Int = 1234
        var intentos: Int = 0
        var pinIngresado: Int = 1233

        do {
            println("Ingrese el Pin ")
            println("Pin Ingresado: ${++pinIngresado}")
            intentos++
            if (pinIngresado == pin){
                break;

            }


        }while (intentos <= 3 && pinIngresado!=pin)
        if (intentos > 3){
            println("Tarjeta Bloqueada")
        }else{
            println("Bienvenido")
        }
        */

        /*
                Arreglos, Matrices y bucle For
                a diferencia de Java un array en kotlin se declara diferente


        */
        var recibos: Array<String> = arrayOf("luz", "agua", "gas")
        recibos.set(2,"Set")
        recorrerArray(recibos)

        var matriz = arrayOf(
            //valores en posicion 0:
            intArrayOf(1,2,3),

            //valores en posicion 1:
            intArrayOf(4,5,6),

            //valores en posicion 2:
            intArrayOf(7,8,9)

        )

        for (i in( 0 until matriz.size)){
            println()
            for (j in (0 until matriz.size)){
                println("Valor en la posisicion: [$i][$j] : ${matriz[i][j]}")
            }
        }

        //Colecciones Inmutables (No se puede hacer CRUD)
        var clientesVip: Set<Int> =  setOf(123,1234,12345)
        val setMeszaldo = setOf("Hola", 123)


        //ver el tamaño de la coleccion
        println("Tamaño: ${clientesVip.size}")
        //ver si se encuentra un elemento
        println("Elemento Buscado: 123")
        if (clientesVip.contains(12)){
            println("Elemento encontrado")
        }else println("No se encontro")

        //Colecciones Mutables (Se puede hacer CRUD)
        var clientes: MutableSet<Int> = mutableSetOf(123,1234,12345,1,2)

        clientes.add(3)
        println(clientes)

        clientes.remove(3)
        println(clientes)

        clientes.clear()
        println(clientes)


        //Listas
        //cada coleccion tiene diferentes metodos que se pueden utilizar

        //inmutable
        var lista: List<String> = listOf("EUD", "PESOS", "YEN")
        println(lista)

        //mutable
        var bolsa: MutableList<String> = mutableListOf("Coca", "Pespi", "Andorid")
        println(bolsa)

        bolsa.add("Windows")
        println(bolsa)

        bolsa.removeAt(0)
        println(bolsa)

        println(bolsa.first())
        println(bolsa.last())
        println(bolsa.elementAt(1))
        //bolsa.clear()
        println(bolsa)
       // println(bolsa.none())

        //Mapas o Diccionarios
        //Se llaman asi porque cada valor tiene un significado

        //Inmutables

        var mapas: Map<Int, String> = mapOf(
            1 to "Mexico",
            2 to "EU",
            3 to "Canada"
        )
        println(mapas)

        //Mutable
        var inversiones:MutableMap<String, Float> = mutableMapOf()
        println(inversiones);


        //While y el uso de Null Safety(?)

        //!! = ESTOY DICIENDO QUE ALGUNA OPERACION NO ES NULA

        var empresa: String? = null //Digo que puede tener un valor de tipo estring o un valor nulo
        mostarsaldoTotal()
        var cantidadInvertir: Float = 10.0f
        var index: Int = 0

        while (saldo >= cantidadInvertir){
            empresa = bolsa.elementAtOrNull(index)
            if (empresa != null){
                saldo -= cantidadInvertir
                println("A invertido:${cantidadInvertir} $moneda en $empresa" )
                inversiones.put(empresa, cantidadInvertir)

            }else break
            index++
        }
        mostarsaldoTotal()


        //Ejercicios de Exemen
        var cuentaRegresiva: Int = 9

        do {
            println(cuentaRegresiva)
            cuentaRegresiva--
        }while (cuentaRegresiva >= 0)

        //Ejercicios de Exemen
        var numeros: Int =0

        while (numeros <= 10){
            if (numeros %2 == 0){
                println(numeros)

            }
            numeros++
        }

        //Ejercicios de Exemen
        var platillos: Array<String> = arrayOf("Frijoles", "Caldo de Pollo", "Fideos")

        for (i in platillos){
            println("Nombre del Platillo: ${i}")
        }



        //Ejercicios de Exemen
        var Platos1: Map<String, Int> = mapOf(
            "Frijoles" to 10,
            "Caldo de Pollo" to 30,
            "Fideos" to 50

        )
        for (i in Platos1){
            println("${i}")
        }

        //Ejercicios de Exemen

        var ingredienteFrijoles: List<String> =  listOf("Frijoles", "Queso", "Sal")
        var ingredienteCaldo: List<String> =  listOf("Pollo", "Calabaza", "Cebolla")
        var ingredienteFideos: List<String> =  listOf("Cebolla", "Masa", "Queso")

        var Platos: Map<String, Int> = mapOf(
            "Frijoles" to 10,
            "Caldo de Pollo" to 30,
            "Fideos" to 50

        )
        for ((plato, precio) in Platos) {

            val ingredientes = when (plato) {
                "Frijoles" -> ingredienteFrijoles
                "Caldo de Pollo" -> ingredienteCaldo
                "Fideos" -> ingredienteFideos
                else -> break
            }

            println("Plato: $plato, Precio: $$precio, Ingredientes: $ingredientes")
        }


    }

    /*
        Pramacion Modular
        Funciones
        Se declara fun para las funciones a diferecnia de java
        el tipo de la fucnion se especifica al final de los parametros que resive



     */








    fun mostarsaldoTotal(){
        println("Tienes un total de: ${saldo} ${moneda}")
    }
    fun ingresarSueldo(cantidad: Float){
        saldo += cantidad
        println("Su sueldo a aumentado: ${cantidad} ${moneda}")
        mostarsaldoTotal()
    }
    fun retirarSaldo(cantidad: Float){
        if (verificacion(cantidad)) {
            saldo -= cantidad
            println("Se ha retirado ${cantidad} ${moneda} de su cuenta")
            mostarsaldoTotal()
        }else println("Imposible saldo insuficiente")

    }

    fun verificacion(cantidadRetiro: Float):Boolean{
        println("Cantidad a reirar ${cantidadRetiro}")
        //if (cantidadRetiro > saldo ) return false
        //        else return true

        return cantidadRetiro <= saldo
    }

    //Formas de usa de una For
    //a diferencia de java i no se decalara i int= 0  =  i in 0
    fun recorrerArray(array: Array<String>){

        for (i in array)
            println("Array Sencillo: ${i}")

        for (i in array.indices)
            println("Array Indices: ${array.get(i)}")
        for (i in 0 .. array.size-1)
            println("Array Inicializando i: ${i+1}: ${array.get(i)}")
    }

}