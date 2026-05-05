fun main() {
    val signalcase_1 = Signal(74, 104, 20, 5, 4)
    check(Policy.score(signalcase_1) == 159)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(74, 105, 14, 21, 5)
    check(Policy.score(signalcase_2) == 107)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(77, 71, 21, 25, 13)
    check(Policy.score(signalcase_3) == 55)
    check(Policy.classify(signalcase_3) == "review")
}
