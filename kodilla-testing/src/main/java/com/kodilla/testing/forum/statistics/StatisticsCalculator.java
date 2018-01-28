package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    Statistics statistics;
    public int postsQuantity;
    public int commentsQuantity;
    public int usersQuantity;
    public double avPostUser;
    public double avCommUser;
    public double avCommPost;

    public Statistics getStatistics() {
        return statistics;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
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
        postsQuantity=statistics.postsCount();
        commentsQuantity=statistics.commentsCount();
        avPostUser=postsQuantity/usersQuantity;
        avCommPost=commentsQuantity/postsQuantity;
        avCommUser=commentsQuantity/postsQuantity;
    }

    public void ShowStatistics(){
        System.out.println();
    }
}
