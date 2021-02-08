package com.legendofj;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Filter;
import com.legendofj.screen.PlayScreen;

public class LegendOfJ extends ApplicationAdapter {
	SpriteBatch batch;
	public static final int V_WIDTH = 432;
	public static final int V_HEIGHT = 280;
	public static final float PPM = 100;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
