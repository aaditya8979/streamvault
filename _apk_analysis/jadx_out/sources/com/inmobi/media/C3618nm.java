package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3618nm;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3618nm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f27708a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3618nm(C3643om c3643om, hn.c cVar) {
        super(2, cVar);
        this.f27708a = c3643om;
    }

    public static final void a(C3643om c3643om, View view) {
        P4.a(c3643om.f27807d, c3643om.f27805b, Ol.f26096a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3618nm(this.f27708a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3618nm(this.f27708a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        final C3643om c3643om = this.f27708a;
        ViewGroup viewGroup = c3643om.f27813j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: n9.q9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3618nm.a(c3643om, view);
                }
            });
        }
        return bn.r.f5635a;
    }
}
