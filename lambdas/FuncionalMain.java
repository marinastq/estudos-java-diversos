package lambdas;

public class FuncionalMain {
    public static void main(String[] args) {
        FuncionalExemplo fe = (a, b) -> a + b;
        String con = fe.concatena("ho", "je");
        System.out.println(con);


        SomaTres st = (x, y, z) -> x + y + z;
        int soma = st.soma(1,2,3);
        System.out.printf("A soma e: %d", soma);


    }
}
