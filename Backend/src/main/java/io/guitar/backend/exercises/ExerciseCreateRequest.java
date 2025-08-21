package io.guitar.backend.exercises;

import jakarta.validation.constraints.*;
import org.hibernate.internal.build.AllowSysOut;

public class ExerciseCreateRequest {

    @NotBlank
    @Size(max = 100)
    private String name;

    @Size(max = 10_000)
    private String description;


    @Min(0)
    @Max(400)
    private Integer defaultTempoMin;

    @Min(0)
    @Max(400)
    private Integer defaultTempoMax;

    @AssertTrue(message = "defaultTempoMin must be ≤ defaultTempoMax")
    public boolean isTempoRangeValid(){
        if(defaultTempoMin == null || defaultTempoMax == null) return true;
        return defaultTempoMin <= defaultTempoMax;
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
