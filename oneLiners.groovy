
//1. Multiple Each Item in a List by 2
def result = (1..10)*.multiply(2)
println result // --> [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

//without spread operator
result = (1..10).multiply(2)
println result // --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

//2. Sum a List of Numbers
result = (1..1000).sum()
println result // --> 500500

//another example
result = (1..10)*.sum(4,5)
println result // --> [9, 9, 9, 9, 9, 9, 9, 9, 9, 9]

//3. Verify if Exists in a String
def wordList = ['groovy', 'akka', 'grails framework', 'spock', 'typesafe']
def tweet = 'This is an example tweet talking about groovy and spock.'
println wordList.any { word -> tweet.contains(word) } // is there any word from wordList is in tweet? --> true
println wordList.every { tweet.contains(it) } // is there every word from wordList is in tweet? --> false

wordList = ["Groovy", "dynamic", "Grails", "Gradle", "scripting"]
def string = "This is an example blog talking about Groovy and Gradle."
println wordList.inject(false){ acc, value -> acc || string.contains(value)}

//4. Read in a File
def fileText = new File('.gitignore').text
println fileText // prints out the text as it is in the file
def fileLines = new File('.gitignore').readLines()
println fileLines.class
println fileLines // result is an ArrayList where each line is an element of it


//5. Happy Birthday to You!
(1..4).each { println 'Happy Birthday ' + ((it == 3) ? 'dear Arturo' : 'to You') }

//6. Filter list of numbers
def (passed, failed) = [49, 58, 76, 82, 88, 90].split{ it > 60 }

//7. Fetch and Parse an XML web service
//def results = new XmlSlurper().parse('http://search.twitter.com/search.atom?&q=groovy')
//println results

//8. Find minimum (or maximum) in a List
[14, 35, -7, 46, 98].min()
[14, 35, -7, 46, 98].max()

//random
Random rand = new Random()
def dataList = []
(1..10).each {
    dataList << rand.nextInt(102)
}


// available TimeZones for a particular JVM implementation
TimeZone.getAvailableIDs().sort().each{println it}