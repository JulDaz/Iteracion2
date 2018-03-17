/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Curso;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author FiJus
 */
public class CursoDAO {
    private Connection connection;

    public CursoDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }
    
    public Curso getCursoById(int idCurso) throws SQLException{
        Curso c=new Curso();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from curso where id="+idCurso);
        while (rs.next()) {
            c.setIdCurso(idCurso);
            c.setNombre(rs.getString("nombre"));
        }
        return c;
    }
    
      public ArrayList<Curso> getAllCursos() throws SQLException, URISyntaxException {
        ArrayList<Curso> cursos = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from curso where delete=1");
        while (rs.next()) {
            Curso c = new Curso();
            c.setIdCurso(rs.getInt("id"));
            c.setNombre(rs.getString("nombre"));
            c.setNumeroEstudiantes(rs.getInt("numeroestudiantes"));
            
            cursos.add(c);
        }
        return cursos;
    }
    

    public void addCurso(Curso curso) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into curso values (?,?,1)");
        preparedStatement.setInt(1, curso.getIdCurso());
        preparedStatement.setString(2, curso.getNombre());
        preparedStatement.executeUpdate();
    }
}
