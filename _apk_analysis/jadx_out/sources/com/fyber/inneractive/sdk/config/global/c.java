package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f16030a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16031b;

    public c(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f16030a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f16031b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f16030a.isEmpty() || eVar.f16032a == null) {
            return false;
        }
        Iterator it = this.f16030a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f16032a)) {
                return !this.f16031b;
            }
        }
        return this.f16031b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f16030a, Boolean.valueOf(this.f16031b));
    }
}
