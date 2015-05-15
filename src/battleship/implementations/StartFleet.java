/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship.implementations;

import battleship.interfaces.Fleet;
import battleship.interfaces.Ship;
import java.util.Iterator;



/**
 *
 * @author Tobias
 */
class StartFleet implements Fleet
{
    private final ShipImpl[] ships;

    public StartFleet(int[] shipSizes)
    {
        this.ships = new ShipImpl[shipSizes.length];
        for(int i = 0; i < ships.length; ++i)
        {
            ships[i] = new ShipImpl(shipSizes[i]);
        }
    }

    @Override
    public int getNumberOfShips()
    {
        return ships.length;
    }

    @Override
    public Ship getShip(int index)
    {
        return ships[index];
    }

    @Override
    public Iterator<Ship> iterator()
    {
        return new ShipIterator();
    }
    
    private class ShipIterator implements Iterator<Ship>
    {
        private int index = 0;
        
        @Override
        public boolean hasNext()
        {
            return index < ships.length;
        }

        @Override
        public Ship next()
        {
            return ships[index++];
        }
        
    }
    
}
