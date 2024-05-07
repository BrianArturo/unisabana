package org.unisabana;

public enum DimensionPizza {
    GRANDE(1, "GRANDE",5),
    PEQUENA(2, "PEQUENA",1),
    MEDIANA(3, "MEDIANA",3);

    private final int codigo;
    private final String nombre;

    private final Integer cocion;

    // Constructor del enumerador
    DimensionPizza(int codigo, String nombre, Integer cocion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cocion = cocion;
    }

    // Métodos para acceder a los parámetros
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCocion(){
        return cocion;
    }

    // Método estático para buscar un valor por su código
    public static DimensionPizza buscarPorCodigo(int codigo) {
        for (DimensionPizza pizza : DimensionPizza.values()) {
            if (pizza.codigo == codigo) {
                return pizza;
            }
        }
        return null; // Si no se encuentra, se devuelve null
    }

}
