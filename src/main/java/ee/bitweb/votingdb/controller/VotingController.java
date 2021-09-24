package ee.bitweb.votingdb.controller;

import ee.bitweb.votingdb.entity.Vote;
import ee.bitweb.votingdb.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/voting")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @GetMapping(value = "/all")
    public List<Vote> getAllVotes() {
        return this.votingService.getAllVotes();
    }

    @PostMapping("/new")
    public void vote(@RequestBody Vote vote) {
        this.votingService.vote(vote);
    }
}
