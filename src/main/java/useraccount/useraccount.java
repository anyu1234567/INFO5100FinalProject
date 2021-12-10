/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useraccount;

import Role.Role;
import com.neu5100.finalproject.model.OrganizationAdmin;

/**
 *
 * @author chenghongmei
 */
public class useraccount {
    private String username;
    private String password;
    private OrganizationAdmin organizationAdmin; // basic information for each person
    private Role role; // enum Role, setting person type
    private OrderQueue workQueue; // order information

    public useraccount() {
        workQueue = new OrderQueue();
    }
    
    public useraccount(String username, String password, OrganizationAdmin organizationAdmin, Role role) {
        this.username = username;
        this.password = password;
        this.organizationAdmin = organizationAdmin;
        this.role = role;
        
        workQueue = new OrderQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OrganizationAdmin getOrganizationAdmin() {
        return organizationAdmin;
    }

    public void setOrganizationAdmin(OrganizationAdmin organizationAdmin) {
        this.organizationAdmin = organizationAdmin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public OrderQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(OrderQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
}
