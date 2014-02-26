/*
 * Created on 24.08.2004
 *
 */
package com.exadel.htmLib.components;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.component.UIViewRoot;


abstract public class UIHtmLibBase extends UIOutput {

    /**
     * @return true if this renderer should render an id attribute.
     */
    protected boolean shouldWriteIdAttribute(UIComponent component) {
        String id;
        return (null != (id = component.getId()) &&
            !id.startsWith(UIViewRoot.UNIQUE_ID_PREFIX));
    }



	
	public void encodeBegin(FacesContext context) throws IOException {
		ResponseWriter writer = context.getResponseWriter();
	    writer.startElement(getTagName(), this);

	    String sid = (String)getAttributes().get("sid");
	    
		if (sid!=null) {
	    	writer.writeAttribute("id", sid, "sid");
		} else {
		    if (shouldWriteIdAttribute(this))
		    	writer.writeAttribute("id", this.getClientId(context), "id");
		}

		setStringAttribute( context , "class" , "styleClass" );
		setStringAttribute( context , "abbr" , "abbr" );
		setStringAttribute( context , "accept" , "accept" );
		setStringAttribute( context , "accesskey" , "accesskey" );
		setStringAttribute( context , "action" , "action" );
		setStringAttribute( context , "align" , "align" );
		setStringAttribute( context , "alink" , "alink" );
		setStringAttribute( context , "alt" , "alt" );
		setStringAttribute( context , "archive" , "archive" );
		setStringAttribute( context , "axis" , "axis" );
		setStringAttribute( context , "background" , "background" );
		setStringAttribute( context , "bgcolor" , "bgcolor" );
		setStringAttribute( context , "border" , "border" );
		setStringAttribute( context , "cellpadding" , "cellpadding" );
		setStringAttribute( context , "cellspacing" , "cellspacing" );
		setStringAttribute( context , "char" , "charAttribute" );
		setStringAttribute( context , "charoff" , "charoff" );
		setStringAttribute( context , "charset" , "charset" );
		setStringAttribute( context , "checked" , "checked" );
		setStringAttribute( context , "cite" , "cite" );
		setStringAttribute( context , "classid" , "classid" );
		setStringAttribute( context , "clear" , "clear" );
		setStringAttribute( context , "code" , "code" );
		setStringAttribute( context , "codebase" , "codebase" );
		setStringAttribute( context , "color" , "color" );
		setStringAttribute( context , "cols" , "cols" );
		setStringAttribute( context , "colspan" , "colspan" );
		setStringAttribute( context , "compact" , "compact" );
		setStringAttribute( context , "content" , "content" );
		setStringAttribute( context , "coords" , "coords" );
		setStringAttribute( context , "data" , "data" );
		setStringAttribute( context , "datetime" , "datetime" );
		setStringAttribute( context , "declare" , "declare" );
		setStringAttribute( context , "defer" , "defer" );
		setStringAttribute( context , "dir" , "dir" );
		setStringAttribute( context , "disabled" , "disabled" );
		setStringAttribute( context , "enctype" , "enctype" );
		setStringAttribute( context , "face" , "face" );
		setStringAttribute( context , "for" , "forAttribute" );
		setStringAttribute( context , "frame" , "frame" );
		setStringAttribute( context , "frameborder" , "frameborder" );
		setStringAttribute( context , "headers" , "headers" );
		setStringAttribute( context , "height" , "height" );
		setStringAttribute( context , "href" , "href" );
		setStringAttribute( context , "hreflang" , "hreflang" );
		setStringAttribute( context , "hspace" , "hspace" );
		setStringAttribute( context , "ismap" , "ismap" );
		setStringAttribute( context , "label" , "label" );
		setStringAttribute( context , "lang" , "lang" );
		setStringAttribute( context , "language" , "language" );
		setStringAttribute( context , "link" , "link" );
		setStringAttribute( context , "longdesc" , "longdesc" );
		setStringAttribute( context , "marginheight" , "marginheight" );
		setStringAttribute( context , "marginwidth" , "marginwidth" );
		setStringAttribute( context , "maxlength" , "maxlength" );
		setStringAttribute( context , "media" , "media" );
		setStringAttribute( context , "method" , "method" );
		setStringAttribute( context , "multiple" , "multiple" );
		setStringAttribute( context , "name" , "name" );
		setStringAttribute( context , "nohref" , "nohref" );
		setStringAttribute( context , "noresize" , "noresize" );
		setStringAttribute( context , "noshade" , "noshade" );
		setStringAttribute( context , "nowrap" , "nowrap" );
		setStringAttribute( context , "object" , "object" );
		setStringAttribute( context , "onblur" , "onblur" );
		setStringAttribute( context , "onchange" , "onchange" );
		setStringAttribute( context , "onclick" , "onclick" );
		setStringAttribute( context , "ondblclick" , "ondblclick" );
		setStringAttribute( context , "onfocus" , "onfocus" );
		setStringAttribute( context , "onkeydown" , "onkeydown" );
		setStringAttribute( context , "onkeypress" , "onkeypress" );
		setStringAttribute( context , "onkeyup" , "onkeyup" );
		setStringAttribute( context , "onload" , "onload" );
		setStringAttribute( context , "onmousedown" , "onmousedown" );
		setStringAttribute( context , "onmousemove" , "onmousemove" );
		setStringAttribute( context , "onmouseout" , "onmouseout" );
		setStringAttribute( context , "onmouseover" , "onmouseover" );
		setStringAttribute( context , "onmouseup" , "onmouseup" );
		setStringAttribute( context , "onreset" , "onreset" );
		setStringAttribute( context , "onselect" , "onselect" );
		setStringAttribute( context , "onsubmit" , "onsubmit" );
		setStringAttribute( context , "onunload" , "onunload" );
		setStringAttribute( context , "profile" , "profile" );
		setStringAttribute( context , "prompt" , "prompt" );
		setStringAttribute( context , "readonly" , "readonly" );
		setStringAttribute( context , "rel" , "rel" );
		setStringAttribute( context , "rev" , "rev" );
		setStringAttribute( context , "rows" , "rows" );
		setStringAttribute( context , "rowspan" , "rowspan" );
		setStringAttribute( context , "rules" , "rules" );
		setStringAttribute( context , "scheme" , "scheme" );
		setStringAttribute( context , "scope" , "scope" );
		setStringAttribute( context , "scrolling" , "scrolling" );
		setStringAttribute( context , "selected" , "selected" );
		setStringAttribute( context , "shape" , "shape" );
		setStringAttribute( context , "size" , "size" );
		setStringAttribute( context , "span" , "span" );
		setStringAttribute( context , "src" , "src" );
		setStringAttribute( context , "standby" , "standby" );
		setStringAttribute( context , "start" , "start" );
		setStringAttribute( context , "style" , "style" );
		setStringAttribute( context , "summary" , "summary" );
		setStringAttribute( context , "tabindex" , "tabindex" );
		setStringAttribute( context , "target" , "target" );
		setStringAttribute( context , "text" , "text" );
		setStringAttribute( context , "title" , "title" );
		setStringAttribute( context , "type" , "type" );
		setStringAttribute( context , "usemap" , "usemap" );
		setStringAttribute( context , "valign" , "valign" );
		setStringAttribute( context , "value" , "value" );
		setStringAttribute( context , "valuetype" , "valuetype" );
		setStringAttribute( context , "version" , "version" );
		setStringAttribute( context , "vlink" , "vlink" );
		setStringAttribute( context , "vspace" , "vspace" );
		setStringAttribute( context , "width" , "width" );

	}

	public void setStringAttribute(FacesContext context, String htmlTag,
			String cTag) throws IOException {
		String value = (String)getAttributes().get(cTag);
		if (value!=null) {
			ResponseWriter writer = context.getResponseWriter();
			writer.writeAttribute(htmlTag, value, null);
		}
	}
	
	public void encodeEnd(FacesContext context) throws IOException {
		if (!isCloseTagForbidden()) {
			ResponseWriter writer = context.getResponseWriter();
			writer.endElement(getTagName());
		}
	}
	abstract protected boolean isCloseTagForbidden();

	abstract protected String getTagName();
}
