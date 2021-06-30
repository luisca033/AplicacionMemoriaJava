package proyecto;

import java.util.ArrayList;

public class camisas extends inventario
    {
    double y;
    static ArrayList <camisas> z = new ArrayList();

    public camisas(String Color, double Precio, String Genero) {
        super(Color, Precio, Genero);
   
    }
     public camisas() {
        camisas c = new  camisas("Negro",25000,"Hombre");
        z.add(c);
        camisas c1= new camisas("Azul",35000,"Hombre");
        z.add(c1);
        camisas c2= new camisas("rojo",25000,"Hombre");
        z.add(c2);
        camisas cm= new camisas("Negro",25000,"Mujer");
        z.add(cm);
        camisas cm2= new camisas("Azul",35000,"Mujer");
        z.add(cm2);
        camisas cm3= new camisas("Rojo",40000,"Mujer");
        z.add(cm3);
    }
    public void imprima()
    {
    for(inventario z:z)
    { 
    {
    System.out.println(z.get_color()+z.get_precio()+z.get_genero()+z.get_can());
    
    }
    }
    }
    public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z.get(0).get_precio();
    
    case 1:
        y=z.get(1).get_precio();
    case 2:
        y=z.get(2).get_precio();
    case 3:
        y=z.get(3).get_precio();
    case 4:
        y=z.get(4).get_precio();
    case 5:
    y=z.get(2).get_precio();
    }
    return y;
    }
    /*public void inicializa()
    {
       camisas c = new  camisas("Negro",25000,"Hombre");
        z.add(c);
        
        camisas c1= new camisas("Azul",35000,"Hombre");
      z.add(c1);
        camisas c2= new camisas("rojo",25000,"Hombre");
   z.add(c2);
    }
*/
    
   
}

    
        
        
    
