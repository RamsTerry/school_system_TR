/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.sars.common.PersonType;
import za.gov.sars.common.SystemUserType;
import za.gov.sars.domain.Employee;
import za.gov.sars.service.EmployeeServiceLocal;

/**
 *
 * @author S2028398
 */
@ManagedBean
@ViewScoped
public class SystemProfileBean extends BaseBean {

    @Autowired //to be able to allow the communication in between
    private EmployeeServiceLocal employeeService;

    private Employee employee;

    public void init() {
        //        employee = employeeService.findById(getActiveUser).getId());
        employee = employeeService.listAll().get(employeeService.listAll().size() - 1);
    }
    
    public void updateSysProfile(Employee syst) {

//        if (syst.getId() != null) {
//
//            employeeService.update(syst);
//        }
//        if(syst.getPersonType().equals(PersonType.SYSTEM_USER)&& syst.getEmployeeType().equals(SystemUserType.ADMIN)){
//        redirect("adminDash");
//        }else if(syst.getPersonType().equals(PersonType.EMPLOYEE)&& syst.getEmployeeType().equals(SystemUserType.)){
//        redirect("officeAdminDash");
//        }else if (emp.getEmployeeType().equals(SystemUserType.PRINCIPAL)) {
//            redirecting("principalDash");
//        } else if (emp.getEmployeeType().equals(SystemUserType.HOD)) {
//            redirecting("hodDash");
//        } else if (emp.getEmployeeType().equals(SystemUserType.EDUCATOR)) {
//            redirecting("educatorDash");
//        }
    }

    public void cancel(Employee syst) {
//         if(emp.getPersonType().equals(PersonType.SYSTEM_USER)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
//        redirect("adminDash");
//        }else if(emp.getPersonType().equals(PersonType.EMPLOYEE)&& emp.getEmployeeType().equals(SystemUserType.ADMIN)){
//        redirect("officeAdminDash");
//        }else if (emp.getEmployeeType().equals(SystemUserType.PRINCIPAL)) {
//            redirecting("principalDash");
//        } else if (emp.getEmployeeType().equals(SystemUserType.HOD)) {
//            redirecting("hodDash");
//        } else if (emp.getEmployeeType().equals(SystemUserType.EDUCATOR)) {
//            redirecting("educatorDash");
//        } 
    }

}
