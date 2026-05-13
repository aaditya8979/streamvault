package yads;

import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes11.dex */
public final class jp3 {
    public static boolean a(XmlPullParser xmlPullParser, String str, boolean z10) {
        Boolean boolR1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return z10;
        }
        String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        return (lowerCase == null || (boolR1 = bo.d0.r1(lowerCase)) == null) ? z10 : boolR1.booleanValue();
    }
}
