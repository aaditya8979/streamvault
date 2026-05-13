package yads;

import android.text.Layout;
import com.ironsource.Z7;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class r93 extends fz2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f94334n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f94335o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f94336p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f94337q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f94338r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f94339s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f94340t = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p93 f94341u = new p93(30.0f, 1, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o93 f94342v = new o93(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f94343m;

    public r93() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f94343m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(String str, p93 p93Var) throws t43 {
        double d10;
        double d11;
        double d12;
        Matcher matcher = f94334n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d13 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d14 = d13 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d15 = d14 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d15 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / p93Var.f93497a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) p93Var.f93498b)) / ((double) p93Var.f93497a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f94335o.matcher(str);
        if (!matcher2.matches()) {
            throw new t43("Malformed time expression: " + str);
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d10 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d11 = p93Var.f93497a;
                d10 /= d11;
                return (long) (d10 * 1000000.0d);
            case "h":
                d12 = 3600.0d;
                break;
            case "m":
                d12 = 60.0d;
                break;
            case "t":
                d11 = p93Var.f93499c;
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

    public static o93 a(XmlPullParser xmlPullParser, o93 o93Var) throws t43 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return o93Var;
        }
        Matcher matcher = f94340t.matcher(attributeValue);
        if (!matcher.matches()) {
            ih1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return o93Var;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 != 0 && i11 != 0) {
                return new o93(i11);
            }
            throw new t43("Invalid cell resolution " + i10 + Z7.f30794r + i11);
        } catch (NumberFormatException unused) {
            ih1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return o93Var;
        }
    }

    public static p93 a(XmlPullParser xmlPullParser) throws t43 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = ib3.f90737a;
            if (attributeValue2.split(Z7.f30794r, -1).length != 2) {
                throw new t43("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        p93 p93Var = f94341u;
        int i12 = p93Var.f93498b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        int i13 = p93Var.f93499c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i13 = Integer.parseInt(attributeValue4);
        }
        return new p93(i10 * f10, i12, i13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.s93 a(org.xmlpull.v1.XmlPullParser r19, yads.s93 r20, java.util.HashMap r21, yads.p93 r22) throws yads.t43 {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r93.a(org.xmlpull.v1.XmlPullParser, yads.s93, java.util.HashMap, yads.p93):yads.s93");
    }

    public static v93 a(XmlPullParser xmlPullParser, v93 v93Var) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    v93Var = a(v93Var);
                    v93Var.f96025i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "fontFamily":
                    v93Var = a(v93Var);
                    v93Var.f96017a = attributeValue;
                    break;
                case "textAlign":
                    v93Var = a(v93Var);
                    v93Var.f96031o = b(attributeValue);
                    break;
                case "textDecoration":
                    String strA = ki.a(attributeValue);
                    strA.getClass();
                    switch (strA) {
                        case "nounderline":
                            v93Var = a(v93Var);
                            v93Var.f96023g = 0;
                            break;
                        case "underline":
                            v93Var = a(v93Var);
                            v93Var.f96023g = 1;
                            break;
                        case "nolinethrough":
                            v93Var = a(v93Var);
                            v93Var.f96022f = 0;
                            break;
                        case "linethrough":
                            v93Var = a(v93Var);
                            v93Var.f96022f = 1;
                            break;
                    }
                    break;
                case "fontWeight":
                    v93Var = a(v93Var);
                    v93Var.f96024h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        v93Var = a(v93Var);
                        v93Var.f96028l = attributeValue;
                        break;
                    }
                    break;
                case "ruby":
                    String strA2 = ki.a(attributeValue);
                    strA2.getClass();
                    switch (strA2) {
                        case "baseContainer":
                        case "base":
                            v93Var = a(v93Var);
                            v93Var.f96029m = 2;
                            break;
                        case "container":
                            v93Var = a(v93Var);
                            v93Var.f96029m = 1;
                            break;
                        case "delimiter":
                            v93Var = a(v93Var);
                            v93Var.f96029m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            v93Var = a(v93Var);
                            v93Var.f96029m = 3;
                            break;
                    }
                    break;
                case "color":
                    v93Var = a(v93Var);
                    try {
                        v93Var.f96018b = nx.a(attributeValue, false);
                        v93Var.f96019c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        pk1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "shear":
                    v93Var = a(v93Var);
                    Matcher matcher = f94337q.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e10) {
                            ih1.d("TtmlDecoder", ih1.a("Failed to parse shear: " + attributeValue, e10));
                        }
                        break;
                    } else {
                        pk1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    }
                    v93Var.f96035s = fMin;
                    break;
                case "textCombine":
                    String strA3 = ki.a(attributeValue);
                    strA3.getClass();
                    if (!strA3.equals("all")) {
                        if (strA3.equals("none")) {
                            v93Var = a(v93Var);
                            v93Var.f96033q = 0;
                        }
                        break;
                    } else {
                        v93Var = a(v93Var);
                        v93Var.f96033q = 1;
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        v93Var = a(v93Var);
                        a(attributeValue, v93Var);
                        break;
                    } catch (t43 unused2) {
                        pk1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "textEmphasis":
                    v93Var = a(v93Var);
                    v93Var.f96034r = v53.a(attributeValue);
                    break;
                case "rubyPosition":
                    String strA4 = ki.a(attributeValue);
                    strA4.getClass();
                    if (!strA4.equals("before")) {
                        if (strA4.equals("after")) {
                            v93Var = a(v93Var);
                            v93Var.f96030n = 2;
                        }
                        break;
                    } else {
                        v93Var = a(v93Var);
                        v93Var.f96030n = 1;
                        break;
                    }
                    break;
                case "backgroundColor":
                    v93Var = a(v93Var);
                    try {
                        v93Var.f96020d = nx.a(attributeValue, false);
                        v93Var.f96021e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        pk1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                    break;
                case "multiRowAlign":
                    v93Var = a(v93Var);
                    v93Var.f96032p = b(attributeValue);
                    break;
            }
        }
        return v93Var;
    }

    public static v93 a(v93 v93Var) {
        return v93Var == null ? new v93() : v93Var;
    }

    public static void a(String str, v93 v93Var) throws t43 {
        Matcher matcher;
        String strGroup;
        int i10 = ib3.f90737a;
        String[] strArrSplit = str.split("\\s+", -1);
        if (strArrSplit.length == 1) {
            matcher = f94336p.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new t43("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = f94336p.matcher(strArrSplit[1]);
            ih1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new t43("Invalid expression for fontSize: '" + str + "'.");
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                v93Var.f96026j = 3;
                break;
            case "em":
                v93Var.f96026j = 2;
                break;
            case "px":
                v93Var.f96026j = 1;
                break;
            default:
                throw new t43("Invalid unit for fontSize: '" + strGroup + "'.");
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        v93Var.f96027k = Float.parseFloat(strGroup2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, yads.o93 r22, yads.q93 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r93.a(org.xmlpull.v1.XmlPullParser, java.util.HashMap, yads.o93, yads.q93, java.util.HashMap, java.util.HashMap):void");
    }

    public static boolean a(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment b(String str) {
        String strA = ki.a(str);
        strA.getClass();
        switch (strA) {
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

    public static q93 b(XmlPullParser xmlPullParser) {
        String strA = sp3.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = f94339s.matcher(strA);
        if (!matcher.matches()) {
            ih1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new q93(i10, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            ih1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        p93 p93Var;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f94343m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new t93("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            q93 q93VarB = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            p93 p93VarA = f94341u;
            o93 o93VarA = f94342v;
            int i11 = 0;
            w93 w93Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                s93 s93Var = (s93) arrayDeque.peek();
                if (i11 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            p93VarA = a(xmlPullParserNewPullParser);
                            o93VarA = a(xmlPullParserNewPullParser, f94342v);
                            q93VarB = b(xmlPullParserNewPullParser);
                        }
                        q93 q93Var = q93VarB;
                        p93 p93Var2 = p93VarA;
                        o93 o93Var = o93VarA;
                        if (a(name)) {
                            if ("head".equals(name)) {
                                p93Var = p93Var2;
                                a(xmlPullParserNewPullParser, map, o93Var, q93Var, map2, map3);
                            } else {
                                p93Var = p93Var2;
                                try {
                                    s93 s93VarA = a(xmlPullParserNewPullParser, s93Var, map2, p93Var);
                                    arrayDeque.push(s93VarA);
                                    if (s93Var != null) {
                                        if (s93Var.f94747m == null) {
                                            s93Var.f94747m = new ArrayList();
                                        }
                                        s93Var.f94747m.add(s93VarA);
                                    }
                                } catch (t43 e10) {
                                    ih1.d("TtmlDecoder", ih1.a("Suppressing parser error", e10));
                                    p93VarA = p93Var;
                                    q93VarB = q93Var;
                                    o93VarA = o93Var;
                                    i11++;
                                }
                            }
                            p93VarA = p93Var;
                            q93VarB = q93Var;
                            o93VarA = o93Var;
                        } else {
                            ih1.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            p93Var = p93Var2;
                        }
                        p93VarA = p93Var;
                        q93VarB = q93Var;
                        o93VarA = o93Var;
                        i11++;
                    } else if (eventType == 4) {
                        s93Var.getClass();
                        s93 s93VarA2 = s93.a(xmlPullParserNewPullParser.getText());
                        if (s93Var.f94747m == null) {
                            s93Var.f94747m = new ArrayList();
                        }
                        s93Var.f94747m.add(s93VarA2);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            s93 s93Var2 = (s93) arrayDeque.peek();
                            s93Var2.getClass();
                            w93Var = new w93(s93Var2, map, map2, map3);
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
            if (w93Var != null) {
                return w93Var;
            }
            throw new t43("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new t43("Unable to decode source", e12);
        }
    }
}
