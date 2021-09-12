fun main() {
    val buyAmount = 10_500
    var oftenBuys = true

    val discount = if (buyAmount in 0..1_000) 0
    else if (buyAmount in 1_001..1_0000) 100
    else buyAmount / 100 * 5

    val oftenDiscount = if (oftenBuys == true && buyAmount <= 1_000) buyAmount / 100
    else if (oftenBuys == true) (discount / 100) + discount
    else 0

    var totalDiscount = discount + oftenDiscount
    var sum = buyAmount - totalDiscount

    println("""Скидка $oftenDiscount руб.
        |Сумма $sum руб.
    """.trimMargin())
}