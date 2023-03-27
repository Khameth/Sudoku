package com.example.demo.app;

public enum HardLevel {
    SUPER_EASY(2),
    EASY(3),
    NORMAL(4),
    HARD(5),
    SUPER_HARD(7),
    EXPERT(10);

    int hardLevel;
    HardLevel(int i) {
        hardLevel = i;
    }

}
