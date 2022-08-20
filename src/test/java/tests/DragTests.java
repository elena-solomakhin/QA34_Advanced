package tests;

import config.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.DragScreen;

public class DragTests extends AppiumConfiguration {

    @Test
    public void dragDown(){
        new DragScreen(driver)
                .selectDraggbleBasic()
                .DragDown(1,2);
//      .dragDownWindow();
    }
    @Test
    public void dragUp(){
        new DragScreen(driver)
                .selectDraggbleBasic()
                .dragUp(5,3);
    }


}
