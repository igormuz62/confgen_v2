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
        System.out.print("Введите номер нужного КД: ");
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
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

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
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

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
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

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
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

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
                        "Password:\tadmin123\n");
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
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

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
                        "Password:\tadmin123\n");
                StringSelection stringSelection6 = new StringSelection(strRes6);
                Clipboard clipboard6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard6.setContents(stringSelection6, null);
                break;

            case 7:
                //Строка с телом конфига для Dlink-des3200-28.
                var seven = (
                                "create account admin admin\n" +
                                "admin123\n" +
                                "admin123\n" +
                                "enable password encryption\n" +
                                "# Basic\n" +
                                "config command_prompt ==SYSNAME==\n" +
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

                String ip07 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip7 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask7 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway7  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan7 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname7 = input.nextLine();

                String strIp7 = seven.replaceAll("==IP==",ip7);
                String strMask7 = strIp7.replaceAll("==MASK==",mask7);
                String strGv7 = strMask7.replaceAll("==GATEWAY==",gateway7);
                String strVlan7 = strGv7.replaceAll("==VLAN==",vlan7);
                String strRes7 = strVlan7.replaceAll("==SYSNAME==",sysname7);


                System.out.print("Для подключения к коммутатору концентрации использовать порты 27-28\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes7);
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
                        "Password:\tadmin123\n");
                StringSelection stringSelection7 = new StringSelection(strRes7);
                Clipboard clipboard7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard7.setContents(stringSelection7, null);
                break;

            case 8:
                //Строка с телом конфига для Eltex_mes3324f_light.
                var eith = (
                                "enable\n" +
                                "config\n" +
                                "!\n" +
                                "hostname ==SYSNAME==\n" +
                                "!\n" +
                                "vlan 1-4094\n" +
                                "vlan ==VLAN== name nms\n" +
                                "interface Vlan ==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "exit\n" +
                                "ip route 0.0.0.0 0.0.0.0 ==GATEWAY==\n" +
                                "!\n" +
                                "no spanning-tree\n" +
                                "!\n" +
                                "aaa authentication login auth default local\n" +
                                "aaa authentication mode break\n" +
                                "username admin password admin123 privilege 15\n" +
                                "enable password level 15 admin123\n" +
                                "!\n" +
                                "interface range GigabitEthernet1/0/23-24\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan add <VLAN>\n" +
                                "exit\n" +
                                "interface range TengigabitEthernet1/0/1-4\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan add <VLAN>\n" +
                                "end\n");

                String ip08 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip8 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask8 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway8  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan8 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname8 = input.nextLine();

                String strIp8 = eith.replaceAll("==IP==",ip8);
                String strMask8 = strIp8.replaceAll("==MASK==",mask8);
                String strGv8 = strMask8.replaceAll("==GATEWAY==",gateway8);
                String strVlan8 = strGv8.replaceAll("==VLAN==",vlan8);
                String strRes8 = strVlan8.replaceAll("==SYSNAME==",sysname8);


                System.out.print("ДДля подключения к коммутатору концентрации по оптике использовать порты TenGigabitEthernet1/0/1-1/0/4 или GigabitEthernet 1/0/23-1/0/24\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes8);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "write\n" +
                        "y\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "reload\n" +
                        "y\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n" +
                        "\n");
                StringSelection stringSelection8 = new StringSelection(strRes8);
                Clipboard clipboard8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard8.setContents(stringSelection8, null);
                break;

            case 9:
                //Строка с телом конфига для huawei-s2326-light.
                var nine = (
                                "undo terminal debugging\n" +
                                "undo terminal monitor\n" +
                                "system\n" +
                                "#\n" +
                                "sysname ==SYSNAME==\n" +
                                "vlan ==VLAN==\n" +
                                "interface Vlanif==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "#\n" +
                                "aaa\n" +
                                "authentication-scheme default\n" +
                                "authorization-scheme default\n" +
                                "accounting-scheme default\n" +
                                "domain default\n" +
                                "domain default_admin\n" +
                                "local-user admin password cipher admin123\n" +
                                "local-user admin privilege level 15\n" +
                                "local-user admin ftp-directory flash:\n" +
                                "local-user admin service-type telnet terminal ftp http\n" +
                                "local-user anklav password cipher D/22a6V3a!L\\^:@]CG5HT_Q!!\n" +
                                "local-user anklav privilege level 15\n" +
                                "local-user anklav ftp-directory flash:\n" +
                                "local-user anklav service-type telnet terminal ftp\n" +
                                "#\n" +
                                "ip route-static 0.0.0.0 0.0.0.0 ==GATEWAY==\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/1\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "combo-port auto\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/2\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "combo-port auto\n" +
                                "#\n" +
                                "user-interface maximum-vty 4\n" +
                                "user-interface con 0\n" +
                                "authentication-mode aaa\n" +
                                "idle-timeout 0 0\n" +
                                "user-interface vty 0 3\n" +
                                "authentication-mode aaa\n" +
                                "idle-timeout 10 1\n" +
                                "q\n" +
                                "q\n");

                String ip09 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip9 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask9 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway9  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan9 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname9 = input.nextLine();

                String strIp9 = nine.replaceAll("==IP==",ip9);
                String strMask9 = strIp9.replaceAll("==MASK==",mask9);
                String strGv9 = strMask9.replaceAll("==GATEWAY==",gateway9);
                String strVlan9 = strGv9.replaceAll("==VLAN==",vlan9);
                String strRes9 = strVlan9.replaceAll("==SYSNAME==",sysname9);


                System.out.print("Для подключения к коммутатору концентрации использовать порты GigabitEthernet0/0/1-GigabitEthernet0/0/2" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes9);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "save\n" +
                        "y\n" +
                        "y\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор */\n" +
                        "\n" +
                        "reboot\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n");
                StringSelection stringSelection9 = new StringSelection(strRes9);
                Clipboard clipboard9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard9.setContents(stringSelection9, null);
                break;

            case 10:
                //Строка с телом конфига для huawei-s2328-light.
                var ten = (
                                "undo terminal debugging\n" +
                                "undo terminal monitor\n" +
                                "system\n" +
                                "#\n" +
                                "sysname ==SYSNAME==\n" +
                                "vlan ==VLAN==\n" +
                                "interface Vlanif==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "#\n" +
                                "aaa\n" +
                                "authentication-scheme default\n" +
                                "authorization-scheme default\n" +
                                "accounting-scheme default\n" +
                                "domain default\n" +
                                "domain default_admin\n" +
                                "local-user admin password cipher admin123\n" +
                                "local-user admin privilege level 15\n" +
                                "local-user admin ftp-directory flash:\n" +
                                "local-user admin service-type telnet terminal ftp http\n" +
                                "local-user anklav password cipher %@%@c@W\"6X)Qw>d4##6lB,G3=2!h%@%@\n" +
                                "local-user anklav privilege level 15\n" +
                                "local-user anklav ftp-directory flash:\n" +
                                "local-user anklav service-type telnet terminal ftp\n" +
                                "#\n" +
                                "ip route-static 0.0.0.0 0.0.0.0 ==GATEWAY==\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/1\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/2\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/3\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "#\n" +
                                "interface GigabitEthernet0/0/4\n" +
                                "undo port hybrid vlan 1\n" +
                                "port hybrid tagged vlan ==VLAN==\n" +
                                "#\n" +
                                "user-interface maximum-vty 4\n" +
                                "user-interface con 0\n" +
                                "authentication-mode aaa\n" +
                                "idle-timeout 0 0\n" +
                                "user-interface vty 0 3\n" +
                                "authentication-mode aaa\n" +
                                "idle-timeout 10 1\n" +
                                "q\n" +
                                "q\n");

                String ip010 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip10 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask10 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway10  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan10 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname10 = input.nextLine();

                String strIp10 = ten.replaceAll("==IP==",ip10);
                String strMask10 = strIp10.replaceAll("==MASK==",mask10);
                String strGv10 = strMask10.replaceAll("==GATEWAY==",gateway10);
                String strVlan10 = strGv10.replaceAll("==VLAN==",vlan10);
                String strRes10 = strVlan10.replaceAll("==SYSNAME==",sysname10);


                System.out.print("Для подключения к коммутатору концентрации использовать порты GigabitEthernet0/0/1-GigabitEthernet0/0/4" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes10);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "save\n" +
                        "y\n" +
                        "y\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "\n" +
                        "reboot\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n");
                StringSelection stringSelection10 = new StringSelection(strRes10);
                Clipboard clipboard10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard10.setContents(stringSelection10, null);
                break;

            case 11:
                //Строка с телом конфига для qtech-2850-28-light.
                var eleven = (
                                                "enable\n" +
                                                "config\n" +
                                                "!\n" +
                                                "username admin privilege 15 password 0 admin123\n" +
                                                "!\n" +
                                                "hostname ==SYSNAME==\n" +
                                                "!\n" +
                                                "vlan ==VLAN==\n" +
                                                "name nms\n" +
                                                "!\n" +
                                                "Interface Ethernet1/0/26\n" +
                                                "media-type copper \n" +
                                                "switchport mode trunk\n" +
                                                "switchport trunk allowed vlan ==VLAN==\n" +
                                                "!\n" +
                                                "Interface Ethernet1/0/27\n" +
                                                "switchport mode trunk\n" +
                                                "switchport trunk allowed vlan ==VLAN==\n" +
                                                "!\n" +
                                                "Interface Ethernet1/0/28\n" +
                                                "switchport mode trunk\n" +
                                                "switchport trunk allowed vlan ==VLAN==\n" +
                                                "!\n" +
                                                "interface Vlan==VLAN==\n" +
                                                "ip address ==IP== ==MASK==\n" +
                                                "!\n" +
                                                "ip route 0.0.0.0/0 ==GATEWAY==\n" +
                                                "!\n" +
                                                "authentication line console login local\n" +
                                                "!\n" +
                                                "end\n");

                String ip011 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip11 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask11 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway11  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan11 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname11 = input.nextLine();

                String strIp11 = eleven.replaceAll("==IP==",ip11);
                String strMask11 = strIp11.replaceAll("==MASK==",mask11);
                String strGv11 = strMask11.replaceAll("==GATEWAY==",gateway11);
                String strVlan11 = strGv11.replaceAll("==VLAN==",vlan11);
                String strRes11 = strVlan11.replaceAll("==SYSNAME==",sysname11);


                System.out.print("Для подключения к коммутатору концентрации по оптике использовать порты Ethernet1/0/27-Ethernet1/0/28\n" +
                        "Для подключения по меди использовать порт Ethernet1/0/26\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes11);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "write\n" +
                        "y<\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "reload\n" +
                        "y\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n");
                StringSelection stringSelection11 = new StringSelection(strRes11);
                Clipboard clipboard11 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard11.setContents(stringSelection11, null);
                break;

            case 12:
                //Строка с телом конфига для qtech-3500-10T-light.
                var twelve = (
                                "enable\n" +
                                "config\n" +
                                "!\n" +
                                "username admin privilege 15 password 0 admin123\n" +
                                "!\n" +
                                "hostname ==SYSNAME==\n" +
                                "!\n" +
                                "vlan ==VLAN==\n" +
                                " name nms\n" +
                                "!\n" +
                                "Interface Ethernet1/0/9\n" +
                                " switchport mode trunk\n" +
                                " switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/10\n" +
                                " switchport mode trunk\n" +
                                " switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "interface Vlan==VLAN==\n" +
                                " ip address ==IP== ==MASK==\n" +
                                "!\n" +
                                "ip route 0.0.0.0/0 ==GATEWAY==\n" +
                                "!\n" +
                                "authentication line console login local\n" +
                                "!\n" +
                                "end\n");

                String ip012 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip12 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask12 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway12  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan12 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname12 = input.nextLine();

                String strIp12 = twelve.replaceAll("==IP==",ip12);
                String strMask12 = strIp12.replaceAll("==MASK==",mask12);
                String strGv12 = strMask12.replaceAll("==GATEWAY==",gateway12);
                String strVlan12 = strGv12.replaceAll("==VLAN==",vlan12);
                String strRes12 = strVlan12.replaceAll("==SYSNAME==",sysname12);


                System.out.print("Для подключения к коммутатору концентрации по оптике использовать порты Ethernet1/0/9-1/0/10 \n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes12);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write\n" +
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
                        "Password:\tadmin123\n");
                StringSelection stringSelection12 = new StringSelection(strRes12);
                Clipboard clipboard12 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard12.setContents(stringSelection12, null);
                break;

            case 13:
                //Строка с телом конфига для qtech-3750-10-light.
                var thirteen = (
                                "enable\n" +
                                "config\n" +
                                "!\n" +
                                "username admin privilege 15 password 0 admin123\n" +
                                "!\n" +
                                "hostname ==SYSNAME==\n" +
                                "!\n" +
                                "vlan ==VLAN==\n" +
                                "name nms\n" +
                                "!\n" +
                                "Interface Ethernet1/0/9\n" +
                                "media-type copper\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/10\n" +
                                "switchport mode trunk\\n" +
                                "switchport trunk allowed vlan <VLAN>\n" +
                                "!\n" +
                                "interface Vlan==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "!\n" +
                                "ip route 0.0.0.0/0 ==GATEWAY==\n" +
                                "!\n" +
                                "authentication line console login local\n" +
                                "!\n" +
                                "end\n");

                String ip013 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip13 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask13 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway13  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan13 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname13 = input.nextLine();

                String strIp13 = thirteen.replaceAll("==IP==",ip13);
                String strMask13 = strIp13.replaceAll("==MASK==",mask13);
                String strGv13 = strMask13.replaceAll("==GATEWAY==",gateway13);
                String strVlan13 = strGv13.replaceAll("==VLAN==",vlan13);
                String strRes13 = strVlan13.replaceAll("==SYSNAME==",sysname13);


                System.out.print(
                        "Для подключения к коммутатору концентрации по оптике использовать порт Ethernet1/0/10\n" +
                        "Для подключения по меди использовать порт Ethernet1/0/9\n" +
                        "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes13);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write\n" +
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
                        "Password:\tadmin123\n");
                StringSelection stringSelection13 = new StringSelection(strRes13);
                Clipboard clipboard13 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard13.setContents(stringSelection13, null);
                break;

            case 14:
                //Строка с телом конфига для qtech-3750-28-light.
                var fourteen = (
                                "enable\n" +
                                "config\n" +
                                "!\n" +
                                "username admin privilege 15 password 0 admin123\n" +
                                "!\n" +
                                "hostname ==SYSNAME==\n" +
                                "!\n" +
                                "vlan ==VLAN==\n" +
                                " name nms\n" +
                                "!\n" +
                                "Interface Ethernet1/0/26\n" +
                                "media-type copper\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/27\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/28\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "interface Vlan==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "!</br>\\n\\\n" +
                                "ip route 0.0.0.0/0 ==GATEWAY==\n" +
                                "!\n" +
                                "authentication line console login local\n" +
                                "!\n" +
                                "end\n");

                String ip014 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip14 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask14 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway14  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan14 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname14 = input.nextLine();

                String strIp14 = fourteen.replaceAll("==IP==",ip14);
                String strMask14 = strIp14.replaceAll("==MASK==",mask14);
                String strGv14 = strMask14.replaceAll("==GATEWAY==",gateway14);
                String strVlan14 = strGv14.replaceAll("==VLAN==",vlan14);
                String strRes14 = strVlan14.replaceAll("==SYSNAME==",sysname14);


                System.out.print(
                                "Для подключения к коммутатору концентрации по оптике использовать порты Ethernet1/0/27-Ethernet1/0/28\n" +
                                "Для подключения по меди использовать порт Ethernet1/0/26\n" +
                                "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes14);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write\n" +
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
                        "Password:\tadmin123\n");
                StringSelection stringSelection14 = new StringSelection(strRes14);
                Clipboard clipboard14 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard14.setContents(stringSelection14, null);
                break;

            case 15:
                //Строка с телом конфига для qtech-4610-28-light.
                var fiveteen = (
                                "enable\n" +
                                "config\n" +
                                "!\n" +
                                "username admin privilege 15 password 0 admin123\\n" +
                                "!\n" +
                                "hostname ==SYSNAME==\n" +
                                "!\n" +
                                "vlan ==VLAN==\n" +
                                "name nms\n" +
                                "!\n" +
                                "Interface Ethernet1/0/26\n" +
                                "media-type copper\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/27\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "Interface Ethernet1/0/28\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan ==VLAN==\n" +
                                "!\n" +
                                "interface Vlan==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "!\n" +
                                "ip route 0.0.0.0/0 ==GATEWAY==\n" +
                                "!\n" +
                                "authentication line console login local\n" +
                                "!\n" +
                                "end\n");

                String ip015 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip15 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask15 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway15  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan15 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname15 = input.nextLine();

                String strIp15 = fiveteen.replaceAll("==IP==",ip15);
                String strMask15 = strIp15.replaceAll("==MASK==",mask15);
                String strGv15 = strMask15.replaceAll("==GATEWAY==",gateway15);
                String strVlan15 = strGv15.replaceAll("==VLAN==",vlan15);
                String strRes15 = strVlan15.replaceAll("==SYSNAME==",sysname15);


                System.out.print(
                        "Для подключения к коммутатору концентрации по оптике использовать порты Ethernet1/0/27-Ethernet1/0/28\n" +
                                "Для подключения по меди использовать порт Ethernet1/0/26\n" +
                                "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes15);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write\n" +
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
                        "Password:\tadmin123\n");
                StringSelection stringSelection15 = new StringSelection(strRes15);
                Clipboard clipboard15 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard15.setContents(stringSelection15, null);
                break;

            case 16:
                //Строка с телом конфига для topaz-2O-XX-light.
                var sixteen = (
                        "configure\n" +
                                "vlan database\n" +
                                "vlan ==VLAN==\n" +
                                "exit\n" +
                                "hostname ==SYSNAME==\n" +
                                "username admin privilege 15 password admin123\n" +
                                "!\n" +
                                "interface vlan 1\n" +
                                "no ip address dhcp\n" +
                                "!\n" +
                                "interface vlan ==VLAN==\n" +
                                "ip address ==IP== ==MASK==\n" +
                                "!\n" +
                                "interface gigabitethernet1/1/1\n" +
                                "description UPLINK\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan add ==VLAN==\n" +
                                " no shutdown\n" +
                                "!\n" +
                                "interface gigabitethernet1/1/2\n" +
                                "description UPLINK\n" +
                                "switchport mode trunk\n" +
                                "switchport trunk allowed vlan add ==VLAN==\n" +
                                "no shutdown\n" +
                                "!\n" +
                                "exit\n" +
                                "ip default-gateway ==GATEWAY==\n" +
                                "exit\n");

                String ip016 = input.nextLine();
                System.out.print("Введите IP КД: ");
                String ip16 = input.nextLine();
                System.out.print("Введите Mask КД: ");
                var mask16 = input.nextLine();
                System.out.print("Введите IP шлюза КД: ");
                var gateway16  = input.nextLine();
                System.out.print("Введите номер VLAN: ");
                var vlan16 = input.nextLine();
                System.out.print("Введите Name КД: ");
                var sysname16 = input.nextLine();

                String strIp16 = sixteen.replaceAll("==IP==",ip16);
                String strMask16 = strIp16.replaceAll("==MASK==",mask16);
                String strGv16 = strMask16.replaceAll("==GATEWAY==",gateway16);
                String strVlan16 = strGv16.replaceAll("==VLAN==",vlan16);
                String strRes16 = strVlan16.replaceAll("==SYSNAME==",sysname16);


                System.out.print(
                        "Для подключения к коммутатору концентрации использовать порты Ethernet1/1/1-Ethernet1/1/2 \n" +
                                "----------------НАЧАЛО КОНФИГУРАЦИИ----------------\n");

                System.out.println(strRes16);
                System.out.print("----------------КОНЕЦ КОНФИГУРАЦИИ----------------\n" +
                        "/* Сохраняем конфигурацию с подтверждением */\n" +
                        "\n" +
                        "write mem\n" +
                        "y\n" +
                        "\n" +
                        "/* Перезагружаем коммутатор с подтверждением */\n" +
                        "\n" +
                        "reload\n" +
                        "y\n" +
                        "y\n" +
                        "\n" +
                        "/* После перезагрузки подключиться к коммутатору для проверки */\n" +
                        "\n" +
                        "Login:\t\tadmin\n" +
                        "Password:\tadmin123\n");
                StringSelection stringSelection16 = new StringSelection(strRes16);
                Clipboard clipboard16 = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard16.setContents(stringSelection16, null);
                break;

            default:
                System.out.println("Ошибка программа завершает работу \n" +
                        "╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗\n" +
                        "║╔══╝║╔═╗║║╔═╗║║╔═╗║║╔═╗║\n" +
                        "║╚══╗║╚═╝║║╚═╝║║║─║║║╚═╝║\n" +
                        "║╔══╝║╔╗╔╝║╔╗╔╝║║─║║║╔╗╔╝\n" +
                        "║╚══╗║║║╚╗║║║╚╗║╚═╝║║║║╚╗\n" +
                        "╚═══╝╚╝╚═╝╚╝╚═╝╚═══╝╚╝╚═╝");
        }


        System.out.println("Для завершения нажмите ENTER.\n" +
                "Конфигурация будет скопирована в буфер обмена. \n" +
                "╔═══╗╔═╗╔═╗╔══╗╔════╗\n" +
                "║╔══╝╚╗╚╝╔╝╚╣─╝║╔╗╔╗║\n" +
                "║╚══╗─╚╗╔╝──║║─╚╝║║╚╝\n" +
                "║╔══╝─╔╝╚╗──║║───║║──\n" +
                "║╚══╗╔╝╔╗╚╗╔╣─╗──║║──\n" +
                "╚═══╝╚═╝╚═╝╚══╝──╚╝──");
        var num000 = input.nextLine();

    }
}
