package proyecto;
import static proyecto.camisas.z;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static proyecto.Proyecto.z;

public class Catalogo extends javax.swing.JFrame {
 //static ArrayList<inventario> inv= new ArrayList();
  
 
 double cuenta=0;
 String direc, nombrerec;
 ArrayList<String> prendas= new ArrayList();
    public Catalogo() {
        initComponents();
        Proyecto.cargue();
        ImageIcon imagen= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/1.jpg");
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(ima1.getWidth(),ima1.getHeight(),Image.SCALE_DEFAULT));
        ima1.setIcon(icono);
        this.repaint();
        cargue();
        cargue2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ima1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        j1 = new javax.swing.JLabel();
        ima2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        j2 = new javax.swing.JLabel();
        ima6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        j6 = new javax.swing.JLabel();
        ima3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        j3 = new javax.swing.JLabel();
        ima5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        j5 = new javax.swing.JLabel();
        ima12 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        j12 = new javax.swing.JLabel();
        ima7 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        j7 = new javax.swing.JLabel();
        ima4 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        j4 = new javax.swing.JLabel();
        ima18 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        j18 = new javax.swing.JLabel();
        ima16 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        ima9 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        j20 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        j16 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        ima19 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        ima8 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        j19 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        j8 = new javax.swing.JLabel();
        ima11 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        ima17 = new javax.swing.JLabel();
        j17 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        ima13 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        j11 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        j13 = new javax.swing.JLabel();
        ima10 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        ima20 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        ima14 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        j14 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        j15 = new javax.swing.JLabel();
        ima15 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        ima21 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        j21 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        j24 = new javax.swing.JLabel();
        j23 = new javax.swing.JLabel();
        j22 = new javax.swing.JLabel();
        ima22 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        ima23 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        ima24 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        j27 = new javax.swing.JLabel();
        j26 = new javax.swing.JLabel();
        j25 = new javax.swing.JLabel();
        ima25 = new javax.swing.JLabel();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        ima26 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        ima27 = new javax.swing.JLabel();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        j30 = new javax.swing.JLabel();
        j29 = new javax.swing.JLabel();
        j28 = new javax.swing.JLabel();
        ima28 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        ima29 = new javax.swing.JLabel();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        ima30 = new javax.swing.JLabel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        ima31 = new javax.swing.JLabel();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        j31 = new javax.swing.JLabel();
        ima32 = new javax.swing.JLabel();
        j32 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        ima33 = new javax.swing.JLabel();
        j33 = new javax.swing.JLabel();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Catalogo");

        ima1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/1.jpg"))); // NOI18N
        ima1.setText("jLabel2");

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Devolucion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        j1.setText("jLabel3");
        j1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                j1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ima2.setText("jLabel2");

