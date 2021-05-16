package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.entity.User;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;

    public User getUser() {
        return user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ResponseTemplateVO() {
    }

    public ResponseTemplateVO(User user, Department department) {
        this.user = user;
        this.department = department;
    }
}
