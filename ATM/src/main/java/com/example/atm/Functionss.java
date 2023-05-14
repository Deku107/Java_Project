package com.example.atm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Shadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Functionss {

    @FXML
    private ImageView Logo;

    @FXML
    private Label Title;

    @FXML
    private Button bln;

    @FXML
    private Button dbt;

    @FXML
    private Label endf;

    @FXML
    private AnchorPane rightp;

    @FXML
    private Circle tp;

    @FXML
    private Button xc;

    public void handleMouseEnter(MouseEvent event) {
        DropShadow shadow = new DropShadow();
        shadow.setWidth(150);
        shadow.setHeight(150);
        shadow.setRadius(110);
        Bloom bloom = new Bloom();
        bloom.setThreshold(0.2);
        bloom.setInput(bloom);
        xc.setEffect(bloom);
        dbt.setEffect(bloom);
        bln.setEffect(bloom);
        xc.setEffect(shadow);
        dbt.setEffect(shadow);
        bln.setEffect(shadow);
    }

    @FXML
    public void handleMouseExit(MouseEvent event) {
        xc.setEffect(null);
        dbt.setEffect(null);
        bln.setEffect(null);
    }

}
