/*41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, and also use treeset for the same for circle objects and see what happens. */

import java.util.*;

class Circle {
    int x, y, radius;

    Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }
}

public class FortyOne {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 2, 3);
        Circle c2 = new Circle(4, 5, 6);
        Circle c3 = new Circle(1, 2, 3); // Duplicate

        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3); // Duplicate should be ignored
        System.out.println("HashSet: " + hashSet);

        TreeSet<Circle> treeSet = new TreeSet<>((o1, o2) -> o1.radius - o2.radius);
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3); // Duplicate based on radius comparison
        System.out.println("TreeSet: " + treeSet);
    }
}
