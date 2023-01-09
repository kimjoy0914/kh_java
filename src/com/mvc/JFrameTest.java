package com.mvc;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrameTest() {
		initDisplay();
	}
		
	public void initDisplay() {
		
		this.setSize(500, 400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameTest();
	}

}
