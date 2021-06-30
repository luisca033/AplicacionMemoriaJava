package proyecto;

import java.util.ArrayList;

public class blusas extends inventario
{
    static ArrayList<blusas>z1= new ArrayList();
    public blusas(String Color, double Precio, String Material) {
        super(Color, Precio, Material);
    }
public blusas()
{
        blusas bl1= new blusas("Negro",50000,"Lino");
        z1.add(bl1);
        blusas bl2= new blusas("Rojo",80000,"Algodon");
        z1.add(bl2);
        blusas bl3= new blusas("Azul",60000,"Poliester");
        z1.add(bl3);
}   
   public void imprima()
    {
        for(inventario z1:z1)
        { 
            {
            System.out.println(z1.get_color()+z1.get_genero()+z1.get_precio()+z1.get_can());

            }
        }
    }
  public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z1.get(0).get_precio();
    
    case 1:
        y=z1.get(1).get_precio();
    case 2:
        y=z1.get(2).get_precio();
    case 3:
        y=z1.get(3).get_precio();
    case 4:
        y=z1.get(4).get_precio();
    case 5:
    y=z1.get(2).get_precio();
    }
    return y;
    }
}
