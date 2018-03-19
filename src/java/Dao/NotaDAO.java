/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Nota;
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
 * @author JulDa
 */
public class NotaDAO {

    private Connection connection;

    public NotaDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public ArrayList<Nota> getNotaByIdEstudiante(int id_estudiante) throws SQLException, URISyntaxException {
        ArrayList<Nota> notaEst = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from nota where idestudiante=" + id_estudiante);
        while (rs.next()) {
            Nota n = new Nota();
            n.setIdEstudiante(rs.getInt("id_Est"));
            n.setNota(rs.getFloat("nota"));
            notaEst.add(n);
        }
        return notaEst;
    }
    
    public Nota getNotaByIdTema(int idTema) throws SQLException, URISyntaxException {
        Nota nota= new Nota();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from nota where idTema=" + idTema);
        while (rs.next()) {
            nota.setNota(rs.getFloat("nota"));
            nota.setIdEstudiante(rs.getInt("id_Est"));
            nota.setIdTema(rs.getInt("id_Tema"));
            nota.setDetallesExtra(rs.getString("detalles"));
            
        }
        return nota;
    }

    public void addNota(float nota, int IdEstudiante, int IdTema, String DetallesExtra) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into nota values (?,?,?,?)");
        preparedStatement.setFloat(1, nota);
        preparedStatement.setInt(2, IdEstudiante);
        preparedStatement.setInt(3, IdTema);
        preparedStatement.setString(4, DetallesExtra);
        preparedStatement.executeUpdate();
    }
}
