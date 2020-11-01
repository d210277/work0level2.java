import java.util.Scanner;
public class hero {

        String name;
        int HP;
        int att;
        int def;
        void renwu(){
            Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英雄的姓名");
        name=scanner.next();
        System.out.println("请输入英雄的攻击力");
        att = scanner.nextInt();
        System.out.println("请输入英雄的防御力");
        def =scanner.nextInt();
        System.out.println("请输入英雄的血量");
        HP =scanner.nextInt();
            System.out.println("\n姓名："+name+"\n生命值"+HP+"\n攻击力"+att+"\n防御力"+def);
        }

//


}
