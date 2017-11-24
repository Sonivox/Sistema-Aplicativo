package sistema.aplicativo;

public class conversiones {
    
    unidades u = new unidades();
    private double conversion;
    private String resultado;
    
    public void centiHecta(double area){
        u.setArea(area);
        conversion = ( u.getArea() / 100000000);
        resultado = String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void centiMetro(double area){
        u.setArea(area);
        conversion = (u.getArea() /10000);
        resultado = String.valueOf(conversion);
        System.out.println(resultado);
    }
    
    public void centiKilo(double area){
        u.setArea(area);
        conversion = (0.0001 / 1000000) * u.getArea();
        resultado = String.valueOf(conversion);
        System.out.println(resultado);
    }
    
    public void centiMili(double area){
        u.setArea(area);
        conversion = ( u.getArea() * 100 )  ;
        resultado = String.valueOf(conversion);
        System.out.println(resultado);
    }
    
    public void centiMilla(double area){
        u.setArea(area);
        conversion = (u.getArea() /  3.8610215854245*10 )  ;
        resultado = String.valueOf(conversion);
        System.out.println(resultado);
    }
    
    public void centiPie(double area){
        
    }
    
    public void centiYar(double area){
        
    }
    
    
}
