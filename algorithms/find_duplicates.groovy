//List inputList = [169, 216, 83, 165, 40, 86, 117, 40, 6, 202, 23, 202, 129, 169, 48, 179, 213, 76, 147, 189, 3, 10, 3, 43, 11, 148, 114, 129, 216, 10, 130, 201, 23, 190]

//(0..inputList.size() - 1).each {
//    println "$it, ${inputList[it]}"
//}
def findDuplicates1 = { List inputList ->
    for (i in 0..inputList.size() - 1) {
        for (j in i+1..inputList.size()) {
            if (inputList[i] == inputList[j]) {
                println "duplicate: ${inputList[i]}, index $i"
                break
            }
        }
    }
}

def findDuplicates2 = { List inputList ->
    for (i in 0..inputList.size() - 1) {
        def curr = inputList.remove(0) //returns removed element
        for (j in inputList) {
            if (curr == j) {
                println "duplicate: $j, index $i"
                break
            }
        }
    }
}

def findDuplicatesSet = { List inputList ->
    def resSet = [] as Set
    for (value in inputList) {
        resSet << value
    }
    if (resSet.size() != inputList.size())
        println "We have duplicates"
}

def findDuplicatesMap = { List inputList ->
    def resMap = [:] as Map
    for (value in inputList) {
        if (resMap.containsKey(value)) {
            resMap.put(value, resMap[value] + 1)
        } else {
            resMap.put(value, 1)
        }
    }
    println resMap
}



lst1 = [169, 216, 83, 165, 40, 86, 117, 40, 6, 202, 23, 202, 129, 169, 48, 179, 213, 76, 147, 189, 3, 10, 3, 43, 11, 148, 114, 129, 216, 10, 130, 201, 23, 190]
findDuplicates1(lst1)
println "-" * 40
lst1 = [169, 216, 83, 165, 40, 86, 117, 40, 6, 202, 23, 202, 129, 169, 48, 179, 213, 76, 147, 189, 3, 10, 3, 43, 11, 148, 114, 129, 216, 10, 130, 201, 23, 190]
findDuplicates2(lst1)
println "-" * 40
lst1 = [169, 216, 83, 165, 40, 86, 117, 40, 6, 202, 23, 202, 129, 169, 48, 179, 213, 76, 147, 189, 3, 10, 3, 43, 11, 148, 114, 129, 216, 10, 130, 201, 23, 190]
findDuplicatesSet(lst1)
println "-" * 40
lst1 = [169, 216, 83, 165, 40, 86, 117, 40, 6, 202, 23, 202, 129, 169, 48, 179, 213, 76, 147, 189, 3, 10, 3, 43, 11, 148, 114, 129, 216, 10, 130, 201, 23, 190]
findDuplicatesMap(lst1)