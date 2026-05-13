package org.seamless.xml;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* JADX INFO: loaded from: classes2.dex */
public class SAXParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f76915b = Logger.getLogger(SAXParser.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final URI f76916c = URI.create("http://www.w3.org/2001/xml.xsd");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final URL f76917d = Thread.currentThread().getContextClassLoader().getResource("org/seamless/schemas/xml.xsd");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XMLReader f76918a;

    public static class a<I> extends DefaultHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SAXParser f76919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public I f76920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f76921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public StringBuilder f76922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Attributes f76923e;

        public a(I i10, a aVar) {
            this(i10, aVar.c(), aVar);
        }

        public a(I i10, SAXParser sAXParser) {
            this(i10, sAXParser, null);
        }

        public a(I i10, SAXParser sAXParser, a aVar) {
            this.f76922d = new StringBuilder();
            this.f76920b = i10;
            this.f76919a = sAXParser;
            this.f76921c = aVar;
            if (sAXParser != null) {
                sAXParser.g(this);
            }
        }

        public String a() {
            return this.f76922d.toString();
        }

        public I b() {
            return this.f76920b;
        }

        public SAXParser c() {
            return this.f76919a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) throws SAXException {
            this.f76922d.append(cArr, i10, i11);
        }

        public boolean d(String str, String str2, String str3) {
            return false;
        }

        public void e() {
            a aVar;
            SAXParser sAXParser = this.f76919a;
            if (sAXParser == null || (aVar = this.f76921c) == null) {
                return;
            }
            sAXParser.g(aVar);
            this.f76923e = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (!d(str, str2, str3)) {
                SAXParser.f76915b.finer(getClass().getSimpleName() + " ending: " + str2);
                return;
            }
            SAXParser.f76915b.finer(getClass().getSimpleName() + ": last element, switching to parent: " + str2);
            e();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.f76922d = new StringBuilder();
            this.f76923e = new AttributesImpl(attributes);
            SAXParser.f76915b.finer(getClass().getSimpleName() + " starting: " + str2);
        }
    }

    public class b implements ErrorHandler {
        public b() {
        }

        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
            throw new SAXException(sAXParseException);
        }
    }

    public SAXParser() {
        this(null);
    }

    public SAXParser(DefaultHandler defaultHandler) {
        XMLReader xMLReaderB = b();
        this.f76918a = xMLReaderB;
        if (defaultHandler != null) {
            xMLReaderB.setContentHandler(defaultHandler);
        }
    }

    public XMLReader b() {
        try {
            if (e() == null) {
                return XMLReaderFactory.createXMLReader();
            }
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            sAXParserFactoryNewInstance.setSchema(c(e()));
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            xMLReader.setErrorHandler(d());
            return xMLReader;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public Schema c(Source[] sourceArr) {
        try {
            SchemaFactory schemaFactoryNewInstance = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            schemaFactoryNewInstance.setResourceResolver(new qs.a(new HashMap<URI, URL>() { // from class: org.seamless.xml.SAXParser.1
                {
                    put(SAXParser.f76916c, SAXParser.f76917d);
                }
            }));
            return schemaFactoryNewInstance.newSchema(sourceArr);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public ErrorHandler d() {
        return new b();
    }

    public Source[] e() {
        return null;
    }

    public void f(InputSource inputSource) throws ParserException {
        try {
            this.f76918a.parse(inputSource);
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }

    public void g(ContentHandler contentHandler) {
        this.f76918a.setContentHandler(contentHandler);
    }
}
