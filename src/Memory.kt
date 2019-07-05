
fun main() {
    print(selectionSort(intArrayOf(2,3,4,5)))

}

fun selectionSort(arr: IntArray): MutableList<Int> {
    val newList: MutableList<Int> = mutableListOf()

    for (i in 1..arr.count()) {
        val smallest = findSmallest(arr)
        newList.add(smallest)
    }

    return newList
}

fun findSmallest(array: IntArray): Int {
    var smallest = array[0]
    var smallestIndex = 0

    for(i in 0 until array.count()-1) {
        if (array[i] < smallest) {
            smallest = array[i]
            smallestIndex = i
        }
    }

    return smallestIndex
}