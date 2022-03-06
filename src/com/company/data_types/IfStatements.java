package com.company.data_types;

public class IfStatements {
    public static void main(String[] args){
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("File send");
            System.out.println(fileSended);
        } else {
            fileSended--;
            System.out.println("Please turn on the Bluetooth for start the transfer");
            System.out.println(fileSended);
        }
    }
}
