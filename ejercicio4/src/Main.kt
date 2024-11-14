fun main() {
    /*
    println("Ejercicio 4, calcula la media de 3 números")
    println("Escribe el primer número")
    var num1= readln().toInt()
    println("Escribe el segundo número")
    var num2= readln().toInt()
    println("Escribe el tercero ")
    var num3= readln().toInt()
    //metodo 1
    var suma =num1 + num2 +num3
    var media = suma / 3
    print("La media de los 3 números es $media aproximadamente ")
    //metodo 2
    println("solución ${(num1+num2+num3)/3}")*/

    //metodo con bucle

    //en primer lugar una variable iniciar con un valor
    println("Con cuantos números quieres hacer la media")
    var numeros= readln().toInt()
    var suma= 0
    var contador=0
    while(contador<numeros){//necesitamos evaluar la variable en la condición
        //la variable cambie en el tiempo
        println("Escribe número")
        var num1= readln().toInt()
        suma= suma+num1
        contador++
    }
    println("La media es  ${(suma)/numeros}")
}
