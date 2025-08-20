package io.guitar.backend.exercises;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/exercises")
public class ExerciseController {
    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<Exercise> getAll() {
        return exerciseService.getAllExercises();
    }

    @PostMapping
    public Exercise create(@RequestBody Exercise exercise) {
        return exerciseService.addExercise(exercise);
    }
}
