package ee.bitweb.votingdb.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

    private String animalName;
    private int votesNumber;

    public Vote(String animalName, int votesNumber) {
        this.animalName = animalName;
        this.votesNumber = votesNumber;
    }
}
