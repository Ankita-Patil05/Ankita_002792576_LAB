/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ankitapatil
 */
public class Person {
    String NUID;
    String FirstName;
    String LastName;
    String CollegeName;
    Contact Personal;
    Contact work;
    Address CollegeCurrent;
    Address Permanent;
    

    public Person() {
        this.NUID = "";
        this.FirstName = "";
        this.LastName = "";
        this.CollegeName = "";
        this.Personal = new Contact();
        this.work = new Contact();
        this.CollegeCurrent = new Address();
        this.Permanent = new Address();
    }

    public Contact getPersonal() {
        return Personal;
    }

    public void setPersonal(Contact Personal) {
        this.Personal = Personal;
    }

    public Contact getWork() {
        return work;
    }

    public void setWork(Contact work) {
        this.work = work;
    }

    public Address getCollegeCurrent() {
        return CollegeCurrent;
    }

    public void setCollegeCurrent(Address CollegeCurrent) {
        this.CollegeCurrent = CollegeCurrent;
    }

    public Address getPermanent() {
        return Permanent;
    }

    public void setPermanent(Address Permanent) {
        this.Permanent = Permanent;
    }
    

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

  
    public String getNUID() {
        return NUID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

}
