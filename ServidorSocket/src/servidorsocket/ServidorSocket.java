/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servidorsocket;

/**
 *
 * @author certificacion7
 */
public class ServidorSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.conexion(5555);
    }
    
}
