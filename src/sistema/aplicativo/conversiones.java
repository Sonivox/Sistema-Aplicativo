package sistema.aplicativo;

public class conversiones {
    
    private double conversion;
    private String resultado;
    
    public String consumo(double distancia, double gas){
        conversion = (distancia / gas);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String costo(double gas, double dinero){
        conversion = (gas * dinero);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    public String otro(double dato, double dato1){
        conversion = (dato * dato1);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
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
        conversion = (area * 1e+10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String kiloMilla(double area){
        conversion = (area * 0.386102);
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
    public String KiJoulePielibra_fuerza(double energia){
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
        conversion= (energia/0.239006);
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
        conversion = (masa/0.004464429);
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
        conversion = (masa * 1000000);
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
    public String Kilometro_hMilla_h(double velocidad){
        conversion = (velocidad*0.621371);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Kilometro_hMetro_segundo(double velocidad){
        conversion = (velocidad*0.277778);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Kilometro_hNudos(double velocidad){
        conversion = (velocidad*0.539957);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Kilometro_hPie_segundo(double velocidad){
        conversion = (velocidad*0.911344);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //PARA MILLA HORA
    public String Milla_hKilometro_h(double velocidad){
        conversion = (velocidad/0.621371);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Milla_hMetro_segundo(double velocidad){
        conversion = (velocidad*0.44704);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Milla_hNudos(double velocidad){
        conversion = (velocidad*0.868976);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Milla_hPie_segundo(double velocidad){
        conversion = (velocidad*1.46667);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA METRO SEGUNDO
    public String Metro_segundoKilometro_h(double velocidad){
        conversion = (velocidad/0.277778);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Metro_segundoMilla_h(double velocidad){
        conversion = (velocidad/0.44704);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Metro_segundoNudos(double velocidad){
        conversion = (velocidad*1.94384);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Metro_segundoPie_segundo(double velocidad){
        conversion = (velocidad*3.28084);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA NUDOS
    public String NudosKilometro_h(double velocidad){
        conversion = (velocidad/0.539957);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String NudosMilla_h(double velocidad){
        conversion = (velocidad/0.868976);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String NudosMetro_segundo(double velocidad){
        conversion = (velocidad/1.94384);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String NudosPie_segundo(double velocidad){
        conversion = (velocidad*1.68781);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    //PARA PIE SEGUNDO
    public String Pie_segundoKilometro_h(double velocidad){
        conversion = (velocidad/0.911344);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Pie_segundoMilla_h(double velocidad){
        conversion = (velocidad/1.46667);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Pie_segundoMetro_segundo(double velocidad){
        conversion = (velocidad/3.28084);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String Pie_segundoNudos(double velocidad){
        conversion = (velocidad/1.68781);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    
    //PARA LAS UNIDADES DE TIEMPO
    //PARA SEGUNDOS
     public String SegundosMinuto(double tiempo){
        conversion = (tiempo/60);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SegundosHora(double tiempo){
        conversion = (tiempo*(1/3600));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SegundosDia(double tiempo){
        conversion = (tiempo*(1/(3600*24)));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public  String SegundosSemana(double tiempo){
        conversion = (tiempo*(1/(3600*168)));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //Minutos
    public String MinutosSegundos(double tiempo){
        conversion = (tiempo*60);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MinutosHora(double tiempo){
        conversion = (tiempo*(1/60));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MinutosDia(double tiempo){
        conversion = (tiempo*(1/1440));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String MinutosSemana(double tiempo){
        conversion = (tiempo*(1/(1440*7)));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String HoraSegundo(double tiempo){
        conversion = (tiempo*3600);
        resultado= String.valueOf(conversion);
        return resultado;
    }
     public String HoraMinuto(double tiempo){
        conversion = (tiempo*60);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String HoraDia(double tiempo){
        conversion = (tiempo/24);
        resultado= String.valueOf(conversion);
       return resultado;
    }
    public String HoraSemana(double tiempo){
        conversion = (tiempo*((1/24)*(1/7)));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String DiaSegundo(double tiempo){
        conversion = (tiempo*(24*60*60));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String DiaMinuto(double tiempo){
        conversion = (tiempo*(24*60));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String DiaHora(double tiempo){
        conversion = (tiempo*(24));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String DiaSemana(double tiempo){
        conversion = (tiempo/7);
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SemanaSegundo(double tiempo){
        conversion = (tiempo*(604800));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SemanaMinuto(double tiempo){
        conversion = (tiempo*(10080));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SemanaHora(double tiempo){
        conversion = (tiempo*(7*24));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    public String SemanaDia(double tiempo){
        conversion = (tiempo*(7));
        resultado= String.valueOf(conversion);
        return resultado;
    }
    
    //LONGITUD
    //Centimetro a otras unidads
    public String CentiKilome(double longitud){
        conversion= (longitud*0.00001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiMetro(double longitud){
        conversion= (longitud*0.01);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiMili(double longitud){
        conversion= (longitud*10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiMilla(double longitud){
        conversion= (longitud*0.0000062137);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiMillanautica(double longitud){
        conversion= (longitud*0.0000053996);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiPies(double longitud){
        conversion= (longitud*0.0328084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiPulgada(double longitud){
        conversion= (longitud*0.393701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String CentiYarda(double longitud){
        conversion= (longitud*0.0109361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Kilometro a otras unidades
     public String KilomeCenti(double longitud){
        conversion= (longitud/0.00001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomeMetro(double longitud){
        conversion= (longitud*1000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomeMili(double longitud){
        conversion= (longitud/0.000001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomeMilla(double longitud){
        conversion= (longitud*0.621371);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomeMillanautica(double longitud){
        conversion= (longitud*0.539957);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomePies(double longitud){
        conversion= (longitud*3280.84);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomePulgada(double longitud){
        conversion= (longitud*39370.1);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String KilomeYarda(double longitud){
        conversion= (longitud*1093.61);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Metros a otras unidades
    public String MetroCenti(double longitud){
        conversion= (longitud/0.01);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroKilome(double longitud){
        conversion= (longitud*0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroMili(double longitud){
        conversion= (longitud*1000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroMilla(double longitud){
        conversion= (longitud*0.000621371);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroMillanautica(double longitud){
        conversion= (longitud*0.000539957);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroPies(double longitud){
        conversion= (longitud*3.28084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroPulgada(double longitud){
        conversion= (longitud*39.3701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MetroYarda(double longitud){
        conversion= (longitud*1.09361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Milimetro a otras unidades
    public String MiliCenti(double longitud){
        conversion= (longitud/10);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliKilome(double longitud){
        conversion= (longitud*0.000001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliMetro(double longitud){
        conversion= (longitud/0.001);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliMilla(double longitud){
        conversion= (longitud*0.00000062137);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliMillanautica(double longitud){
        conversion= (longitud*0.00000053996);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliPies(double longitud){
        conversion= (longitud*0.00328084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliPulgada(double longitud){
        conversion= (longitud*0.00393701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MiliYarda(double longitud){
        conversion= (longitud*0.00109361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Milla a otras unidades
    public String MillaCenti(double longitud){
        conversion= (longitud/0.0000062137);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaKilome(double longitud){
        conversion= (longitud/0.62137);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaMetro(double longitud){
        conversion= (longitud/0.000621371);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaMili(double longitud){
        conversion= (longitud/0.00000062137);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaMillanautica(double longitud){
        conversion= (longitud*0.868976);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaPies(double longitud){
        conversion= (longitud*5280);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaPulgada(double longitud){
        conversion= (longitud*63360);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillaYarda(double longitud){
        conversion= (longitud*1760);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Milla nautica a otras
    public String MillanauticaCenti(double longitud){
        conversion= (longitud/0.00000539966);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaKilome(double longitud){
        conversion= (longitud/0.539957);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaMetro(double longitud){
        conversion= (longitud/0.000539957);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaMili(double longitud){
        conversion= (longitud/0.00000053996);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaMilla(double longitud){
        conversion= (longitud/0.868976);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaPie(double longitud){
        conversion= (longitud*6076.12);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaPulgada(double longitud){
        conversion= (longitud*72913.4);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String MillanauticaYarda(double longitud){
        conversion= (longitud*2025.37);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Pies a otras
    public String PiesCenti(double longitud){
        conversion= (longitud/0.0328084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesKilome(double longitud){
        conversion= (longitud/3280.84);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesMetro(double longitud){
        conversion= (longitud/3.28084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesMili(double longitud){
        conversion= (longitud/0.00328084);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesMilla(double longitud){
        conversion= (longitud/5280);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesMillanautica(double longitud){
        conversion= (longitud/6076.12);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesPulgada(double longitud){
        conversion= (longitud*2025.37);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PiesYarda(double longitud){
        conversion= (longitud*2025.37);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Pulgada a otras
    public String PulgadaCenti(double longitud){
        conversion= (longitud/0.393701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaKilome(double longitud){
        conversion= (longitud/39370.1);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaMetro(double longitud){
        conversion= (longitud/39.3701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaMili(double longitud){
        conversion= (longitud/0.00393701);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaMilla(double longitud){
        conversion= (longitud/633601);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaMillanautica(double longitud){
        conversion= (longitud/72913.4);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaPie(double longitud){
        conversion= (longitud/2025.37);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String PulgadaYarda(double longitud){
        conversion= (longitud*0.277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Yarda a otras unidades
    public String YardaCenti(double longitud){
        conversion= (longitud/0.0109361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaKilome(double longitud){
        conversion= (longitud/1093.61);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaMetro(double longitud){
        conversion= (longitud/1.09361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaMili(double longitud){
        conversion= (longitud/0.00109361);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaMilla(double longitud){
        conversion= (longitud/1760);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaMillanautica(double longitud){
        conversion= (longitud/1760);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaPies(double longitud){
        conversion= (longitud/2025.37);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String YardaPulgada(double longitud){
        conversion= (longitud/0.277778);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    
    //Temperatura
    //Centigrado
    public String CFaren(double temperatura){
        conversion=((temperatura*1.8)+(32));
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String Ckelvin(double temperatura){
        conversion=(temperatura+273.15);
        resultado=String.valueOf(conversion);
        return resultado;        
    }
    
    //Kelvin
    public String KCelcius(double temperatura){
        conversion=(temperatura-273.15);
        resultado=String.valueOf(conversion);
        return resultado;        
    }
    public String KFaren(double temperatura){
        conversion=(((temperatura-273.15)*(1.80))+32);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    
    //Fahrenheit
    public String FCelcius(double temperatura){
        conversion=((temperatura-32)/1.8);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String FKelvin(double temperatura){
        conversion=(((temperatura-32)/(1.80))+273.15);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    
    //Volumen
    //para litro
    public String LitroMili(double volumen){
        conversion=(volumen * 1000);
        resultado = String.valueOf(conversion);
        return resultado;
    }
    public String LitroMcubico(double volumen){
        conversion=(volumen / 1000);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String LitroPcubico(double volumen){
        conversion=(volumen *0.0353147);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String LitroPulcubica(double volumen){
        conversion=(volumen *61.0237);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String LitroGusa(double volumen){
        conversion=(volumen *0.264172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    //Para mililitro
    public String MiliLitro(double volumen){
        conversion=(volumen / 1000);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String MiliMcubico(double volumen){
        conversion=(volumen * 1e-6);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String MiliPcubico(double volumen){
        conversion=(volumen * 3.5315e-5);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String MiliPulcubica(double volumen){
        conversion=(volumen * 0.0610237);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String MiliGusa(double volumen){
        conversion=(volumen * 0.000264172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    //metro cubico
    
    public String McubicoLitro(double volumen){
        conversion=(volumen * 1000);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String McubicoMili(double volumen){
        conversion=(volumen / 1e-6);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String McubicoPcubico(double volumen){
        conversion=(volumen * 35.3147);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String McubicoPulcubica(double volumen){
        conversion=(volumen * 61023.7);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String McubicoGusa(double volumen){
        conversion=(volumen * 264.172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    
    //Para pie cubico
    public String PcubicoLitro(double volumen){
        conversion=(volumen /0.0353147);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PcubicoMili(double volumen){
        conversion=(volumen / 3.5315e-5);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PcubicoMcubico(double volumen){
        conversion=(volumen / 35.3147);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PcubicoPulcubica(double volumen){
        conversion=(volumen *1728);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PcubicoGusa(double volumen){
        conversion=(volumen *7.48052);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    //Para pulgada cubica
    public String PulcubicaLitro(double volumen){
        conversion=(volumen /61.0237);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PulcubicaMili(double volumen){
        conversion=(volumen / 0.0610237);
        resultado=String.valueOf(conversion);
        return resultado;
    }
     public String PulcubicaMcubico(double volumen){
        conversion=(volumen / 61023.7);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PulcubicaPcubico(double volumen){
        conversion=(volumen /1728);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String PulcubicaGusa(double volumen){
        conversion=(volumen *0.004329 );
        resultado=String.valueOf(conversion);
        return resultado;
    }
     
    //Galon EE.UU
    public String GusaLitro(double volumen){
        conversion=(volumen /0.264172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String GusaMili(double volumen){
        conversion=(volumen /0.000264172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String GusaMcubico(double volumen){
        conversion=(volumen / 264.172);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String GusaPcubico(double volumen){
        conversion=(volumen /7.48052);
        resultado=String.valueOf(conversion);
        return resultado;
    }
    public String GusaPulcubica(double volumen){
        conversion=(volumen /0.004329 );
        resultado=String.valueOf(conversion);
        return resultado;
    }
}