package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class Uc extends AbstractC3991e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f30548i = C4023fd.f31702a;

    public Uc(int i10) {
        this.f31513g = i10;
    }

    @Override // com.ironsource.AbstractC3991e
    public String a() {
        return C4023fd.f31702a;
    }

    @Override // com.ironsource.AbstractC3991e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f31512f = IronSourceVideoBridge.jsonObjectInit();
        } else {
            this.f31512f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }

    @Override // com.ironsource.AbstractC3991e
    public String c() {
        return K5.f29723b;
    }
}
