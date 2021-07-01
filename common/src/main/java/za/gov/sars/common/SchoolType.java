/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.common;

/**
 *
 * @author S2028398
 */
public enum SchoolType {
    PRIMARY("Primary_School"),
    SECONDARY("Secondary_School"),
    TERTIARY("Tertiary_Level"),;
    
    private final String displaySchoolType;
    
        private SchoolType(String displaySchoolType) {
        this.displaySchoolType = displaySchoolType;
    }
            @Override
    public String toString() {
        return this.displaySchoolType;
    } 
}
