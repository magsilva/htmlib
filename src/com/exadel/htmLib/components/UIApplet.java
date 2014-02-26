package com.exadel.htmLib.components;

public class UIApplet extends UIHtmLibBase {

	protected String getTagName() {
		return "applet";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
