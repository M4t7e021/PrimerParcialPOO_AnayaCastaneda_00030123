public class Telefonos extends AritculosElectronicos implements Definir{

    private String procesador;
    private String tipoCamara;
    private int memoria;
    private String marcaProducto;

    public Telefonos(){}

    public Telefonos(String nombreProducto , double modeloProducto , String descripciopProducto , double precioPorducto,String procesador , String tipoCamara , int memoria ,String marcaProducto){
        super();
        this.procesador = procesador;
        this.tipoCamara = tipoCamara;
        this.memoria = memoria;
        this.marcaProducto = marcaProducto;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoCamara(String tipoCamara) {
        this.tipoCamara = tipoCamara;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
