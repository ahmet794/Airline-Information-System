module uk.ac.rhul.cs2800.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens uk.ac.rhul.cs2800.javafxtest to javafx.fxml;
    exports uk.ac.rhul.cs2800.javafxtest;
}
