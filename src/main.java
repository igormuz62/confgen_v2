import java.io.File;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер КД: ");
        int num = input.nextInt();
        String ip1 = input.nextLine();
        System.out.print("Введите IP КД: ");
        String ip = input.nextLine();
        System.out.print("Введите Mask КД: ");
        var mask = input.nextLine();
        System.out.print("Введите IP шлюза КД: ");
        var gateway = input.nextLine();
        System.out.print("Введите номер VLAN: ");
        var vlan = input.nextLine();
        System.out.print("Введите Name КД: ");
        var sysname = input.nextLine();
        switch (num) {
            case 1:
                var one = (

                        "set prompt \"==SYSNAME==\"\n" +
                                "network parms ==IP== ==MASK== ==GATEWAY==\n" +
                                "vlan database\n" +
                                "vlan ==VLAN==\n" +
                                "vlan name ==VLAN== \"nms\"\n" +
                                "exit\n" +
                                "network mgmt_vlan ==VLAN==\n" +
                                "configure\n" +
                                "passwords min-length 0\n" +
                                "username \"admin\" password admin123 level 15\n" +
                                "interface 0/9\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/10\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "exit\n");

                String strIp = one.replaceAll("==IP==",ip);
                String strMask = strIp.replaceAll("==MASK==",mask);
                String strGv = strMask.replaceAll("==GATEWAY==",gateway);
                String strVlan = strGv.replaceAll("==VLAN==",vlan);
                String strRes = strVlan.replaceAll("==SYSNAME==",sysname);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 0/9-0/10\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "write memory\n" +
                        "y\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "reload\n" +
                        "y\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n");
            default:
                System.out.print("DEFAULT");
        }

    }
}
