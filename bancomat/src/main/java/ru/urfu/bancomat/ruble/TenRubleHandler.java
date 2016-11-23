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
public class TenRubleHandler extends BanknoteHandler {

    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean Validate(String banknote) {
        if (banknote.equals("10 Рублей")) {
            return true;
        }
        return super.Validate(banknote);
    }
}
