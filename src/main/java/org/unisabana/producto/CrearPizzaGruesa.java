package org.unisabana.producto;

public class CrearPizzaGruesa extends CrearPizza {

    String tamano;
    String ingredientes;
    String tipo;
    Integer coccion;

    public CrearPizzaGruesa(String tamano, String ingredientes, String tipo, Integer coccion) throws InterruptedException {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.coccion = coccion;
        amasar();
        moldear();
        hornear();

    }

    @Override
    public String amasar() throws InterruptedException {
        System.out.println("Amasando pizza "+ tipo +" de tamaño "+ tamano);
        Thread.sleep(2000);
        return "Amasando pizza "+ tipo +" de tamaño "+tamano;
    }

    @Override
    public String hornear() throws InterruptedException {
        System.out.println("Horneando Pizza "+ tipo +" cocinando unos " + coccion+ " minutos ");
        Thread.sleep(coccion);
        return "horneando pizza" +tipo;
    }

    @Override
    public String moldear()  throws InterruptedException{
        System.out.println("aplicando ingredientes  "+ ingredientes + " a la pizza ");
        Thread.sleep(1000);
        System.out.println("Moldeando Pizza "+ tipo +" de tamaño "+ tamano);
        Thread.sleep(2000);
        return "Moldeando Pizza "+ tipo +" de tamaño "+tamano;
    }
}
