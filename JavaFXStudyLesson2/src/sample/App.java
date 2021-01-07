package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    /*
    这个是初始化函数，在start函数之前运行。如果不进行重载的话就会默认为空。
     */
//    @Override
//    public void init() throws Exception {
//        super.init();
//    }

    /*
    注意！start是必须覆盖的一个函数
     */
    @Override
    public void start(Stage stage) throws Exception {
        Stage mainStage = new Stage();
        mainStage.setTitle("MainWindow");

        mainStage.setX(50);
        mainStage.setY(50);


        /**
         * 这里一共有两个方法：show()和showAndWait()。
         * 它们的区别是：show()在显示之后就会直接退出。showAndWait()在显示之后不会立即退出，而是滞留在这个方法中，直到Stage关闭的时候才一同退出。
         */
        mainStage.show();


    }

    /*
    同init
     */
//    @Override
//    public void stop() throws Exception {
//        super.stop();
//    }
}
