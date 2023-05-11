package com.example.piedrapapeltijera.controllers

import com.example.piedrapapeltijera.PiedraPapelTijeraApplication
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView

class PiedraPapelTijeraController {
    @FXML
    private lateinit var botonPiedra: Button

    @FXML
    private lateinit var botonPapel: Button

    @FXML
    private lateinit var botonTijera: Button

    @FXML
    private lateinit var botonLagarto: Button

    @FXML
    private lateinit var botonSpock: Button

    private val estilos: Map<String, String> = mapOf(
        "botonEnPiedra" to "-fx-background-color: #A5FFEC; -fx-background-radius: 10;",
        "botonEnPapel" to "-fx-background-color: #A5FFEC; -fx-background-radius: 10;",
        "botonEnTijera" to "-fx-background-color: #A5FFEC; -fx-background-radius: 10;",
        "botonEnLagarto" to "-fx-background-color: #A5FFEC; -fx-background-radius: 10;",
        "botonEnSpock" to "-fx-background-color: #A5FFEC; -fx-background-radius: 10;",
        "botonFueraPiedra" to "-fx-background-color: #E2FFF9;",
        "botonFueraPapel" to "-fx-background-color: #E2FFF9;",
        "botonFueraTijera" to "-fx-background-color: #E2FFF9;",
        "botonFueraLagarto" to "-fx-background-color: #E2FFF9;",
        "botonFueraSpock" to "-fx-background-color: #E2FFF9;"
    )

    @FXML
    private fun initialize() {
        iniciarBotonPiedra()
        iniciarBotonPapel()
        iniciarBotonTijera()
        iniciarBotonLagarto()
        iniciarBotonSpock()
    }

    private fun iniciarBotonPiedra() {
        val icono = ImageView(Image(PiedraPapelTijeraApplication::class.java.getResourceAsStream("icons/piedra.png")))
        icono.fitWidth = 25.0
        icono.fitHeight = 25.0
        botonPiedra.graphic = icono
    }

    private fun iniciarBotonPapel() {
        val icono = ImageView(Image(PiedraPapelTijeraApplication::class.java.getResourceAsStream("icons/papel.png")))
        icono.fitWidth = 35.0
        icono.fitHeight = 35.0
        botonPapel.graphic = icono
    }

    private fun iniciarBotonTijera() {
        val icono = ImageView(Image(PiedraPapelTijeraApplication::class.java.getResourceAsStream("icons/tijeras.png")))
        icono.fitWidth = 35.0
        icono.fitHeight = 35.0
        botonTijera.graphic = icono
    }

    private fun iniciarBotonLagarto() {
        val icono = ImageView(Image(PiedraPapelTijeraApplication::class.java.getResourceAsStream("icons/lagarto.png")))
        icono.fitWidth = 30.0
        icono.fitHeight = 30.0
        botonLagarto.graphic = icono
    }

    private fun iniciarBotonSpock() {
        val icono = ImageView(Image(PiedraPapelTijeraApplication::class.java.getResourceAsStream("icons/spock.png")))
        icono.fitWidth = 30.0
        icono.fitHeight = 30.0
        botonSpock.graphic = icono
    }

    @FXML
    private fun onRatonEnPiedra() {
        botonPiedra.style = estilos["botonEnPiedra"]
    }

    @FXML
    private fun onRatonFueraPiedra() {
        botonPiedra.style = estilos["botonFueraPiedra"]
    }

    @FXML
    private fun onRatonEnPapel() {
        botonPapel.style = estilos["botonEnPapel"]
    }

    @FXML
    private fun onRatonFueraPapel() {
        botonPapel.style = estilos["botonFueraPapel"]
    }

    @FXML
    private fun onRatonEnTijera() {
        botonTijera.style = estilos["botonEnTijera"]
    }

    @FXML
    private fun onRatonFueraTijera() {
        botonTijera.style = estilos["botonFueraTijera"]
    }

    @FXML
    private fun onRatonEnLagarto() {
        botonLagarto.style = estilos["botonEnLagarto"]
    }

    @FXML
    private fun onRatonFueraLagarto() {
        botonLagarto.style = estilos["botonFueraLagarto"]
    }

    @FXML
    private fun onRatonEnSpock() {
        botonSpock.style = estilos["botonEnSpock"]
    }

    @FXML
    private fun onRatonFueraSpock() {
        botonSpock.style = estilos["botonFueraSpock"]
    }
}