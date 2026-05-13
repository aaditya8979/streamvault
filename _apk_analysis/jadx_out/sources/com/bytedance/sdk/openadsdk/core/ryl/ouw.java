package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public int bly;
    public String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13940le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh f13941lh;
    public double pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f13942ra;
    public String ryl;
    public int tlj;
    public vt vt;
    public String yu;
    public final com.bytedance.sdk.openadsdk.core.model.yu ouw = new com.bytedance.sdk.openadsdk.core.model.yu();

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f13939cf = "VAST_ACTION_BUTTON";

    public final String ouw() {
        lh lhVar;
        String str = this.f13940le;
        if (!TextUtils.isEmpty(this.ryl)) {
            String str2 = this.ryl;
            this.ryl = null;
            return str2;
        }
        String str3 = this.f13939cf;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            vt vtVar = this.vt;
            if (vtVar != null && !TextUtils.isEmpty(vtVar.pno)) {
                str = this.vt.pno;
            }
        } else if (str3.equals("VAST_END_CARD") && (lhVar = this.f13941lh) != null && !TextUtils.isEmpty(lhVar.pno)) {
            str = this.f13941lh.pno;
        }
        this.f13939cf = "VAST_ACTION_BUTTON";
        return str;
    }

    public final void ouw(lh lhVar) {
        if (lhVar != null) {
            lhVar.bly = this.f13942ra;
        }
        this.f13941lh = lhVar;
    }

    public final void ouw(vt vtVar) {
        if (vtVar != null) {
            vtVar.bly = this.f13942ra;
        }
        this.vt = vtVar;
    }

    public final void ouw(Set<tlj> set) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVar = this.ouw;
        if (set == null || set.isEmpty()) {
            return;
        }
        yuVar.vt.addAll(set);
    }

    public final JSONArray vt() {
        Set<tlj> set = this.ouw.vt;
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (tlj tljVar : set) {
            if (tljVar != null) {
                jSONArray.put(tljVar.ouw());
            }
        }
        return jSONArray;
    }
}
