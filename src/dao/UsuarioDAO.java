/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dto.Usuario;
import config.Conexion;
import interfaces.UsuarioInterface;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alum.fial1
 */
public class UsuarioDAO implements UsuarioInterface{
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";
    
    @Override
    public int validarUser(String user, String pass) {
        int x = 0;
       sql ="select *from usuario where usuario='"+user+"' and clave='"+pass+"'";
       
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                x=1;
            }            
        } catch (SQLException e) {
            
        }
        return x;
    }

    @Override
    public int verificarUser(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarUser() {
        List<Usuario> lista = new ArrayList<>();
        sql = "select *from salida_item";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Usuario u = new Usuario();
                u.setIdestudiante(rs.getInt("idestudiante"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setDni(rs.getInt("dni"));
                u.setCodigo(rs.getString("codigo"));
                u.setDireccion(rs.getString("direccion"));
                u.setAño(rs.getString("año"));
                
                lista.add(u);
            }
        } catch (SQLException e) {
        }
        
       return lista;
    }

    @Override
    public List<Usuario> buscarUser(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarUser(Usuario u) {
        boolean op = false;
        sql="INSERT INTO `salida_item`(`idsalida_item`,`idproducto`, `idsalida`, `item`, `cantidad`," 
         +"`precio`,`idperiodo`) values('"+u.getIdestudiante()
        
//                sql="insert into usuario(idusuario, nombres, apellidos, usuario, "
//            + "clave, Estado) values(null,'"+u.getNombres()
            +"', '"+u.getNombre()
            +"', '"+u.getApellido()
            +"', '"+u.getDni()
            +"', '"+u.getCodigo()
            +"', '"+u.getDireccion()
            +"', '"+u.getAño()+"')";
            
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
        }
        return op;
    }
    

    @Override
    public boolean modificarUser(Usuario u) {
        boolean op = false;
        sql="update usuario set idsalida_item='"+u.getIdestudiante()
            +"', idproducto='"+u.getNombre()
            +"', idsalida='"+u.getApellido()
            +"', item='"+u.getDni()
            +"', cantidad='"+u.getCodigo()
            +"', precio='"+u.getDireccion()
            +"', idperiodo='"+u.getSexo()
            +"' where ="+u.getSexo();
            
         try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
        }
        return op;
        
    }

    @Override
    public boolean eliminarUser(int id) {
        boolean op = false;
//        sql = "delete from usuario where idusuario = "+id;
        sql = "DELETE FROM `bd_almacen`.`salida_item` WHERE `salida_item`.`salida_item` ="+id;
         try {
             
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
            
        }
        return op;
        
    }
    
}
