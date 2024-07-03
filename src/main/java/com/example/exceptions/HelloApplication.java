package com.example.exceptions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {

    public static void main(String[] args) {
        try {
            int numeroquevaarriba = 5;
            int numeroquevaabajo = 0;
            double resultado = (numeroquevaarriba/numeroquevaabajo);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }


    }
}