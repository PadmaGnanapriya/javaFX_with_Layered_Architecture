package controller;

import db.Database;
import dto.CustomerDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import jdk.nashorn.internal.ir.FunctionNode;

public class MainFormController {
    public TableView<CustomerDTO> tbl;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TextField txtId;
    public TextField txtName;
    public TextField txtSalary;
    public TextField txtAddress;


    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        loadAllData();// To create this method =>  Alt +Enter


    //Create listner


        tbl.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            txtId.setText(newValue.getId());
            txtName.setText(newValue.getName());
            txtAddress.setText(newValue.getAddress());
            //txtSalary.setText(newValue.getSalary()+"");
            txtSalary.setText(String.valueOf(newValue.getSalary()));


        });// Ctrl+Shift+Space
    }

    private void loadAllData() {
        ObservableList<CustomerDTO> dtos= FXCollections.observableArrayList(Database.list);
        tbl.setItems(dtos);
    }
}
