/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat.dollar;

import ru.urfu.bancomat.banknote.BanknoteHandler;
import ru.urfu.bancomat.banknote.Currency;

/**
 * @author lifeandfree
 */
public abstract class DollarHandlerBase extends BanknoteHandler {

    protected int value;

    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Currency CashOut(Currency currency) {
        if (currency.getQuantity() >= this.getValue()) {
            int num = currency.getQuantity() / this.getValue();
            int remainder = currency.getQuantity() % this.getValue();
            System.out.print(num + "x" + this.getValue() + "$ ");
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
