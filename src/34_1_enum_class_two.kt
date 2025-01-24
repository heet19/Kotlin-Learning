fun main(args: Array<String>) {

/** Enum Class */

    println(CreaditCardTypes.SILVER.color)
    println(CreaditCardTypes.GOLD.color)
    println(CreaditCardTypes.PLATINUM.color)

}

/** Enum Class */
enum class CreaditCardTypes(val color: String, val maxLimit: Int = 1000000): ICardCashBack {

    SILVER("gray", 50000) {
        override fun getCashbackValue(): Float = 0.02f
    },                                                          /** ordinal = 0      name="SILVER" */        // Enum Constants
    GOLD("gold", 100000) {
        override fun getCashbackValue(): Float = 0.04f
    },                                                          /** ordinal = 1      name="GOLD" */          // Enum Constants
    PLATINUM("black",700000) {
        override fun getCashbackValue(): Float = 0.06f
    }                                                           /** ordinal = 2      name="PLATINUM" */      // Enum Constants

}

interface ICardCashBack {
    fun getCashbackValue(): Float
}