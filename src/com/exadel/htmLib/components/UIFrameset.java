package com.exadel.htmLib.components;

public class UIFrameset extends UIHtmLibBase {

	protected String getTagName() {
		return "frameset";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
