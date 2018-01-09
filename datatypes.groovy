byte b = 10
println "byte b = 10:           " + b.class

short s = 1000
println "short s = 1000:        " + s.class

float f = 1.25
println "float f = 1.25:        " + f.class

f = (float) 1.25
println "f = (float) 1.25:      " + f.class

def ff = 1.25
println "def ff = 1.25:         "  + ff.class

ff = (float) 1.25
println "ff = (float) 1.25:     " + ff.class

println "323232323111231322423224223: " + 323232323111231322423224223.class
println "3:             " + 3.class

println "4.50:          " + 4.50.class

def d = '234'
println "def d = '234': " + d.getClass().getName()
d = 234
println "d = 234:       " + d.getClass().getName()

Integer ii = 34

def number = "1"
number = 10
number = 10 + "1"

println "number = 10 + \"1\": " + number.class

float f1 = 10.4
double d1 = 23.34

def res1 = f1 / d1
println "res1 = f1 / d1: " + res1.class

float f2 = 10.4
float d2 = 23.34

def res2 = f1 / d1
println "res2 = f2 / d2: " + res2.class

println "1.intdiv(2): " + 1.intdiv(2)

40.times {
    print '-'
}
println()

1.upto(10) { num ->
    print num + ", "
}
println()

10.downto(1){ num ->
    print num + ", "
}
println()

0.step(1,0.1) { num ->
    print num + ", "
}
assert 2 == 2.5.toInteger() //conversion
assert 2 == 2.5 as Integer //enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()
println()
40.times { print '-' }
println()

println 3.plus(45)
println 3 + 45
40.times { print '-' }
println()