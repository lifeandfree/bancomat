/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat;

import ru.urfu.bancomat.banknote.BanknoteHandler;
import ru.urfu.bancomat.banknote.Currency;
import ru.urfu.bancomat.banknote.CurrencyType;
import ru.urfu.bancomat.dollar.FiftyDollarHandler;
import ru.urfu.bancomat.dollar.HundredDollarHandler;
import ru.urfu.bancomat.dollar.TenDollarHandler;
import ru.urfu.bancomat.ruble.FiftyRubleHandler;
import ru.urfu.bancomat.ruble.HundredRubleHandler;
import ru.urfu.bancomat.ruble.TenRubleHandler;

/**
 * @author lifeandfree
 */
public class Bancomat {
    private BanknoteHandler _handler;
    private CurrencyType currencyType;

    public Bancomat() {
        this.currencyType = CurrencyType.Ruble;
    }

    public Bancomat(CurrencyType currencyType) {
        this.currencyType = currencyType;

    }

    public void getMakeCash(int cash) {
        Currency currency = new Currency(cash);
        if (this.currencyType.equals(CurrencyType.Dollar)) {
            _handler = new HundredDollarHandler(null);
            currency = _handler.CashOut(currency);
            _handler = new FiftyDollarHandler(_handler);
            currency = _handler.CashOut(currency);
            _handler = new TenDollarHandler(_handler);
            currency = _handler.CashOut(currency);
        }

        if (this.currencyType.equals(CurrencyType.Eur)) {
            // Здесь, если понадобится тоже самое будет для евро
        }

        if (this.currencyType.equals(CurrencyType.Ruble)) {
            _handler = new HundredRubleHandler(null);
            currency = _handler.CashOut(currency);
            _handler = new FiftyRubleHandler(_handler);
            currency = _handler.CashOut(currency);
            _handler = new TenRubleHandler(_handler);
            currency = _handler.CashOut(currency);
        }
        if (currency.getQuantity() != 0) {
            System.out.println(" + " + currency.getQuantity() + " не валидная сумма =(");
        }
        else {
            System.out.println("");
            System.out.println("Money given");
        }
    }

    public boolean Validate(String banknote) {
        return _handler.Validate(banknote);
    }
}
