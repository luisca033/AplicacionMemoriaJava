package proyecto;

import java.util.ArrayList;

public class vestidos extends inventario{
static ArrayList <vestidos> z6 = new ArrayList();

    public vestidos(String Color, double Precio, String Material) {
        super(Color, Precio, Material);
    }

    public vestidos() 
    {
    vestidos ves1= new vestidos("Azul",100000,"Algodon Licrado");
    z6.add(ves1);
    vestidos ves2= new vestidos("Negro",100000,"Poliester");
    z6.add(ves2);
    vestidos ves3= new vestidos("Rosado",100000,"Dril");
    z6.add(ves3);

    }
     public void imprima()
     {
     for(inventario z6:z6)
     {
     System.out.println(z6.get_can()+z6.get_color()+z6.get_precio());
     }
     }
public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z6.get(0).get_precio();
    
    case 1:
        y=z6.get(1).get_precio();
    case 2:
        y=z6.get(2).get_precio();
    case 3:
        y=z6.get(3).get_precio();
    case 4:
        y=z6.get(4).get_precio();
    case 5:
    y=z6.get(2).get_precio();
    }
    return y;
    }
}
