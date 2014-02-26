package com.exadel.htmLib.components;

public class UIFieldset extends UIHtmLibBase {

	protected String getTagName() {
		return "fieldset";
	}

	protected boolean isCloseTagForbidden() {
		return false;
	}
}
