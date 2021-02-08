package com.legendofj.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.legendofj.LegendOfJ;
import com.legendofj.screen.PlayScreen;

import javax.xml.soap.Text;

public class Player extends Sprite {
    public enum State { FALLING, JUMPING, STANDING, RUNNING, DEAD };
    public State currentState;
    public State previousState;

    public World world;
    public Body b2body;

    private float stateTimer;
    private boolean runningRight;
    private TextureRegion playerStand;

    private PlayScreen screen;
    public Player(PlayScreen screen) {
        this.screen = screen;
        this.world = screen.getWorld();
        currentState = State.STANDING;
        previousState = State.STANDING;
        stateTimer = 0;
        runningRight = true;

        playerStand = new TextureRegion(screen.getAtlas().findRegion("adventurer-Sheet.png"), 0, 0, 50, 37);
        setBounds(0, 0, 50 / LegendOfJ.PPM, 37 / LegendOfJ.PPM);
        setRegion(playerStand);
    }
    public void update(float dt){

    }
    public TextureRegion getFrame(float dt){
        TextureRegion tr = new TextureRegion();
        return tr;
    }
    public State getState(){
        State s = State.STANDING;
        return s;
    }
    public void die() {

    }
}
