package n7;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.ironsource.Z7;
import g7.i;
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
import s7.m0;
import s7.n0;
import s7.q;

/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends g7.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f75191p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f75192q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f75193r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f75194s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f75195t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f75196u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f75197v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f75198w = new b(30.0f, 1, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f75199x = new a(32, 15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XmlPullParserFactory f75200o;

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f75201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f75202b;

        public a(int i10, int i11) {
            this.f75201a = i10;
            this.f75202b = i11;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f75203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f75204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f75205c;

        public b(float f10, int i10, int i11) {
            this.f75203a = f10;
            this.f75204b = i10;
            this.f75205c = i11;
        }
    }

    /* JADX INFO: renamed from: n7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    public static final class C0895c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f75206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f75207b;

        public C0895c(int i10, int i11) {
            this.f75206a = i10;
            this.f75207b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f75200o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static a A(XmlPullParser xmlPullParser, a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f75197v.matcher(attributeValue);
        if (!matcher.matches()) {
            q.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i10 = Integer.parseInt((String) s7.a.e(matcher.group(1)));
            int i11 = Integer.parseInt((String) s7.a.e(matcher.group(2)));
            if (i10 != 0 && i11 != 0) {
                return new a(i10, i11);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i10 + Z7.f30794r + i11);
        } catch (NumberFormatException unused) {
            q.i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    public static void B(String str, g gVar) throws SubtitleDecoderException {
        Matcher matcher;
        String str2;
        String[] strArrH0 = m0.H0(str, "\\s+");
        if (strArrH0.length == 1) {
            matcher = f75193r.matcher(str);
        } else {
            if (strArrH0.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrH0.length + ".");
            }
            matcher = f75193r.matcher(strArrH0[1]);
            q.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) s7.a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) s7.a.e(matcher.group(1))));
    }

    public static b C(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (m0.H0(attributeValue2, Z7.f30794r).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = f75198w;
        int i11 = bVar.f75204b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f75205c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(i10 * f10, i11, i12);
    }

    public static Map<String, g> D(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, @Nullable C0895c c0895c, Map<String, e> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (n0.e(xmlPullParser, "style")) {
                String strA = n0.a(xmlPullParser, "style");
                g gVarI = I(xmlPullParser, new g());
                if (strA != null) {
                    for (String str : J(strA)) {
                        gVarI.a(map.get(str));
                    }
                }
                String strG = gVarI.g();
                if (strG != null) {
                    map.put(strG, gVarI);
                }
            } else if (n0.e(xmlPullParser, "region")) {
                e eVarG = G(xmlPullParser, aVar, c0895c);
                if (eVarG != null) {
                    map2.put(eVarG.f75221a, eVarG);
                }
            } else if (n0.e(xmlPullParser, "metadata")) {
                E(xmlPullParser, map3);
            }
        } while (!n0.c(xmlPullParser, "head"));
        return map;
    }

    public static void E(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strA;
        do {
            xmlPullParser.next();
            if (n0.e(xmlPullParser, "image") && (strA = n0.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!n0.c(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n7.d F(org.xmlpull.v1.XmlPullParser r19, @androidx.annotation.Nullable n7.d r20, java.util.Map<java.lang.String, n7.e> r21, n7.c.b r22) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.c.F(org.xmlpull.v1.XmlPullParser, n7.d, java.util.Map, n7.c$b):n7.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n7.e G(org.xmlpull.v1.XmlPullParser r17, n7.c.a r18, @androidx.annotation.Nullable n7.c.C0895c r19) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.c.G(org.xmlpull.v1.XmlPullParser, n7.c$a, n7.c$c):n7.e");
    }

    public static float H(String str) {
        Matcher matcher = f75194s.matcher(str);
        if (!matcher.matches()) {
            q.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) s7.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            q.j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    public static g I(XmlPullParser xmlPullParser, g gVar) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    gVar = x(gVar).B("italic".equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    gVar = x(gVar).x(attributeValue);
                    break;
                case "textAlign":
                    gVar = x(gVar).H(z(attributeValue));
                    break;
                case "textDecoration":
                    String strE = y7.a.e(attributeValue);
                    strE.hashCode();
                    switch (strE) {
                        case "nounderline":
                            gVar = x(gVar).K(false);
                            break;
                        case "underline":
                            gVar = x(gVar).K(true);
                            break;
                        case "nolinethrough":
                            gVar = x(gVar).C(false);
                            break;
                        case "linethrough":
                            gVar = x(gVar).C(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    gVar = x(gVar).v("bold".equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        gVar = x(gVar).A(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strE2 = y7.a.e(attributeValue);
                    strE2.hashCode();
                    switch (strE2) {
                        case "baseContainer":
                        case "base":
                            gVar = x(gVar).F(2);
                            break;
                        case "container":
                            gVar = x(gVar).F(1);
                            break;
                        case "delimiter":
                            gVar = x(gVar).F(4);
                            break;
                        case "textContainer":
                        case "text":
                            gVar = x(gVar).F(3);
                            break;
                    }
                    break;
                case "color":
                    gVar = x(gVar);
                    try {
                        gVar.w(s7.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        q.i("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    gVar = x(gVar).G(H(attributeValue));
                    break;
                case "textCombine":
                    String strE3 = y7.a.e(attributeValue);
                    strE3.hashCode();
                    if (!strE3.equals("all")) {
                        if (strE3.equals("none")) {
                            gVar = x(gVar).I(false);
                        }
                        break;
                    } else {
                        gVar = x(gVar).I(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        gVar = x(gVar);
                        B(attributeValue, gVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        q.i("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    gVar = x(gVar).J(n7.b.a(attributeValue));
                    break;
                case "rubyPosition":
                    String strE4 = y7.a.e(attributeValue);
                    strE4.hashCode();
                    if (!strE4.equals("before")) {
                        if (strE4.equals("after")) {
                            gVar = x(gVar).E(2);
                        }
                        break;
                    } else {
                        gVar = x(gVar).E(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    gVar = x(gVar);
                    try {
                        gVar.u(s7.f.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        q.i("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    gVar = x(gVar).D(z(attributeValue));
                    break;
            }
        }
        return gVar;
    }

    public static String[] J(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : m0.H0(strTrim, "\\s+");
    }

    public static long K(String str, b bVar) throws SubtitleDecoderException {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f75191p.matcher(str);
        if (matcher.matches()) {
            double d13 = (Long.parseLong((String) s7.a.e(matcher.group(1))) * 3600) + (Long.parseLong((String) s7.a.e(matcher.group(2))) * 60) + Long.parseLong((String) s7.a.e(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d13 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f75203a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) bVar.f75204b)) / ((double) bVar.f75203a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f75192q.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        d10 = Double.parseDouble((String) s7.a.e(matcher2.group(1)));
        String str2 = (String) s7.a.e(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d11 = bVar.f75203a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = bVar.f75205c;
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

    @Nullable
    public static C0895c L(XmlPullParser xmlPullParser) {
        String strA = n0.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f75196u.matcher(strA);
        if (!matcher.matches()) {
            q.i("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new C0895c(Integer.parseInt((String) s7.a.e(matcher.group(1))), Integer.parseInt((String) s7.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            q.i("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    public static g x(@Nullable g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean y(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    @Nullable
    public static Layout.Alignment z(String str) {
        String strE = y7.a.e(str);
        strE.hashCode();
        switch (strE) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // g7.h
    public i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        b bVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f75200o.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e(""));
            C0895c c0895cL = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVarC = f75198w;
            a aVarA = f75199x;
            int i11 = 0;
            h hVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVarC = C(xmlPullParserNewPullParser);
                            aVarA = A(xmlPullParserNewPullParser, f75199x);
                            c0895cL = L(xmlPullParserNewPullParser);
                        }
                        C0895c c0895c = c0895cL;
                        b bVar2 = bVarC;
                        a aVar = aVarA;
                        if (y(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                D(xmlPullParserNewPullParser, map, aVar, c0895c, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    d dVarF = F(xmlPullParserNewPullParser, dVar, map2, bVar);
                                    arrayDeque.push(dVarF);
                                    if (dVar != null) {
                                        dVar.a(dVarF);
                                    }
                                } catch (SubtitleDecoderException e10) {
                                    q.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVarC = bVar;
                        } else {
                            q.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i11++;
                            bVarC = bVar2;
                        }
                        c0895cL = c0895c;
                        aVarA = aVar;
                    } else if (eventType == 4) {
                        ((d) s7.a.e(dVar)).a(d.d(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            hVar = new h((d) s7.a.e((d) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }
}
