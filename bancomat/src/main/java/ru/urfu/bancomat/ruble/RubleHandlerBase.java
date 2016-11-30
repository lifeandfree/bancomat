package ru.urfu.bancomat.ruble;

import ru.urfu.bancomat.banknote.BanknoteHandler;
import ru.urfu.bancomat.banknote.Currency;

public abstract class RubleHandlerBase extends BanknoteHandler {

    protected int value;

    protected RubleHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Currency CashOut(Currency currency) {
        if (currency.getQuantity() >= this.getValue()) {
            int num = currency.getQuantity() / this.getValue();
            int remainder = currency.getQuantity() % this.getValue();
            System.out.println(num + "x" + this.getValue() + "рублей");
            if (remainder != 0) {
                return new Currency(remainder);
            }
            else {
                return new Currency(0);
            }
        }
        else {
            return currency;
        }
    }

    protected abstract int getValue();

    @Override
    public boolean Validate(String banknote) {
        if (banknote.equals(String.valueOf(this.value))) {
            return true;
        }
        return super.Validate(banknote);
    }
}
