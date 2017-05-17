package com.fortune.webapp;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import com.fortune.webapp.controller.DBConnection;
import com.fortune.webapp.model.Data;
import com.fortune.webapp.model.Fortune;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@RestController
@EnableAutoConfiguration
public class FortuneWebApp {
	
	private static DBConnection conn;
	
    @RequestMapping("/data/")
    public Data listCookies() {List<Fortune> fortune = new ArrayList<Fortune>();
		
    	Data result = new Data();
		String sql = "SELECT * FROM `fcookies`.`fcookies`";
		try {
			PreparedStatement ps = conn.getConn().prepareStatement(sql);
		
		    ResultSet rs = ps.executeQuery();
		    while (rs.next()) {
		    	Fortune cookie = new Fortune((String)(rs.getString("idfcookies")), (String)rs.getString("des"));
				fortune.add(cookie);
		    }
		    result.data = fortune;
		    rs.close();
			ps.close();
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
		finally{
			
		}

		return result;
    }
    
    public static void main(String[] args) throws Exception {
        conn = new DBConnection("root","root","jdbc:mysql://localhost:3306","fcookies");
    	conn.connect();
    	SpringApplication.run(FortuneWebApp.class, args);
    }         
    	
	    
    	
}