module br.com.fiap {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens br.com.fiap.controller to javafx.fxml;
    exports br.com.fiap;
}
