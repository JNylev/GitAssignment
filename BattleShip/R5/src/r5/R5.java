/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package r5;

import battleship.interfaces.BattleshipsPlayer;
import tournament.player.PlayerFactory;

/**
 *
 * @author Tobias Grundtvig
 */
public class R5 implements PlayerFactory<BattleshipsPlayer>
{

    public R5(){}
    
    
    @Override
    public BattleshipsPlayer getNewInstance()
    {
        return new RandomPlayer();
    }

    @Override
    public String getID()
    {
        return "R5";
    }

    @Override
    public String getName()
    {
        return "PUSSY(cat) SLAYERS AKA JOHN";
    }
    
}
