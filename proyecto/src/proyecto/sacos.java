package proyecto;

import java.util.ArrayList;

public class sacos extends inventario 
{
static ArrayList <sacos> z4 = new ArrayList();
    public sacos(String Color, double Precio, String Genero, String Material) {
        super(Color, Precio, Genero, Material);
    }
    
     /*
*/

    public sacos() {
        
    sacos sac1h= new sacos("Azul",40000,"Hombre","Hilo");
    z4.add(sac1h);
    sacos sac2h= new sacos("Negro",40000,"Hombre","Lana");
    z4.add(sac2h);
    sacos sac3h= new sacos("Blanco",40000,"Hombre","Algodon");
    z4.add(sac3h);
    sacos sac1m= new sacos("Azul",40000,"Mujer","Hilo");
    z4.add(sac1m);
    sacos sac2m= new sacos("Negro",40000,"Mujer","Lana");
    z4.add(sac2m);
    sacos sac3m= new sacos("Blanco",40000,"Mujer","Algodon");
    z4.add(sac3m);
    }
    public void imprima()
    {
    for(inventario z4:z4)
    {
    System.out.println(z4.get_can()+z4.get_color()+z4.get_precio()+z4.get_genero());
    }
    }
    public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z4.get(0).get_precio();
    
    case 1:
        y=z4.get(1).get_precio();
    case 2:
        y=z4.get(2).get_precio();
    case 3:
        y=z4.get(3).get_precio();
    case 4:
        y=z4.get(4).get_precio();
    case 5:
    y=z4.get(2).get_precio();
    }
    return y;
    }
}
