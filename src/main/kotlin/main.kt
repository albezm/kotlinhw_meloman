var withSale: UInt = 0u
var melomanResult: Boolean? = null

fun main(){
    print("Сумма потраченых средств ранее: ")
    val total = readLine()?.toUInt()
    println()
    print("Постоянный покупатель или нет? (Введите y - да или n - нет) : ")

    melomanResult = when (readLine()?.toString()) {
        "y" -> {
            true
        }
        "n" -> {
            false
        }
        else -> {
            null
        }
    }

        print("Итак. Пользователь потратил $total и он")
    when (melomanResult) {
        false -> print(" не меломан.")
        true -> print(" меломан. (+ скидка 1%)")
        null -> print(" пёс хулиганский.")
    }

    println()
    println ("Введи сумму новой покупки: ")
    val newCard = readLine()?.toUInt()

    println("Сумма покупки: $newCard")
    if (total != null) {
        if (total > 10000u){
            println("Ваша скидка: 5% от суммы заказа.")
            withSale = newCard!! - (newCard / 100u * 5u)
        } else if (total > 1000u && total <= 10000u) {
            println("Ваша скидка: 100р от суммы заказа.")
            withSale = newCard!! - 100u
        } else if (total > 0u && total <= 1000u){
            println("Ваша скидка: скидки нет.")
            withSale = newCard!!.toUInt()
        }
    }
    if (melomanResult != null) {
        if (melomanResult == true){
            println("Ваша скидка постоянного покупателя: 1%")
            val melomanSale = withSale - (withSale / 100u * 1u)
            println("Итого к оплате: $melomanSale")
        } else {
            println("Ваша скидка постоянного покупателя: отсутствует.")
            val melomanSale = withSale
            println("Итого к оплате: $melomanSale")
        }
    }

}