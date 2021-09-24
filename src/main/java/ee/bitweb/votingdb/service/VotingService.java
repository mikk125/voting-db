package ee.bitweb.votingdb.service;

import ee.bitweb.votingdb.entity.Vote;
import ee.bitweb.votingdb.repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingService {

    @Autowired
    private VotingRepository votingRepository;

    public List<Vote> getAllVotes() {
        return this.votingRepository.findAll();
    }

    public void vote(Vote vote) {
        Vote currentVote = this.votingRepository.findVoteByAnimalName(vote.getAnimalName());
        if (currentVote == null) {
            this.votingRepository.save(new Vote(vote.getAnimalName(), 1));
        } else {
            currentVote.setVotesNumber(currentVote.getVotesNumber() + 1);
            this.votingRepository.save(currentVote);
        }
    }
}
