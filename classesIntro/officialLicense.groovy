String license_created_at = '04-DEC-2015 12:23:03'
Date date1 = Date.parse( 'dd-MMM-yyyy HH:mm:ss', license_created_at )
String license_updated_at = '05-DEC-2018 11:23:03'
Date date2 = Date.parse( 'dd-MMM-yyyy', license_updated_at )

def update_date = new Date().format( 'yyyy-MM-dd HH:mm:ss' )
Date date3 = Date.parse( 'yyyy-MM-dd HH:mm:ss', update_date )

myLicense = new LicenseOfficial("1", "project license", "09-1256L", 25, date1, date2)

println myLicense
myLicense.updateLicenseName("Project License")
myLicense.updateLicenseUsageLimit(90)
myLicense.updateLicense(date3)
println myLicense
