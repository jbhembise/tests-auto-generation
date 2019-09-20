package jbhembise.testauto.example6;

import java.util.Optional;

public interface Media {
    String getName();
    void setBorrower(User user);
    Optional<User> getBorrower();
}
