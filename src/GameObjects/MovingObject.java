/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Math.Vector2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 *
 * @author Franco
 */
public abstract class MovingObject extends GameObject {

    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;
    
    public MovingObject(Vector2D posicion,Vector2D velocity, BufferedImage textura) {
        super(posicion, textura);
        this.velocity = velocity;
        angle = 0;
    }

}
