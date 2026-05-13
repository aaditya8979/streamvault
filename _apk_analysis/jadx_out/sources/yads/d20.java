package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class d20 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f88701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rp3 f88702b;

    public d20(jr0 jr0Var, rp3 rp3Var) {
        this.f88701a = jr0Var;
        this.f88702b = rp3Var;
    }

    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        this.f88702b.getClass();
        Object objA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f88702b.getClass();
            if (xmlPullParser.next() == 3) {
                return objA;
            }
            this.f88702b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                objA = this.f88701a.a(xmlPullParser, knVar);
            }
        }
    }
}
