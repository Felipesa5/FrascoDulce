package dulce;
//import java.time.LocalDate;
public class FrascoDulce{
    String sabor;
    int cantidad;
    String fechaEnvase;

    public int consultarCantidad(){
        return this.cantidad;
    }

    public boolean envasarDulce(int cantidad){
        if ((this.cantidad + cantidad) > 200 ){
            return false;
        }else {
            this.cantidad += cantidad;
            return true;
        }
    }

    public int sacarDulce(int cantidadASacar){
        int cantidadSacada = 0;
        if (this.consultarCantidad() >= cantidadASacar) {
            this.cantidad -= cantidadASacar;
            cantidadSacada = cantidadASacar;
        } else {
            cantidadSacada = this.cantidad;
            this.cantidad = 0;
        }
        return cantidadSacada;
}

}
//cristian.echeverri@ucaldas.edu.co

