public class User {
    private Long id;
    private String name;
    private String email;

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    private String employment;

    public User(Long id, String name, String email, String employment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.employment = employment;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "User{id:" + id + ", name:" + name + ", email:" + email + ", employment:" + employment + "}";
    }
}
