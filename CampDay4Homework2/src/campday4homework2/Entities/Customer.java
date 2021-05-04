package campday4homework2.Entities;

import campday4homework2.Abstarct.Entity;

public class Customer implements Entity {
    
    private int id;
    private String FirstName;
    private String lastName;
    private String birthYear;
    private String nationalityId;

    public Customer(int id, String FirstName, String lastName, String birthYear, String nationalityId) {
        this.id = id;
        this.FirstName = FirstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
	
    
}
