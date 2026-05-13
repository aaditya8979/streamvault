package io.appmetrica.analytics.impl;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5161ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f67781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67782b;

    public C5161ud(List list, long j10) {
        this.f67781a = list;
        this.f67782b = j10;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C4705cd> list = this.f67781a;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            for (C4705cd c4705cd : list) {
                c4705cd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c4705cd.f66527a);
                    jSONObject.put(C3978d4.i.f31359r, c4705cd.f66528b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f67782b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5161ud)) {
            return false;
        }
        C5161ud c5161ud = (C5161ud) obj;
        return tn.p.f(this.f67781a, c5161ud.f67781a) && this.f67782b == c5161ud.f67782b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f67782b) + (this.f67781a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f67781a + ", lastSendTime=" + this.f67782b + ')';
    }
}
