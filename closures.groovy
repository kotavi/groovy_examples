/**
 * Create a Method that accepts a closure as an argument
 * Create a closure that performs some action
 * Call the method and pass the closure to it.*/

def closure1 = { String type, Date createdOn, String message ->
    println "$createdOn [$type] - $message"
}

closure1("INFO", new Date(), "This is an info message")

def method1(Closure someClosure) {
    someClosure
}

method1(closure1("Error", new Date(), "This is an error message"))

/**
 * Create a list and use the each to iterate
 * over each item in the list and print it out
 * Hint - You can use the implicit it or use your own variable*/

List lst1 = [1, "23", 34, "info", 31, ['w'], 0]
lst1.each { num ->
    print num + " "
}
println()
lst1.each {
    print it + " "
}
println()
/**
 * Create a map of data and iterate over it using the each method.
 * This method can take a closure that accepts 1 or 2 arguments.
 * Use 2 arguments and print out the key and value on each line.*/

Map map1 = [dog: 23, cat: 45, fridge: 120, home: 230]
map1.each { key, value ->
    println "$key / $value"
}

/**
 * Demonstrate the use of curry and try to come up
 * with an example different from the one we used
 * in the lecture. */

// simple currying
List lst2 = [1, "23", 34, "info", 31, ['w'], 0]
def closure2 = {List lst, value ->
    def res = lst.count(value)
    println "Number of found $value-s: $res"
//    for (item in lst) {
//        if (item == value) {
//            println "$value exists"
//        }
//    }
//    lst.each { item ->
//        def res = ( item == value ) ? item : "No such $value was found"
//        println res
//
//    }
}
closure2(lst2,"23")

List lst3 = [1, 12, [34, 123], 1, ['w'], 0, 1]
def newClosure1 = closure2.curry(lst3)
newClosure1(1)

// right currying
List lst4 = [1, 12, 34, 123, 31, 44, 0, 66]
List lst5 = [1, 12, 34, 44, 31, 45, 0, 44, 44, 44]
def newClosure2 = closure2.rcurry(44)
newClosure2(lst4)
newClosure2(lst5)

// index based currying
List lst6 = [0, 12, 34, 44, 31, 45, 0, 44, 0, 0]
def newClosure6 = closure2.ncurry(1, 0)
newClosure6(lst6)

/**
 * Search for the find and findAll methods.
 * What is the difference between the two?
 * Write some code to show how they both work.*/
List lst7 = [123, 'e', 'r', 45]
def res1 = lst7.find { num ->
    num > 20
}
println res1

List lst8 = [123, 0, 1, 45]
def res2 = lst8.findAll { num ->
    num > 20
}
println res2

/**
 * Search for the any and every methods.
 * What is the difference between the two?
 * Write some code to show how they both work.*/
println lst7.any {it.equals(123)}
println lst8.every {it > 0}
println lst8.every {it >= 0}

/**
 * Search for the method groupBy that accepts a closure
 * What does this method do?
 * Write an example of how to use this method.*/
println lst8.groupBy {it > 1}