fun main() {

    // Вводим сумму перевода
    print("Введите цифрами сумму в рублях: ")
    val amount=readln().toInt()

    // Вычисляем размер комиссии
    val commission=if (amount < 300 || amount > 75_000)
        ((amount + 35) * 0.75) / 100
    else
        if (amount > 75_000) (amount * 0.6) / 100 + 20
        else 0

    print("Размер комиссии: ")
    print(commission)
    println()
}