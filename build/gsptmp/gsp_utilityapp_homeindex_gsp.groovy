import grails.plugins.metadata.GrailsPlugin
import org.grails.gsp.compiler.transform.LineNumber
import org.grails.gsp.GroovyPage
import org.grails.web.taglib.*
import org.grails.taglib.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_utilityapp_homeindex_gsp extends org.grails.gsp.GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(4)
invokeTag('link','asset',6,['rel':("icon"),'href':("favicon.ico"),'type':("image/x-ico")],-1)
printHtmlPart(4)
invokeTag('link','asset',8,['rel':("icon"),'href':("favicon.ico"),'type':("image/x-ico")],-1)
printHtmlPart(4)
invokeTag('javascript','asset',10,['src':("jquery-3.1.1.js")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
expressionOut.print(name)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
expressionOut.print(vehicleTotal)
printHtmlPart(12)
for( vehicle in (vehicleList) ) {
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
expressionOut.print(vehicle.name)
printHtmlPart(15)
expressionOut.print(vehicle.year)
printHtmlPart(16)
expressionOut.print(vehicle.make)
printHtmlPart(16)
expressionOut.print(vehicle.model)
printHtmlPart(17)
})
invokeTag('link','g',35,['controller':("vehicle"),'action':("show"),'id':(vehicle.id)],3)
printHtmlPart(18)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('textField','g',41,['name':("name"),'value':(""),'placeholder':(name)],-1)
printHtmlPart(20)
invokeTag('submitButton','g',42,['name':("Update name")],-1)
printHtmlPart(21)
})
invokeTag('form','g',43,['action':("updateName"),'style':("margin: 0 auto; width:320px")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1535302257000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
