package utez.edu.mx.agenda.model;

import utez.edu.mx.agenda.utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoPerson {

    public List<BeanPerson> list() {
        List<BeanPerson> list = new ArrayList<>();
        try {
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next()) {
                list.add(new BeanPerson(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getString("email"),
                        resultSet.getInt("phone"),
                        resultSet.getString("address"),
                        resultSet.getString("curp"),
                        resultSet.getInt("nss")
                ));
            }
            connection.close();
            statement.close();
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public boolean save(BeanPerson beanPerson) {
        boolean result = false;
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person (name, lastName, email, phone, address, curp, nss) VALUES (?,?,?,?,?,?,?)");
        ) {
            preparedStatement.setString(1, beanPerson.getName());
            preparedStatement.setString(2, beanPerson.getLastName());
            preparedStatement.setString(3, beanPerson.getEmail());
            preparedStatement.setInt(4, beanPerson.getPhone());
            preparedStatement.setString(5, beanPerson.getAddress());
            preparedStatement.setString(6, beanPerson.getCurp());
            preparedStatement.setInt(7, beanPerson.getNss());
            result = preparedStatement.executeUpdate() == 1;


        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;
    }

    public BeanPerson get(int id) {
        BeanPerson person = new BeanPerson();
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person WHERE id = ?");
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setLastName(resultSet.getString("lastName"));
                person.setEmail(resultSet.getString("email"));
                person.setPhone(resultSet.getInt("phone"));
                person.setAddress(resultSet.getString("address"));
                person.setCurp(resultSet.getString("curp"));
                person.setNss(resultSet.getInt("nss"));

            }
            connection.close();
            preparedStatement.close();
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    public boolean update(BeanPerson person) {
        boolean result = false;
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person SET name = ?, lastName = ?, email = ?, phone = ?, address = ?, curp = ?, nss = ? WHERE id = ?");
        ) {
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getEmail());
            preparedStatement.setInt(4, person.getPhone());
            preparedStatement.setString(5, person.getAddress());
            preparedStatement.setString(6, person.getCurp());
            preparedStatement.setInt(7, person.getNss());
            preparedStatement.setInt(8, person.getId());
            result = preparedStatement.executeUpdate() == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean delete(int id) {
        boolean result = false;
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM person WHERE id = ?");
        ) {
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate() == 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
