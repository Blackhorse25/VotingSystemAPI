package com.example.demo_project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.VoteService;

@SpringBootTest
public class VoteServiceTest {

    @Autowired
    private VoteService voteService;

    @BeforeEach
    public void setup() {
        voteService.addCandidate("Ajay");
        voteService.addCandidate("Bickey");
    }

    @Test
    public void testAddCandidate() {
        assertEquals("Candidate Mohan added successfully with vote count 0.", voteService.addCandidate("Mohan"));
    }

    @Test
    public void testCastVote() {
        assertEquals(1, voteService.castVote("Ajay"));
        assertEquals(2, voteService.castVote("Ajay"));
    }

    @Test
    public void testGetVoteCount() {
        voteService.castVote("Bickey");
        assertEquals(1, voteService.getVoteCount("Bickey"));
    }

    @Test
    public void testGetAllCandidates() {
        assertEquals(2, voteService.getAllCandidates().size());
    }

    @Test
    public void testGetWinner() {
        voteService.castVote("Ajay");
        voteService.castVote("Ajay");
        voteService.castVote("Bickey");
        assertEquals("Ajay", voteService.getWinner());
    }
}

