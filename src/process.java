public class process {
    void process1(){
        hero word=new hero();
        word.renwu();
        monster word1=new monster();
        word1.guaiwu();

        System.out.println("战斗开始。");
        for (int i=0;;) {
            int a = word1.att - word.def;
            if (a <= 0) {
                a = 1;
            }
            int b = word.att - word1.def;
            if (b <= 0) {
                b = 1;
            }

            System.out.println("第" + (i + 1) + "回合。");
            word.HP = word.HP - a;
            System.out.println(word.name + "对" + word1.name + "造成了" + b + "伤害。");
            word1.HP = word1.HP - b;
            System.out.println(word1.name + "对" + word.name + "造成了" + a + "伤害。");
            System.out.println(word.name + "还剩余" + word.HP + "的血量。");
            System.out.println(word1.name + "还剩余" + word1.HP + "的血量。");
            if (word.HP > 0 && word1.HP > 0) {
                i++;
            } else if (word1.HP <= 0 && word.HP > 0) {
                System.out.println(word1.name + "打败了" + word.name + "。");
                break;
            } else if (word.HP <= 0 && word1.HP <= 0) {
                System.out.println("两人同归于尽！");
                break;
            } else if (a == 0 && b == 0) {
                System.out.println("这俩人无法让对方受到伤害。（打假赛）");
                break;
            } else if(word.HP<=0&&word1.HP>0) {
                System.out.println(word.name + "打败了" + word1.name + "。");
                break;
            }
        }
    }
}
