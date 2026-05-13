package yads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class e30 extends DefaultHandler implements pb2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f89073b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f89074c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f89075d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f89076e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f89077a;

    public e30() {
        try {
            this.f89077a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = ib3.f90737a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new fx2(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static long a(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = ib3.f90744h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j11 : j11;
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        boolean z10 = false;
        int i10 = 0;
        long j12 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j13 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    jA = a(arrayList, jA, j12, i10, j13);
                }
                if (j13 == -9223372036854775807L) {
                    j13 = jA;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                long j14 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                long j15 = j14;
                z10 = true;
                j12 = j15;
                jA = j13;
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            a(arrayList, jA, j12, i10, ib3.a(j11, j10, 1000L));
        }
        return arrayList;
    }

    public static ArrayList a(XmlPullParser xmlPullParser, List list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "BaseURL"));
        if (text != null && oa3.a(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return qf1.a(new uo(i10, i11, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            uo uoVar = (uo) list.get(i12);
            String strA = oa3.a(uoVar.f95730a, text);
            String str = attributeValue3 == null ? strA : attributeValue3;
            if (z10) {
                i10 = uoVar.f95732c;
                i11 = uoVar.f95733d;
                str = uoVar.f95731b;
            }
            arrayList.add(new uo(i10, i11, strA, str));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:153:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0d95 A[LOOP:11: B:284:0x078d->B:530:0x0d95, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x1078 A[LOOP:5: B:177:0x0413->B:624:0x1078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x1403 A[LOOP:1: B:45:0x00d0->B:740:0x1403, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x13c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0f1b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:772:0x09c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.c30 a(org.xmlpull.v1.XmlPullParser r144, android.net.Uri r145) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.a(org.xmlpull.v1.XmlPullParser, android.net.Uri):yads.c30");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8 A[PHI: r2 r3
      0x00d8: PHI (r2v9 yads.pl2) = (r2v8 yads.pl2), (r2v10 yads.pl2) binds: [B:56:0x00c1, B:63:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r3v4 java.util.List) = (r3v3 java.util.List), (r3v5 java.util.List) binds: [B:56:0x00c1, B:63:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.dx2 a(org.xmlpull.v1.XmlPullParser r25, yads.dx2 r26, long r27, long r29, long r31, long r33, long r35) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.a(org.xmlpull.v1.XmlPullParser, yads.dx2, long, long, long, long, long):yads.dx2");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[PHI: r6
      0x00f4: PHI (r6v3 yads.pl2) = (r6v2 yads.pl2), (r6v5 yads.pl2) binds: [B:66:0x00e5, B:70:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.ex2 a(org.xmlpull.v1.XmlPullParser r28, yads.ex2 r29, java.util.List r30, long r31, long r33, long r35, long r37, long r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.a(org.xmlpull.v1.XmlPullParser, yads.ex2, java.util.List, long, long, long, long, long):yads.ex2");
    }

    public static gx2 a(XmlPullParser xmlPullParser, gx2 gx2Var) throws XmlPullParserException, IOException {
        long j10 = gx2Var != null ? gx2Var.f90589b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = gx2Var != null ? gx2Var.f90590c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = gx2Var != null ? gx2Var.f90148d : 0L;
        long j15 = gx2Var != null ? gx2Var.f90149e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        pl2 pl2VarA = gx2Var != null ? gx2Var.f90588a : null;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, "Initialization")) {
                pl2VarA = a(xmlPullParser, "sourceURL", "range");
            } else {
                a(xmlPullParser);
            }
        } while (!sp3.b(xmlPullParser, "SegmentBase"));
        return new gx2(pl2VarA, j11, j13, j17, j16);
    }

    public static pl2 a(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return new pl2(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return new pl2(attributeValue, j10, j11);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c8. Please report as an issue. */
    public static va3 a(XmlPullParser xmlPullParser, String str, va3 va3Var) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return va3Var;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i10 = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i10] = strArr[i10] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i10] = strArr[i10] + "$";
                length += 2;
            } else {
                int i11 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i11);
                String strSubstring2 = attributeValue.substring(i11, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i10] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith(VastAttributes.HORIZONTAL_POSITION) && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i10] = 2;
                            break;
                        case "Time":
                            iArr[i10] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i10] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
                strArr[i10] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new va3(strArr, iArr, strArr2, i10);
    }

    public static wf0 a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, str));
        return new wf0(attributeValue, attributeValue2, str2);
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    public static int b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        iBitCount = 6;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount <= 0 || iBitCount >= 33) {
                    iBitCount = -1;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    iBitCount = Integer.parseInt(attributeValue3);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 == null) {
                    iBitCount = -1;
                    break;
                } else {
                    String strA = ki.a(attributeValue4);
                    strA.getClass();
                    switch (strA) {
                        case "4000":
                            iBitCount = 1;
                            break;
                        case "a000":
                            iBitCount = 2;
                            break;
                        case "f801":
                            break;
                        case "fa01":
                            iBitCount = 8;
                            break;
                        default:
                            iBitCount = -1;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int i10 = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (i10 >= 0) {
                    int[] iArr = f89076e;
                    iBitCount = i10 >= iArr.length ? -1 : iArr[i10];
                    break;
                } else {
                    iBitCount = -1;
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue6, 16))) == 0) {
                    iBitCount = -1;
                    break;
                }
                break;
            default:
                iBitCount = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!sp3.b(xmlPullParser, "AudioChannelConfiguration"));
        return iBitCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.e30.c(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    @Override // yads.pb2
    public final Object a(Uri uri, r30 r30Var) throws ob2 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f89077a.newPullParser();
            xmlPullParserNewPullParser.setInput(r30Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return a(xmlPullParserNewPullParser, uri);
            }
            throw new ob2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e10) {
            throw new ob2(null, e10, true, 4);
        }
    }
}
