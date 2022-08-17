package data;

public class person {
    private String name;
    private String age;
    private String color;
    private double height;
    private int idCardNumber;
    private Address address;

    public void display() {
        System.out.println("Person Details.");
        System.out.println("Name = " + name);
        System.out.println("AGE = " + age);
        System.out.println("COLOR = " + color);
        System.out.println("Height = " + height);
        System.out.println("idCardNumber = " + idCardNumber);
        address.display();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

