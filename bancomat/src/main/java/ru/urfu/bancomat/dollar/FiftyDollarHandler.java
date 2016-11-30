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
public class FiftyDollarHandler extends DollarHandlerBase {

    protected int value = 50;

    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return this.value;
    }
}
