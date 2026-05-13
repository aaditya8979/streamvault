package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class zd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f97541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pp3 f97542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pp3 f97543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl3 f97544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ee3 f97545e;

    public /* synthetic */ zd3(Context context, io2 io2Var) {
        this(new rp3(), new pp3(new h20(context, io2Var), VastTagName.CREATIVES, VastTagName.CREATIVE), new pp3(new kd3(), "AdVerifications", VastTagName.VERIFICATION), new pl3(), new ee3());
    }

    public zd3(rp3 rp3Var, pp3 pp3Var, pp3 pp3Var2, pl3 pl3Var, ee3 ee3Var) {
        this.f97541a = rp3Var;
        this.f97542b = pp3Var;
        this.f97543c = pp3Var2;
        this.f97544d = pl3Var;
        this.f97545e = ee3Var;
    }

    public final void a(XmlPullParser xmlPullParser, td3 td3Var, kn knVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (tn.p.f(VastTagName.IMPRESSION, name)) {
            this.f97541a.getClass();
            String strA = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = td3Var.f95177n;
            Object arrayList = linkedHashMap.get("impression");
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put("impression", arrayList);
            }
            ((List) arrayList).add(strA);
            return;
        }
        if (tn.p.f("ViewableImpression", name)) {
            td3Var.f95172i = this.f97544d.a(xmlPullParser);
            return;
        }
        if (tn.p.f(VastTagName.ERROR, name)) {
            this.f97541a.getClass();
            String strA2 = rp3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = td3Var.f95177n;
            Object arrayList2 = linkedHashMap2.get("error");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put("error", arrayList2);
            }
            ((List) arrayList2).add(strA2);
            return;
        }
        if (tn.p.f("Survey", name)) {
            this.f97541a.getClass();
            td3Var.f95170g = rp3.a(xmlPullParser);
            return;
        }
        if (tn.p.f("Description", name)) {
            this.f97541a.getClass();
            td3Var.f95169f = rp3.a(xmlPullParser);
            return;
        }
        if (tn.p.f("AdTitle", name)) {
            this.f97541a.getClass();
            td3Var.f95168e = rp3.a(xmlPullParser);
            return;
        }
        if (tn.p.f(VastTagName.AD_SYSTEM, name)) {
            this.f97541a.getClass();
            td3Var.f95167d = rp3.a(xmlPullParser);
            return;
        }
        if (tn.p.f(VastTagName.CREATIVES, name)) {
            td3Var.f95175l.addAll(this.f97542b.a(xmlPullParser, knVar));
            return;
        }
        if (tn.p.f("AdVerifications", name)) {
            td3Var.f95176m.addAll(this.f97543c.a(xmlPullParser, knVar));
            return;
        }
        if (!tn.p.f(VastTagName.EXTENSIONS, name)) {
            this.f97541a.getClass();
            rp3.b(xmlPullParser);
            return;
        }
        ee3 ee3Var = this.f97545e;
        ee3Var.f89226a.getClass();
        xmlPullParser.require(2, null, VastTagName.EXTENSIONS);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            ee3Var.f89226a.getClass();
            if (xmlPullParser.next() == 3) {
                td3Var.f95178o = new de3(cn.f0.g1(arrayList4), cn.f0.g1(arrayList3));
                return;
            }
            ee3Var.f89226a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (tn.p.f(VastTagName.EXTENSION, xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (ee3.f89225e.contains(attributeValue)) {
                        hq0 hq0VarA = ee3Var.f89227b.a(xmlPullParser);
                        if (hq0VarA != null) {
                            arrayList4.add(hq0VarA);
                        }
                    } else if (tn.p.f(ee3.f89224d, attributeValue)) {
                        arrayList3.addAll(ee3Var.f89228c.a(xmlPullParser, knVar));
                    } else {
                        ee3Var.f89226a.getClass();
                        rp3.b(xmlPullParser);
                    }
                } else {
                    ee3Var.f89226a.getClass();
                    rp3.b(xmlPullParser);
                }
            }
        }
    }
}
