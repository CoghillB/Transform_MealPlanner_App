package org.example.mealplanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        GridPane menuPage = new GridPane();
        Label menuTitle = new Label("Transform");
        VBox menuTitleBox = new VBox();
        HBox menuOptions = new HBox();
        Button newMealButton = new Button("New Meal");
        Button viewMealsButton = new Button("View Meals");
        Button deleteMealButton = new Button("Delete Meals");
        Button groceryListButton = new Button("Grocery List");

        newMealButton.setOnAction(e -> {
            MealPlannerApp mealPlannerApp = new MealPlannerApp();
            mealPlannerApp.startAddMeal(stage);
        });

        viewMealsButton.setOnAction(e -> {
            // create a new scene for viewing meals
            // create a table to display meals
        });

        deleteMealButton.setOnAction(e -> {
            // create a new scene for deleting meals
            // create a table to display meals
            // create a button to delete a meal
        });

        groceryListButton.setOnAction(e -> {
            // create a new scene for viewing grocery list
            // create a table to display grocery list
        });

        menuTitle.setStyle("-fx-font-family: Stencil; -fx-font-size: 50; -fx-font-weight: bold; -fx-text-fill: #000000;");

        menuTitleBox.setStyle("-fx-background-color: lightblue; -fx-font-family: Stencil; -fx-font-size: 24; " +
                "-fx-font-weight: bold; -fx-text-fill: #000000; -fx-border-color: #000000; -fx-padding: 10; -fx-spacing: 75;");
        menuTitleBox.setPadding(new Insets(20, 20, 20, 20));
        menuTitleBox.setSpacing(50);

        menuOptions.setSpacing(30);

        menuOptions.getChildren().addAll(newMealButton, viewMealsButton, deleteMealButton);
        menuOptions.setAlignment(Pos.CENTER);

        menuTitleBox.getChildren().addAll(menuTitle, menuOptions, groceryListButton);
        menuTitleBox.setAlignment(Pos.CENTER);

        Scene menuScene = new Scene(menuTitleBox, 800, 600);
        stage.setScene(menuScene);
        stage.setTitle("Meal Planner");
        stage.show();
    }
}

class MealPlannerApp {
    public void startAddMeal(Stage stage) {
        // create a new scene for adding a meal for the planner
        Button addMealButton = new Button("Add Meal");
        Button cancelButton = new Button("Cancel");
        HBox buttonBox = new HBox();
        VBox addMealBox = new VBox();
        Label mealTitle = new Label("Add Meal");

        // create fill in form for meal details
        // create a button to submit the meal
    }
}


