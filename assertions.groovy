assert 2 == 2.5.toInteger() //conversion
assert 2 == 2.5 as Integer //enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

def x = [1,2,3,4,5]
assert (x << 6) == [1,2,3,4,5,6]
print x
