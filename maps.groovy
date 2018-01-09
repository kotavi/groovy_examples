
def map = [:]
//println map.class.name - fails
//LinkedHashMap map = [:]
println map
println map.getClass().getName()

def person = [first:"Tanya", last: "Korchak", email:"kotavi@i.ua"]
println person
println person.first
println person.last
println person.email

person.tweeter = "tweeter"
println person

def tweeter1 = [username: "@kotavi", 'email address': "kotavi@i.ua"]
def emailkey = 'Email Address'
def tweeter2 = [username: "@kotavi", (emailkey): "kotavi@i.ua"]
println tweeter1
println tweeter1.sort()
println tweeter2
println tweeter2.size()
println '-----------------------------------'

// looping through person
for ( entry in person ) {
    println entry
}
println '-----------------------------------'
for ( key in person.keySet() ) {
//    println "$key: $person[$key]" // not correct
    println "$key: ${person[key]}"
}
println '-----------------------------------'

// each | eachWithIndex

