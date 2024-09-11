package dulce;

        /*
         * Crear un frasco de dulce
         * Tratar de envasar 250 gramos de dulce
         * Mostrar si fue posible envasar los 250 gramos o solo 200
         * 
         * intenta sacar 150 gramos de dulce y luego sacar 60 gramos
         * Mostrar la cantidad de dulce que efectivamente se puede sacar
         * y mostrar la cantidad que queda en el frasco 
         *       
         * */




public class main {
    public static void main(String[] args) {
        
        // Se crea un objeto de tipo FrascoDulce
        FrascoDulce frasco = new FrascoDulce();

        System.out.println(frasco.envasarDulce(200));

        if (frasco.envasarDulce(250) ) {
            System.out.println("Se envasaron "+ frasco.envasarDulce(250));
    
        }else {
            System.out.println("No se pudo envasar 250");
        }


        System.out.println("La cantidad actual es: "+ frasco.consultarCantidad());

        System.out.println("Se sacarán del frasco: "+ frasco.sacarDulce(150));
        System.out.println("La cantidad actual es: "+ frasco.consultarCantidad());

        System.out.println("Se sacarán del frasco: "+ frasco.sacarDulce(60));
        System.out.println("La cantidad actual es: "+ frasco.consultarCantidad());

        System.out.println("Lo cantidad que quedó al final es: "+ frasco.consultarCantidad());





    }        
}
