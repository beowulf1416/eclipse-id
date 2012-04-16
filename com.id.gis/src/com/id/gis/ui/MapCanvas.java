package com.id.gis.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class MapCanvas extends Canvas {

	public MapCanvas(Composite parent, int style) {
		super(parent, style | SWT.NONE | SWT.NO_BACKGROUND | SWT.NO_REDRAW_RESIZE | SWT.V_SCROLL | SWT.H_SCROLL);
		
		initialize_scrollbars();
		
		attach_handlers();
		
	}

	private void initialize_scrollbars(){
		
	}
	
	private void attach_handlers(){
		
		addControlListener(new ControlAdapter() {

			@Override
			public void controlResized(ControlEvent e) {
				resize();
			}
			
		});
		
		addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent e) {
				paint(e.gc);
			}
		});
		
	}
	
	private void resize(){
		// TODO
	}
	
	private void paint(GC gc){
		// TODO
	}
	
}
