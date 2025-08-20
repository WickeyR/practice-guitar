package io.guitar.backend.exercises;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.util.UUID;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private Integer defaultTempoMin;

    private Integer defaultTempoMax;

    public Exercise() {}

    public Exercise(String name, String description, Integer defaultTempoMin, Integer defaultTempoMax) {
        this.name = name;
        this.description = description;
        this.defaultTempoMin = defaultTempoMin;
        this.defaultTempoMax = defaultTempoMax;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDefaultTempoMin() {
        return defaultTempoMin;
    }

    public Integer getDefaultTempoMax() {
        return defaultTempoMax;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDefaultTempoMin(Integer defaultTempoMin) {
        this.defaultTempoMin = defaultTempoMin;
    }

    public void setDefaultTempoMax(Integer defaultTempoMax) {
        this.defaultTempoMax = defaultTempoMax;
    }
}
