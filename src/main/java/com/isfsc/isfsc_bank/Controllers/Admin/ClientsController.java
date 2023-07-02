package com.isfsc.isfsc_bank.Controllers.Admin;

import com.isfsc.isfsc_bank.Models.Client;
import com.isfsc.isfsc_bank.Models.Model;
import com.isfsc.isfsc_bank.Views.ClientCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientsController implements Initializable {
    public ListView<Client> clients_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initClients();
        clients_listview.setItems(Model.getInstance().getClients());
        clients_listview.setCellFactory(e -> new ClientCellFactory());

    }

    private void initClients(){
        if(Model.getInstance().getClients().isEmpty()){
            Model.getInstance().setClients();
        }
    }
}
