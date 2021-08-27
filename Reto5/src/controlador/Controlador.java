
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import modelo.cliente;
import modelo.clienteDAO;
import vista.crearTiket;
import vista.modificarTiket;


public class Controlador implements ActionListener{
    
    clienteDAO dao = new clienteDAO();
    cliente p = new cliente();
    modificarTiket modificar = new modificarTiket();
    crearTiket crear = new crearTiket();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Controlador(crearTiket cre) {
        this.crear = cre;
        this.crear.btnGuardar.addActionListener(this);
        this.crear.btnCancelar.addActionListener(this);
        this.crear.btnNuevo.addActionListener(this);
    }

    public Controlador(modificarTiket mod) {
        this.modificar = mod;
        this.modificar.btnBuscar.addActionListener(this);
        this.modificar.btnCancelar1.addActionListener(this);
        this.modificar.btnEliminar.addActionListener(this);
        this.modificar.btnModificar.addActionListener(this);
        this.modificar.tbTabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==1) {
                    seleccion();
                }
            }
            
        });
    }
    //Accion

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==modificar.btnBuscar) {
            buscar(modificar.tbTabla);            
        }
        
        if (e.getSource()==crear.btnGuardar) {
            guardar();            
        }
        
        if (e.getSource()==crear.btnNuevo) {
            limpiar();
        }
        
        if (e.getSource()==modificar.btnModificar) {
            modificar();
            buscar(modificar.tbTabla);
        }
        
        if (e.getSource()==modificar.btnEliminar) {
            eliminar();
            buscar(modificar.tbTabla);
            
        }
        
        
    }
    
    //metodo
    
    public void eliminar() {
        int elim = modificar.tbTabla.getSelectedRow();
        if (elim==-1) {
            JOptionPane.showMessageDialog(modificar, "Opcion Invalida");            
        }
        else {
            int id= (int)modificar.tbTabla.getValueAt(elim, 0);
            dao.eliminar(id);
            JOptionPane.showMessageDialog(modificar, "Eliminacion Exitosa");
        }
    }
    
    public void modificar() {
        String id= modificar.txtId.getText();
        String nit= modificar.txtNit2.getText();
        String nom= modificar.txtCliente2.getText();
        String dic= modificar.txtDireccion2.getText();
        String tel= modificar.txtTelefono2.getText();
        String fec= modificar.txtFecha2.getText();
        String ser= modificar.cboTipoServi2.getSelectedItem().toString();
        String com= modificar.txtComen2.getText();
        
        p.setId(Integer.parseInt(id));
        p.setNit(nit);
        p.setNombre(nom);
        p.setDireccion(dic);
        p.setTelefono(tel);
        p.setFecha(fec);
        p.setTipoServicio(ser);
        p.setComentario(com);
        
        int result = dao.modificar(p);
        
        if (result==1) {
            JOptionPane.showMessageDialog(modificar, "Se Modifico Correctamente");
        }
        else{
            JOptionPane.showMessageDialog(modificar, "Error !!!");
        }
        
    }
    
    public void seleccion() {
        int selec = modificar.tbTabla.getSelectedRow();
        if (selec==-1) {
            JOptionPane.showMessageDialog(crear, "Error !!!");
        }
        else {
            int Id = (int)modificar.tbTabla.getValueAt(selec, 0);
            String nit = (String)modificar.tbTabla.getValueAt(selec, 1);
            String nombre = (String)modificar.tbTabla.getValueAt(selec, 2);
            String direccion = (String)modificar.tbTabla.getValueAt(selec, 3);
            String telefono = (String)modificar.tbTabla.getValueAt(selec, 4);
            String fecha = (String)modificar.tbTabla.getValueAt(selec, 5);
            String tipoServicio = (String)modificar.tbTabla.getValueAt(selec, 6);
            String comentario = (String)modificar.tbTabla.getValueAt(selec, 7);
            
            modificar.txtId.setText(""+Id);
            modificar.txtNit2.setText(nit);
            modificar.txtCliente2.setText(nombre);
            modificar.txtDireccion2.setText(direccion);
            modificar.txtTelefono2.setText(telefono);
            modificar.txtFecha2.setText(fecha);
            modificar.cboTipoServi2.setSelectedItem(tipoServicio);
            modificar.txtComen2.setText(comentario);
            
            
        }
    }
    
    public void limpiar() {
        crear.txtNit.setText("");
        crear.txtNombre.setText("");
        crear.txtDireccion.setText("");
        crear.txtTelefono.setText("");
        crear.txtFecha.setText("");
        crear.cboTipoServi.setSelectedIndex(0);
        crear.txtComen.setText("");
    }
    
    public void guardar() {
        String nit= crear.txtNit.getText();
        String nom= crear.txtNombre.getText();
        String dic= crear.txtDireccion.getText();
        String tel= crear.txtTelefono.getText();
        String fec= crear.txtFecha.getText();
        String ser= crear.cboTipoServi.getSelectedItem().toString();
        String com= crear.txtComen.getText();
        
        p.setNit(nit);
        p.setNombre(nom);
        p.setDireccion(dic);
        p.setTelefono(tel);
        p.setFecha(fec);
        p.setTipoServicio(ser);
        p.setComentario(com);
        int r=dao.guardar(p);
        if(r==1) {
            JOptionPane.showMessageDialog(crear, "Usuario Registrado con exito");
        }
        else {
            JOptionPane.showMessageDialog(crear, "Error !!!");
        }
    }
    
    public void buscar(JTable tabla) {
        modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(0);
        List<cliente>lista= dao.listar(modificar.txtNomClien.getText());
        Object[]object = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getNit();
            object[2]=lista.get(i).getNombre();
            object[3]=lista.get(i).getDireccion();
            object[4]=lista.get(i).getTelefono();
            object[5]=lista.get(i).getFecha();
            object[6]=lista.get(i).getTipoServicio();
            object[7]=lista.get(i).getComentario();
            modelo.addRow(object);
            
        }
        modificar.tbTabla.setModel(modelo);
    }
    
    
}
