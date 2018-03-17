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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public void addCurso(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
