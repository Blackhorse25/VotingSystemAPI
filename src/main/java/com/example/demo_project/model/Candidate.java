package com.example.demo_project.model;

public class Candidate {
    // The name of the candidate
    private String name;

    // The number of votes received by the candidate
    private int voteCount;

    // Constructor to create a new candidate with a given name
    public Candidate(String name) {
        this.name = name; // Set the candidate's name
        this.voteCount = 0; // Initialize vote count to 0
    }

    // Getter method to retrieve the candidate's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the current vote count
    public int getVoteCount() {
        return voteCount;
    }

    // Method to increment the vote count by 1
    public void incrementVoteCount() {
        this.voteCount++; // Increase the vote count
    }
}
