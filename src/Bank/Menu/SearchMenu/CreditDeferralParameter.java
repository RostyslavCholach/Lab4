package Bank.Menu.SearchMenu;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class CreditDeferralParameter implements MenuExecute {
    @Override
    public void execute() {
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).isCreditDeferral()){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}
