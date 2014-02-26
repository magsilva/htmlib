package com.exadel.htmLib.components;

public class UIStyle extends UIHtmLibBase {

	protected String getTagName() {
		return "style";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
