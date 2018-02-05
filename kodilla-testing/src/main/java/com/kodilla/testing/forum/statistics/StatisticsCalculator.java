package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    Statistics statistics;
    public int postsCount;
    public int commentsCount;
    public int usersQuantity;
    public double avPostUser;
    public double avCommUser;
    public double avCommPost;

    public StatisticsCalculator(int postsCount, int commentsCount, int usersQuantity) {
        this.postsCount = postsCount;
        this.commentsCount = commentsCount;
        this.usersQuantity = usersQuantity;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public double getAvPostUser() {
        return avPostUser;
    }

    public double getAvCommUser() {
        return avCommUser;
    }

    public double getAvCommPost() {
        return avCommPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity=statistics.usersNames().size();
        postsCount=statistics.postsCount();
        commentsCount=statistics.commentsCount();
        avPostUser=postsCount/usersQuantity;
        avCommPost=commentsCount/postsCount;
        avCommUser=commentsCount/postsCount;
    }

    public void ShowStatistics(){
        System.out.println(statistics);
    }
}
