CREATE TABLE exercises (
                           id UUID PRIMARY KEY,
                           name TEXT UNIQUE NOT NULL,
                           description TEXT,
                           default_tempo_min INT,
                           default_tempo_max INT
);

CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       email TEXT UNIQUE NOT NULL,
                       password_hash TEXT NOT NULL,
                       display_name TEXT
);

CREATE TABLE sessions (
                          id UUID PRIMARY KEY,
                          user_id UUID NOT NULL REFERENCES users(id),
                          started_at TIMESTAMPTZ NOT NULL,
                          ended_at TIMESTAMPTZ,
                          rpe INT,
                          notes TEXT
);

CREATE TABLE set_entries (
                             id UUID PRIMARY KEY,
                             session_id UUID NOT NULL REFERENCES sessions(id) ON DELETE CASCADE,
                             exercise_id UUID NOT NULL REFERENCES exercises(id),
                             order_idx INT,
                             tempo_target INT,
                             tempo_achieved INT,
                             reps INT,
                             duration_sec INT,
                             accuracy_pct DOUBLE PRECISION,
                             rating INT,
                             notes TEXT
);
