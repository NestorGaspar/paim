fun main(){

    val inicio = 0 //val = valor no cambia
    val fin = 10
    var sumaPares = 0 //var = valor cambia
    var sumaImpares = 0

    println("bucle for")

    for (i in inicio..fin){
        if(i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
    }

    println("numeros pares: $sumaPares")
    println("numeros impares: $sumaImpares")

    println("for each")

    sumaPares = 0
    sumaImpares = 0

    (inicio..fin).forEach{
        if (it%2==0){
            sumaPares += it
        } else {
            sumaImpares += it
        }
    }

    println("numeros pares: $sumaPares")
    println("numeros impares: $sumaImpares")

    println("bucle while")

    sumaPares = 0
    sumaImpares = 0

    var i = inicio
    while (i<=fin){
        if (i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
        i++
    }

    println("numeros pares: $sumaPares")
    println("numeros impares: $sumaImpares")

    println("bucle do while")
    sumaPares = 0
    sumaImpares = 0
    i = inicio

    do{
        if (i%2==0){
            sumaPares += i
        } else {
            sumaImpares += i
        }
        i++
    }while (i<=fin)

    println("numeros pares: $sumaPares")
    println("numeros impares: $sumaImpares")
}
