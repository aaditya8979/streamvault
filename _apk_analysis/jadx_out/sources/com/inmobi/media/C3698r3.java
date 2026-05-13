package com.inmobi.media;

import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3698r3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f28026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f28027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3698r3(S2 s22, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(2, cVar);
        this.f28026b = s22;
        this.f28027c = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3698r3(this.f28026b, this.f28027c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3698r3(this.f28026b, this.f28027c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28025a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3823w3 c3823w3 = C3823w3.f28406a;
            SystemClock.elapsedRealtime();
            if (this.f28026b.f26278e) {
                InterfaceC3580m9 interfaceC3580m9 = this.f28027c;
                if (interfaceC3580m9 != null) {
                    tn.p.j("w3", "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m9).c("w3", "ping in web view");
                }
                new C3475i3(C3823w3.f28417l).a(this.f28026b);
                return bn.r.f5635a;
            }
            InterfaceC3580m9 interfaceC3580m92 = this.f28027c;
            if (interfaceC3580m92 != null) {
                tn.p.j("w3", "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).c("w3", "ping in http executor");
            }
            C3524k3 c3524k3 = new C3524k3();
            S2 s22 = this.f28026b;
            this.f28025a = 1;
            obj = c3524k3.a(s22, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        EnumC3273a6 enumC3273a6 = (EnumC3273a6) obj;
        if (enumC3273a6 != null) {
            C3823w3.f28417l.a(this.f28026b, enumC3273a6);
        } else {
            C3823w3.f28417l.a(this.f28026b);
        }
        return bn.r.f5635a;
    }
}
