package pl.itacademy.week9.hw;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {
    private List<Box<T>> boxes = new ArrayList<>();

    public void addBox(Box<T> box) {
        boxes.add(box);
    }

    public List<Box<T>> getBoxes() {
        return boxes;
    }
}
