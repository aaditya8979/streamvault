package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Xc implements InterfaceC3338cj, InterfaceC3395f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f26587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiAdRequestStatus f26588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ec f26589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jc f26590d;

    public Xc(short s10, InMobiAdRequestStatus inMobiAdRequestStatus, Ec ec2, Jc jc2) {
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.k(ec2, "nativeAdUnitComponent");
        tn.p.k(jc2, "stateMachine");
        this.f26587a = s10;
        this.f26588b = inMobiAdRequestStatus;
        this.f26589c = ec2;
        this.f26590d = jc2;
    }

    @Override // com.inmobi.media.InterfaceC3395f
    public final Object a(hn.c cVar) {
        C3605n9 c3605n9 = this.f26589c.f25379a.f28472a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("NativeFailedState", "onDestroy");
        }
        Object objA = this.f26590d.a(new Vc(), this, (ContinuationImpl) cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void a() {
        C3605n9 c3605n9 = this.f26589c.f25379a.f28472a.f27735c;
        if (c3605n9 != null) {
            c3605n9.a("NativeFailedState", "Initialize Called");
        }
        this.f26589c.f25381c.a(this.f26588b, this.f26587a);
    }

    @Override // com.inmobi.media.InterfaceC3338cj
    public final void c() {
    }
}
