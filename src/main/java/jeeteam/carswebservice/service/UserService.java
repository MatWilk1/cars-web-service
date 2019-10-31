package jeeteam.carswebservice.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import jeeteam.carswebservice.entity.User;
import jeeteam.carswebservice.registrationuser.RegistrationUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(RegistrationUser crmUser);
}
