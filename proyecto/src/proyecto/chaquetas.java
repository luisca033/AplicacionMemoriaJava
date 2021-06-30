package proyecto;

import java.util.ArrayList;
import static proyecto.blusas.z1;

public class chaquetas extends inventario
{
static ArrayList <chaquetas> z2 = new ArrayList();
    public chaquetas(String Color, double Precio, String Genero, String Material) {
        super(Color, Precio, Genero, Material);
    }
    public chaquetas()
    {
        chaquetas ch1h= new chaquetas("Negro",50000,"Hombre","Cuero");
        z2.add(ch1h);
        chaquetas ch2h= new chaquetas("Verde",30000,"Hombre","Deportivo");
        z2.add(ch2h);
        chaquetas ch3h= new chaquetas("Cafe",60000,"Hombre","Jean");
        z2.add(ch3h);
        chaquetas ch1m= new chaquetas("Negro",50000,"Mujer","Cuero");
        z2.add(ch1m);
        chaquetas ch2m= new chaquetas("Verde",30000,"Mujer","Algodon");
        z2.add(ch2m);
        chaquetas ch3m= new chaquetas("Cafe",60000,"Mujer","Jean");
        z2.add(ch3m);
  
    }
public void imprima(){
 for(inventario z2:z2)
    { 
    {
    System.out.println(z2.get_can()+z2.get_color()+z2.get_precio()+z2.get_genero());
    
    }
    }
}

public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z2.get(0).get_precio();
    
    case 1:
        y=z2.get(1).get_precio();
    case 2:
        y=z2.get(2).get_precio();
    case 3:
        y=z2.get(3).get_precio();
    case 4:
        y=z2.get(4).get_precio();
    case 5:
    y=z2.get(2).get_precio();
    }
    return y;
    }
}
/*        public String get_color() {
       return this.Color;
                                    }
        public String get_genero() {
       return this.Genero;
                                    }
         public double get_precio()
                {
            return this.Precio;
                }
         public String get_material()
         {
         return this.Material;
         }
*/
    
        

