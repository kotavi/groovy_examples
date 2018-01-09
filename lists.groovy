def lst1 = []
println lst1.class.name
ArrayList lst2 = []
println lst2.class.name
List lst3 = []
println lst3.class.name

lst1.push(45)
lst1.push(4)
lst1.push(5)
lst1 << 234
println lst1

lst2.add(34)
lst2.add(3)
lst2.add(4)
lst2.putAt(0, 22)
lst2[0] = 222
println lst2

lst3.add(11)
lst3.add(10)
lst3.add(12)
lst3.add(0, 22)
println lst3

40.times { print '-' }
println()

def lst4 = [1,2,3,4,5,6,7] as LinkedList
println lst4.class.name

40.times { print '-' }
println()

List lst5 = [1,2,3,4,5,6,7]
println lst5
lst5.pop()
println lst5
lst5.remove(1)
println lst5
new_lst5 = lst5 - 5
println new_lst5
println new_lst5[-1]
println new_lst5.getAt(-1)
println new_lst5.getAt(-3.. -1)

40.times { print '-' }
println()

// flatten
def lst6 = [1, 2, 3, [1, 3, 6, [3, -1], [-5, 1]]]
println lst6.flatten()
println lst6.flatten().unique()

40.times { print '-' }
println()
def lst7 = [1,2,1,4,5,2,7,5] as Set
println lst7
println lst7.class.name

40.times { print '-' }
println()
def lst8 = [5,7,1,4,5,2,7,5] as SortedSet
println lst8
println lst8.class.name

