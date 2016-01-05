package routeFinder;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    Scene scene;
    Button searchBtn;
    TextArea display;
    ComboBox<String> boxFrom;
    ComboBox<String> boxTo;
    StationManager sm;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        sm = new StationManager();
        window = primaryStage;
        window.setTitle("Train Express - Route Finder");
        searchBtn = new Button("Search");
        display = new TextArea();
        display.setEditable(false);

        boxFrom = new ComboBox<>();
        boxTo = new ComboBox<>();

        boxFrom.getItems().addAll(sm.getStations().keySet());
        boxTo.getItems().addAll(sm.getStations().keySet());
        boxFrom.setPrefWidth(80);
        boxTo.setPrefWidth(80);
        boxFrom.setPromptText("From:");
        boxTo.setPromptText("To:");
        searchBtn.setOnAction(e -> search());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(boxFrom, boxTo, searchBtn, display);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void search() {
        Search srch = new Search();
        Route route = srch.search(sm.getStations().get(boxFrom.getValue()), sm.getStations().get(boxTo.getValue()));
        if(route == Route.EMPTY)display.setText("You have selected the same Station! \nPlease select another one for destination!");
        else display.setText(route.toString());
    }


}

