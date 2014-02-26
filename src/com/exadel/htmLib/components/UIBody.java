package com.exadel.htmLib.components;

public class UIBody extends UIHtmLibBase {

	protected String getTagName() {
		return "body";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
