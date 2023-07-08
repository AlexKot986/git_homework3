public class Hello {
    public static void main(String[] args) {

        helloWorld();
        helloPerson("Кашак");
        
    }
    public static void helloWorld() {
        System.out.println("Привет мир");
    }
    
    public static void helloPerson(String name) {
        System.out.printf("Привет %s\n", name);
    }

}
