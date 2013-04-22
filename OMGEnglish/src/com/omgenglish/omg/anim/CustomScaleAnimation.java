package com.omgenglish.omg.anim;

import android.graphics.Canvas;

import com.omgenglish.omg.R;
import com.slidingmenu.lib.SlidingMenu.CanvasTransformer;

public class CustomScaleAnimation extends CustomAnimation {

	public CustomScaleAnimation() {
		super(R.string.anim_scale, new CanvasTransformer() {
			@Override
			public void transformCanvas(Canvas canvas, float percentOpen) {
				canvas.scale(percentOpen, 1, 0, 0);
			}			
		});
	}

}
