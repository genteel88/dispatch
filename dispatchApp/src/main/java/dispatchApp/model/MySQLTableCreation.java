package dispatchApp.model;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class MySQLTableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Step 1: connect to MySQL
			System.out.println("Connecting to " + MySQLDBUtil.URL);
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(MySQLDBUtil.URL);
			
			if (conn == null) {
				return;
			}
			
			// Step 2: drop tables if exists
			Statement statement = conn.createStatement();
			String sql = "";
			
			// Tell MySQL to ignore foreign keys for a little while
			sql = "SET FOREIGN_KEY_CHECKS = 0";
			statement.executeUpdate(sql);
			
			sql = "DROP TABLE IF EXISTS User";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Account";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Address";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS BillingInfo";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Station";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Carrier";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Order1";
			statement.executeUpdate(sql);
			sql = "DROP TABLE IF EXISTS Option1";
			statement.executeUpdate(sql);
			
			// Step 3: create new tables
			sql = "CREATE TABLE User ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "firstName varchar(255),"
					+ "lastName varchar(255),"
					+ "billingInfoId bigint,"
					+ "accountId bigint,"
					+ "optionId bigint,"
					+ "FOREIGN KEY (billingInfoId) REFERENCES BillingInfo (id) on update cascade on delete restrict,"
					+ "FOREIGN KEY (accountId) REFERENCES Account (id) on update cascade on delete restrict,"
					+ "FOREIGN KEY (optionId) REFERENCES Option1 (id) on update cascade on delete restrict"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Account ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "email varchar(255),"
					+ "passwordHash varchar(255),"
					+ "status varchar(255),"
					+ "type varchar(255)"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Address ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "address varchar(255),"
					+ "city varchar(255),"
					+ "state varchar(255),"
					+ "zipcode int8,"
					+ "country varchar(255)"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE BillingInfo ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "billingAddressId bigint,"
					+ "cardNum bigint,"
					+ "dueDate varchar(255),"
					+ "cvs int8,"
					+ "FOREIGN KEY (billingAddressId) REFERENCES Address (id) on update cascade on delete restrict"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Station ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "address varchar(255),"
					+ "remainDroneNum int8,"
					+ "remainRobotNUm int8"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Carrier ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "status varchar(255),"
					+ "price bigint,"
					+ "maxWeight bigint,"
					+ "maxLength bigint,"
					+ "speed bigint,"
					+ "lon float8,"
					+ "lat float8,"
					+ "stationId bigint,"
					+ "FOREIGN KEY (stationId) REFERENCES Station (id) on update cascade on delete restrict"					
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Order1 ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "userId bigint,"
					+ "optionId bigint,"
					+ "carrierId bigint,"
					+ "orderedTime timestamp,"
					+ "FOREIGN KEY (userId) REFERENCES User (id) on update cascade on delete restrict,"
					+ "FOREIGN KEY (optionId) REFERENCES Option1 (id) on update cascade on delete restrict,"
					+ "FOREIGN KEY (carrierId) REFERENCES Carrier (id) on update cascade on delete restrict"
					+ ")";
			statement.executeUpdate(sql);
			
			sql = "CREATE TABLE Option1 ("
					+ "id bigint PRIMARY KEY AUTO_INCREMENT,"
					+ "startAddressId bigint,"
					+ "endAddressId bigint,"
					+ "departureTime timeStamp,"
					+ "optionWeight bigint,"
					+ "FOREIGN KEY (startAddressId) REFERENCES Address (id) on update cascade on delete restrict,"
					+ "FOREIGN KEY (endAddressId) REFERENCES Address (id) on update cascade on delete restrict"					
					+ ")";
			statement.executeUpdate(sql);
			
			// Turn the mysql foreign keys check back on
			sql = "SET FOREIGN_KEY_CHECKS = 1";
			statement.executeUpdate(sql);
			
//			sql = "ALTER TABLE User ADD FOREIGN KEY (accountId) REFERENCES Account (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE User ADD FOREIGN KEY (billingInfoId) REFERENCES BillingInfo (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE BillingInfo ADD FOREIGN KEY (billingAddressId) REFERENCES Address (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Carrier ADD FOREIGN KEY (stationId) REFERENCES Station (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE User ADD FOREIGN KEY (optionId) REFERENCES Option1 (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Order1 ADD FOREIGN KEY (optionId) REFERENCES Option1 (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Order1 ADD FOREIGN KEY (userId) REFERENCES User (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Order1 ADD FOREIGN KEY (carrierId) REFERENCES Carrier (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Option1 ADD FOREIGN KEY (startAddressId) REFERENCES Address (id)";
//			statement.executeUpdate(sql);
//			
//			sql = "ALTER TABLE Option1 ADD FOREIGN KEY (endAddressId) REFERENCES Address (id)";
//			statement.executeUpdate(sql);
			
			// Step 4: insert fake carrier
			sql = "INSERT INTO Station VALUES('1', '122 Ave N', '4', '5')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO Carrier VALUES('1111','Ok', '24', '100', '25', '10', '100.08', '120.98', '1')";
			statement.executeUpdate(sql);
			
			// insert fake user
			sql = "INSERT INTO Address VALUES('11', '4016 46th Ave', 'Minneapolis', 'MN', '55234', 'US')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO Address VALUES('12', '896 11th Street South', 'Minneapolis', 'MN', '55284', 'US')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO BillingInfo VALUES('12345', '11', '1234567878459652', 'December 12 2020', '562')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO Account VALUES('1001', 'ermao@example.com', 'rt4523jhydn987hsd', 'ok', 'user')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO Option1 VALUES('01', '11', '12', '2020-01-01 00:00:01', '12.8')";
			statement.executeUpdate(sql);
			sql = "INSERT INTO User VALUES('1', 'Eric', 'Hu', '12345', '1001', '01')";
			statement.executeUpdate(sql);
			
			conn.close();
			System.out.println("Import done successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
