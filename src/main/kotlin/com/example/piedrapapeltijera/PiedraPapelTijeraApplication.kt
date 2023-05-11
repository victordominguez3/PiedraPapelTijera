package com.example.piedrapapeltijera

import com.example.piedrapapeltijera.controllers.PiedraPapelTijeraController
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class PiedraPapelTijeraApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PiedraPapelTijeraApplication::class.java.getResource("views/principal-view.fxml"))
        val controlador = PiedraPapelTijeraController()
        fxmlLoader.setController(controlador)
        val scene = Scene(fxmlLoader.load(), 510.0, 325.0)
        stage.title = "Piedra Papel Tijeras Lagarto Spock"
        stage.scene = scene
        stage.isResizable = false
        stage.show()
    }
}

fun main() {
    Application.launch(PiedraPapelTijeraApplication::class.java)
}