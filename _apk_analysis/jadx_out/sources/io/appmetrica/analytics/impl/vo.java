package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vo implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D8 f67869a;

    public vo() {
        this(new D8());
    }

    public vo(D8 d82) {
        this.f67869a = d82;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C4941lh c4941lh) {
        if (!((Y4) c4941lh.f67223l).B() && !TextUtils.isEmpty(o82.f65689b)) {
            try {
                JSONObject jSONObject = new JSONObject(o82.f65689b);
                jSONObject.remove("preloadInfo");
                o82.f65689b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f67869a.a(o82, c4941lh);
    }
}
