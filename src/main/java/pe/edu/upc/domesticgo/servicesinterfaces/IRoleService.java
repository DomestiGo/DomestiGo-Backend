package pe.edu.upc.domesticgo.servicesinterfaces;

import pe.edu.upc.domesticgo.entities.Role;

import java.util.List;

public interface IRoleService {
    List<Role> list();
    void insert(Role role);
    void update(Role role);
    void delete(Long id);
    Role searchId(Long id);
}
