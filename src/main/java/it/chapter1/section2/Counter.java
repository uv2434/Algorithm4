package it.chapter1.section2;

public class Counter {
    private int count;

    private final String name;

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    // 计数器的值
    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
