package com.example.demo_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo_project.model.Candidate;
import com.example.demo_project.service.VoteService;

import java.util.List;

@RestController
@RequestMapping("/api/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping("/entercandidate")
    public String enterCandidate(@RequestParam String name) {
        return voteService.addCandidate(name);
    }

    @PostMapping("/castvote")
    public int castVote(@RequestParam String name) {
        return voteService.castVote(name);
    }

    @GetMapping("/countvote")
    public int countVote(@RequestParam String name) {
        return voteService.getVoteCount(name);
    }

    @GetMapping("/listvote")
    public List<Candidate> listVotes() {
        return voteService.getAllCandidates();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        return voteService.getWinner();
    }
}

