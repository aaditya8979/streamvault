package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class pl3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f93640a;

    public /* synthetic */ pl3() {
        this(new rp3());
    }

    public pl3(rp3 rp3Var) {
        this.f93640a = rp3Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final ol3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f93640a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f93640a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ol3(arrayList);
            }
            this.f93640a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (tn.p.f("Viewable", xmlPullParser.getName())) {
                    this.f93640a.getClass();
                    arrayList.add(rp3.a(xmlPullParser));
                } else {
                    this.f93640a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
