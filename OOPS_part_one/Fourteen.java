/*14. Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.
*/

class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int initialCount) {
        this.count = initialCount;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }
    
    public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();

        System.out.println("Initially, the count without parameters: " + c1.getCount());

        c1.increment();
        System.out.println("Count after incrementing: " + c1.getCount());
        c1.decrement();
        System.out.println("Count after decrementing: " + c1.getCount());

        Counter c2 = new Counter(25);

        System.out.println("Intially, the count value with parameters: " + c2.getCount());

        c2.increment();
        System.out.println("Count after incrementing: " + c2.getCount());
        c2.decrement();
        System.out.println("Count after decrementing: " + c2.getCount());
    }
}