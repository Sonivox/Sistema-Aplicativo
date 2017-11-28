package sistema.aplicativo;

public class conversiones {
    
    unidades u = new unidades();
    private double conversion;
    private String resultado;
    double area;
    
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
    
    
    // PARA TODAS LAS UNIDADES DE ENERGIA
    //PARA LOS JULIOS
    public String JulioKiJoule(double energia){
        conversion= (energia *0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String JulioVatio_h(double energia){
        conversion= (energia*0.000277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String JulioKilovatio_h(double energia){
        conversion= (energia*0.000000277);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String JulioKilocalo(double energia){
        conversion= (energia*0.000239006);
        resultado = String.valueOf(conversion);
        return resultado;
    }
     public String JulioPielibra_fuerza(double energia){
        conversion= (energia*0.737562);
        resultado = String.valueOf(conversion);
        return resultado;
    }
     
    //Conversion de Kilojoules
    public String KiJouleJulio(double energia){
        conversion= ( energia /0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiJouleVatio_h(double energia){
        conversion= (energia*0.277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiJouleKilovatios_h(double energia){
        conversion= (energia *0.000277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiJouleKilocalo(double energia){
        conversion= (energia*0.239006);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiloJoulePielibra_fuerza(double energia){
        conversion= (energia*737.562);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Conversion e vatios hora a las otras unidades
    public String vatio_hJulio(double energia){
        conversion= (energia/0.000277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String vatio_hKiJoule(double energia){
        conversion= (energia/0.277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String vatio_hKilovartios_h(double energia){
        conversion= (energia*0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String vatio_hKiolocalo(double energia){
        conversion= (energia*0.860421);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String vatio_hPielibra_fuerza(double energia){
        conversion= (energia*2655.22);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Concersion de Kilovatios hora a las otras unidades
    public String Kilovatio_hJulio(double energia){
        conversion= ( energia /0.000000277);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Kilovatio_hKiloJoule(double energia){
        conversion= (energia /0.000277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Kilovatio_hvatio_h(double energia){
        conversion= (energia/0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Kilovatio_hKilocalo(double energia){
        conversion= (energia * 860.421);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Kilovatio_hPielibra_fuerza(double energia){
        conversion= (energia * 0.000002655);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Conversion de Kilocalorias a las otras unidades
    public String KiloCaloJulio(double energia){
        conversion= (energia/0.000239006);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiloCaloKiloJoule(double energia){
        conversion= (u.getEnergia()/0.239006);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiloCalovatio_h(double energia){
        conversion= (energia/0.860421);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiloCaloKilovatio_h(double energia){
        conversion= (energia/860.421);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KiloCaloPielibra_fuerza(double energia){
        conversion= (energia*3085.96);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Conversion de Pielibra-fuerza a las otras unidades
    public String Pielibra_fuerzaJulio(double energia){
        conversion= (energia/0.737562);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Pielibra_fuerzaKiloJoule(double energia){
        conversion= (energia/737.562);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Pielibra_fuerzavatio_h(double energia){
        conversion= (energia/2655.22);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Pielibra_fuerzaKilovatios_h(double energia){
        conversion= (energia/0.000002655);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String Pielibra_fuerzaKiloCalo(double energia){
        conversion= (energia/3085.963);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //PARA TODAS LAS UNIDADES DE PRESION
    //PARA mmHG
    public String mmHGAtmosfera(double presion){
        conversion = (presion *0.01316);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String mmHGBaros(double presion){
        conversion = (presion*0.001333);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String mmHGPascales(double presion){
        conversion = (presion*133.315558);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS ATOMOSFERAS
     public String AtmosferammHG(double presion){
        conversion = (presion/0.01316);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String AtmosferaBaros(double presion){
        conversion = (presion*1.013333);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String AtmosferaPascales(double presion){
        conversion = ( presion*101319.824023);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LOS BAROS
    public String BarosmmHG(double presion){
        conversion = (presion/0.001333);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String BarosAtmosfera(double presion){
        conversion = (presion/1.013333);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String BarosPascales(double presion){
        conversion = (presion*99986.668444);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA LOS PASCALES
    public String PascalesmmHG(double presion){
        conversion = (presion/133.315558);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String PascalesAtmosfera(double presion){
        conversion = (presion/101319.824023);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String PascalesBaros(double presion){
        conversion = (presion/101319.824023);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS UNIDADES DE MASA
    //PARA LOS GRAMOS
    public String GramosKilogra(double masa){
        conversion = (masa*0.01);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String GramosLibra(double masa){
        conversion = (masa*0.0220492);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String GramosMiligra(double masa){
        conversion = (masa*1000);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String GramosOnza(double masa){
        conversion = (masa *0.035274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String GramosStone(double masa){
        conversion = (masa*0.000157473);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String GramosTonelada(double masa){
        conversion = (masa*0.000001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LOS KILOGRAMOS
    public String KilograGramos(double masa){
        conversion = (masa/0.001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String KilograLibra(double masa){
        conversion = (masa*2.20462);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String KilograMiligramo(double masa){
        conversion = (masa/0.000001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String KilograOnza(double masa){
        conversion = (masa*35.274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String KilograStone(double masa){
        conversion = (masa*0.157473);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String KilograTonelada(double masa){
        conversion = (masa*0.001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS LIBRAS
    public String LibraGramos(double masa){
        conversion = (masa/0.0220492);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String LibraKilogra(double masa){
        conversion = (masa/2.20462);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String LibraMiligra(double masa){
        conversion = (masa*453592);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String LibraOnza(double masa){
        conversion = (masa*16);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String LibraStone(double masa){
        conversion = (masa*0.0714286);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String LibraTonelada(double masa){
        conversion = (masa*0.000453592);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LOS MILIGRAMOS
    public String MiligraGramo(double masa){
        conversion = (masa/1000);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MiligraKilogra(double masa){
        conversion = (masa*0.000001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MiligraLibra(double masa){
        conversion = (masa/453592);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MiligraOnza(double masa){
        conversion = (masa*0.000035274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MiligraStone(double masa){
        conversion = (masa*0.00000015747);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MiligraTonelada(double masa){
        conversion = (masa *0.000000001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA LAS ONZAS
    public String OnzaGramo(double masa){
        conversion = (masa/0.035274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String OnzaKilogra(double masa){
        conversion = (masa/35.274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String OnzaLibra(double masa){
        conversion = (masa/16);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String OnzaMiligra(double masa){
        conversion = (masa/0.000035274);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String OnzaStone(double masa){
        conversion = (masa*0.00446429);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String OnzaTonelada(double masa){
        conversion = (masa*0.00002835);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA LOS STONE
    public String StoneGramo(double masa){
        conversion = (masa/0.000157473);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String StoneKilogra(double masa){
        conversion = (masa/0.157473);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String StoneLibra(double masa){
        conversion = (masa/0.071486);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String StoneMiligra(double masa){
        conversion = (masa/0.00000015747);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String StoneOnza(double masa){
        conversion = (u.getMasa()/0.004464429);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String StoneTonelada(double masa){
        conversion = (masa*0.00635029);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA LAS TONELADAS
    public String ToneladaGramo(double masa){
        conversion = (masa *0.00635029);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String ToneladaKilogra(double masa){
        conversion = (masa/0.001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String ToneladaLibra(double masa){
        conversion = (masa/0.000453592);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String ToneladaMiligra(double masa){
        conversion = (masa/0.000000001);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String ToneladaOnza(double masa){
        conversion = (masa/0.00002835);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String ToneladaStone(double masa){
        conversion = (masa/0.00635029);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA LAS UNIDADES DE VELOCIDAD
    //PARA KILOMERTROS HORA
    public void Kilometro_hMilla_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.621371);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Kilometro_hMetro_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.277778);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Kilometro_hNudos(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.539957);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Kilometro_hPie_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.911344);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    //PARA MILLA HORA
    public void Milla_hKilometro_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.621371);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Milla_hMetro_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.44704);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Milla_hNudos(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*0.868976);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Milla_hPie_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*1.46667);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    //PARA METRO SEGUNDO
    public void Metro_segundoKilometro_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.277778);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Metro_segundoMilla_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.44704);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Metro_segundoNudos(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*1.94384);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Metro_segundoPie_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*3.28084);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    //PARA NUDOS
    public void NudosKilometro_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.539957);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void NudosMilla_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.868976);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void NudosMetro_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/1.94384);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void NudosPie_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()*1.68781);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    //PARA PIE SEGUNDO
    public void Pie_segundoKilometro_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/0.911344);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Pie_segundoMilla_h(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/1.46667);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Pie_segundoMetro_segundo(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/3.28084);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
    public void Pie_segundoNudos(double velocidad){
        u.setVelocidad(velocidad);
        conversion = (u.getVelocidad()/1.68781);
        resultado= String.valueOf(conversion);
        System.out.println(resultado);
    }
}
