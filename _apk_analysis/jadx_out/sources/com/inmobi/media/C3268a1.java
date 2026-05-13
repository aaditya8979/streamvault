package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3268a1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f26731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3268a1(Ae ae2, View view, hn.c cVar) {
        super(2, cVar);
        this.f26730a = ae2;
        this.f26731b = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3268a1(this.f26730a, this.f26731b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3268a1(this.f26730a, this.f26731b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f26730a.f27075c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.f26731b);
            }
        } catch (IllegalArgumentException e10) {
            String str = AbstractC3371e1.f27072f;
            Log.getStackTraceString(e10);
        }
        return bn.r.f5635a;
    }
}
