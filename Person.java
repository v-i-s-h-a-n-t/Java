public class Person {
    private String name;
    private String address;
    private int contact;
    private int age;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getContact() {
        return contact;
    }

    public int getAge() {
        return age;
    }

    void printInfo() {
        System.out.println("--Person Details--");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
        System.out.println("Age: " + age);
    }
}
