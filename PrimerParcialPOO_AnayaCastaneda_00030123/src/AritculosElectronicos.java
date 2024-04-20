public class AritculosElectronicos implements Definir{

    private String nombreProducto;
    private double modeloProducto;
    private String descripciopProducto;
    private double precioPorducto;


    @Override
    public double obtenerPrecio() {
        return precioPorducto;
    }

    @Override
    public void descripcionArticulos() {
        System.out.println("-------------------");
        System.out.println("Articulo Electronico");
        System.out.println("\tNombre del producto: " + nombreProducto);
        System.out.println("\tModelo del producto: " + modeloProducto);
        System.out.println("\tPrecio del producto: " + precioPorducto);
    }


    //Metodos
    public AritculosElectronicos(){}

    public AritculosElectronicos(String nombreProducto , double modeloProducto , String descripciopProducto , double precioPorducto){
        this.nombreProducto = nombreProducto;
        this.modeloProducto = modeloProducto;
        this.descripciopProducto = descripciopProducto;
        this.precioPorducto = precioPorducto;
    }

    //Getters and Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getModeloProducto() {
        return modeloProducto;
    }

    public void setModeloProducto(double modeloProducto) {
        this.modeloProducto = modeloProducto;
    }

    public String getDescripciopProducto() {
        return descripciopProducto;
    }

    public void setDescripciopProducto(String descripciopProducto) {
        this.descripciopProducto = descripciopProducto;
    }

    public double getPrecioPorducto() {
        return precioPorducto;
    }

    public void setPrecioPorducto(double precioPorducto) {
        this.precioPorducto = precioPorducto;
    }

}
