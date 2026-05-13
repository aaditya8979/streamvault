package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class jr0 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f91335a;

    public jr0(rp3 rp3Var) {
        this.f91335a = rp3Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f91335a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.f91335a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long lT = attributeValue != null ? bo.z.t(attributeValue) : null;
        this.f91335a.getClass();
        String strA = rp3.a(xmlPullParser);
        if (strA.length() <= 0 || lT == null) {
            return null;
        }
        return new dr0(strA, lT.longValue());
    }
}
