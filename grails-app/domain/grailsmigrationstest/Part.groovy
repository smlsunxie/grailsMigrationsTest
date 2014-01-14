package grailsmigrationstest

class Part {
    String name
    String title
    String description


    static constraints = {
        name blank: false, unique: 'title' // 新增 PK
        title nullable: true //原本 title blank: false
        //description nullable: true, empty: true
    }
}