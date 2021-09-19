package com.packtpub.libgdx.canyonbunny;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class CanyonBunnyMain extends ApplicationAdapter {
	private static final String TAG =
	        CanyonBunnyMain.class.getName();
	    private WorldController worldController;
	    private WorldRenderer worldRenderer;
	    
	    @Override 
	    public void create() {
	    	worldController = new WorldController();
			worldRenderer = new WorldRenderer(worldController);
	    }
	    
	    @Override
	    public void render() {
	    	worldController.update(Gdx.graphics.getDeltaTime());
	    	Gdx.gl.glClearColor(0x64/255.0f, 0x95/255.0f, 0xed/255.0f, 0xff/255.0f);
	    	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    	worldRenderer.render();
	    }
	    
	    @Override
	    public void resize(int width, int height) {
	    	worldRenderer.resize(width, height);
	    }
	    
	    @Override
	    public void pause() {
	    	
	    }
	    
	    @Override
	    public void resume() {
	    	
	    }
	    
	    @Override
	    public void dispose() {
	    	
	    }
	 
		 
	}

