package com.exadel.htmLib.components;

public class UILabel extends UIHtmLibBase {

	protected String getTagName() {
		return "label";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
