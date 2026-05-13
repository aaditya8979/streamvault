package yads;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f95320a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f95321b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f95322c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static fv1 a(String str) throws XmlPullParserException, IOException {
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!sp3.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw new ob2("Couldn't find xmp metadata", null, true, 1);
        }
        m51 m51Var = p51.f93439c;
        sm2 sm2VarA = sm2.f94878f;
        long j11 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (sp3.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f95320a;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String strA = sp3.a(xmlPullParserNewPullParser, strArr[i10]);
                    if (strA == null) {
                        i10++;
                    } else if (Integer.parseInt(strA) == 1) {
                        String[] strArr2 = f95321b;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String strA2 = sp3.a(xmlPullParserNewPullParser, strArr2[i11]);
                            if (strA2 != null) {
                                j10 = Long.parseLong(strA2);
                                if (j10 == -1) {
                                    break;
                                }
                            } else {
                                i11++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        String[] strArr3 = f95322c;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 2) {
                                m51 m51Var2 = p51.f93439c;
                                sm2VarA = sm2.f94878f;
                                break;
                            }
                            String strA3 = sp3.a(xmlPullParserNewPullParser, strArr3[i12]);
                            if (strA3 != null) {
                                sm2VarA = p51.a(new ev1("image/jpeg", 0L, 0L), new ev1("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i12++;
                        }
                        j11 = j10;
                    }
                }
                return null;
            }
            if (sp3.c(xmlPullParserNewPullParser, "Container:Directory")) {
                sm2VarA = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (sp3.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                sm2VarA = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!sp3.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (sm2VarA.isEmpty()) {
            return null;
        }
        return new fv1(j11, sm2VarA);
    }

    public static sm2 a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        m51 m51Var = p51.f93439c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (sp3.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = sp3.a(xmlPullParser, strConcat3);
                String strA2 = sp3.a(xmlPullParser, strConcat4);
                String strA3 = sp3.a(xmlPullParser, strConcat5);
                String strA4 = sp3.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return sm2.f94878f;
                }
                ev1 ev1Var = new ev1(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L);
                int i11 = i10 + 1;
                if (objArrCopyOf.length < i11) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i11));
                }
                objArrCopyOf[i10] = ev1Var;
                i10 = i11;
            }
        } while (!sp3.b(xmlPullParser, strConcat2));
        return p51.b(i10, objArrCopyOf);
    }
}
