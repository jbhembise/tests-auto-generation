package jbhembise.testauto.example5;

import java.util.Optional;

public abstract class AbstractMedia implements Media {

    private String name;
    private User borrower;

    public AbstractMedia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setBorrower(User user) {
        this.borrower = user;
    }

    public Optional<User> getBorrower() {
        return Optional.ofNullable(borrower);
    }
}
