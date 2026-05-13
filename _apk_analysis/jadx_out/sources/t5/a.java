package t5;

import a6.k0;
import a6.l0;
import a6.m;
import android.text.Layout;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import com.ironsource.Z7;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends n5.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f84979p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f84980q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f84981r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f84982s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f84983t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f84984u = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f84985v = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1060a f84986w = new C1060a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f84987o;

    /* JADX INFO: renamed from: t5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class C1060a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f84988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84989b;

        public C1060a(int i10, int i11) {
            this.f84988a = i10;
            this.f84989b = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f84990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84992c;

        public b(float f10, int i10, int i11) {
            this.f84990a = f10;
            this.f84991b = i10;
            this.f84992c = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f84993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84994b;

        public c(int i10, int i11) {
            this.f84993a = i10;
            this.f84994b = i11;
        }
    }

    public a() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f84987o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static void A(String str, e eVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        String[] strArrD0 = k0.D0(str, "\\s+");
        if (strArrD0.length == 1) {
            matcher = f84981r.matcher(str);
        } else {
            if (strArrD0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrD0.length + ".");
            }
            matcher = f84981r.matcher(strArrD0[1]);
            m.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        strGroup = matcher.group(3);
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                eVar.t(3);
                break;
            case "em":
                eVar.t(2);
                break;
            case "px":
                eVar.t(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        eVar.s(Float.valueOf(matcher.group(1)).floatValue());
    }

    public static long I(String str, b bVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f84979p.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String strGroup = matcher.group(4);
            return (long) ((d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f84990a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) bVar.f84991b)) / ((double) bVar.f84990a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f84980q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        d10 = Double.parseDouble(matcher2.group(1));
        String strGroup2 = matcher2.group(2);
        strGroup2.hashCode();
        switch (strGroup2) {
            case "f":
                d11 = bVar.f84990a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = bVar.f84992c;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "ms":
                d11 = 1000.0d;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            default:
                return (long) (d10 * 1000000.0d);
        }
        d10 *= d12;
        return (long) (d10 * 1000000.0d);
    }

    public static boolean y(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public final b B(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (k0.D0(attributeValue2, Z7.f30794r).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = f84985v;
        int i11 = bVar.f84991b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f84992c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    public final Map<String, e> C(XmlPullParser xmlPullParser, Map<String, e> map, C1060a c1060a, c cVar, Map<String, t5.c> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "style")) {
                String strA = l0.a(xmlPullParser, "style");
                e eVarG = G(xmlPullParser, new e());
                if (strA != null) {
                    for (String str : H(strA)) {
                        eVarG.a(map.get(str));
                    }
                }
                if (eVarG.g() != null) {
                    map.put(eVarG.g(), eVarG);
                }
            } else if (l0.f(xmlPullParser, "region")) {
                t5.c cVarF = F(xmlPullParser, c1060a, cVar);
                if (cVarF != null) {
                    map2.put(cVarF.f85007a, cVarF);
                }
            } else if (l0.f(xmlPullParser, "metadata")) {
                D(xmlPullParser, map3);
            }
        } while (!l0.d(xmlPullParser, "head"));
        return map;
    }

    public final void D(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (l0.f(xmlPullParser, "image") && (strA = l0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!l0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t5.b E(org.xmlpull.v1.XmlPullParser r21, t5.b r22, java.util.Map<java.lang.String, t5.c> r23, t5.a.b r24) throws com.google.android.exoplayer.text.SubtitleDecoderException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.E(org.xmlpull.v1.XmlPullParser, t5.b, java.util.Map, t5.a$b):t5.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t5.c F(org.xmlpull.v1.XmlPullParser r18, t5.a.C1060a r19, t5.a.c r20) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.a.F(org.xmlpull.v1.XmlPullParser, t5.a$a, t5.a$c):t5.c");
    }

    public final e G(XmlPullParser xmlPullParser, e eVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    eVar = x(eVar).v("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    eVar = x(eVar).r(attributeValue);
                    break;
                case "textAlign":
                    String strK0 = k0.K0(attributeValue);
                    strK0.hashCode();
                    switch (strK0) {
                        case "center":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_CENTER);
                            break;
                        case "end":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "left":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_NORMAL);
                            break;
                        case "right":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_OPPOSITE);
                            break;
                        case "start":
                            eVar = x(eVar).x(Layout.Alignment.ALIGN_NORMAL);
                            break;
                    }
                    break;
                case "textDecoration":
                    String strK02 = k0.K0(attributeValue);
                    strK02.hashCode();
                    switch (strK02) {
                        case "nounderline":
                            eVar = x(eVar).y(false);
                            break;
                        case "underline":
                            eVar = x(eVar).y(true);
                            break;
                        case "nolinethrough":
                            eVar = x(eVar).w(false);
                            break;
                        case "linethrough":
                            eVar = x(eVar).w(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    eVar = x(eVar).p("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        eVar = x(eVar).u(attributeValue);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "color":
                    eVar = x(eVar);
                    try {
                        eVar.q(a6.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        m.h("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        eVar = x(eVar);
                        A(attributeValue, eVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        m.h("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "backgroundColor":
                    eVar = x(eVar);
                    try {
                        eVar.o(a6.e.d(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        m.h("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
            }
        }
        return eVar;
    }

    public final String[] H(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : k0.D0(strTrim, "\\s+");
    }

    public final c J(XmlPullParser xmlPullParser) {
        String strA = l0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f84983t.matcher(strA);
        if (!matcher.matches()) {
            m.h("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            m.h("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    @Override // n5.c
    public n5.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        f fVar;
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f84987o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            c cVarJ = null;
            map2.put("", new t5.c(null));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarB = f84985v;
            C1060a c1060aZ = f84986w;
            int i11 = 0;
            f fVar2 = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                t5.b bVar2 = (t5.b) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarB = B(xmlPullParserNewPullParser);
                            c1060aZ = z(xmlPullParserNewPullParser, f84986w);
                            cVarJ = J(xmlPullParserNewPullParser);
                        }
                        c cVar = cVarJ;
                        b bVar3 = bVarB;
                        C1060a c1060a = c1060aZ;
                        if (y(name)) {
                            if ("head".equals(name)) {
                                fVar = fVar2;
                                bVar = bVar3;
                                C(xmlPullParserNewPullParser, map, c1060a, cVar, map2, map3);
                            } else {
                                fVar = fVar2;
                                bVar = bVar3;
                                try {
                                    t5.b bVarE = E(xmlPullParserNewPullParser, bVar2, map2, bVar);
                                    arrayDeque.push(bVarE);
                                    if (bVar2 != null) {
                                        bVar2.a(bVarE);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    m.i("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVarB = bVar;
                            cVarJ = cVar;
                            c1060aZ = c1060a;
                        } else {
                            m.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i11++;
                            bVarB = bVar3;
                            cVarJ = cVar;
                            c1060aZ = c1060a;
                        }
                    } else {
                        fVar = fVar2;
                        if (eventType == 4) {
                            bVar2.a(t5.b.d(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            fVar2 = xmlPullParserNewPullParser.getName().equals("tt") ? new f((t5.b) arrayDeque.peek(), map, map2, map3) : fVar;
                            arrayDeque.pop();
                        }
                    }
                    xmlPullParserNewPullParser.next();
                } else {
                    fVar = fVar2;
                    if (eventType == 2) {
                        i11++;
                    } else if (eventType == 3) {
                        i11--;
                    }
                }
                fVar2 = fVar;
                xmlPullParserNewPullParser.next();
            }
            return fVar2;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }

    public final e x(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    public final C1060a z(XmlPullParser xmlPullParser, C1060a c1060a) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c1060a;
        }
        Matcher matcher = f84984u.matcher(attributeValue);
        if (!matcher.matches()) {
            m.h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c1060a;
        }
        try {
            int i10 = Integer.parseInt(matcher.group(1));
            int i11 = Integer.parseInt(matcher.group(2));
            if (i10 != 0 && i11 != 0) {
                return new C1060a(i10, i11);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i10 + Z7.f30794r + i11);
        } catch (NumberFormatException unused) {
            m.h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return c1060a;
        }
    }
}
