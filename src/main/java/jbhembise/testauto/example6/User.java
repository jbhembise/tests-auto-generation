package jbhembise.testauto.example6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User {

    private String firstName;
    private String lastName;
    private List<Media> borrowedMedias = new ArrayList<>();

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void borrow(Media media) {
        Optional.ofNullable(media)
                .ifPresent(it -> {
                    this.borrowedMedias.add(media);
                    media.setBorrower(this);
                });
    }

    public List<Media> getBorrowedMedias() {
        return borrowedMedias;
    }
}
