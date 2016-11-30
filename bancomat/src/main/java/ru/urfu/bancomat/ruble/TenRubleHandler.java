/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat.ruble;

import ru.urfu.bancomat.banknote.BanknoteHandler;

/**
 * @author lifeandfree
 */
public class TenRubleHandler extends RubleHandlerBase {

    protected int value = 10;

    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return this.value;
    }
}
