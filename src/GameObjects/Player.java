/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Math.Vector2D;
import input.KeyBoard;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Chory77
 */
public class Player extends GameObject {

    public Player(Vector2D posicion, BufferedImage textura) {
        super(posicion, textura);
    }

    @Override
    public void update() {
        if (KeyBoard.RIGHT) {
            posicion.setX(posicion.getX() + 1);
        }

    }

    @Override
    public void draw(Graphics g) {

        g.drawImage(textura, (int) posicion.getX(), (int) posicion.getY(), null);
    }

}
