package yads;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes12.dex */
public final class pp3 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp3 f93714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rp3 f93717d;

    public /* synthetic */ pp3(qp3 qp3Var, String str, String str2) {
        this(qp3Var, str, str2, new rp3());
    }

    public pp3(qp3 qp3Var, String str, String str2, rp3 rp3Var) {
        this.f93714a = qp3Var;
        this.f93715b = str;
        this.f93716c = str2;
        this.f93717d = rp3Var;
    }

    @Override // yads.qp3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        rp3 rp3Var = this.f93717d;
        String str = this.f93715b;
        rp3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f93717d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f93717d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (tn.p.f(this.f93716c, xmlPullParser.getName())) {
                    Object objA = this.f93714a.a(xmlPullParser, knVar);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } else {
                    this.f93717d.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
