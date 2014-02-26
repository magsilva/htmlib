package com.exadel.htmLib.components;

public class UIKbd extends UIHtmLibBase {

	protected String getTagName() {
		return "kbd";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
