module com.isfsc.isfsc_bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.isfsc.isfsc_bank to javafx.fxml;
    exports com.isfsc.isfsc_bank;
    exports com.isfsc.isfsc_bank.Controllers;
    exports com.isfsc.isfsc_bank.Controllers.Admin;
    exports com.isfsc.isfsc_bank.Controllers.Client;
    exports com.isfsc.isfsc_bank.Models;
    exports com.isfsc.isfsc_bank.Views;



}