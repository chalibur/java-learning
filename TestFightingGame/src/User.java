import java.util.Random;

public class User {
    /*
    1. 用户类：
属性：id、用户名、密码、状态

各属性描述：
id：
用户无法设置，是自动生成的，格式为：heima+5位数字的随机数
用户名username：
用户名唯一
长度必须在3 ~ 16位
只能由字母、数字组成，不能是纯数字
3，密码要求：

长度3 ~ 8位
只能是字母加数字的组合，不能有其他字母
4，状态state

默认是可使用状态
如果密码连续输错3次，修改为不可使用状态
     */
    private String id;
    private String username;
    private String password;
    private int state;

    public User() {
    }

    public User(String id, String username, String password, int state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.state = state;
    }

    public String getId() {
        return id;
    }
    Random r = new Random();
    // 生成id,不能由用户自己设置，只能由heima+五位数字组成
    public void setId( ) {
        this.id = "heima"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+r.nextInt(9);
    }
    //用户名唯一
    //长度必须在3 ~ 16位
    //只能由字母、数字组成，不能是纯数字
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        int count=0;
        if(username.length()>=3&&username.length()<=16){
            for (int i = 0; i < username.length(); i++) {
                if(username.charAt(i)>='0'&&username.charAt(i)<='9')
                    count++;
            }
            if(count!=username.length()){
                this.username = username;
            }
            else{
                System.out.println("用户名只能由字母、数字组成，不能是纯数字");
            }
        }else{
            System.out.println("用户名长度必须在3 ~ 16位");
        }

    }

    public String getPassword() {
        return password;
    }
//长度3 ~ 8位
//只能是字母加数字的组合，不能有其他字母
    public void setPassword(String password) {
        if(password.length()>=3&&password.length()<=8){

        }
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
