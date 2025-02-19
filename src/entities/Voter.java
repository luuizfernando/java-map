package entities;

import java.util.Objects;

public class Voter {
    private String name;
    private Integer quantityVotes;

    public Voter(String name, Integer quantityVotes) {
        this.name = name;
        this.quantityVotes = quantityVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityVotes() {
        return quantityVotes;
    }

    public void setQuantityVotes(Integer quantityVotes) {
        this.quantityVotes = quantityVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Voter voter = (Voter) o;
        return Objects.equals(getName(), voter.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}