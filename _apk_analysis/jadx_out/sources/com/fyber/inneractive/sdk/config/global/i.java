package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f16046a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16047b;

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f16046a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f16047b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f16046a.isEmpty() || eVar.f16033b == null) {
            return false;
        }
        Iterator it = this.f16046a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f16033b)) {
                return !this.f16047b;
            }
        }
        return this.f16047b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f16046a, Boolean.valueOf(this.f16047b));
    }
}
