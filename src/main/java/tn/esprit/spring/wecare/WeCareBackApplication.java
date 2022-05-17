package tn.esprit.spring.wecare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.wecare.entities.Ads;
import tn.esprit.spring.wecare.services.AdsServiceImpl;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


@SpringBootApplication
@Slf4j
@CrossOrigin(origins="http://localhost:4200")
public class WeCareBackApplication {

	
	@Autowired
	static
	AdsServiceImpl adService;
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(WeCareBackApplication.class, args);
//		Ads c= adService.getAdById(null);
		
        
		
	}

}
