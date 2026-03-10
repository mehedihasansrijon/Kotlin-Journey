fun main() {
    var priceAdd = 100
    priceAdd += 10 // priceAdd = priceAdd + 10
    showLabel("After +=", priceAdd)

    var priceSub = 100
    priceSub -= 10 // priceSub = priceSub - 10
    showLabel("After -=", priceSub)

    var priceMul = 100
    priceMul *= 10 // priceMul = priceMul * 10
    showLabel("After *=", priceMul)

    var priceDiv = 100
    priceDiv /= 10 // priceDiv = priceDiv / 10
    showLabel("After /=", priceDiv)

    var priceMod = 100
    priceMod %= 10 // priceMod = priceMod % 10
    showLabel("After %=", priceMod)
}

fun showLabel (labelName: String, value: Int) {
    println("$labelName : $value")
}