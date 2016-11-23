/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat.dollar;

import ru.urfu.bancomat.banknote.BanknoteHandler;

/**
 * @author lifeandfree
 */
public abstract class DollarHandlerBase extends BanknoteHandler {

    protected int value;

    protected DollarHandlerBase(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    /**
     * @return the value
     */
    protected int getValue() {
        return this.value;
    }

    @Override
    public boolean Validate(String banknote) {
        if (banknote.equals("{Value}$")) {
            return true;
        }
        return super.Validate(banknote);
    }
}
