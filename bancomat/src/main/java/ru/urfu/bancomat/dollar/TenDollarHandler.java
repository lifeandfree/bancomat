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
public class TenDollarHandler extends DollarHandlerBase {

    protected int value = 10;

    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return this.value;
    }
}
