package com.inmobi.media;

import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3550l4 extends AbstractC3829w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f27533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3550l4(String str, String str2, List list, boolean z10) {
        super(str);
        tn.p.k(str, "url");
        tn.p.k(str2, "accountId");
        tn.p.k(list, "configRequestContexts");
        this.f27532b = str2;
        this.f27533c = list;
        this.f27534d = z10;
    }

    public final Le a() throws JSONException {
        List<C3575m4> list = this.f27533c;
        JSONArray jSONArray = new JSONArray();
        for (C3575m4 c3575m4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("n", c3575m4.f27598b.getType());
            jSONObject.put("t", c3575m4.f27598b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        tn.p.j(string, "toString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.f27532b);
        linkedHashMap.put("p", string);
        tn.p.k(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string2 = jSONObjectB.toString();
            tn.p.j(string2, "toString(...)");
            linkedHashMap.put("consentObject", string2);
        }
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f25133e);
        linkedHashMap.putAll(C3850x5.f28483a.a(false));
        linkedHashMap.putAll(AbstractC3903z8.a());
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f25134f));
        tn.p.k(linkedHashMap, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.f27534d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Le(this.f28424a, linkedHashMap2, null, new Y6(linkedHashMap), null, 52);
    }
}
