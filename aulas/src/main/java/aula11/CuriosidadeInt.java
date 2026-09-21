package aula11;

public class CuriosidadeInt {

    public static void main(String[] args) {

        int var1 = 147483647;

        int var2 = 121212124;

        System.out.println(var1 + var2);


//Porque em Java o número 031 não é decimal, e sim octal (base 8), já que começa com 0.
        int Oct31 = 031;

        int Dec25 = 25;

        System.out.println(Oct31 == Dec25);

        //"Hello, World!"
        System.out.print("\"Hello, World!\"\n\r");
        // 1\4
        System.out.println("1\\4");

    }
}
