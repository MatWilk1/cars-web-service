package jeeteam.carswebservice.dao;

import jeeteam.carswebservice.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
