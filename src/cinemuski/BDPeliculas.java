package cinemuski;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BDPeliculas {

    String url = "jdbc:mysql://localhost:3306/cine";
    String user = "root";
    String pass = "muski";
    Statement sta = null;
    Connection con = null;
    PreparedStatement insertar = null;
    ResultSet registro = null;
    boolean existe;

    public BDPeliculas() {

    }

    public boolean registrarpelicula(String titulo, String genero, String duracion, String director, String reparto, String img) {
        try {
            existe = false;
            int num = 0;
            con = DriverManager.getConnection(url, user, pass);
            sta = con.createStatement();
            String sqll = "SELECT * FROM peliculas;";
            registro = sta.executeQuery(sqll);
            int cont = 1;
            while (registro.next()) {
                if (titulo.toLowerCase().equals(registro.getString(cont))) {
                    JOptionPane.showMessageDialog(null, "Esta pelicula ya existe en la base de datos!");
                    existe = true;
                    break;
                }
            }
            if (existe == false) {
                String sql = "insert into peliculas values ('" + titulo.toLowerCase() + "','" + genero + "','" + duracion + "','" + director + "'," + num + ",'" + reparto + "','" + img + "');";
                insertar = con.prepareStatement(sql);
                insertar.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se ha registrado la pelicula con exito!");
            }
            sta.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de registrar la pelicula " + ex);
        }
        return existe;
    }

    public void eliminarpelicula(String titulo) {
        try {
            boolean encontrado = false;
            con = DriverManager.getConnection(url, user, pass);
            sta = con.createStatement();
            String query = "SELECT * FROM peliculas";
            registro = sta.executeQuery(query);
            int cont = 1;
            while (registro.next()) {
                if (titulo.equals(registro.getString(cont))) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado == true) {
                String sql = "delete from peliculas where titulo='" + titulo + "';";
                sta.execute(sql);
                String eliminarboletos="delete from boletoss where pelicula='" + titulo + "';";
                sta.execute(eliminarboletos);
                String eliminarhorario="delete from horarios where Pelicula='" + titulo + "';";
                sta.execute(eliminarhorario);
                JOptionPane.showMessageDialog(null, "Se ha eliminado la pelicula con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No existe ninguna pelicula con este nombre");
            }
            sta.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de eliminar la pelicula " + ex);
        }
    }

    public void eliminartodas() {
        try {
            con = DriverManager.getConnection(url, user, pass);
            sta = con.createStatement();
            String sqll = "SELECT * FROM peliculas;";
            registro = sta.executeQuery(sqll);
            if (!registro.next()) {
                JOptionPane.showMessageDialog(null, "No se puede concretar la acción ya que no hay peliculas en existencia!");
            } else {
                String sql = "delete from peliculas;";
                sta.execute(sql);
                JOptionPane.showMessageDialog(null, "Todas las peliculas han sido eliminadas!");
            }
            sta.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de eliminar la pelicula " + ex);
        }
    }
}
