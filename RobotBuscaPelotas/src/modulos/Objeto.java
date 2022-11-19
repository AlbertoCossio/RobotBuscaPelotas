package modulos;

public class Objeto {
    
    //VARIABLES.
    private boolean _activo;
    private int _coordX, _coordY;
    
    //Constructor por defecto.
    public Objeto ( ) {
        _activo = false;
    }
    
    //Cambia el estado de la bandera.
    public void setActivo ( boolean activo ) {
        _activo = activo;
    }
    
    //Regresa el estado de la bandera.
    public boolean getActivo ( ) {
        return _activo;
    }
    
    //Cambia las coordendas en X
    public void setCoordX ( int coordX ) {
        _coordX = coordX;
    }
    
    //Regresa la coordenada en X
    public int getCoordX ( ) {
        return _coordX;
    }
    
    //Cambia la coordenada en Y.
    public void setCoordY ( int coordY ) {
        _coordY = coordY;
    }
    
    //Regresa la coordenada en Y.
    public int getCoordY ( ) {
        return _coordY;
    }
}
