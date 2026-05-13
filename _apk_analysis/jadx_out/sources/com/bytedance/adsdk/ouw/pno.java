package com.bytedance.adsdk.ouw;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class pno implements bly {
    private static Boolean ouw(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // com.bytedance.adsdk.ouw.bly
    public final /* bridge */ /* synthetic */ Object ouw(JSONObject jSONObject, Object[] objArr) {
        return ouw(objArr);
    }
}
