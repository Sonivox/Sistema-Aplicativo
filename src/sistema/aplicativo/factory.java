package sistema.aplicativo;

public class factory extends conversiones{
    
    public unidades unidades(){
        return new unidades();
    }
    public conversiones conversiones(){
        return new conversiones();
    }
    public area are(){
        return new area();
    }
    public energia energia(){
        return new energia();
    }
    public presion presion(){
        return new presion();
    }
    public masa masa(){
        return new masa();
    }
    public temperatura temperatura(){
        return new temperatura();
    }
    public tiempo tiempo(){
        return new tiempo();
    }
    public longitud longitud(){
        return new longitud();
    }
    public velocidad velocidad(){
        return new velocidad();
    }
    public volumen volumen(){
        return new volumen();
    }
    public combustible combustible(){
        return new combustible();
    }
    public otro otro(){
        return new otro();
    }
}
