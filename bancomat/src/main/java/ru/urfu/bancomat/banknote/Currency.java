/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat.banknote
 *         Дата создания класса: 30 нояб. 2016 г.
 */
package ru.urfu.bancomat.banknote;

/**
 * @author lifeandfree
 */
public class Currency {
    private int quantity;

    public Currency(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