        jButton3.setText("Comprar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Devolucion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        j2.setText("jLabel3");

        ima6.setText("jLabel2");

        jButton5.setText("Comprar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Devolucion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        j6.setText("jLabel3");

        ima3.setText("jLabel2");

        jButton7.setText("Comprar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Devolucion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        j3.setText("jLabel3");

        ima5.setText("jLabel2");

        jButton9.setText("Comprar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Devolucion");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        j5.setText("jLabel3");

        ima12.setText("jLabel2");

        jButton11.setText("Comprar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Devolucion");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        j12.setText("jLabel3");

        ima7.setText("jLabel2");

        jButton13.setText("Comprar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Devolucion");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        j7.setText("jLabel3");

        ima4.setText("jLabel2");

        jButton15.setText("Comprar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Devolucion");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        j4.setText("jLabel3");

        ima18.setText("jLabel2");

        jButton17.setText("Comprar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Devolucion");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        j18.setText("jLabel3");

        ima16.setText("jLabel2");

        jButton19.setText("Devolucion");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        ima9.setText("jLabel2");

        jButton20.setText("Comprar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        j20.setText("jLabel3");

        jButton21.setText("Comprar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Devolucion");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Devolucion");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        j16.setText("jLabel3");

        j9.setText("jLabel3");

        ima19.setText("jLabel2");

        jButton24.setText("Comprar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        ima8.setText("jLabel2");

        jButton25.setText("Devolucion");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("Comprar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        j19.setText("jLabel3");

        jButton27.setText("Devolucion");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        j8.setText("jLabel3");

        ima11.setText("jLabel2");

        jButton28.setText("Comprar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Devolucion");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        ima17.setText("jLabel2");

        j17.setText("jLabel3");

        jButton30.setText("Comprar");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        ima13.setText("jLabel2");

        jButton31.setText("Comprar");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Devolucion");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        j11.setText("jLabel3");

        jButton33.setText("Devolucion");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        j13.setText("jLabel3");

        ima10.setText("jLabel2");

        jButton34.setText("Comprar");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("Devolucion");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        ima20.setText("jLabel2");

        j10.setText("jLabel3");

        jButton36.setText("Comprar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        ima14.setText("jLabel2");

        jButton37.setText("Comprar");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("Devolucion");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        j14.setText("jLabel3");

        jButton39.setText("Devolucion");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        j15.setText("jLabel3");

        ima15.setText("jLabel2");

        jButton40.setText("Comprar");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        ima21.setText("jLabel2");

        jButton41.setText("Comprar");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("Devolucion");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        j21.setText("jLabel3");

        jButton43.setText("Pedido");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        j24.setText("jLabel3");

        j23.setText("jLabel3");

        j22.setText("jLabel3");

        ima22.setText("jLabel2");

        jButton44.setText("Comprar");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setText("Devolucion");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        ima23.setText("jLabel2");

        jButton46.setText("Comprar");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setText("Devolucion");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        ima24.setText("jLabel2");

        jButton48.setText("Comprar");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setText("Devolucion");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        j27.setText("jLabel3");

        j26.setText("jLabel3");

        j25.setText("jLabel3");

        ima25.setText("jLabel2");

        jButton50.setText("Comprar");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setText("Devolucion");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        ima26.setText("jLabel2");

        jButton52.setText("Comprar");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setText("Devolucion");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        ima27.setText("jLabel2");

        jButton54.setText("Comprar");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("Devolucion");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        j30.setText("jLabel3");

        j29.setText("jLabel3");

        j28.setText("jLabel3");

        ima28.setText("jLabel2");

        jButton56.setText("Comprar");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setText("Devolucion");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        ima29.setText("jLabel2");

        jButton58.setText("Comprar");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setText("Devolucion");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        ima30.setText("jLabel2");

        jButton60.setText("Comprar");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setText("Devolucion");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        ima31.setText("jLabel2");

        jButton62.setText("Comprar");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setText("Devolucion");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        j31.setText("jLabel3");

        ima32.setText("jLabel2");

        j32.setText("jLabel3");

        jButton64.setText("Comprar");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setText("Devolucion");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        ima33.setText("jLabel2");

        j33.setText("jLabel3");

        jButton66.setText("Comprar");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setText("Devolucion");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(668, 668, 668)
                                        .addComponent(jButton22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(205, 205, 205)
                                                .addComponent(ima20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(j19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton24)
                                                    .addComponent(jButton25))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton19)
                                            .addComponent(jButton36))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(ima21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton41)
                                                    .addComponent(jButton18))))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(ima29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton59, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton58, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(j29, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(85, 85, 85)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(ima30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton60)
                                                    .addComponent(jButton61)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton42))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1)
                                                    .addComponent(jButton2)))
                                            .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton13)
                                                    .addComponent(jButton14))))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton3)
                                                            .addComponent(jButton4))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton7)
                                                            .addComponent(jButton8))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton15)
                                                            .addComponent(jButton16)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton26)
                                                            .addComponent(jButton27)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(ima14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton37)
                                                                .addComponent(jButton38)))
                                                        .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton21)
                                                            .addComponent(jButton23)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton39)
                                                            .addComponent(jButton40)))
                                                    .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton34)
                                                            .addComponent(jButton35)))
                                                    .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton20))
                                                    .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton45)
                                                            .addComponent(jButton44)))
                                                    .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton31)
                                            .addComponent(jButton33))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton9)
                                                            .addComponent(jButton10)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ima11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton28)
                                                            .addComponent(jButton32)))
                                                    .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(51, 51, 51)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton46)
                                                    .addComponent(jButton47)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton29)
                                                    .addComponent(jButton30))))))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(jButton6)))
                                    .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton11)
                                            .addComponent(jButton12)))
                                    .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton48)
                                            .addComponent(jButton49)))
                                    .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ima25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton50)
                                    .addComponent(jButton51)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton62)
                                            .addComponent(jButton63))))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton52)
                                            .addComponent(jButton53)))
                                    .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton64)
                                            .addComponent(jButton65)))
                                    .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j33, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima33, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton66)
                                            .addComponent(jButton67)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima27, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton54))
                                    .addComponent(j27, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jButton55)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton56)
                                            .addComponent(jButton57))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ima6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ima5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ima4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton28)
                                            .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(ima11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(20, 20, 20)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ima12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton12))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j12)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ima18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ima1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton27)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton23)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton35)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton33)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ima14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton38)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ima15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton39)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton22))
                                    .addComponent(ima16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(j16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton29))
                                    .addComponent(ima17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(j11)
                        .addGap(55, 55, 55)
                        .addComponent(jButton42)))
                .addGap(18, 18, 18)
                .addComponent(j17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ima19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton36)
                                                .addGap(14, 14, 14)
                                                .addComponent(jButton19))
                                            .addComponent(ima20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(j20))
                                    .addComponent(jButton41)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ima21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton18))
                                            .addComponent(ima22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton44)
                                                .addGap(14, 14, 14)
                                                .addComponent(jButton45)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j21))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(j22))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton46)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton47))
                                    .addComponent(ima23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jButton59)
                                .addGap(18, 18, 18)
                                .addComponent(j29)
                                .addGap(135, 135, 135))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j25))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ima26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton52)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton53)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j26))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton55))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(ima27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton54)
                                                        .addGap(29, 29, 29)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j27))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton51))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j28))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton57))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton60)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton61))
                                                    .addComponent(ima30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(j30)))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j31))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton62)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton63))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(j32))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton64)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton65))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ima33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(j33)
                                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton67))))
                                    .addComponent(ima29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ima24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j24)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void cuentasa(double a)
 {
     cuenta=cuenta+a;
 System.out.println(cuenta);
 }
    public void cargue2()
{  j1.setText(String.valueOf(Proyecto.z.get(0).obtengaval(0, 1)));
j2.setText(String.valueOf(Proyecto.z.get(0).obtengaval(1, 0)));
j3.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(1, 3)));
j4.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(0, 3)));
j5.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(1, 1)));
j6.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(2, 2)));
j7.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(0, 2)));
j8.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(3, 4)));
j9.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(4, 2)));
j10.setText(String.valueOf(Proyecto.z4.get(0).obtengaval(0, 0)));
j11.setText(String.valueOf(Proyecto.z4.get(0).obtengaval(1, 1)));
j12.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(2, 0)));
j13.setText(String.valueOf(Proyecto.z.get(0).obtengaval(0, 3)));
j14.setText(String.valueOf(Proyecto.z.get(0).obtengaval(1, 0)));
j15.setText(String.valueOf(Proyecto.z.get(0).obtengaval(2, 2)));
j16.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(0, 3)));
j17.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(1, 4)));
j18.setText(String.valueOf(Proyecto.z2.get(0).obtengaval(2, 5)));
j19.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(1, 3)));
j20.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(3, 4)));
j21.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(1, 5)));
j22.setText(String.valueOf(Proyecto.z4.get(0).obtengaval(4, 3)));
j23.setText(String.valueOf(Proyecto.z4.get(0).obtengaval(1, 4)));
j24.setText(String.valueOf(Proyecto.z4.get(0).obtengaval(2,5 )));
j25.setText(String.valueOf(Proyecto.z5.get(0).obtengaval(1, 0)));
j26.setText(String.valueOf(Proyecto.z5.get(0).obtengaval(2, 0)));
j27.setText(String.valueOf(Proyecto.z3.get(0).obtengaval(3, 4)));
j28.setText(String.valueOf(Proyecto.z6.get(0).obtengaval(2, 1)));
j29.setText(String.valueOf(Proyecto.z6.get(0).obtengaval(1, 1)));
j30.setText(String.valueOf(Proyecto.z6.get(0).obtengaval(2, 2)));
j31.setText(String.valueOf(Proyecto.z1.get(0).obtengaval(0, 0)));
j32.setText(String.valueOf(Proyecto.z1.get(0).obtengaval(1, 1)));
j33.setText(String.valueOf(Proyecto.z1.get(0).obtengaval(2, 2)));
    
}
    public void cargue()
{
ImageIcon imagen1= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/2.jpg");
        Icon icono=new ImageIcon(imagen1.getImage().getScaledInstance(ima2.getWidth(),ima2.getHeight(),Image.SCALE_DEFAULT));
        ima2.setIcon(icono);
        this.repaint();

        ImageIcon imagen2= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/3.jpg");
        Icon icono2=new ImageIcon(imagen2.getImage().getScaledInstance(ima3.getWidth(),ima3.getHeight(),Image.SCALE_DEFAULT));
        ima3.setIcon(icono2);
        this.repaint();
        
        ImageIcon imagen3= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/4.jpg");
        Icon icono3=new ImageIcon(imagen3.getImage().getScaledInstance(ima4.getWidth(),ima4.getHeight(),Image.SCALE_DEFAULT));
        ima4.setIcon(icono3);
        this.repaint();
        
        ImageIcon imagen4= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/5.jpg");
        Icon icono4=new ImageIcon(imagen4.getImage().getScaledInstance(ima5.getWidth(),ima5.getHeight(),Image.SCALE_DEFAULT));
        ima5.setIcon(icono4);
        this.repaint();
        
        ImageIcon imagen5= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/6.jpg");
        Icon icono6=new ImageIcon(imagen5.getImage().getScaledInstance(ima6.getWidth(),ima6.getHeight(),Image.SCALE_DEFAULT));
        ima6.setIcon(icono6);
        this.repaint();
        
        ImageIcon imagen6= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/7.jpg");
        Icon icono7=new ImageIcon(imagen6.getImage().getScaledInstance(ima7.getWidth(),ima7.getHeight(),Image.SCALE_DEFAULT));
        ima7.setIcon(icono7);
        this.repaint();
        
        ImageIcon imagen7= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/8.jpg");
        Icon icono8=new ImageIcon(imagen7.getImage().getScaledInstance(ima8.getWidth(),ima8.getHeight(),Image.SCALE_DEFAULT));
        ima8.setIcon(icono8);
        this.repaint();
        
        ImageIcon imagen8= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/9.jpg");
        Icon icono9=new ImageIcon(imagen8.getImage().getScaledInstance(ima9.getWidth(),ima9.getHeight(),Image.SCALE_DEFAULT));
        ima9.setIcon(icono9);
        this.repaint();
        
        ImageIcon imagen9= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/10.jpg");
        Icon icono10=new ImageIcon(imagen9.getImage().getScaledInstance(ima10.getWidth(),ima10.getHeight(),Image.SCALE_DEFAULT));
        ima10.setIcon(icono10);
        this.repaint();
        
        ImageIcon imagen10= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/11.jpg");
        Icon icono11=new ImageIcon(imagen10.getImage().getScaledInstance(ima11.getWidth(),ima11.getHeight(),Image.SCALE_DEFAULT));
        ima11.setIcon(icono11);
        this.repaint();
        
        ImageIcon imagen11= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/12.jpg");
        Icon icono12=new ImageIcon(imagen11.getImage().getScaledInstance(ima12.getWidth(),ima12.getHeight(),Image.SCALE_DEFAULT));
        ima12.setIcon(icono12);
        this.repaint();
        
        ImageIcon imagen12= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/13.jpg");
        Icon icono13=new ImageIcon(imagen12.getImage().getScaledInstance(ima13.getWidth(),ima13.getHeight(),Image.SCALE_DEFAULT));
        ima13.setIcon(icono13);
        this.repaint();
        
        ImageIcon imagen13= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/14.jpg");
        Icon icono14=new ImageIcon(imagen13.getImage().getScaledInstance(ima14.getWidth(),ima14.getHeight(),Image.SCALE_DEFAULT));
        ima14.setIcon(icono14);
        this.repaint();
        
        ImageIcon imagen14= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/15.jpg");
        Icon icono15=new ImageIcon(imagen14.getImage().getScaledInstance(ima15.getWidth(),ima15.getHeight(),Image.SCALE_DEFAULT));
        ima15.setIcon(icono15);
        this.repaint();
        
        ImageIcon imagen15= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/16.jpg");
        Icon icono16=new ImageIcon(imagen15.getImage().getScaledInstance(ima16.getWidth(),ima16.getHeight(),Image.SCALE_DEFAULT));
        ima16.setIcon(icono16);
        this.repaint();
        
        ImageIcon imagen16= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/17.jpg");
        Icon icono17=new ImageIcon(imagen16.getImage().getScaledInstance(ima17.getWidth(),ima17.getHeight(),Image.SCALE_DEFAULT));
        ima17.setIcon(icono17);
        this.repaint();
        
        ImageIcon imagen17= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/18.jpg");
        Icon icono18=new ImageIcon(imagen17.getImage().getScaledInstance(ima18.getWidth(),ima18.getHeight(),Image.SCALE_DEFAULT));
        ima18.setIcon(icono18);
        this.repaint();
        
        ImageIcon imagen18= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/19.jpg");
        Icon icono19=new ImageIcon(imagen18.getImage().getScaledInstance(ima19.getWidth(),ima19.getHeight(),Image.SCALE_DEFAULT));
        ima19.setIcon(icono19);
        this.repaint();
        
        ImageIcon imagen19= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/20.jpg");
        Icon icono20=new ImageIcon(imagen19.getImage().getScaledInstance(ima20.getWidth(),ima20.getHeight(),Image.SCALE_DEFAULT));
        ima20.setIcon(icono20);
        this.repaint();
        
        ImageIcon imagen20= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/21.jpg");
        Icon icono21=new ImageIcon(imagen20.getImage().getScaledInstance(ima21.getWidth(),ima21.getHeight(),Image.SCALE_DEFAULT));
        ima21.setIcon(icono21);
        this.repaint();
        
        ImageIcon imagen21= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/22.jpg");
        Icon icono22=new ImageIcon(imagen21.getImage().getScaledInstance(ima22.getWidth(),ima22.getHeight(),Image.SCALE_DEFAULT));
        ima22.setIcon(icono22);
        this.repaint();
        
        ImageIcon imagen22= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/23.jpg");
        Icon icono23=new ImageIcon(imagen22.getImage().getScaledInstance(ima23.getWidth(),ima23.getHeight(),Image.SCALE_DEFAULT));
        ima23.setIcon(icono23);
        this.repaint();
        
        ImageIcon imagen23= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/24.jpg");
        Icon icono24=new ImageIcon(imagen23.getImage().getScaledInstance(ima24.getWidth(),ima24.getHeight(),Image.SCALE_DEFAULT));
        ima24.setIcon(icono24);
        this.repaint();
        
        ImageIcon imagen24= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/25.jpg");
        Icon icono25=new ImageIcon(imagen24.getImage().getScaledInstance(ima25.getWidth(),ima25.getHeight(),Image.SCALE_DEFAULT));
        ima25.setIcon(icono25);
        this.repaint();
        
        ImageIcon imagen25= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/26.jpg");
        Icon icono26=new ImageIcon(imagen25.getImage().getScaledInstance(ima26.getWidth(),ima26.getHeight(),Image.SCALE_DEFAULT));
        ima26.setIcon(icono26);
        this.repaint();
        
        ImageIcon imagen26= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/27.jpg");
        Icon icono27=new ImageIcon(imagen26.getImage().getScaledInstance(ima27.getWidth(),ima27.getHeight(),Image.SCALE_DEFAULT));
        ima27.setIcon(icono27);
        this.repaint();
        
        ImageIcon imagen27= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/28.jpg");
        Icon icono28=new ImageIcon(imagen27.getImage().getScaledInstance(ima28.getWidth(),ima28.getHeight(),Image.SCALE_DEFAULT));
        ima28.setIcon(icono28);
        this.repaint();
        
        ImageIcon imagen28= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/29.jpg");
        Icon icono29=new ImageIcon(imagen28.getImage().getScaledInstance(ima29.getWidth(),ima29.getHeight(),Image.SCALE_DEFAULT));
        ima29.setIcon(icono29);
        this.repaint();
        
        ImageIcon imagen29= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/30.jpg");
        Icon icono30=new ImageIcon(imagen29.getImage().getScaledInstance(ima30.getWidth(),ima30.getHeight(),Image.SCALE_DEFAULT));
        ima30.setIcon(icono30);
        this.repaint();
        
        ImageIcon imagen30= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/31.jpg");
        Icon icono31=new ImageIcon(imagen30.getImage().getScaledInstance(ima31.getWidth(),ima31.getHeight(),Image.SCALE_DEFAULT));
        ima31.setIcon(icono31);
        this.repaint();
        
        ImageIcon imagen31= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/32.jpg");
        Icon icono32=new ImageIcon(imagen31.getImage().getScaledInstance(ima32.getWidth(),ima32.getHeight(),Image.SCALE_DEFAULT));
        ima32.setIcon(icono32);
        this.repaint();
        
        ImageIcon imagen32= new ImageIcon("C:\\Users\\Luis\\Desktop\\universidad\\10MO SEMESTRE\\programacion\\proyecto\\final_proyecto\\imagenes\\ropa/33.jpg");
        Icon icono33=new ImageIcon(imagen32.getImage().getScaledInstance(ima33.getWidth(),ima33.getHeight(),Image.SCALE_DEFAULT));
        ima33.setIcon(icono33);
        this.repaint();
}
    public void registre() throws IOException
    {
    System.out.println("Su pedido cuesta "+cuenta);
    if(cuenta >0){
    JOptionPane.showMessageDialog(null,"Su pedido cuesta "+cuenta);
    nombrerec=JOptionPane.showInputDialog(null,"Ingrese el nombre de la persona que va a recibir el producto");
    direc=JOptionPane.showInputDialog(null,"Ingrese su direccion");
    File archivo= new File(nombrerec+".txt");
       PrintWriter wr = new PrintWriter(archivo);
       BufferedWriter bw = null;
   try{
    FileWriter escribir=new FileWriter(archivo,true);
   wr.println(nombrerec+"\n");
   wr.println(direc+"\n");
   wr.println((int) cuenta+"\n");
   wr.close();
   bw.close();
   escribir.close();
   }

    catch (Exception e)
    {
    
    }
    }
    else{
    JOptionPane.showMessageDialog(null, "Aun tienes saldo "+" antes de continuar debes gastarlo");
}
    }
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
     try {
         registre();
     } catch (IOException ex) {
         Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(0, 2));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
