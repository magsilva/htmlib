package com.exadel.htmLib.components;

public class UIParam extends UIHtmLibBase {

	protected String getTagName() {
		return "param";
	}

	protected boolean isCloseTagForbidden() {
		return true;
	}
}
