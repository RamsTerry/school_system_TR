/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.List;
import za.gov.sars.persistence.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.gov.sars.domain.SystemUser;

/**
 *
 * @author S2028398
 */
@Service
public class LoginService implements LoginServiceLocal {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public SystemUser logUserIn(String username, String password) {
        SystemUser systemUser = null;
        if (isUserExisting(username)) {
            for (SystemUser user : loginRepository.findAll()) {
                if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                    systemUser = user;
                }
            }
        }
        return systemUser;
    }

    @Override
    public boolean isUserExisting(String username) {
        int count = 0;
        for (SystemUser user : loginRepository.findAll()) {
            if (user.getUsername().equals(username)) {
                count++;
            }
        }

        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public void deleteById(Long id) {
        loginRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        loginRepository.deleteAll();
    }

    @Override
    public List<SystemUser> listAll() {
        return loginRepository.findAll();
    }

    @Override
    public SystemUser findById(Long id) {
        return loginRepository.getOne(id);
    }

    @Override
    public SystemUser update(SystemUser systemUser) {
        return loginRepository.save(systemUser);
    }

}
