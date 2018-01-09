
import groovy.transform.Immutable
import groovy.transform.ToString


@Immutable
@ToString
class LicenseOfficial {
    String id
    String name
    String key
    Integer usage_limit
}

myLicense = new LicenseOfficial("1", "project license", "09-1256L", 25)

println myLicense
assert "1" == myLicense.id
assert "09-1256L" == myLicense.key


/**
 * Error example:
 * Caught: groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: name for class: LicenseOfficial
 groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: name for class: LicenseOfficial
 at LicenseOfficial.setProperty(immutable.groovy)
 at immutable.run(immutable.groovy:21)*/

//myLicense.name = "new name"

/**
 * Error example:
 * Caught: groovy.lang.GroovyRuntimeException: Cannot set the property 'name' because the backing field is final.
 groovy.lang.GroovyRuntimeException: Cannot set the property 'name' because the backing field is final.
 at immutable.run(immutable.groovy:31)*/

//myLicense.@name = "new name"
