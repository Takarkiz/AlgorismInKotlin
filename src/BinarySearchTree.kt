
fun binarySearch(list: IntArray, item: Int): Int?{

    var low = 0
    var high = list.count() - 1

    while (low <= high) {
        val mid = low + high
        val guess = list[mid]

        if (guess == item) {
            return mid
        } else if (guess > item) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return null
}


fun main(args: Array<String>) {

    val sampleList = intArrayOf(1,2,6,7,34,45,234,656,2134,6533,23333,564444)

    val num = binarySearch(sampleList, 5)

    print(num.toString() + "番目だがね")

    var tes = 2
    var index = 0
    while (tes <= 128) {
        tes *= 2
        index++
    }

    print(index)
}