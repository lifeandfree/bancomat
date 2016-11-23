/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat;

import ru.urfu.bancomat.banknote.BanknoteHandler;
import ru.urfu.bancomat.dollar.FiftyDollarHandler;
import ru.urfu.bancomat.dollar.HundredDollarHandler;
import ru.urfu.bancomat.dollar.TenDollarHandler;
import ru.urfu.bancomat.ruble.TenRubleHandler;

/**
 * @author lifeandfree
 */
public class Bancomat {
    private BanknoteHandler _handler;

    public Bancomat() {
        _handler = new TenRubleHandler(null);
        _handler = new TenDollarHandler(_handler);
        _handler = new FiftyDollarHandler(_handler);
        _handler = new HundredDollarHandler(_handler);
    }

    public boolean Validate(String banknote) {
        return _handler.Validate(banknote);
    }
}
