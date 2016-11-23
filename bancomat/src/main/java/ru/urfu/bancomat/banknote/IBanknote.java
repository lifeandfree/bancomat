/**
 * @author lifeandfree
 *         Пакет: ru.urfu.bancomat
 *         Дата создания класса: 23 нояб. 2016 г.
 */
package ru.urfu.bancomat.banknote;

/**
 * @author lifeandfree
 */
public interface IBanknote {

    CurrencyType getCurrency();

    String getValue();

}
