package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f16044a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16045b;

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f16044a.add(strOptString);
                }
            }
        }
        this.f16045b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f16044a.isEmpty() || eVar.f16034c == null) {
            return false;
        }
        Iterator it = this.f16044a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f16034c.value())) {
                return !this.f16045b;
            }
        }
        return this.f16045b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f16044a, Boolean.valueOf(this.f16045b));
    }
}
