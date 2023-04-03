import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tiempos {
    public static double[] tiemposConsultaCuatroVeces(Statement statement, String consulta) throws SQLException {
        double[] tiempos = new double[4];

        for (int i = 0; i < tiempos.length; i++) {
            tiempos[i] = medirTiempoConsulta(statement, consulta);
        }

        statement.close();

        return tiempos;
    }

    public static double medirTiempoConsulta(Statement statement, String consulta) throws SQLException {
        double startTime = System.currentTimeMillis();
        ResultSet resultSet = statement.executeQuery(consulta);
        double endTime = System.currentTimeMillis();
        double tiempo = endTime - startTime;

        resultSet.close();
        return tiempo;
    }
}
