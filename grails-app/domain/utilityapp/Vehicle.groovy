package utilityapp

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    Integer year

    String name
    String model
    String make

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}
