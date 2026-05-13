package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class X0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ae f26570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f26571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FriendlyObstructionPurpose f26572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Ae ae2, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, hn.c cVar) {
        super(2, cVar);
        this.f26570a = ae2;
        this.f26571b = view;
        this.f26572c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new X0(this.f26570a, this.f26571b, this.f26572c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((X0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            AdSession adSession = this.f26570a.f27075c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.f26571b, this.f26572c, null);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26570a.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(AbstractC3371e1.f27072f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e10));
            }
        }
        return bn.r.f5635a;
    }
}
