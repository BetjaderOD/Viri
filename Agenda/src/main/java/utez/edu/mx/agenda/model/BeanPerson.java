package utez.edu.mx.agenda.model;

public class BeanPerson {
    int id;
    String name;
    String lastName;
    String email;
    int phone;
    String address;
    String curp;
    int nss;


    public BeanPerson() {
    }

    public BeanPerson(int id, String name, String lastName, String email, int phone, String address, String curp, int nss) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.curp = curp;
        this.nss = nss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }
}
