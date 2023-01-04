// practicing slicing

def firstTwo(inputList: List[String]): List[String] = inputList.slice(0, 2)
def lastTwo(inputList: List[String]): List[String] = inputList.slice(inputList.size - 2, inputList.size)

def twoToEnd(inputList: List[String]): List[String] = {
    val firstTwoChars = firstTwo(inputList)
    val remainder = inputList.slice(2, inputList.size)
    remainder ::: firstTwoChars
}


def insertNewElementBeforeLast(inputList: List[String], element: String): List[String] = {
    var beforeLast = inputList.slice(0, inputList.size - 1)
    var last = inputList.slice(inputList.size - 1, inputList.size)
    beforeLast ::: List(element) ::: last
}