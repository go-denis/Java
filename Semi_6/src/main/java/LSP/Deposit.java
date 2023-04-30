package LSP;

import java.math.BigDecimal;

public class Deposit extends Account{
    @Override
    public BigDecimal balans(String numberAccount) {
        return super.balans(numberAccount);
    }

    @Override
    public void reill(String numberAcount, BigDecimal sum) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
}
