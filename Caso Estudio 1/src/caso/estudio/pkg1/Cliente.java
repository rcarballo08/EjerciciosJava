package caso.estudio.pkg1;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Cliente {
    
    public String nombre, cedula, mes, año, estado;
    public int Mfactura, Nfactura, monto, montoT; // Mfactura significa Monto de la factura, Nfactura significa Numero de la factura y montoT significa el monto total
    
    public Cliente() {
    
    }
    
    public void agregarC() {
        
        int con = 0;
        while (con != 2) {
            con = Integer.parseInt(JOptionPane.showInputDialog("1- agregar otra factura 2-  dejar de agregar  facturas"));
            switch (con){
                case 1:
                    setNombre(JOptionPane.showInputDialog("Coloque el nombre del cliente"));
                    setCedula(JOptionPane.showInputDialog("Coloque el numero de cedula del cliente"));
                    setNfactura(Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de la factura")));
                    setMes(JOptionPane.showInputDialog("Coloque el mes de la factura"));
                    setAño(JOptionPane.showInputDialog("Coloque el año de la factura"));
                    setMfactura(Integer.parseInt(JOptionPane.showInputDialog("Coloque el monto de la factura")));
                    monto += Mfactura;
                    setEstado(JOptionPane.showInputDialog("Coloque el estado de la  factura \n 1 = pagada \n 2 = no pagada"));
                    mostrarC();
                    
                    break;
                    
            }  
        }
        calculo();
    }
    
    public void mostrarC() {
        
        System.out.println("Nombre del cliente: " + getNombre()
                + "\nCedula del cliente: " + getCedula()
                + "\nNumero de la factura: " + getNfactura()
                + "\nMes de la factura: " + getMes()
                + "\nAño de la factura: " + getAño()
                + "\nMonto de la factura: " + getMfactura()
                + "\nEstado de la factura: " + getEstado()
                + "\n*************************");
    }
    
    public void calculo() {
        montoT = (int) ((monto*0.05)+ monto/6);
        
        System.out.println("cuota 1: "+montoT +" Fecha de pago Julio 2023");
        System.out.println("cuota 2: "+montoT +" Fecha de pago Agosto 2023");
        System.out.println("cuota 3: "+montoT +" Fecha de pago Septiembre 2023");
        System.out.println("cuota 4: "+montoT +" Fecha de pago Octubre 2023");
        System.out.println("cuota 5: "+montoT +" Fecha de pago Noviembre 2023");
        System.out.println("cuota 6: "+montoT +" Fecha de pago Diciemnbre 2023");
        System.out.println("***************************************************");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMfactura() {
        return Mfactura;
    }

    public void setMfactura(int Mfactura) {
        this.Mfactura = Mfactura;
    }

    public int getNfactura() {
        return Nfactura;
    }

    public void setNfactura(int Nfactura) {
        this.Nfactura = Nfactura;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMontoT() {
        return montoT;
    }

    public void setMontoT(int montoT) {
        this.montoT = montoT;
    }
    
}
    
    

    

