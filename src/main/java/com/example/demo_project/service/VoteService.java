package com.example.demo_project.service;

import org.springframework.stereotype.Service;

import com.example.demo_project.model.Candidate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoteService {
    // List to store candidates
    private final List<Candidate> candidates = new ArrayList<>();

    // Method to add a candidate
    public String addCandidate(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                return "Candidate " + name + " already exists.";
            }
        }
        candidates.add(new Candidate(name));
        return "Candidate " + name + " added successfully with vote count 0.";
    }

    // Method to cast a vote for a candidate
    public int castVote(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.incrementVoteCount(); // Increment vote count
                return candidate.getVoteCount(); // Return updated vote count
            }
        }
        throw new IllegalArgumentException("Invalid candidate name."); // Candidate not found
    }

    // Method to get the vote count of a candidate
    public int getVoteCount(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                return candidate.getVoteCount(); // Return vote count
            }
        }
        throw new IllegalArgumentException("Invalid candidate name."); // Candidate not found
    }

    // Method to get all candidates
    public List<Candidate> getAllCandidates() {
        return candidates; // Return the candidate list directly
    }


    // Method to get the winner based on the highest vote count
    public String getWinner() {
        if (candidates.isEmpty()) {
            return "No candidates available."; // No candidates case
        }

        Candidate winner = candidates.get(0); // Assume the first candidate is the winner initially
        for (Candidate candidate : candidates) {
            // Update winner if current candidate has more votes
            if (candidate.getVoteCount() > winner.getVoteCount()) {
                winner = candidate;
            }
        }
        return winner.getName(); // Return the winner's name
    }
}
