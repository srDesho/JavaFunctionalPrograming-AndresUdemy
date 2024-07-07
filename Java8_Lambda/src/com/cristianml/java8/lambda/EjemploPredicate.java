package com.cristianml.java8.lambda;

import com.cristianml.java8.lambda.models.UsuarioModel;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    // Los Predicates(predicados) son para evaluar expresiones booleanas.
    public static void main(String[] args) {
        // Siempre van a devolver boolean así que no es necesario agregar el tipo de dato que retornará porque se
        // sobreentiende cuando llamamos a la clase Predicate.
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(11);
        System.out.println("r = " + r);

        // Ejemplo con método equals
        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_USER"));
        System.out.println(test2.test("ROLE_ADMIN"));

        // BiPredicate
        BiPredicate<String, String> test3 = String::equals; // (a, b) -> a.equals(b);
        System.out.println(test3.test("Daniel", "Daniel"));

        BiPredicate<Integer, Integer> test4 = (a, b) -> b > a;
        System.out.println("test 4 = " + test4.test(5, 10));

        // ejemplo con objeto UsuarioModel
        UsuarioModel a = new UsuarioModel();
        UsuarioModel b = new UsuarioModel();
        a.setNombre("Maria");
        b.setNombre("Maria");

        BiPredicate<UsuarioModel, UsuarioModel> test5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println("test5 = " + test5.test(a, b));
    }

}
