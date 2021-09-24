package ee.bitweb.votingdb.repository;

import ee.bitweb.votingdb.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VotingRepository extends JpaRepository<Vote, Long> {

    @Query("SELECT v FROM Vote v WHERE v.animalName = ?1")
    Vote findVoteByAnimalName(String animalName);
}
