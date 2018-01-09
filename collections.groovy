// Ranges
enum week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
println week.values()
def first = week.values().first()
def last = week.values().last()

Range r = first..last
println r.size()
println r
for (day in r) {
    println day
}
println r.contains(week.Monday)
println '-' * 40
week.values().each { w ->
    if ( w.name() ==~ 'Monday' ) {
        println w.name()
    }
}
println '-' * 40


// Lists
//Create a list days (Sun - Sat)
def lst = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
//Print out the list
println lst
//Print the size of the list
println lst.size()
//Remove Saturday from the list
println lst.remove('Saturday')
println lst
//Add Saturday back by appending it to the list
println lst.add('Saturday')
//println lst << 'Saturday'
println lst
//Print out the Wednesday using its index
println lst[2]

println '-' * 40
// Maps
//Create a map of days of the week
//1: Sunday, 2:Monday, etc...
def map = [1: 'Sunday', 2:'Monday', 3:'Tuesday', 4:'Wednesday', 5:'Thursday', 6:'Friday', 7:'Saturday']
//Print out the map
println map
//Print out the class name of the map
println map.getClass().getName()
//Print the size of the map
println map.size()
//Is there a method that would easily print out all of the days (values)?
//Without closures you may have to look at the Java API for LinkedHashMap
for ( value in map.values() ) {
    println value
}
println map.values()
