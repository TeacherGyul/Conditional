import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

    public class main extends JavaPlugin{
        //플러그인 실행 시에 실행되는 부분
        @Override
        public void onEnable(){
            System.out.println("귤쌤의 실습용 플러그인 실행");
        }
        //플러그인 종료 시에 실행되는 부분
        @Override
        public void onDisable(){
            System.out.println("빠 이빠이");
        }

        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
            if(cmd.getName().equalsIgnoreCase("s")){
                if(args.length==1){//데이터 타입 확인을 안해주었기 때문에 정수가 아닌 문자를 넣을 시 오류 발생!
                    int a = Integer.valueOf(args[0]);



                }
                else{
                    sender.sendMessage("명령어가 완전하지 않아요!");
                }
            }
            return true;
        }
    }


