module org.example.mealplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mealplanner to javafx.fxml;
    exports org.example.mealplanner;
}