package pl.itacademy.week7;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    private BigDecimal creditLimit;

    public CreditAccount(BigDecimal creditLimit) {
        super();
        this.creditLimit = creditLimit;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        return null;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        return null;
    }
}
