package tech.iwe.iwebackoffice.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity // To map this class in a database that we will configure in the class path
public class User implements Serializable {
    // implements Serializable helps us transform this class in different type of string

    @Id //setting the primary key
    @GeneratedValue (strategy = GenerationType.AUTO) //tell him how to generate this information
    @Column(nullable = false, updatable = false) //to specify some column information
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String imageUrl;
    private String location;

    @Column(nullable = false)
    private String role;

    // Generate constructor


    public User() {}

    public User(String firstName, String lastName, String email, String imageUrl, String location, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.location = location;
        this.role = role;
    }

    // Generate getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    // Generate toString() in case I want to print that out
    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", location='" + location + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}




