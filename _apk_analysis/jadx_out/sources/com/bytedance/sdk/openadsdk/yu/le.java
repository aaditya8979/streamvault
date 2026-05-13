package com.bytedance.sdk.openadsdk.yu;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class le extends ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final SimpleDateFormat f14432lh = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public le(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.yu.ouw
    public final JSONObject yu() {
        return this.vt;
    }
}
