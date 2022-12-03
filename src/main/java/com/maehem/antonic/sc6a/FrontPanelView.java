/*
 * Copyright 2022 Mark J. Koch
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.maehem.antonic.sc6a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author mark
 */
public class FrontPanelView extends Application {

    private Stage stage;
    private static final String APP_NAME = "Antonic SuperCon.6 Badge Computer";

    private final BorderPane chassisPane = new BorderPane();

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setResizable(false);
        stage.setTitle(APP_NAME);
        initProperties();
        chassisPane.setPrefWidth(512);
        chassisPane.setPrefHeight(342);
        chassisPane.setCenter(new Label("SC6"));

        var scene = new Scene(chassisPane);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
                        
        stage.show();
    }

    private void initProperties() {

    }

    public static void main(String[] args) {
        launch();
    }


}
