// Spock applies implicit assertion only to the top-level expressions.
// So the implicit assert will be applied only to the result of 'each' closure, which is void.
// Any actions that happen inside the each closure are out of Spock's scope.
// So there are 2 options here:

// Use explicit assert
responsePayload.data.each {
    assert it.id != licenseId1
    assert it.id != licenseId2
}

//Use any or every methods that return boolean,
// so that spock implicit assert will be applied to the result of that method
responsePayload.data.every {
    it.id != licenseId1 && it.id != licenseId2
}

//----------------------------------------------------------
//More compact via Groovy spread-dot operator or collect method
licenseId in responsePayload.data*.id
//or
licenseId in responsePayload.data.collect { it.id }

//--------------------------
//instead of
!hostId ?: host.forceRemoveHost(hostId)
//there is a bit 'clearer' way to do the same null-check:
hostId && host.forceRemoveHost(hostId)

//------------------------
//when importing package names should be all lowercase
//Class names should start with uppercase
//var names always start from lowercase
//method names always from lowercase
//In java, method/class/field documentation is located above the method and starts with /**.
/**
 * Method description
 *
 * @param param1 descr of input param 1
 * @param param2 descr of input param 2
 * @return descr of what is returned
 */
String method(param1, param2) {
    pass
}
//Describing all the params is not mandatory

//---------------------------------
// ==~  -  returns the boolean value whether the regexp fully matches the string
// =~   -  returns the matcher object