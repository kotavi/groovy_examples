import groovy.transform.Sortable
import groovy.transform.ToString

@Sortable(includes = ['name', 'key'])
@ToString
class LicenseShortened {
    String id
    String name
    String description
    String key

    LicenseShortened(String license_id, String license_name,
                     String license_description, String license_key) {
        id = license_id
        name = license_name
        description = license_description
        key = license_key
    }

    void printLicenseInfo() {
        println "{$id, $name, $description, $key}"
    }
}

final LicenseShortened Lis1 = new LicenseShortened("1", "egfuwyeg",
        "description", "key-123")
final LicenseShortened Lis2 = new LicenseShortened("2", "ergsgrrh",
        "description","35345")
final LicenseShortened Lis3 = new LicenseShortened("3","fvdtgdth",
        "description","11324")
final LicenseShortened Lis4 = new LicenseShortened("4","qwewqre",
        "description","565774")
final LicenseShortened Lis5 = new LicenseShortened("5","asfef",
        "description","4333")

final List<LicenseShortened> licenses = [Lis1, Lis2, Lis3, Lis4, Lis5]

/* As I use @Sortable here so lists will be sorted by name and key*/
final List<LicenseShortened> licenses1 = licenses.toSorted()
licenses1.each {
    println it.printLicenseInfo()
}

assert licenses.last().name == 'asfef'
assert licenses1.last().name == 'qwewqre'

println "-" * 40
def Lis6 = new LicenseShortened("6","srgrdhtrt",
        "description","454t4")
def Lis7 = new LicenseShortened("6-a","aefrq3r3f",
        "description","345345")
def Lis8 = new LicenseShortened("8-1","rsgsrger",
        "description","345-12")
def Lis9 = new LicenseShortened("1-9a","erf4r323",
        "description","092-2")

def licenses2 = [Lis6, Lis7, Lis8, Lis9]

def licenses3 = licenses2.toSorted()
licenses3.each {
    println it.printLicenseInfo()
}

assert licenses2.last().name == 'erf4r323'
assert licenses3.last().name == 'srgrdhtrt'

def Lis10 = new LicenseShortened("1-9a","erf4r323",
        "","092-2")

def description = Lis10?.description
assert description == ''