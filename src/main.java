import java.io.File;
import java.util.Scanner;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "╔═══╗╔═══╗╔═╗─╔╗╔═══╗╔══╗╔═══╗╔═══╗╔═══╗╔═╗─╔╗\n" +
                "║╔═╗║║╔═╗║║║╚╗║║║╔══╝╚╣─╝║╔═╗║║╔═╗║║╔══╝║║╚╗║║\n" +
                "║║─╚╝║║─║║║╔╗╚╝║║╚══╗─║║─║║─╚╝║║─╚╝║╚══╗║╔╗╚╝║\n" +
                "║║─╔╗║║─║║║║╚╗║║║╔══╝─║║─║║╔═╗║║╔═╗║╔══╝║║╚╗║║\n" +
                "║╚═╝║║╚═╝║║║─║║║║║───╔╣─╗║╚╩═║║╚╩═║║╚══╗║║─║║║\n" +
                "╚═══╝╚═══╝╚╝─╚═╝╚╝───╚══╝╚═══╝╚═══╝╚═══╝╚╝─╚═╝");
        System.out.println(
                "1. ALS-241XX-8\n" +
                "2. ALS-241XX-16\n" +
                "3. ALS-241XX-24\n" +
                "4. ALS-24110P-UCN\n" +
                "5. Dlink-des1210-10\n" +
                "6. Dlink-des1210-28\n" +
                "7. Dlink-des3200-28\n" +
                "8. Eltex_mes3324f\n" +
                "9. Huawei-s2326\n" +
                "10. Huawei-s2328\n" +
                "11. Qtech-2850-28\n" +
                "12. Qtech-3500-10T\n" +
                "13. Qtech-3750-10\n" +
                "14. Qtech-3750-28\n" +
                "15. Qtech-4610-28\n" +
                "16. Topaz-2O-XX");
        System.out.println("Введите номер нужного КД: ");
        int num = input.nextInt();


        switch (num) {

            case 1:
                //Строка с телом конфига для ALS-241XX-8.
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

                String ip01 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip1 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask1 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway1 = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan1 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname1 = input.nextLine();

                String strIp = one.replaceAll("==IP==",ip1);
                String strMask = strIp.replaceAll("==MASK==",mask1);
                String strGv = strMask.replaceAll("==GATEWAY==",gateway1);
                String strVlan = strGv.replaceAll("==VLAN==",vlan1);
                String strRes = strVlan.replaceAll("==SYSNAME==",sysname1);


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
                StringSelection stringSelection = new StringSelection(strRes);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                break;

            case 2:
                //Строка с телом конфига для ALS-241XX-16.
                var two = (
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
                                "interface 0/17\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/18\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "exit\n");

                String ip02 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip2 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask2 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway2  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan2 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname2 = input.nextLine();

                String strIp2 = two.replaceAll("==IP==",ip2);
                String strMask2 = strIp2.replaceAll("==MASK==",mask2);
                String strGv2 = strMask2.replaceAll("==GATEWAY==",gateway2);
                String strVlan2 = strGv2.replaceAll("==VLAN==",vlan2);
                String strRes2 = strVlan2.replaceAll("==SYSNAME==",sysname2);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 0/17-0/18\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------");

                System.out.println(strRes2);
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
                StringSelection stringSelection2 = new StringSelection(strRes2);
                Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard2.setContents(stringSelection2, null);
                break;

            case 3:
                //Строка с телом конфига для ALS-241XX-24.
                var three = (
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
                                "interface 0/25\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/26\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/27\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/28\n" +
                                "no shutdown\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "exit");

                String ip03 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip3 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask3 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway3  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan3 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname3 = input.nextLine();

                String strIp3 = three.replaceAll("==IP==",ip3);
                String strMask3 = strIp3.replaceAll("==MASK==",mask3);
                String strGv3 = strMask3.replaceAll("==GATEWAY==",gateway3);
                String strVlan3 = strGv3.replaceAll("==VLAN==",vlan3);
                String strRes3 = strVlan3.replaceAll("==SYSNAME==",sysname3);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 0/25-0/26(-28 для некоторых моделей)\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------");

                System.out.println(strRes3);
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
                StringSelection stringSelection3 = new StringSelection(strRes3);
                Clipboard clipboard3 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard3.setContents(stringSelection3, null);
                break;

            case 4:
                //Строка с телом конфига для ALS-24110P-UCN-light.
                var four = (
                        "set prompt ==SYSNAME==\n" +
                                "network parms ==IP== ==MASK== ==GATEWAY==\n" +
                                "vlan database\n" +
                                "vlan ==VLAN==\n" +
                                "exit\n" +
                                "network mgmt_vlan ==VLAN==\n" +
                                "configure\n" +
                                "clock timezone 3 minutes 0\n" +
                                "passwords min-length 0\n" +
                                "username \"admin\" password admin123 level 15\n" +
                                "exit\n" +
                                "interface 0/6\n" +
                                "description \"UPLINK-fiber-port6\"\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/7\n" +
                                "description \"UPLINK-fiber-port7\"\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/8\n" +
                                "description \"UPLINK-fiber-port8\"\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "interface 0/9\n" +
                                "description \"UPLINK-fiber-port9\"\n" +
                                "vlan participation include ==VLAN==\n" +
                                "vlan tagging ==VLAN==\n" +
                                "exit\n" +
                                "exit\n");

                String ip04 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip4 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask4 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway4  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan4 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname4 = input.nextLine();

                String strIp4 = four.replaceAll("==IP==",ip4);
                String strMask4 = strIp4.replaceAll("==MASK==",mask4);
                String strGv4 = strMask4.replaceAll("==GATEWAY==",gateway4);
                String strVlan4 = strGv4.replaceAll("==VLAN==",vlan4);
                String strRes4 = strVlan4.replaceAll("==SYSNAME==",sysname4);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 0/6-0/9\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------");

                System.out.println(strRes4);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write memory\n" +
                        "y\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "\n" +
                        "reload\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n" +
                        "\n");
                StringSelection stringSelection4 = new StringSelection(strRes4);
                Clipboard clipboard4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard4.setContents(stringSelection4, null);
                break;

            case 5:
                //Строка с телом конфига для Dlink-des1210-10-light.
                var five = (
                        "create account admin admin\n" +
                                "admin123\n" +
                                "admin123\n" +
                                "enable password encryption\n" +
                                "# Basic\n" +
                                "config command_prompt \"==SYSNAME==\"\n" +
                                "# Vlan\n" +
                                "disable asymmetric_vlan\n" +
                                "config vlan vlanid 1 delete 1-10\n" +
                                "config vlan vlanid 1 advertisement disable\n" +
                                "create vlan \"==VLAN==\" tag ==VLAN==\n" +
                                "config vlan vlanid ==VLAN== delete 1-10\n" +
                                "config vlan vlanid ==VLAN== add tagged 9-10\n" +
                                "config vlan vlanid ==VLAN== advertisement disable\n" +
                                "# IP\n" +
                                "config ipif System ipaddress ==IP==/==MASK== vlan \"==VLAN==\"\n" +
                                "create iproute default ==GATEWAY==");

                String ip05 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip5 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask5 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway5  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan5 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname5 = input.nextLine();

                String strIp5 = five.replaceAll("==IP==",ip5);
                String strMask5 = strIp5.replaceAll("==MASK==",mask5);
                String strGv5 = strMask5.replaceAll("==GATEWAY==",gateway5);
                String strVlan5 = strGv5.replaceAll("==VLAN==",vlan5);
                String strRes5 = strVlan5.replaceAll("==SYSNAME==",sysname5);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 9-10\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------");

                System.out.println(strRes5);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию */\n" +
                        "\n" +
                        "save\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "\n" +
                        "reboot\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123");
                StringSelection stringSelection5 = new StringSelection(strRes5);
                Clipboard clipboard5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard5.setContents(stringSelection5, null);
                break;

            case 6:
                //Строка с телом конфига для Dlink-des1210-28-light.
                var six = (
                        "create account admin admin\n" +
                                "admin123\n" +
                                "admin123\n" +
                                "enable password encryption\n" +
                                "# Basic\n" +
                                "config command_prompt \"==SYSNAME==\"\n" +
                                "# Vlan\n" +
                                "disable asymmetric_vlan\n" +
                                "config vlan vlanid 1 delete 1-28\n" +
                                "config vlan vlanid 1 advertisement disable\n" +
                                "create vlan \"==VLAN==\" tag ==VLAN==\n" +
                                "config vlan vlanid ==VLAN== delete 1-28\n" +
                                "config vlan vlanid ==VLAN== add tagged 27-28\n" +
                                "config vlan vlanid ==VLAN== advertisement disable\n" +
                                "# IP\n" +
                                "config ipif System ipaddress ==IP==/==MASK== vlan \"==VLAN==\"\n" +
                                "create iproute default ==GATEWAY==");

                String ip06 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip6 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask6 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway6  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan6 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname6 = input.nextLine();

                String strIp6 = six.replaceAll("==IP==",ip6);
                String strMask6 = strIp6.replaceAll("==MASK==",mask6);
                String strGv6 = strMask6.replaceAll("==GATEWAY==",gateway6);
                String strVlan6 = strGv6.replaceAll("==VLAN==",vlan6);
                String strRes6 = strVlan6.replaceAll("==SYSNAME==",sysname6);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 27-28\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------");

                System.out.println(strRes6);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию */\n" +
                        "\n" +
                        "save\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "\n" +
                        "reboot\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123");
                StringSelection stringSelection6 = new StringSelection(strRes6);
                Clipboard clipboard6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard6.setContents(stringSelection6, null);
                break;


            default:
                System.out.println("Ошибка программа завершает работу");
        }


        System.out.println("Для завершения нажмите ENTER.\n" +
                "Конфигурация будет скопирована в буфер обмена.");
        var num000 = input.nextLine();

    }
}
