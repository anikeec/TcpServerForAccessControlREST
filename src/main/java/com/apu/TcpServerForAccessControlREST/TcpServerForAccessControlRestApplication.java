package com.apu.TcpServerForAccessControlREST;

import java.io.PrintStream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.apu.TcpServerForAccessControlREST.utils.logging.LoggingOutputStream;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.apu.TcpServerForAccessControlDB.repository"})
@EntityScan(basePackages = {"com.apu.TcpServerForAccessControlDB.entity"})  
@ImportResource("/META-INF/spring/application-context.xml")
public class TcpServerForAccessControlRestApplication {

    private static final Logger logger = LogManager.getLogger(TcpServerForAccessControlRestApplication.class);
    
	public static void main(String[] args) {
	    System.setOut(new PrintStream(new LoggingOutputStream(LogManager.getLogger("outLog"), Level.ALL), true));
		SpringApplication.run(TcpServerForAccessControlRestApplication.class, args);
	}
}
