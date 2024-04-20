public class Laptops extends AritculosElectronicos{

    private String procesador;
    private int memoriaRAM;
    private String graficosIntegrados;
    private String marcaProducto;

    public Laptops(){}

    public Laptops(String nombreProducto , double modeloProducto , String descripciopProducto , double precioPorducto , String procesador , int memoriaRAM , String graficosIntegrados , String marcaProducto){
        super();
        this.procesador = procesador;
        this.memoriaRAM =  memoriaRAM;
        this.graficosIntegrados = graficosIntegrados;
        this.marcaProducto = marcaProducto;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getGraficosIntegrados() {
        return graficosIntegrados;
    }

    public void setGraficosIntegrados(String graficosIntegrados) {
        this.graficosIntegrados = graficosIntegrados;
    }
}
