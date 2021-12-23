package spring.bootstrap.dao;

import spring.bootstrap.entities.Role;


import java.util.List;

public interface RoleDAO {

    List<Role> allRole();
    Role findRoleById(Long id);
    void addRole(Role role);
}
