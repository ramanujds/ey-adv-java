public class Employee {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<=0){
            throw new RuntimeException("Id cannot be negative");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printEmployee(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
    }

}
