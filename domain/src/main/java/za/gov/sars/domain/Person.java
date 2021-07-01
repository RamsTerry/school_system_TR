/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import za.gov.sars.common.PersonType;

/**
 *
 * @author S2028398
 */
@MappedSuperclass
public class Person extends BaseEntity{
    @Column(name="first_namee")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="identity_number")
    private String identityNumber;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Address> addressList= new ArrayList<>();
    @OneToOne(optional = true,cascade = CascadeType.ALL, fetch=FetchType.EAGER )
    @JoinColumn(name = "contact_detail")
    private ContactDetail contactDetail;
    @Enumerated(EnumType.STRING)
    @Column(name = "personType")
    private PersonType personType;
    

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

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }
    
    public void addAddress(Address address){
    this.addressList.add(address);
    }
      
}
