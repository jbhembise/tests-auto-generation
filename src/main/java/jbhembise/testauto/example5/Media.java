package jbhembise.testauto.example5;

import java.util.Optional;

public interface Media {
    String getName();
    void setBorrower(User user);
    Optional<User> getBorrower();
}
