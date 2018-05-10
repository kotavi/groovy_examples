
println "Enter number of symbols in password: "
def n = System.in.newReader().readLine() as int

println "Enter password: "
def password = System.in.newReader().readLine()

static passSize(data, count) {
    def number = (data.size() - count).abs()
    if (data.size() < count) {
        return number
    }
    return true
}

static boolean passDigit(data) {
    def countNumber = data.findAll("\\d").size()
    if (countNumber <= 0) {
        return false
    }
    return true
}

static boolean passLowercase(data) {
    def countLowercase = data.findAll("[a-z]").size()
    if (countLowercase <= 0) {
        return false
    }
    return true
}

static boolean passUppercase(data) {
    def countLowercase = data.findAll("[A-Z]").size()
    if (countLowercase <= 0) {
        return false
    }
    return true
}

static boolean passSpecial(data) {
    def countSpecial = data.findAll("[!@#\$%^&*()-+]").size()
    if (countSpecial <= 0) {
        return false
    }
    return true
}

//Its length is at least 6.
//It contains at least one digit.
//It contains at least one lowercase English character.
//It contains at least one uppercase English character.
//It contains at least one special character. The special characters are: !@#$%^&*()-+

def result = { data, count ->
    def input1 = passSize(data, count)
    def input2 = passDigit(data)
    def input3 = passLowercase(data)
    def input4 = passUppercase(data)
    def input5 = passSpecial(data)
    def i = 0
    println "$input1, $input2, $input3, $input4, $input5"

    if (input1 != true) {
        println input1
    } else {
        if (input2 & input3 & input4 & input5) {
            println "All true"
            return i
        }
        if (!input2 & input3 & input4 & input5) i = i + 1
        if (input2 & !input3 & input4 & input5) i++
        if (input2 & input3 & !input4 & input5) i++
        if (input2 & input3 & input4 & !input5) i++
        return i
    }
}
println result(password, n)
