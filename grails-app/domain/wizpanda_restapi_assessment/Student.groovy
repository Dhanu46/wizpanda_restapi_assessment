package wizpanda_restapi_assessment

class Student {
    Long id;
    String firstName;
    String lastName;
    String email;
    int age;
    String city;

    static constraints = {
        firstName blank: false, nullable: false,size: 3..15
        lastName blank: false, nullable: false,size: 3..15
        email email: true
        age null:false
        city nullable: true
    }
}
