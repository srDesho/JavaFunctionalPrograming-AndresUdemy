package com.cristianml.ejercicio_carrito_de_supermercado;

public class Main {

    public static void main(String[] args) {

        // Creamos las bolsas de cada producto que tenemos
        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        // Agregamos los productos a cada bolsa
        bolsaFruta.addProducto(new Fruta("Manzana verde", 1200D, 2500.00, "verde"));
        bolsaFruta.addProducto(new Fruta("Plátano maduro", 1500D, 2000.00, "amarillo"));
        bolsaFruta.addProducto(new Fruta("Fresa fresca", 500D, 3000.00, "rojo"));
        bolsaFruta.addProducto(new Fruta("Pera jugosa", 1800D, 2200.00, "verde"));
        bolsaFruta.addProducto(new Fruta("Naranja dulce", 2000D, 2400.00, "naranja"));

        bolsaLimpieza.addProducto(new Limpieza("Lavandina", 1400D, "Cloro", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 1800D, "Jabón", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 2000D, "Ácido cítrico", 1.2));
        bolsaLimpieza.addProducto(new Limpieza("Limpiavidrios", 1600D, "Alcohol", 0.75));
        bolsaLimpieza.addProducto(new Limpieza("Jabón líquido", 1200D, "Glicerina", 1.0));

        bolsaLacteo.addProducto(new Lacteo("Leche condensada", 750D, 4, 200));
        bolsaLacteo.addProducto(new Lacteo("Yogur natural", 500D, 6, 150));
        bolsaLacteo.addProducto(new Lacteo("Queso cheddar", 1200D, 12, 300));
        bolsaLacteo.addProducto(new Lacteo("Mantequilla", 800D, 10, 250));
        bolsaLacteo.addProducto(new Lacteo("Crema de leche", 600D, 8, 200));

        bolsaNoPerecible.addProducto(new NoPerecible("Jurel Natural Lata", 1100D, 425 ,560));
        bolsaNoPerecible.addProducto(new NoPerecible("Arroz Integral", 800D, 1000, 3600));
        bolsaNoPerecible.addProducto(new NoPerecible("Lentejas", 1200D, 500, 3400));
        bolsaNoPerecible.addProducto(new NoPerecible("Pasta Fusilli", 900D, 500, 3200));
        bolsaNoPerecible.addProducto(new NoPerecible("Harina de Trigo", 700D, 1000, 4000));

        // Iteramos cada bolsa
        System.out.println("============================= FRUTA =========================================");
        for (Fruta f: bolsaFruta.getProductos()) {
            System.out.println("------------------------" + f.getNombre());
            System.out.println("Precio: " + f.getPrecio());
            System.out.println("Peso (gr): " + f.getPrecio());
            System.out.println("Color: " + f.getColor());
        }

        System.out.println("============================= LIMPIEZA =========================================");
        for (Limpieza l: bolsaLimpieza.getProductos()) {
            System.out.println("------------------------" + l.getNombre());
            System.out.println("Precio: " + l.getPrecio());
            System.out.println("Componente principal: " + l.getComponentes());
            System.out.println("Litros: " + l.getLitros());
        }

        System.out.println("============================= LÁCTEOS =========================================");
        for (Lacteo lc: bolsaLacteo.getProductos()) {
            System.out.println("------------------------" + lc.getNombre());
            System.out.println("Precio: " + lc.getPrecio());
            System.out.println("Cantidad: " + lc.getCantidad());
            System.out.println("Proteínas: " + lc.getProteinas());
        }

        System.out.println("============================= NO PERECIBLES =========================================");
        for (NoPerecible np: bolsaNoPerecible.getProductos()) {
            System.out.println("------------------------" + np.getNombre());
            System.out.println("Precio: " + np.getPrecio());
            System.out.println("Contenido (g): " + np.getContenido());
            System.out.println("Calorías: " + np.getCalorias());
        };
    }
}
