package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser1> userList = new ArrayList<>();

    public Forum(){///????
        userList.add(new ForumUser1(0445, "Thomas99", 'M', 2000, 04, 28, 16));
        userList.add(new ForumUser1(1422, "Michael", 'M', 1977, 12, 02, 0));
        userList.add(new ForumUser1(1233, "Jessica5454", 'W', 1998,12, 28, 0));
        userList.add(new ForumUser1(0775, "Shaft", 'M', 1995, 02, 16, 528));
        userList.add(new ForumUser1(1544, "Ginger", 'W', 1992, 07, 04, 885));
        userList.add(new ForumUser1(0177, "Minessota2",'W', 1999,10, 19, 2514));
        userList.add(new ForumUser1(1452, "Nosferatu", 'M', 2001, 01, 31, 821));
        userList.add(new ForumUser1(0326, "NoUserName", 'M', 2005, 11,18, 75));
        userList.add(new ForumUser1(1439, "Madagaskar", 'W', 2003, 05, 17, 4));
    }

    public List<ForumUser1> getUserList() {
        return userList;
    }
}
