package com.example.midtermexam200470534;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;

public class StudentViewController {

    @FXML
    private TableColumn<Student, Integer> Tel;

    @FXML
    private TableColumn<Student, Integer> avggrade;

    @FXML
    private Button buttonTwo;

    @FXML
    private TableColumn<Student, String> firstName;

    @FXML
    private TableColumn<Student, String> gend;

    @FXML
    private TableColumn<Student, String> lastname;

    @FXML
    private TableColumn<Student, String> majCode;

    @FXML
    private Label msgLabel;

    @FXML
    private MenuButton province;

    @FXML
    private TableColumn<Student, Integer> studCol;

    @FXML
    private Label studentLabel;

}
