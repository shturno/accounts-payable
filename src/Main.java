import com.algaworks.accountspayable.model.Payslip;
import com.algaworks.accountspayable.model.ServiceOrder;
import com.algaworks.accountspayable.service.AccountsPayableService;
import com.algaworks.payments.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentMethod pixMethod = new PixKey();
        PaymentMethod bankTransferMethod = new BankTransfer();

        AccountsPayableService accountsPayableService = new AccountsPayableService(pixMethod);

        Beneficiary employee = new Beneficiary("João Silva", "3485746934", "4564363454");
        Payslip payslip = new Payslip(employee, 100, 168);

        Beneficiary supplier = new Beneficiary("Consultoria XYZ","10673465386", "872345643");
        ServiceOrder os = new ServiceOrder(supplier, 65_000);

        accountsPayableService.pay(os);

        accountsPayableService.pay(payslip);
    }
}