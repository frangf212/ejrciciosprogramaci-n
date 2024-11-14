fun main() {
    println("Adjunta la medida del radio del círculo en cm")
    var radio: Int = readln().toInt()
    print("El área del círculo es ")
    print(Math.PI * radio * radio)
    println("La circunferencia del círculo es ")
    print(2 * Math.PI * radio)
}
