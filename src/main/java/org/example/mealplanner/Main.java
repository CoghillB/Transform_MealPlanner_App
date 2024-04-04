package org.example.mealplanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        GridPane menuPage = new GridPane();
        Label menuTitle = new Label("Transform");
        VBox menuTitleBox = new VBox();
        VBox menuOptions = new VBox();
        Button newMealButton = new Button("New Meal");
        Button viewMealsButton = new Button("View Meals");
        Button deleteMealButton = new Button("Delete Meals");
        Button groceryListButton = new Button("Grocery List");
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();

        newMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        newMealButton.setOnMouseEntered(e -> newMealButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        newMealButton.setOnMouseExited(e -> newMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        viewMealsButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        viewMealsButton.setOnMouseEntered(e -> viewMealsButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        viewMealsButton.setOnMouseExited(e -> viewMealsButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        deleteMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        deleteMealButton.setOnMouseEntered(e -> deleteMealButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        deleteMealButton.setOnMouseExited(e -> deleteMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        groceryListButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        groceryListButton.setOnMouseEntered(e -> groceryListButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        groceryListButton.setOnMouseExited(e -> groceryListButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        newMealButton.setOnAction(e -> {
            // create a new scene for adding a meal
            MealPlannerApp mealPlannerApp = new MealPlannerApp();
            mealPlannerApp.startAddMeal(stage);
        });

        viewMealsButton.setOnAction(e -> {
            // create a new scene for viewing meals
            MealPlannerApp mealPlannerApp = new MealPlannerApp();
            mealPlannerApp.startViewMeals(stage);
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
                "-fx-font-weight: bold; -fx-text-fill: #000000;-fx-padding: 20; -fx-spacing: 75;");
        menuTitleBox.setPadding(new Insets(20, 20, 20, 20));
        menuTitleBox.setSpacing(50);

        menuOptions.setSpacing(30);

        menuOptions.getChildren().addAll(newMealButton, viewMealsButton, deleteMealButton, groceryListButton);
        menuOptions.setAlignment(Pos.CENTER);

        menuTitleBox.getChildren().addAll(menuTitle, menuOptions);
        menuTitleBox.setAlignment(Pos.CENTER);

        Scene menuScene = new Scene(menuTitleBox, visualBounds.getWidth(), visualBounds.getHeight());
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
        VBox mealTypeBox = new VBox();
        VBox addMealBox = new VBox();
        Label mealTitle = new Label("Add Meal");
        Label mealNameLabel = new Label("Meal Name:");
        Label mealTypeLabel = new Label("Meal Type:");
        RadioButton mealTypeRB = new RadioButton("Dinner");
        RadioButton mealTypeRB2 = new RadioButton("Lunch");
        RadioButton mealTypeRB3 = new RadioButton("Breakfast");
        Label mealIngredientsLabel = new Label("Meal Ingredients:");
        TextField mealName = new TextField();
        TextArea mealIngredients = new TextArea();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        ToggleGroup mealTypeGroup = new ToggleGroup();

        mealTypeRB.setToggleGroup(mealTypeGroup);
        mealTypeRB2.setToggleGroup(mealTypeGroup);
        mealTypeRB3.setToggleGroup(mealTypeGroup);

        addMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        addMealButton.setOnMouseEntered(e -> addMealButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        addMealButton.setOnMouseExited(e -> addMealButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        cancelButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        cancelButton.setOnMouseEntered(e -> cancelButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        cancelButton.setOnMouseExited(e -> cancelButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        mealTitle.setStyle("-fx-font-family: Stencil; -fx-font-size: 50; -fx-font-weight: bold; -fx-text-fill: #000000;");

        mealName.setPromptText("Meal Name");
        mealName.setPrefWidth(100);

        mealIngredients.setPromptText("Meal Ingredients");
        mealIngredients.setPrefWidth(100);

        buttonBox.setStyle("-fx-background-color: lightblue; -fx-font-family: Stencil; -fx-font-size: 24; " +
                "-fx-font-weight: bold; -fx-text-fill: #000000; -fx-padding: 20; -fx-spacing: 75;");
        buttonBox.getChildren().addAll(addMealButton, cancelButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(30);

        addMealBox.setStyle("-fx-background-color: lightblue; -fx-font-family: Stencil; -fx-font-size: 24; " +
                "-fx-font-weight: bold; -fx-text-fill: #000000; -fx-border-color: #000000; -fx-padding: 10; -fx-spacing: 50;");
        addMealBox.getChildren().addAll(mealTypeBox, mealName, mealIngredients, buttonBox);
        addMealBox.setAlignment(Pos.CENTER);
        addMealBox.setSpacing(10);

        mealTypeBox.getChildren().addAll(mealTypeRB3, mealTypeRB2, mealTypeRB);
        mealTypeBox.setAlignment(Pos.CENTER_LEFT);
        mealTypeBox.setSpacing(20);


        Scene addMealScene = new Scene(addMealBox, visualBounds.getWidth(), visualBounds.getHeight());
        stage.setScene(addMealScene);
        stage.setTitle("Add Meal");
        stage.show();
        mealName.prefWidthProperty().bind(addMealScene.widthProperty());
        mealIngredients.prefWidthProperty().bind(addMealScene.widthProperty());


        addMealButton.setOnAction(e -> {
            // Check if the text fields are empty
            if (mealName.getText().trim().isEmpty() || mealIngredients.getText().trim().isEmpty()) {
                // Show an alert to the user
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Please fill in all the text fields.");
                alert.showAndWait();
            } else {
                // add meal to the planner
                HashMap<String, String> mealDetails = new HashMap<>();
                mealDetails.put(mealName.getText(), mealTypeRB.isSelected() ? "Dinner" : mealTypeRB2.isSelected() ? "Lunch" : "Breakfast");
//                mealDetails.put("mealIngredients", mealIngredients.getText());

                // tell the user that the meal has been added
                Label mealAdded = new Label("Meal added successfully!");
                addMealBox.getChildren().add(mealAdded);
                // add meal to the planner
                mealDetails.forEach((key, value) -> System.out.println(key + " -> " + value));
                System.out.println("Meal added!");
                // clear the text fields
                mealName.clear();
                mealIngredients.clear();
            }
        });

        cancelButton.setOnAction(e -> {
            // return to the main menu
            Main main = new Main();
            try {
                main.start(stage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    public void startViewMeals(Stage stage) {
        // create a new scene for viewing meals
        // create a table to display meals
        Label currentMeals = new Label("Current Meals");
        TableView mealsTable = new TableView();
        TableColumn mealNameCol = new TableColumn("Meal Name");
        TableColumn mealTypeCol = new TableColumn("Meal Type");
        Button backButton = new Button("Back");
        VBox viewMealsBox = new VBox();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();

        backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;");
        backButton.setOnMouseEntered(e -> backButton.setStyle("-fx-background-color: #000000; -fx-text-fill: #ffffff;"));
        backButton.setOnMouseExited(e -> backButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000;"));

        currentMeals.setStyle("-fx-font-family: Stencil; -fx-font-size: 50; -fx-font-weight: bold; -fx-text-fill: #000000;");

        mealNameCol.setMinWidth(400);
        mealTypeCol.setMinWidth(400);

        mealsTable.getColumns().addAll(mealNameCol, mealTypeCol);

        viewMealsBox.setStyle("-fx-background-color: lightblue; -fx-font-family: Stencil; -fx-font-size: 24; " +
                "-fx-font-weight: bold; -fx-text-fill: #000000; -fx-padding: 20; -fx-spacing: 75;");
        viewMealsBox.getChildren().addAll(currentMeals, mealsTable, backButton);
        viewMealsBox.setAlignment(Pos.CENTER);
        viewMealsBox.setSpacing(30);

        backButton.setOnAction(e -> {
            // return to the main menu
            Main main = new Main();
            try {
                main.start(stage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        Scene viewMealsScene = new Scene(viewMealsBox, visualBounds.getWidth(), visualBounds.getHeight());
        stage.setScene(viewMealsScene);
        stage.setTitle("View Meals");
        stage.show();
    }
}