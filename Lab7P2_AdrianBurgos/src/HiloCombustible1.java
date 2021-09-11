import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloCombustible1 extends Thread{
    private JProgressBar combustible;
    private JProgressBar reservas;
    
    private int combustiblekl;
    private int distancia;
    private int tanque;
    private int reserva;

    public HiloCombustible1(JProgressBar combustible, JProgressBar reservas, int combustiblekl, int distancia, int tanque, int reserva) {
        this.combustible = combustible;
        this.reservas = reservas;
        this.combustiblekl = combustiblekl;
        this.distancia = distancia;
        this.tanque = tanque;
        this.reserva = reserva;
    }
    
    @Override
    public void run() {
        int i = 0;
        boolean flag = true;
        boolean flag2 = false;
        combustible.setMaximum(tanque);
        while (flag) {
            if (distancia < 0) {
                flag = false;
                flag2 = true;
            }
            else if (tanque < 0) {
                flag = false;
                flag2 = false;
            }
            distancia--;
            System.out.println(distancia);
            i++;
            if (i == combustiblekl) {
                tanque--;
                System.out.println(tanque);
                i = 0;
            }
            combustible.setValue(tanque);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        if (flag2) {
            JOptionPane.showMessageDialog(combustible, "Mision completada con exito");
        }
        else {
            String opcion = JOptionPane.showInputDialog("Tanque Principal agotado\nDesea utilizar las reservas?[Si/No]");
            if (opcion.equalsIgnoreCase("Si")) {
                reservas.setMaximum(reserva);
                flag = true;
                flag2 = false;
                while (flag) {
                    if (distancia < 0) {
                        flag = false;
                        flag2 = true;
                    } else if (reserva < 0) {
                        flag = false;
                        flag2 = false;
                    }
                    distancia--;
                    System.out.println(distancia);
                    i++;
                    if (i == combustiblekl) {
                        reserva--;
                        System.out.println(reserva);
                        i = 0;
                    }
                    combustible.setValue(reserva);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                    }
                }
                if (flag2) {
                    JOptionPane.showMessageDialog(combustible, "Mision completada con exito");
                }
                else JOptionPane.showMessageDialog(reservas, "Mision Fallida");
            }
            else JOptionPane.showMessageDialog(reservas, "Mision Fallida");
        }
    }
}
