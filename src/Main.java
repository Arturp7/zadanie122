public class Main {
    public static void main(String[] args) {
        System.out.println(
                "1.Wyjątki dzielimy na kontrolowane które trzeba obsłużyć i" +
                        " niekontrolowane które można ale nie trzeba obsłużyć"
        );
        System.out.println(
                "2.Wyjątki niekontrolowane dziedziczą po RuntimeException"
        );
        System.out.println(
                "3.Wyjątki rzucamy korzystając z instrukcji throw, jeśli rzucamy  wyjątek kontrolowany" +
                        " musimy dodatkowo w sygnaturze metody/konstruktora zadeklarować wyjątek używająć słowa throws "
        );
        System.out.println(
                "4.Do bloku try-catch możemy dodać dodatkowo blok finally{} który wykona się zawsze niezależnie, czy w " +
                        "bloku try wyjątek wystąpił czy nie  "
                );



    }
}
