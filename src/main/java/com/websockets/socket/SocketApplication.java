package com.websockets.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;

@SpringBootApplication
public class SocketApplication {

	public static void main(String[] args) {
		SocketServer socketServer = new SocketServer(new InetSocketAddress("0.0.0.0", 8443));
		socketServer.start();
	}

}
