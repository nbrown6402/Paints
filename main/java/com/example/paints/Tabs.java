package com.example.paints;

import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;

public class Tabs extends Tab {

    /**
     * adds a new tab
     * @param tabPane
     * @param i
     * @param tam
     */
    public void addTab(TabPane tabPane, int i, Tab tam) {
        Tab tab = new Tab("Tab: " + i);
        tab.setContent(createTabContent());
       // tab.setContent(tam.getContent());
        tabPane.getTabs().add(tab);
        tabPane.getSelectionModel().select(tab);


        //Tab tab = tabpain.getTabs().get(tabpain.getSelectionModel().getSelectedIndex());
    }

    /**
     * Creates the content that will be on a new tab
     * @return
     */
    private Node createTabContent() {
        ScrollPane scroll = new ScrollPane();
        Canvas canvas = new Canvas(500, 500);
        scroll.setContent(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUE);
        gc.fillRect(0,0,500, 500);
        return canvas;
    }

    /**
     * gets the current tab
     * @param pane
     * @return
     */
    //public Tab getTabs(TabPane pane) {
      //  return (Tab) pane.getSelectionModel().getSelectedItem().

  //  }


}

