package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3645p extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3645p(InterfaceC3580m9 interfaceC3580m9, Context context, long j10, hn.c cVar) {
        super(2, cVar);
        this.f27815a = interfaceC3580m9;
        this.f27816b = context;
        this.f27817c = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3645p(this.f27815a, this.f27816b, this.f27817c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3645p) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        InterfaceC3580m9 interfaceC3580m9 = this.f27815a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3670q.f27914b == null) {
            Object systemService = this.f27816b.getSystemService("audio");
            tn.p.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C3670q.f27914b = (AudioManager) systemService;
        }
        C3670q c3670q = C3670q.f27913a;
        C3670q.f27918f = F3.a(C3670q.f27919g, 0L, this.f27817c, new C3620o(null));
        C3670q.a(this.f27817c);
        Context context = this.f27816b;
        C3670q.f27915c = new C3520k();
        context.registerReceiver(C3670q.f27915c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3670q.a(Float.valueOf(c3670q.a()));
        return bn.r.f5635a;
    }
}
