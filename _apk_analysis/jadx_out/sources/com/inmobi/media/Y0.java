package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Y0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3371e1 f26609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f26610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(AbstractC3371e1 abstractC3371e1, ViewGroup viewGroup, hn.c cVar) {
        super(2, cVar);
        this.f26609a = abstractC3371e1;
        this.f26610b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Y0(this.f26609a, this.f26610b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Y0(this.f26609a, this.f26610b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f26609a.f27075c;
            if (adSession != null) {
                adSession.registerAdView(this.f26610b);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26609a.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "Failed to registerAdView. " + Log.getStackTraceString(e10));
            }
        }
        return bn.r.f5635a;
    }
}
