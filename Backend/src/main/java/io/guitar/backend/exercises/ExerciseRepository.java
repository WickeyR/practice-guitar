package io.guitar.backend.exercises;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciseRepository  extends JpaRepository<Exercise, UUID> {
}
