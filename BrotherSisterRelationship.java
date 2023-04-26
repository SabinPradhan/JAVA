public class BrotherSisterRelationship {
    public static void main(String[] args) {
        Person brother = new Person("John", "male");
        Person sister = new Person("Jenny", "female");

        System.out.println("Brother's name: " + brother.getName());
        System.out.println("Sister's name: " + sister.getName());

        if (brother.getGender().equals("male") && sister.getGender().equals("female")) {
            System.out.println("Brother and sister have a sibling relationship.");
        } else {
            System.out.println("Brother and sister do not have a sibling relationship.");
        }
    }
}

class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
