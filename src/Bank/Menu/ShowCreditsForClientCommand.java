package Bank.Menu;

import Bank.Credit.Credit;
import Bank.Main;

import java.util.ArrayList;

public class ShowCreditsForClientCommand implements MenuExecute{

    public static ArrayList<Credit> listForClient = new ArrayList<Credit>();

    @Override
    public void execute() {

        if(Main.client.getFirstName().isEmpty()){
            EnterInformationCommand info = new EnterInformationCommand();
            info.execute();
        }

        for(int i = 0; i < Main.listOfBanks.size(); i++){
            if(Main.listOfBanks.get(i).meetsTheRequirementsOfTheCredit(Main.client)){
                listForClient.add(Main.listOfBanks.get(i));
            }
        }

        if(listForClient.isEmpty()){
            System.out.println(" Sorry, there are no available credits for you..");
            return;
        }
        System.out.println(" List of available credits:");
        for(int i = 0; i < listForClient.size(); i++){
            System.out.println("\n\t\t\t\t\t" + (i+1) + ". " + listForClient.get(i));
        }
        System.out.println("\n====================================================================================================\n");
    }
}
