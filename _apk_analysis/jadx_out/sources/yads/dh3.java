package yads;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class dh3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f88856a;

    public /* synthetic */ dh3() {
        this(new rp3());
    }

    public dh3(rp3 rp3Var) {
        this.f88856a = rp3Var;
    }

    @Override // yads.qp3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final ch3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f88856a.getClass();
        String str = null;
        xmlPullParser.require(2, null, VastTagName.VIDEO_CLICKS);
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f88856a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ch3(str, arrayList);
            }
            this.f88856a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (tn.p.f(VastTagName.CLICK_THROUGH, name)) {
                    this.f88856a.getClass();
                    String strA = rp3.a(xmlPullParser);
                    if (strA.length() > 0) {
                        str = strA;
                    }
                } else if (tn.p.f(VastTagName.CLICK_TRACKING, name)) {
                    this.f88856a.getClass();
                    String strA2 = rp3.a(xmlPullParser);
                    if (strA2.length() > 0) {
                        arrayList.add(strA2);
                    }
                } else {
                    this.f88856a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
