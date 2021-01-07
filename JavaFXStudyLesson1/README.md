# Lesson1：安装JavaFX，基本的图形绘制

## JavaFX配置、安装和使用
首先，我们要清楚一点：JavaFX从Java11以后的版本就已经脱离出去了。因此如果我们使用的Java版本比较高，就需要手动下载并进行相关配置。
此处我们使用的是Java15的版本，因此要自己下载相关安装包。
包在仓库的lib地址中有所保留，也可以通过官方网址下载：https://gluonhq.com/products/javafx/

## JavaFX在IDEA中的配置
IDEA自带对JavaFX的支持，可以从其预设模板中直接选择生成即可。
（不知道为什么IDEA默认对JavaFX加载了Gradel）

## 两种基本配置方法

### IDEA官方推荐方法
1. 初始化JavaFX项目
2. 安装相关lib
3. 修改VM配置
    1. Run->Edit Configurations中，在Build and run（右上角）找到Modify options
    2. 选择 Add VM Option
    3. 在VM Option配置中添加以下内容：

    '''
    --module-path
    （添加包的路径，如E:\JavaFxStudy\lib）
    --add-modules
    javafx.controls,javafx.fxml
    --add-exports
    javafx.graphics/com.sun.javafx.sg.prism=ALL-UNNAMED
    '''
4. 直接可运行

### 无VM配置方法
1. 初始化JavaFX项目
2. 安装相关lib
3. 创建一个App类，把Main中的代码（继承Application的内容）转移到App类中
4. 使用一个普通的Main调用App类

### 为什么会有这两种方法？
在查阅一些资料后，没有找到非常准确的答案。
个人推测，大致的可能是，由于JavaFX在创建的时候是需要启动一个JavaFX运行环境所导致的。
需要注意的是，在无VM配置方法中，Main方法实际上是从基本的JVM开始调用。在这之后才通过Application的launch方法构建JavaFX运行环境。
而在官方推荐方法中，VM在启动的时候就已经运载了相关的环境。因此就可以直接把Main类继承Application来使用。