package io.spring.start.mygroup.mySpringApp.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName;
    
    public String getDeptName(){
        return deptName;
    }
    public void setDeptBean(String deptName){
        this.deptName = deptName;
    }
    
}
