package conectando;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
Connection conn=null;
String url="jdbc:postgresql://localhost:5432/mydb";
String usuario="postgres";
String clave="311239902";

public Connection conectar () {
try {
Class.forName("org.postgresql.Driver");
conn=DriverManager.getConnection(url, usuario, clave);
JOptionPane.showMessageDialog(null, "Conexión exitosa a la Base de Datos de PostgreSQL ");
} catch (Exception e) {

JOptionPane. showMessageDialog(null,"Error de conexion "+e,"Err.",JOptionPane.ERROR_MESSAGE);
}
return conn;
}
}