cuentasa(-Proyecto.z.get(0).obtengaval(1, 0));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(0, 3));
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
cuentasa(-Proyecto.z1.get(0).obtengaval(1, 1));
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
cuentasa(Proyecto.z1.get(0).obtengaval(2, 2));    }//GEN-LAST:event_jButton66ActionPerformed

    private void j1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_j1AncestorAdded

    }//GEN-LAST:event_j1AncestorAdded

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(3, 4));
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
cuentasa(Proyecto.z.get(0).obtengaval(1, 0));    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(1, 3));    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cuentasa(Proyecto.z.get(0).obtengaval(0, 1));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(0, 3));
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(1, 1));     
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(2, 2));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(0, 2));    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(4, 2));    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
cuentasa(Proyecto.z4.get(0).obtengaval(0, 0));    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
cuentasa(Proyecto.z4.get(0).obtengaval(1, 1));    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(2, 0));    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
cuentasa(Proyecto.z.get(0).obtengaval(0, 3));    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
cuentasa( Proyecto.z.get(0).obtengaval(1, 0));    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
cuentasa(Proyecto.z.get(0).obtengaval(2, 2));    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(0, 3));    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(1, 4));    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
cuentasa(Proyecto.z2.get(0).obtengaval(2, 5));    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(1, 3));    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(3, 4));    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(1, 5));    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
cuentasa(Proyecto.z4.get(0).obtengaval(4, 3));    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
cuentasa(Proyecto.z4.get(0).obtengaval(1, 4));    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
cuentasa(Proyecto.z4.get(0).obtengaval(2,5 ));    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
cuentasa(Proyecto.z5.get(0).obtengaval(1, 0));    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
cuentasa(Proyecto.z5.get(0).obtengaval(2, 0));    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
cuentasa(Proyecto.z3.get(0).obtengaval(3, 4));    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
cuentasa(Proyecto.z6.get(0).obtengaval(2, 1));    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
cuentasa(Proyecto.z6.get(0).obtengaval(1, 1));    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
cuentasa(Proyecto.z6.get(0).obtengaval(2, 2));    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
cuentasa(Proyecto.z1.get(0).obtengaval(0, 0));    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
cuentasa(Proyecto.z1.get(0).obtengaval(1, 1));    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
cuentasa(-Proyecto.z.get(0).obtengaval(0, 1));       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(1, 3));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(0, 3));
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(1, 1));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(2, 2));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(3, 4));
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(4, 2));
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
cuentasa(-Proyecto.z4.get(0).obtengaval(0, 0));
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
cuentasa(-Proyecto.z4.get(0).obtengaval(1, 1));
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(2, 0));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
cuentasa(-Proyecto.z.get(0).obtengaval(0, 3));
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
cuentasa(- Proyecto.z.get(0).obtengaval(1, 0));
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
cuentasa(-Proyecto.z.get(0).obtengaval(2, 2));
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(1, 4));
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
cuentasa(-Proyecto.z2.get(0).obtengaval(2, 5));
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(1, 3));
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(3, 4));
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(1, 5));
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
cuentasa(-Proyecto.z4.get(0).obtengaval(4, 3));
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
cuentasa(-Proyecto.z4.get(0).obtengaval(1, 4));
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
cuentasa(-Proyecto.z4.get(0).obtengaval(2,5 ));
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
cuentasa(-Proyecto.z5.get(0).obtengaval(1, 0));
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
cuentasa(-Proyecto.z5.get(0).obtengaval(2, 0));
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
cuentasa(-Proyecto.z3.get(0).obtengaval(3, 4));
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
cuentasa(-Proyecto.z6.get(0).obtengaval(2, 1));
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
cuentasa(-Proyecto.z6.get(0).obtengaval(1, 1));
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
cuentasa(-Proyecto.z6.get(0).obtengaval(2, 2));
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
cuentasa(-Proyecto.z1.get(0).obtengaval(0, 0));
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
cuentasa(-Proyecto.z1.get(0).obtengaval(2, 2));
    }//GEN-LAST:event_jButton67ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ima1;
    private javax.swing.JLabel ima10;
    private javax.swing.JLabel ima11;
    private javax.swing.JLabel ima12;
    private javax.swing.JLabel ima13;
    private javax.swing.JLabel ima14;
    private javax.swing.JLabel ima15;
    private javax.swing.JLabel ima16;
    private javax.swing.JLabel ima17;
    private javax.swing.JLabel ima18;
    private javax.swing.JLabel ima19;
    private javax.swing.JLabel ima2;
    private javax.swing.JLabel ima20;
    private javax.swing.JLabel ima21;
    private javax.swing.JLabel ima22;
    private javax.swing.JLabel ima23;
    private javax.swing.JLabel ima24;
    private javax.swing.JLabel ima25;
    private javax.swing.JLabel ima26;
    private javax.swing.JLabel ima27;
    private javax.swing.JLabel ima28;
    private javax.swing.JLabel ima29;
    private javax.swing.JLabel ima3;
    private javax.swing.JLabel ima30;
    private javax.swing.JLabel ima31;
    private javax.swing.JLabel ima32;
    private javax.swing.JLabel ima33;
    private javax.swing.JLabel ima4;
    private javax.swing.JLabel ima5;
    private javax.swing.JLabel ima6;
    private javax.swing.JLabel ima7;
    private javax.swing.JLabel ima8;
    private javax.swing.JLabel ima9;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j13;
    private javax.swing.JLabel j14;
    private javax.swing.JLabel j15;
    private javax.swing.JLabel j16;
    private javax.swing.JLabel j17;
    private javax.swing.JLabel j18;
    private javax.swing.JLabel j19;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j20;
    private javax.swing.JLabel j21;
    private javax.swing.JLabel j22;
    private javax.swing.JLabel j23;
    private javax.swing.JLabel j24;
    private javax.swing.JLabel j25;
    private javax.swing.JLabel j26;
    private javax.swing.JLabel j27;
    private javax.swing.JLabel j28;
    private javax.swing.JLabel j29;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j30;
    private javax.swing.JLabel j31;
    private javax.swing.JLabel j32;
    private javax.swing.JLabel j33;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private double IntegerParseIn(double Precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
