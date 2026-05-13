package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MemoryEventFilter.java */
/* JADX INFO: loaded from: classes9.dex */
public class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f40956a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: MemoryEventFilter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f40957a;

        public a(boolean z10) {
            this.f40957a = z10;
        }

        public boolean a() {
            return this.f40957a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String strG = eVar.g();
                if (this.f40956a.containsKey(strG)) {
                    aVar = this.f40956a.get(strG);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strG));
                    this.f40956a.put(strG, aVar2);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    return aVar.a();
                }
                return false;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e10);
                }
            }
        }
        return false;
    }
}
