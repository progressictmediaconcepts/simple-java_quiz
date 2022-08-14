class Food {
    
    static int sum = 0;
    static void add() { sum++; }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) add();
        System.out.println(sum);
    }
}
