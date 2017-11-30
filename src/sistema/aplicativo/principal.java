package sistema.aplicativo;
public class principal {
    
    public static factory f;
    
    public static void main(String[] args) {
        
        f = new factory();
        
        menu menu = new menu();
        menu.setVisible(true);
    }
    
}
