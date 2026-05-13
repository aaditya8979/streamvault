package com.bytedance.sdk.openadsdk.zin;

import com.ironsource.Z3;

/* JADX INFO: loaded from: classes2.dex */
public enum yu {
    TYPE_2G("2g"),
    TYPE_3G(Z3.f30762a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_MOBILE("mobile"),
    TYPE_UNKNOWN("unknown");

    private String pno;

    yu(String str) {
        this.pno = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.pno;
    }
}
