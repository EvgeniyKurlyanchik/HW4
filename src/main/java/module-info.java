module ru.geekbrains.hw4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens ru.geekbrains.hw4 to javafx.fxml;
    exports ru.geekbrains.hw4;
}