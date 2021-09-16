package com.amazon.ata.inheritance.prework.day1.model;

public class InvalidVisit extends Visit {

    @Override
    public char getVisitCharacter() {
        return 'X';
    }

    @Override
    public VisitColor getVisitColor() {
        return VisitColor.INVALID_COLOR;
    }
}
