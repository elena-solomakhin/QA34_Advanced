package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DragBasicScreen extends BaseScreen {
    public DragBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/drag_handle']" )
    List<MobileElement> list;


    public    DragBasicScreen dragUp(int index, int count) {

        MobileElement element= list.get(index);
        Rectangle rect=element.getRect();
        int xFrom=  rect.getX()+rect.getWidth()/2;
        int yFrom= rect.getY()+rect.getWidth()/2;
        int yTo= yFrom- rect.getHeight()*count ;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();
        return this;
    }
    public DragBasicScreen dragDownWindow() {
        MobileElement element= list.get(0);
        Rectangle rect=element.getRect();
        int xFrom= rect.getX()+ rect.getWidth()/2;
        int yFrom= rect.getY()+rect.getHeight()/2;
        int yTo= driver.manage().window().getSize().getHeight()- rect.getHeight()/2;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();


        return this;
    }
    public DragBasicScreen DragDown(int index, int count) {
        MobileElement element= list.get(index);
        Rectangle rect=element.getRect();
        int xFrom= rect.getX()+ rect.getWidth()/2;
        int yFrom= rect.getY()+rect.getHeight()/2;
        int yTo= yFrom+ rect.getHeight()*count;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();

        return this;
    }
    public DragBasicScreen dragDown1(int index) {
        MobileElement element= list.get(index);
        Rectangle rect=element.getRect();
        int xFrom= rect.getX()+ rect.getWidth()/2;
        int yFrom= rect.getY()+rect.getHeight()/2;
        int yTo= yFrom+ rect.getHeight();

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,yFrom))
                .moveTo(PointOption.point(xFrom,yTo))
                .release()
                .perform();


        return this;
    }
}
