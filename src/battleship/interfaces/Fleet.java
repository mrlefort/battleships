/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship.interfaces;

/**
 *
 * @author Tobias
 */
public interface Fleet extends Iterable<Ship>
{
    public int getNumberOfShips();
    public Ship getShip(int index);
}
