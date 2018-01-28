package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser1 {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostPublished() {
        return postPublished;
    }

    private final int postPublished;

    public ForumUser1(int userId, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postPublished) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postPublished = postPublished;
    }
}
