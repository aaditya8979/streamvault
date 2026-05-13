package yads;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class z73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f97420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y73 f97421b;

    public /* synthetic */ z73() {
        this(new rp3(), new y73());
    }

    public z73(rp3 rp3Var, y73 y73Var) {
        this.f97420a = rp3Var;
        this.f97421b = y73Var;
    }

    public final HashMap a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f97420a.getClass();
        xmlPullParser.require(2, null, VastTagName.TRACKING_EVENTS);
        HashMap map = new HashMap();
        while (true) {
            this.f97420a.getClass();
            if (xmlPullParser.next() == 3) {
                return map;
            }
            this.f97420a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (tn.p.f(VastTagName.TRACKING, xmlPullParser.getName())) {
                    x73 x73VarA = this.f97421b.a(xmlPullParser);
                    if (x73VarA != null) {
                        String str = x73VarA.f96651a;
                        String str2 = x73VarA.f96652b;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        List list = (List) map.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.f97420a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
