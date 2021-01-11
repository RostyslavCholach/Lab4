package Bank.Menu.SearchMenu;

import static Bank.Menu.SearchForCreditsByParametersCommand.listByParameters;

public class ChangeCreditPlanParameter implements MenuExecute{
    @Override
    public void execute() {
        for(int i = 0; i < listByParameters.size(); i++){
            if(!listByParameters.get(i).isChangeCreditRepaymentPlan()){
                listByParameters.remove(i);
                i--;
            }
        }
    }
}
