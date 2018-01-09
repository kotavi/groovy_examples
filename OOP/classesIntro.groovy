// default constructor
import groovy.transform.ToString

@ToString
class Flavor1 {
    String name
    Integer memoryMB
    Integer vcpu
    Boolean isPublic
}
Flavor1 flavor1 = new Flavor1(name: "m1", memoryMB: 512, vcpu: 4, isPublic: true)
println flavor1
println '-' * 40

// with constructor
@ToString
class Flavor2 {
    String name
    Integer memoryMB
    Integer vcpu
    Boolean isPublic

    Flavor2 (String data){
        List flavorInfo = data.split(',')
        println flavorInfo
        name = flavorInfo[0]
        memoryMB = flavorInfo[1] as Integer
        vcpu = flavorInfo[2] as Integer
        isPublic = flavorInfo[3] as Boolean


    }
}
Flavor2 flavor2 = new Flavor2("m1, 512, 4, true")
println flavor2
println flavor2.memoryMB.class

println '-' * 40
// Methods
@ToString
class Flavor3 {
    String name
    Integer memoryMB
    Integer vcpu
    Boolean isPublic

    String updateName(String arg1) {
        name = arg1
    }

    def changeAccsess() {
//        isPublic = !isPublic
        isPublic = isPublic ? false : true
    }
    // allows to supply as many arguments as we need
    static printIntFlavorInfo(Integer... args) {
        println args
    }

    public static final printFlavorInfo(... args) {
        println args
    }

    static String defaultMessage() {
        println "default message from static method"
    }
}

Flavor3 flavor3 = new Flavor3(name: "m1", memoryMB: 512, vcpu: 4, isPublic: true)
println flavor3
println flavor3.changeAccsess()
println flavor3.updateName("New name")
println Flavor3.defaultMessage()
println flavor3.printFlavorInfo(flavor3.name, flavor3.memoryMB)
println flavor3.printFlavorInfo(flavor3.memoryMB, flavor3.vcpu)
