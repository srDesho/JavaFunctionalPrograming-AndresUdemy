package com.cristianml.java8.lambda.ejercicios;

public class ExpresionLambdaQueConvierteFrase {

    public static void main(String[] args) {

        // Expresión Lambda que elimine espacios, comas y puntos de una frase
        // y además la devuelva la frase convertida en mayúscula.
        FormatearFrase formatear = (frase) -> {
            return frase.replace(",", "")
                    .replace(".", "").replace(" ", "")
                    .toUpperCase();
        };

        // Llamamos a nuestra expresión para formatear
        System.out.println(formatear.limpiarYFormatear("Hola que, a todos. ¿Cómo están compañeros?" +
                ", soy bueno programando, estoy aprendiendo inglés."));
    }

}
