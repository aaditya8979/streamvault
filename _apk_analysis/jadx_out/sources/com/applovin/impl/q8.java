package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack f9670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f9671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f9673e;

    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
            if (StringUtils.isValidString(strTrim)) {
                q8.this.f9671c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - q8.this.f9672d;
            com.applovin.impl.sdk.o unused = q8.this.f9669a;
            if (com.applovin.impl.sdk.o.a()) {
                q8.this.f9669a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            q8 q8Var = q8.this;
            q8Var.f9673e = (b) q8Var.f9670b.pop();
            q8.this.f9673e.d(q8.this.f9671c.toString().trim());
            q8.this.f9671c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.o unused = q8.this.f9669a;
            if (com.applovin.impl.sdk.o.a()) {
                q8.this.f9669a.a("XmlParser", "Begin parsing...");
            }
            q8.this.f9672d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !q8.this.f9670b.isEmpty() ? (b) q8.this.f9670b.peek() : null;
                b bVar2 = new b(str2, q8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                q8.this.f9670b.push(bVar2);
            } catch (Exception e10) {
                com.applovin.impl.sdk.o unused = q8.this.f9669a;
                if (com.applovin.impl.sdk.o.a()) {
                    q8.this.f9669a.a("XmlParser", "Unable to process element <" + str2 + ">", e10);
                }
                throw new SAXException("Failed to start element", e10);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    public static class b extends p8 {
        public b(String str, Map map, p8 p8Var) {
            super(str, map, p8Var);
        }

        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f9556e.add(p8Var);
        }

        public void d(String str) {
            this.f9555d = str;
        }
    }

    public q8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f9669a = kVar.O();
    }

    public static p8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new q8(kVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap map = new HashMap(length);
        for (int i10 = 0; i10 < length; i10++) {
            map.put(attributes.getQName(i10), attributes.getValue(i10));
        }
        return map;
    }

    public p8 a(String str) throws SAXException {
        if (str == null) {
            throw new IllegalArgumentException("Unable to parse. No XML specified.");
        }
        this.f9671c = new StringBuilder();
        this.f9670b = new Stack();
        this.f9673e = null;
        Xml.parse(str, new a());
        b bVar = this.f9673e;
        if (bVar != null) {
            return bVar;
        }
        throw new SAXException("Unable to parse XML into node");
    }
}
