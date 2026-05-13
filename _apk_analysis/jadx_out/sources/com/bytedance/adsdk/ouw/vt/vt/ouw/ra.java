package com.bytedance.adsdk.ouw.vt.vt.ouw;

import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.metadata.a;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ra implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final Object ouw;

    public ra(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.ouw = Boolean.TRUE;
        } else if (str.equalsIgnoreCase(a.f32683h)) {
            this.ouw = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.ouw = null;
        }
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.CONSTANT;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    public final String toString() {
        return "KeywordNode [keywordValue=" + this.ouw + C3978d4.j.f31385e;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        Object obj = this.ouw;
        return obj != null ? obj.toString() : "NULL";
    }
}
