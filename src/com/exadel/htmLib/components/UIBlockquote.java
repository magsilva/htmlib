package com.exadel.htmLib.components;

public class UIBlockquote extends UIHtmLibBase {

	protected String getTagName() {
		return "blockquote";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
