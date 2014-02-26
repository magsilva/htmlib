package com.exadel.htmLib.components;

public class UIObject extends UIHtmLibBase {

	protected String getTagName() {
		return "object";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
