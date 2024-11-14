fun main() {
    print("Introduce un número")
    var x = readln().toInt()

    if (x == 0) {
        println("El número introducido es 0")
    } else {
        if (x < 0) {
            println("El número introducido es negativo")
        } else {
            println("El número introducido es positivo")
        }
    }
}
