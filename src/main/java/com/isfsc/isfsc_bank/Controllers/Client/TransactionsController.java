package com.isfsc.isfsc_bank.Controllers.Client;

import com.isfsc.isfsc_bank.Models.Model;
import com.isfsc.isfsc_bank.Views.TransactionCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionsController implements Initializable {
    public ListView transactions_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initAllTransactionsList();
        transactions_listview.setItems(Model.getInstance().getLatestTransactions());
        transactions_listview.setCellFactory(e -> new TransactionCellFactory());
    }

    private void initAllTransactionsList() {
        if (Model.getInstance().getAllTransactions().isEmpty()){
            Model.getInstance().setAllTransactions();
        }
    }
}

