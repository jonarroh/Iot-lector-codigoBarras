/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.controller;

import com.fazecast.jSerialComm.SerialPort;

/**
 *
 * @author urieh
 */
public class SerialController {
    SerialPort puertoSerial;
    public void conectar(){
    puertoSerial = SerialPort.getCommPort("COM3");
    puertoSerial.setBaudRate(9600);
    puertoSerial.openPort();
        System.out.println("hay conexion");
    }
    
    public void mandarMensaje(String mensaje){
    System.out.println("enviando mensaje?");
    byte[] b;
    b=mensaje.getBytes();
    puertoSerial.writeBytes(b, b.length);
    }
}

