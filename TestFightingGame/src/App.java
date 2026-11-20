import com.itheima.domain.HeroCharacter;
import com.itheima.ui.FightingGame;
import com.itheima.ui.Login;

public class App {
    /*
    启动类
    当作程序的启动类
    不写任何的业务逻辑
     */
    public static void main(String[] args){
      /*  Login l=new Login();
        l.start();
        */
       FightingGame fg=new FightingGame();
       fg.gameStart("zhangsan");



    }
}
