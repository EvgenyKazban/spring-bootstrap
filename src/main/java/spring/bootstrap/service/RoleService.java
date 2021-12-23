package spring.bootstrap.service;

import spring.bootstrap.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> allRole();
    Role findRoleById(Long id);
    void addRole(Role role);
}
