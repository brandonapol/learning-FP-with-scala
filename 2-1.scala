//* Java version

// class ShoppingCart {
//     public static int getDiscountPercentage(List<String> items) {
//         if (items.contains("Book")) {
//             return 5;
//         } else {
//             return 0;
//         }
//     }
// }

//* Scala

object ShoppingCart {
    def getDiscountPercentage(items: List[String]): Int = {
        if (items.contains("Book")) {
            5
        } else {
            0
        }
    }
}

object TipCalculator {
    def getTipPercentage(names: List[String]): Int = {
        if (names.size() > 5) {
            20
        } else if (names.size() > 0) {
            10
        } else {
            0
        }
    }
}

val smallGroup = List("Alice", "Bob", "Charlie")
val largeGroup = List("Alice", "Bob", "Charlie", "Daniel", "Emily", "Frank")
TipCalculator.getTipPercentage(List.empty)
TipCalculator.getTipPercentage(smallGroup)
TipCalculator.getTipPercentage(largeGroup)
TipCalculator.getTipPercentage(List.empty) == 1 // false - testing!