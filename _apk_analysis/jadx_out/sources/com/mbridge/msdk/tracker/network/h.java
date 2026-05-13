package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MBridgeBaseRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class h<T> extends t<T> {
    public static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f40984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f40985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f40986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f40987z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f40984w = j10;
        } else {
            this.f40984w = 60000L;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f40985x == null) {
            this.f40985x = new HashMap();
        }
        try {
            this.f40985x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f40986y == null) {
            this.f40986y = new HashMap();
        }
        try {
            this.f40986y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f40986y == null) {
            this.f40986y = new HashMap();
        }
        this.f40986y.put("Charset", "UTF-8");
        return this.f40986y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f40985x == null) {
            this.f40985x = new HashMap();
        }
        return this.f40985x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f40987z == null) {
            this.f40987z = new e(30000, this.f40984w, 3);
        }
        return this.f40987z;
    }
}
