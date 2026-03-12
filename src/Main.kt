fun main() {

    var i = 1
    while (i <= 10) {
        if (i == 4) {
            i++
            continue
        }
        println("I am $i")
        i++
    }

    var x = 1
    while (x <= 10) {
        if (x == 4) {
            break
        }
        println("I am $x")
        x++
    }
}