import groovy.transform.ToString


@ToString
class LicenseOfficial {
    String id
    String name
    String key
    Integer usage_limit
    Date created_at
    Date updated_at

    LicenseOfficial(String license_id, String license_name,
                    String license_key, Integer license_usage_limit,
                    Date license_created_at, Date license_updated_at) {
        id = license_id
        name = license_name
        key = license_key
        usage_limit = license_usage_limit
        created_at = license_created_at
        updated_at = license_updated_at
    }

    void updateLicense(Date new_date) {
        updated_at = new_date
    }

    void updateLicenseName(String new_name) {
        name = new_name
    }

    void updateLicenseUsageLimit(Integer usageLimit) {
        usage_limit = usageLimit
    }
}