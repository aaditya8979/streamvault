package com.mbridge.msdk.tracker;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ReportRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f41142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t.a f41143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private v.b<T> f41144y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f41145z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public v.b<T> C() {
        return this.f41144y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f41145z.a(qVar);
    }

    public void a(t.a aVar) {
        this.f41143x = aVar;
    }

    public void a(v.b<T> bVar) {
        this.f41144y = bVar;
    }

    public void a(w wVar) {
        this.f41145z = wVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        v.b<T> bVarC = C();
        this.f41144y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }

    public void a(Map<String, String> map) {
        this.f41142w = map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f41142w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public t.a l() {
        return this.f41143x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }
}
