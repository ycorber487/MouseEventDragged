module org.example.di_formdesign_cortesyon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens org.example.di_formdesign_cortesyon to javafx.fxml;
    exports org.example.di_formdesign_cortesyon;
}