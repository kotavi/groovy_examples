//def lst1 = []
//println lst1.class.name
//ArrayList lst2 = []
//println lst2.class.name
//List lst3 = []
//println lst3.class.name
//
//lst1.push(45)
//lst1.push(4)
//lst1.push(5)
//lst1 << 234
//println lst1
//
//lst2.add(34)
//lst2.add(3)
//lst2.add(4)
//lst2.putAt(0, 22)
//lst2[0] = 222
//println lst2
//
//lst3.add(11)
//lst3.add(10)
//lst3.add(12)
//lst3.add(0, 22)
//println lst3
//
//40.times { print '-' }
//println()
//
//def lst4 = [1,2,3,4,5,6,7] as LinkedList
//println lst4.class.name
//
//40.times { print '-' }
//println()
//
//List lst5 = [1,2,3,4,5,6,7]
//println lst5
//lst5.pop()
//println lst5
//lst5.remove(1)
//println lst5
//new_lst5 = lst5 - 5
//println new_lst5
//println new_lst5[-1]
//println new_lst5.getAt(-1)
//println new_lst5.getAt(-3.. -1)
//
//40.times { print '-' }
//println()
//
//// flatten
//def lst6 = [1, 2, 3, [1, 3, 6, [3, -1], [-5, 1]]]
//println lst6.flatten()
//println lst6.flatten().unique()
//
//40.times { print '-' }
//println()
//def lst7 = [1,2,1,4,5,2,7,5] as Set
//println lst7
//println lst7.class.name
//
//40.times { print '-' }
//println()
//def lst8 = [5,7,1,4,5,2,7,5] as SortedSet
//println lst8
//println lst8.class.name

40.times { print '-' }
println "Not Groovy way"
List<Map> responsePayload = [[id:"0cf9e9be-1f3b-4aba-96df-fae575b53501", name:"license name eeb6fe0f9625", description:"license description", key:"key-eeb6fe0f9625", vendor_id:"a31ae14a-412d-41ad-85a3-6d366e6bd8c2", status:"active", usage_type:"limited", usage_limit:1024, max_bandwidth:123, applicable_to:[], license_term_id:"1362cadb-89c4-44a2-8bf0-d76dd9a65929"],
                             [id:"628042dc-2054-4c30-a53f-1a96e48e5434", name:"license name f0a2e2c95fc9", description:"license description", key:"key-f0a2e2c95fc9", vendor_id:"a31ae14a-412d-41ad-85a3-6d366e6bd8c2", status:"active", usage_type:"limited", usage_limit:1024, max_bandwidth:123, applicable_to:[], license_term_id:"f0b99a39-4ba4-4a61-bd78-70d8e93c8e4c"],
                             [id:"ff5f6b19-2d34-4784-8509-f3d40ad9b95c", name:"license name 3b5b681e9781", description:"license description", key:"key-3b5b681e9781", vendor_id:"a31ae14a-412d-41ad-85a3-6d366e6bd8c2", status:"active", usage_type:"limited", usage_limit:1024, max_bandwidth:123, applicable_to:[], license_term_id:"7705ffeb-a767-477a-aa22-e72716490e68"]]
String licenseId = "0cf9e9be-1f3b-4aba-96df-fae575b53501"
List license_ids = []
responsePayload.each {
    license_ids << it.id
}
println licenseId in license_ids

println "Groovy way"
println licenseId in responsePayload*.id
println licenseId in responsePayload.collect { it.id }

