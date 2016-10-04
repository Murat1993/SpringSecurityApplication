package net.murat.springsecurityapp.dao;


import net.murat.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
