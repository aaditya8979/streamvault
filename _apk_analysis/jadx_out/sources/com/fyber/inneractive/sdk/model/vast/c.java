package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f16838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f16845i = new HashMap();

    public c(i iVar, int i10, int i11, String str, int i12) {
        this.f16837a = iVar;
        this.f16839c = i10;
        this.f16840d = i11;
        this.f16841e = str;
        this.f16844h = i12;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f16845i.isEmpty()) {
            return null;
        }
        return (List) this.f16845i.get(xVar);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f16839c);
            jSONObject.put("h", this.f16840d);
            jSONObject.put("type", this.f16837a.toString());
            k kVar = this.f16838b;
            jSONObject.put("creativeType", kVar != null ? kVar.mimeType : "none");
            jSONObject.put("content", this.f16842f);
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
        }
        return jSONObject;
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f16845i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f16845i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f16839c);
        sb2.append(" h:");
        sb2.append(this.f16840d);
        sb2.append(" type:");
        sb2.append(this.f16837a.toString());
        sb2.append(" creativeType: ");
        k kVar = this.f16838b;
        sb2.append(kVar != null ? kVar.mimeType : "none");
        sb2.append(" ctr:");
        sb2.append(this.f16843g);
        sb2.append(" events:");
        sb2.append(this.f16845i);
        return sb2.toString();
    }
}
