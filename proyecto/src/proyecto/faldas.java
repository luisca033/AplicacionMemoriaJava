package proyecto;

import java.util.ArrayList;

public class faldas extends inventario
{
static ArrayList <faldas> z5 = new ArrayList();
    public faldas(String Color, double Precio, String Material) {
        super(Color, Precio, Material);
    }

    public faldas() {
        faldas fal1= new faldas("Azul",50000,"Dril");
        z5.add(fal1);
        faldas fal2= new faldas("Negro",50000,"Pana");
        z5.add(fal2);
        faldas fal3= new faldas("Blanca",50000,"Paño");
        z5.add(fal3);

    }
public void imprima()
{
for (inventario z5:z5)
{
System.out.println(z5.get_can()+z5.get_color()+z5.get_precio());
}
}
public double precios(int x)
    {
    switch (x)
    {
        case 0:
            y=z5.get(0).get_precio();
    
    case 1:
        y=z5.get(1).get_precio();
    case 2:
        y=z5.get(2).get_precio();
    case 3:
        y=z5.get(3).get_precio();
    case 4:
        y=z5.get(4).get_precio();
    case 5:
    y=z5.get(2).get_precio();
    }
    return y;
    }        
}
