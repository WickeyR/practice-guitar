INSERT INTO exercises (id, name, description, default_tempo_min, default_tempo_max)
VALUES
    (gen_random_uuid(), 'Travis Picking – Pattern 1', 'Thumb–index–thumb–middle alternation', 60, 120),
    (gen_random_uuid(), 'Alternate Picking – Single String 16s', 'Consistency at 4 notes/beat', 60, 180)
    ON CONFLICT DO NOTHING;