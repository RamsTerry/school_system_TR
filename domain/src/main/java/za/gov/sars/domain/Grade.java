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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Columns;
import org.hibernate.envers.Audited;

/**
 *
 * @author S2028398
 */
@Entity
@Audited
@Table(name="grade")
public class Grade extends BaseEntity {
    
    @Column(name = "name")
    private String name;
    @Column(name = "designation")
    private String designation;
//    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
//    private List<Student>students = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name="grade_employee",joinColumns = {@JoinColumn(name = "grade_id")}, inverseJoinColumns = {@JoinColumn(name = "employee_id")})
    private List<Employee>employees = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name="grade_subject",joinColumns = {@JoinColumn(name = "grade_id")}, inverseJoinColumns = {@JoinColumn(name = "subject_id")})
    private List<Subject>subjects = new ArrayList<>();

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
       
}
