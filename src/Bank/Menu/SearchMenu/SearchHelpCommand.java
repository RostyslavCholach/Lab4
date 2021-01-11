package Bank.Menu.SearchMenu;

public class SearchHelpCommand implements MenuExecute{

    @Override
    public void execute() {
        System.out.println("Parameters for search:\n" +
                "\n\t" + "1 - help" +
                "\n\t" + "2 - clear search" +
                "\n\t" + "3 - bank name" +
                "\n\t" + "4 - credit purpose" +
                "\n\t" + "5 - credit term" +
                "\n\t" + "6 - credit amount" +
                "\n\t" + "7 - change credit plan" +
                "\n\t" + "8 - early credit repayment" +
                "\n\t" + "9 - credit line extension" +
                "\n\t" + "10 - credit deferral" +
                "\n\t" + "0 - end of search");
    }
}
