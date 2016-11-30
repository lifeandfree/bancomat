/**
 * Организация: УрФУ
 * Проект: Параллельные вычисления, 2016
 *
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat.ruble
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.bancomat.ruble;

import ru.urfu.bancomat.banknote.BanknoteHandler;

/**
 * @author lifeandfree
 */
public class HundredRubleHandler extends RubleHandlerBase {

    protected int value = 10;

    public HundredRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected int getValue() {
        return this.value;
    }

}
