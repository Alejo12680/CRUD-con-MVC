
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class clienteDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(String bus){
        List<cliente>datos=new ArrayList<>();
        String sql = "";
        DefaultTableModel del = new DefaultTableModel();
        if (bus.equals("")) {
            sql="SELECT * FROM cliente";
        }
        else {
            sql="SELECT * FROM cliente WHERE nombre LIKE '%"+bus+"%' OR nit LIKE '%"+bus+"%'";
        }
            con=conectar.getConnection();
            Statement pr;
        
        
        try {
            
            pr=con.createStatement();
            ResultSet rs = pr.executeQuery(sql);
//            ps=con.prepareStatement(sql);
//            rs=ps.executeQuery();
            while (rs.next()) {
                cliente p = new cliente();
                p.setId(rs.getInt(1));
                p.setNit(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setFecha(rs.getString(6));
                p.setTipoServicio(rs.getString(7));
                p.setComentario(rs.getNString(8));
                datos.add(p);
            }
           
        } catch (Exception e) {
        }
        return datos;
        
    }
    //metodo
    
    public void eliminar(int id) {
        String sql="DELETE FROM cliente WHERE id="+id;
        try {
           con = conectar.getConnection();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
           
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error" +e,"SQL",JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    public int modificar(cliente p) {
        String sql= "UPDATE cliente SET nit=?,nombre=?,direccion=?,telefono=?,fecha=?,tipoServicio=?,comentario=? WHERE id=?";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getNit());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getFecha());
            ps.setString(6, p.getTipoServicio());
            ps.setString(7, p.getComentario());
            ps.setInt(8, p.getId());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error" +e,"SQL",JOptionPane.ERROR_MESSAGE);
        }
        
        return 1;
    }
    
    public int guardar(cliente cli) {
        String sql="INSERT INTO cliente(nit,nombre,direccion,telefono,fecha,tipoServicio,comentario) VALUES(?,?,?,?,?,?,?)";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, cli.getNit());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getDireccion());
            ps.setString(4, cli.getTelefono());
            ps.setString(5, cli.getFecha());
            ps.setString(6, cli.getTipoServicio());
            ps.setString(7, cli.getComentario());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error" +e,"SQL",JOptionPane.ERROR_MESSAGE);
            
        }
        
        return 1;
    }
    
}
