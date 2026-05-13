package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public final class h20 implements qp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f90198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff1 f90199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f20 f90200c;

    public /* synthetic */ h20(Context context, io2 io2Var) {
        this(new rp3(), new ff1(), new f20(context, io2Var));
    }

    public h20(rp3 rp3Var, ff1 ff1Var, f20 f20Var) {
        this.f90198a = rp3Var;
        this.f90199b = ff1Var;
        this.f90200c = f20Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.qp3
    public final Object a(XmlPullParser xmlPullParser, kn knVar) throws XmlPullParserException, JSONException, IOException {
        String str;
        int i10;
        String str2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        this.f90198a.getClass();
        int i11 = 2;
        String str3 = null;
        xmlPullParser2.require(2, null, VastTagName.CREATIVE);
        this.f90198a.getClass();
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        e20 e20Var = null;
        String str4 = null;
        n03 n03Var = 0;
        String strA = null;
        boolean z10 = false;
        int iLongValue = 0;
        while (true) {
            this.f90198a.getClass();
            if (xmlPullParser.next() == 3) {
                String str5 = attributeValue;
                int i12 = iLongValue;
                if (!z10) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof kl1) {
                        arrayList4.add(obj);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof rc1) {
                        arrayList5.add(obj2);
                    }
                }
                return new b20(arrayList4, arrayList5, arrayList2, arrayList3, e20Var, str4, n03Var, str5, i12, strA);
            }
            this.f90198a.getClass();
            if (xmlPullParser.getEventType() == i11) {
                String name = xmlPullParser.getName();
                if (tn.p.f(VastTagName.LINEAR, name)) {
                    ff1 ff1Var = this.f90199b;
                    ff1Var.f89553a.getClass();
                    xmlPullParser2.require(i11, str3, VastTagName.LINEAR);
                    ff1Var.f89556d.getClass();
                    String attributeValue2 = xmlPullParser2.getAttributeValue(str3, VastAttributes.SKIP_OFFSET);
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    Object n03Var2 = attributeValue2.length() > 0 ? new n03(attributeValue2) : str3;
                    while (true) {
                        ff1Var.f89553a.getClass();
                        if (xmlPullParser.next() != 3) {
                            ff1Var.f89553a.getClass();
                            if (xmlPullParser.getEventType() == i11) {
                                String name2 = xmlPullParser.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (name2.equals(VastTagName.VIDEO_CLICKS)) {
                                                ch3 ch3VarA = ff1Var.f89554b.a(xmlPullParser2);
                                                str4 = ch3VarA.f88464b;
                                                for (Iterator it = ch3VarA.f88463a.iterator(); it.hasNext(); it = it) {
                                                    arrayList3.add(new x73("clickTracking", (String) it.next(), null));
                                                }
                                                break;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name2.equals(VastTagName.DURATION)) {
                                                dl0 dl0Var = ff1Var.f89555c;
                                                dl0Var.f88899a.getClass();
                                                xmlPullParser2.require(i11, str3, VastTagName.DURATION);
                                                dl0Var.f88899a.getClass();
                                                Long lA = xg3.a(rp3.a(xmlPullParser));
                                                if (lA != null) {
                                                    iLongValue = (int) lA.longValue();
                                                } else {
                                                    iLongValue = 0;
                                                }
                                            }
                                            break;
                                        case -1348833651:
                                            if (name2.equals(VastTagName.AD_PARAMETERS)) {
                                                ff1Var.f89553a.getClass();
                                                strA = rp3.a(xmlPullParser);
                                            }
                                            break;
                                        case -385055469:
                                            if (name2.equals(VastTagName.MEDIA_FILES)) {
                                                arrayList.addAll(ff1Var.f89557e.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals("Icons")) {
                                                arrayList2.addAll(ff1Var.f89558f.a(xmlPullParser2, knVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals(VastTagName.TRACKING_EVENTS)) {
                                                Iterator it2 = ff1Var.f89559g.a(xmlPullParser2, knVar).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList3.add((x73) it2.next());
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                ff1Var.f89553a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            i11 = 2;
                            str3 = null;
                        } else {
                            z10 = true;
                            n03Var = n03Var2;
                            i11 = 2;
                            str3 = null;
                        }
                    }
                } else if (tn.p.f("CreativeExtensions", name)) {
                    f20 f20Var = this.f90200c;
                    f20Var.f89452a.getClass();
                    xmlPullParser2.require(2, null, "CreativeExtensions");
                    dr0 dr0Var = null;
                    ArrayList arrayListA = null;
                    df1 df1Var = null;
                    while (true) {
                        f20Var.f89452a.getClass();
                        int i13 = iLongValue;
                        if (xmlPullParser.next() != 3) {
                            f20Var.f89452a.getClass();
                            if (xmlPullParser.getEventType() != 2) {
                                str2 = attributeValue;
                            } else if (tn.p.f("CreativeExtension", xmlPullParser.getName())) {
                                String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                if (tn.p.f("false_click", attributeValue3)) {
                                    dr0Var = (dr0) f20Var.f89454c.a(xmlPullParser2, knVar);
                                } else if (tn.p.f(f20.f89450e, attributeValue3)) {
                                    arrayListA = f20Var.f89455d.a(xmlPullParser2, knVar);
                                } else if (tn.p.f(f20.f89451f, attributeValue3)) {
                                    ef1 ef1Var = f20Var.f89453b;
                                    ef1Var.getClass();
                                    try {
                                        ef1Var.f89239b.getClass();
                                        JSONObject jSONObject = new JSONObject(rp3.a(xmlPullParser));
                                        Iterator<String> itKeys = jSONObject.keys();
                                        List listM = cn.w.m();
                                        while (itKeys.hasNext()) {
                                            Iterator<String> it3 = itKeys;
                                            String next = itKeys.next();
                                            String str6 = attributeValue;
                                            if (tn.p.f("assets", next)) {
                                                listM = ef1Var.f89238a.a(jSONObject, knVar);
                                            } else if (tn.p.f("link", next)) {
                                                ef1Var.f89240c.a(jSONObject.getJSONObject(next), knVar);
                                            }
                                            attributeValue = str6;
                                            itKeys = it3;
                                        }
                                        str2 = attributeValue;
                                        df1Var = new df1(listM);
                                    } catch (Exception e10) {
                                        throw new JSONException(e10.getMessage());
                                    }
                                } else {
                                    str2 = attributeValue;
                                    f20Var.f89452a.getClass();
                                    rp3.b(xmlPullParser);
                                }
                                iLongValue = i13;
                            } else {
                                str2 = attributeValue;
                                f20Var.f89452a.getClass();
                                rp3.b(xmlPullParser);
                            }
                            xmlPullParser2 = xmlPullParser;
                            iLongValue = i13;
                            attributeValue = str2;
                        } else {
                            e20Var = new e20(dr0Var, arrayListA, df1Var);
                            iLongValue = i13;
                            i11 = 2;
                            str3 = null;
                            xmlPullParser2 = xmlPullParser;
                        }
                    }
                } else {
                    str = attributeValue;
                    i10 = iLongValue;
                    this.f90198a.getClass();
                    rp3.b(xmlPullParser);
                }
            } else {
                str = attributeValue;
                i10 = iLongValue;
            }
            xmlPullParser2 = xmlPullParser;
            iLongValue = i10;
            attributeValue = str;
            n03Var = n03Var;
            i11 = 2;
            str3 = null;
        }
    }
}
