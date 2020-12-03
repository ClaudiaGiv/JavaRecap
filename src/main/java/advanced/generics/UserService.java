package advanced.generics;

import java.util.List;

public class UserService implements Service<User, Long> {

    public List<User> findAll(){
        return null;
    }

    public User save(User user){
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}
