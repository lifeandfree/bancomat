/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat.banknote;

/**
 * @author lifeandfree
 */
public abstract class BanknoteHandler {

    private BanknoteHandler _nextHandler;

    protected BanknoteHandler(BanknoteHandler nextHandler) {
        _nextHandler = nextHandler;
    }

    public abstract Currency CashOut(Currency cur);

    public boolean Validate(String banknote) {
        return _nextHandler != null && _nextHandler.Validate(banknote);
    }
}
