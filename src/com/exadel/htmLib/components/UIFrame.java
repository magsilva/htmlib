package com.exadel.htmLib.components;

public class UIFrame extends UIHtmLibBase {

	protected String getTagName() {
		return "frame";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
