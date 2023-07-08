public class Hello {
    public static void main(String[] args) {

        helloWorld();
        helloPerson("Кашак");
        good(4);
        
    }
    public static void helloWorld() {
        System.out.println("Привет мир");
    }
    
    public static void helloPerson(String name) {
        System.out.printf("Привет %s\n", name);
    }

    public static void good(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("GOOD");
    }

    //test
}
