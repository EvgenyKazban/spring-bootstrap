package spring.bootstrap.service;

import org.springframework.stereotype.Service;
import spring.bootstrap.dao.RoleDAO;
import spring.bootstrap.entities.Role;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleServiceImp implements RoleService {

    private final RoleDAO roleDAO;

    public RoleServiceImp(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> allRole() {
        return roleDAO.allRole();
    }

    @Override
    public Role findRoleById(Long id) {
        return roleDAO.findRoleById(id);
    }

    @Override
    public void addRole(Role role) {
        roleDAO.addRole(role);
    }

}
