package grailsmigrationstest

class Part {
    String name
    String title
    String description


    static constraints = {
        name blank: false, unique: true
        title blank: false
        description nullable: true, empty: true

    }
}