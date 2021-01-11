package Bank.Menu.SearchMenu;

import static Bank.Main.listOfBanks;
import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class ClearSearch implements MenuExecute{
    @Override
    public void execute() {

        if(!listByParameters.isEmpty()) {
            while(listByParameters.size() != 0) {
                listByParameters.remove(0);
            }
        }
        listByParameters.addAll(listOfBanks);
    }
}
