/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.mb;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.common.PersonType;
import za.gov.sars.domain.Student;
import za.gov.sars.service.StudentServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class StdProfileBean extends BaseBean {

    @Autowired //to be able to allow the communication in between
    private StudentServiceLocal studentService;
    private Student student;

    @PostConstruct
    public void init() {
//        student = studentService.findById(getActiveUser).getId());
        student = studentService.listAll().get(studentService.listAll().size() - 1);
    }

    public void updateProfile(Student std) {

        if (std.getId() != null) {

            studentService.update(std);
        }
        if (std.getPersonType().equals(PersonType.LEARNER)) {
            redirect("studentDash");
        }
        redirect("learnerConsole");
    }

    public void cancel(Student std) {
        if (std.getPersonType().equals(PersonType.LEARNER)) {
            redirect("studentDash");
        }
        redirect("learnerConsole");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
