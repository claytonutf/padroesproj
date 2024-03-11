package refactoring_guru.singleton.example.non_thread_safe;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println(
                "Se você ver o mesmo valor, então o Singleton foi reusado (beleza)\n"+
                "Se você ver valores diferentes, então 2 Singletons foram criados (ixi)\n"+
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("Parâmetro para criar a instância 1");
        Singleton anotherSingleton = Singleton.getInstance("Parâmetro para criar a instância 2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}