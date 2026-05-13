package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: ProcessorWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f41116a;

    public q(g gVar) {
        this.f41116a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f41116a)) {
            return;
        }
        this.f41116a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        return y.b(this.f41116a) ? new long[]{0, 0} : this.f41116a.a();
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f41116a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f41116a.b(eVar);
        } catch (Exception e10) {
            if (a.f40902a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }
}
