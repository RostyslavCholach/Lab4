package Bank.Menu;

public class ExitCommand implements MenuExecute{

    @Override
    public void execute() {
        System.out.println(" Exit");
        System.exit(0);
    }
}
