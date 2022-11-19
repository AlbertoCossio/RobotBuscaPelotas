package modulos;

import modulos.Objeto;
import java.util.Random;

public class Robot {
    
    //Constantes que permiten ubicar el estado del robot.
    public static int BUSQUEDA       = 0;
    public static int NUEVA_BUSQUEDA = 1;
    public static int IR_POR_BATERIA = 2;
    public static int RECARGAR       = 3;
    public static int APAGAR_SISTEMA = 4;
    public static int AL_AZAR        = 5;
    
    //Variables.
    private int _estado;
    private int _coordX, _coordY;
    private Objeto [ ] _objetos;
    private Objeto _bateria;
    private int _indice;
    private int _energia;
    
    //constructor por defecto.
    public Robot ( ) {
        _estado = NUEVA_BUSQUEDA; //Inicialización del estado base.
        _coordX = 13;             //Inicialización de la coordenada en X
        _coordY = 13;             //Inicialización de la coordenada en Y.
        _indice = -1;             //Inicialización del indice.
        _energia = 100;           //Inicialización de la energía.
    }
    
    //Método para obtener el estado del ROBOT.
    public int getEstado ( ) {
        return _estado;
    }
    
    //Mñétodo para obtener la energía del robto.
    public int getEnergia ( ) {
        return _energia;
    }
    
    //Método para obtener la coordenada en X
    public int getCoordX ( ) {
        return _coordX;
    }
    
    //Método para obtener la coordenada en Y.
    public int getCoordY ( ) {
        return _coordY;
    }
    
    //Inicializa los objetos del ROBOT,
    public void inicializaSistema ( Objeto [ ] objetos, Objeto bateria ) {
        _objetos = objetos;
        _bateria = bateria;
    }
    
    //Método que ocntrolará al robot en ejecución.
    public void control ( ) {
        switch ( _estado ) { //Switch para ver el estado en el que se encuentra.
            case 0:
                busqueda ( ); //Llamda al método de buscar.
                
                //Si el robot esta en la posición de la pelota.
                if ( _coordX == _objetos [ _indice ].getCoordX ( ) &&
                        _coordY == _objetos [ _indice ].getCoordY ( ) ) {
                    _objetos [ _indice ].setActivo ( false );
                    _estado = NUEVA_BUSQUEDA; //el estado cambia a NUEVA_BUSQUEDA.
                } else {
                    if ( _energia < 45 ) //Si la bateria se encuentra por debajo de 45.
                        _estado = IR_POR_BATERIA; //Se cambia el estado a IR_POR_BATERIA.
                }
                break;
                
            case 1: 
                nuevaBusqueda ( ); //Llamada al método nueva busqueda.
                
                //Si el indice es igual a -1.
                if ( _indice == -1 )
                    _estado = AL_AZAR; //El robot debe moverse al azar.
                else
                    _estado = BUSQUEDA; //En caso contrario se realiza la busqueda.
                break;
                
            case 2:
                irPorBateria ( );
                
                //Si el robot se encuentra en la posición de la bateria.
                if ( _coordX == _bateria.getCoordX ( ) &&
                        _coordY == _bateria.getCoordY ( ) )
                    _estado = RECARGAR; //La batería se carga-
                if ( _energia == 0) //Si la energía es 0.
                    _estado = APAGAR_SISTEMA; //El ROBOT muere.
                break;
                
            case 3:
                recargar ( );
                
                _estado = BUSQUEDA;
                break;
                
            case 4:
                apagarSistema ( );
                break;
                
            case 5:
                alAzar ( );
                
                if ( _energia == 0 )
                    _estado = APAGAR_SISTEMA;
        }
    }
    
    //--------------------------------------------------------------------------
    
    //Método de busqueda de pelotas.
    public void busqueda ( ) {
        if ( _coordX < _objetos [ _indice ].getCoordX ( ) )
            _coordX+=50;
        else if ( _coordX > _objetos [ _indice ].getCoordX ( ) )
            _coordX-=50;
        
        else if ( _coordY < _objetos [ _indice ].getCoordY ( ) )
            _coordY+=50;
        else if ( _coordY > _objetos [ _indice ].getCoordY ( ) )
            _coordY-=50;
        
        _energia-=4; //La energía disminuya.
    }
    
    //--------------------------------------------------------------------------
    
    //Método que ve si hay más pelotas para buscar.
    public void nuevaBusqueda ( ) {
        _indice = -1;
        
        //Si el indice es diferente a menos uno.
        for ( int i = 0; i < _objetos.length; i++ )
            if ( _objetos [ i ].getActivo ( ) ) //Y el estado es verdadero.
                _indice = i; //Entonces hay un nuevo objeto por buscar.
    }
    
    //--------------------------------------------------------------------------
    
    //Método que va en busca de la batería para recargar.
    public void irPorBateria ( ) {
        if ( _coordX < _bateria.getCoordX ( ) )
            _coordX+=50;
        else if ( _coordX > _bateria.getCoordX ( ) )
            _coordX-=50;
        
        else if ( _coordY < _bateria.getCoordY ( ) )
            _coordY+=50;
        else if ( _coordY > _bateria.getCoordY ( ) )
            _coordY-=50;
        
        _energia-=4;
    }
    
    //--------------------------------------------------------------------------
    
    //Método que recarga la bateria.
    public void recargar ( ) {
        _energia = 100;        
    }
    
    //--------------------------------------------------------------------------
    
    //Método que mata al ROBOT.
    public void apagarSistema ( ) {
        
    }
    
    //--------------------------------------------------------------------------
    
    //Método que permite que el robot se mueva al azar hasta morir.
    public void alAzar ( ) {
        Random r = new Random ( );
        int c = r.nextInt ( 4 ) - 1;
        
        if ( c == 0 && _coordX < 450 )
            _coordX+=50;
        else if ( c == 1 && _coordX > 50 )
            _coordX-=50;
        else if ( c == 2 && _coordY < 450 )
            _coordY+=50;
        else if ( c == 3 && _coordY > 50)
            _coordY-=50;
        
        _energia-=4;
    }
}
