

fun main() {
    print(fact(10))

}

fun fact(x: Int): Int {
    if(x == 1) return 1
    else return x * fact(x - 1)
}

fun countdown(i: Int) {
    print(i)
    print("\n")
    if (i <= 0) return
    else countdown(i - 1)
}

fun greet(name: String) {
    print("Hello, ${name} \n")
    greet2(name)
    print("getting ready to say bye...\n")
    bye()

}

fun greet2(name: String) {
    print("how are you, ${name} ?\n")
}

fun bye() {
    print("ok bye!\n")
}