module co.edu.uniquindio.gestionpeajes {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestionpeajes to javafx.fxml;
    exports co.edu.uniquindio.gestionpeajes;
}