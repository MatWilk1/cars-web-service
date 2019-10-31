package jeeteam.carswebservice.dao;

import jeeteam.carswebservice.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
