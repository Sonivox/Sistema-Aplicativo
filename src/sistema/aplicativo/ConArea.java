package sistema.aplicativo;

/**
 *
 * @author Roberto
 */
public class ConArea {
    
    private double conversion;
    private String resultado;
    
    //PARA TODAS LAS UNIDADES DE AREA
    //PARA LOS CENTIMETROS CUADRADOS
    public String centiMetro(double area){
        conversion = (area / 10000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String centiKilo(double area){
        conversion = (0.0001 / 1000000) * area;
        resultado = String.valueOf(conversion);
        return resultado;
        
    }
    public String centiMilla(double area){
        conversion = (area *  3.861e-11 )  ;
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String centiHecta(double area){
        conversion = ( area * 1e-8);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String centiPie(double area){
        conversion = ( area * 0.00107639);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String centiPul(double area){
        conversion = ( area * 0.155);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String centiYar(double area){
        conversion = ( area * 0.000119599);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LOS METROS CUADRADOS
    public String metroCen(double area){
        conversion = (area * 10000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroKilo(double area){
        conversion = (area * 0.000001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroMilla(double area){
        conversion = (area * 0.0000003861);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroHecta(double area){
        conversion = (area * 0.0001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroPie(double area){
        conversion = (area* 10.7639);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroPul(double area){
        conversion = (area * 1550);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String metroYar(double area){
        conversion = (area * 1.19599);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA KILOMETROS CUADRADOS 
    public String kiloMetro(double area){
        conversion = (area * 1000000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloCenti(double area){
        conversion = (area * 1000000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloMilla(double area){
        conversion = (area * 1000000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloHecta(double area){
        conversion = (area * 100);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloPie(double area){
        conversion = (area * 1.076e+7);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloPul(double area){
        conversion = (area * 1.55e+9);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloYar(double area){
        conversion = (area * 1.196e+6);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS MILLAS CUADRADAS
    public String millaCen(double area){
        conversion = (area * 2.59e+10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaMet(double area){
        conversion = (area * 2.59e+6);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaKilo(double area){
        conversion = (area * 2.5899);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaHecta(double area){
        conversion = (area * 258.999);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaPie(double area){
        conversion = (area * 2.788e+7);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaPul(double area){
        conversion = (area * 4.014e+9);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String millaYar(double area){
        conversion = (area * 3.098e+6);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS HECTAREAS
    public String hectaCen(double area){
        conversion = (area * 1e+8);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaMet(double area){
        conversion = (area * 10000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaKilo(double area){
        conversion = (area * 0.01);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaMilla(double area){
        conversion = (area * 0.00386102);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaPie(double area){
        conversion = (area * 1076390);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaPul(double area){
        conversion = (area * 1.55e+7);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String hectaYar(double area){
        conversion = (area * 11959.9);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LOS PIES CUADRADOS
    public String pieCen(double area){
        conversion = (area * 929.03);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pieMet(double area){
        conversion = (area * 0.092903);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pieKilo(double area){
        conversion = (area * 9.2903e-8);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pieMilla(double area){
        conversion = (area * 3.587e-8);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pieHecta(double area){
        conversion = (area * 9.2903e-6);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String piePul(double area){
        conversion = (area * 144);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pieYar(double area){
        conversion = (area * 0.111111);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    
    //PARA LAS PULGADAS CUADRADAS
    public String pulCen(double area){
        conversion = (area * 6.4516);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulMet(double area){
        conversion = (area * 0.00064516);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulKilo(double area){
        conversion = (area * 6.4516e-10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulMilla(double area){
        conversion = (area * 2.491e-10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulHecta(double area){
        conversion = (area * 6.4516e-8);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulPie(double area){
        conversion = (area * 0.00694444);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String pulYar(double area){
        conversion = (area * 0.000771605);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS YARDAS CUADRADAS
    public String yarCen(double area){
        conversion = (area * 8361.27);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarMet(double area){
        conversion = (area * 0.836127);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarKilo(double area){
        conversion = (area * 8.3613e-7);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarMilla(double area){
        conversion = (area * 3.2283e-7);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarHecta(double area){
        conversion = (area * 8.3613e-5);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarPie(double area){
        conversion = (area * 9);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String yarPul(double area){
        conversion = (area * 1296);
        resultado = String.valueOf(conversion);
        return resultado;
    }
}
