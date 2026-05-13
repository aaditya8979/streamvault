package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;

/* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class i<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.b<T> f37872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f37873b = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f37874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f37875b;

        public a(v vVar, q qVar) {
            this.f37874a = vVar;
            this.f37875b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f37872a != null) {
                    i.this.f37872a.onSuccess(i.this.a(this.f37874a, this.f37875b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e10);
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeRequestListenerWrapper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f37877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f37878b;

        public b(v vVar, q qVar) {
            this.f37877a = vVar;
            this.f37878b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f37872a != null) {
                    i.this.f37872a.onError(i.this.a(this.f37877a.f41099c, this.f37878b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseError error", e10);
            }
        }
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.f37872a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(v<T> vVar, q qVar) {
        if (vVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(vVar.f41097a, new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f41021a, qVar.f41022b, qVar.f41024d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(b0 b0Var, q qVar) {
        if (b0Var == null) {
            return null;
        }
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar = qVar != null ? new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f41021a, qVar.f41022b, qVar.f41024d) : new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        return b0Var.d() == 0 ? new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage()) : b0Var.d() == 1 ? new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, b0Var.getMessage()) : b0Var.d() == 2 ? new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage()) : b0Var.d() == 4 ? new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, b0Var.getMessage()) : b0Var.d() == 5 ? new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage()) : b0Var.d() == 6 ? new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, b0Var.getMessage()) : b0Var.d() == 7 ? new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, b0Var.getMessage()) : b0Var.d() == 8 ? new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, b0Var.getMessage()) : b0Var.d() == 9 ? new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, b0Var.getMessage()) : new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void a(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + vVar.f41097a);
        this.f37873b.post(new a(vVar, qVar));
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void b(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseError: " + vVar.f41099c.d() + Z7.f30794r + vVar.f41099c.getMessage());
        this.f37873b.post(new b(vVar, qVar));
    }
}
