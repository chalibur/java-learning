import com.itheima.domain.User;

public class UserTest {
    public static void main(String[] args){
        User user1=new User();

        System.out.println(user1.getId());
        user1.setUsername("zhangsan12138" );
        System.out.println(user1.getUsername());
    }
}
