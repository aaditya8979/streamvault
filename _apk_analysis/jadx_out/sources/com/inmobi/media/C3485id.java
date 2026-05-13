package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3485id implements InterfaceC3613nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3509jd f27351a;

    public C3485id(C3509jd c3509jd) {
        this.f27351a = c3509jd;
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final void a(String str) {
        tn.p.k(str, "api");
        Map mapA = AbstractC3491ik.a(this.f27351a.f27398a.f27469e.f25313a);
        Wj wj2 = Wj.f26549a;
        Wj.b("BlockAutoRedirection", mapA, EnumC3287ak.f26805a);
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean a() {
        long userTouchResetTime = this.f27351a.f27398a.f27466b.f25488a.f27824b.getRendering().getUserTouchResetTime();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27351a.f27399b;
        return j10 != 0 && jElapsedRealtime - j10 < userTouchResetTime;
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean c() {
        return !this.f27351a.f27398a.f27466b.f25488a.f27824b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final long getViewTouchTimestamp() {
        return this.f27351a.f27399b;
    }
}
