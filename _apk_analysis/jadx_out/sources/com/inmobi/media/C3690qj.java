package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3690qj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3839wj f27986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f27987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3690qj(C3839wj c3839wj, FrameLayout frameLayout, hn.c cVar) {
        super(2, cVar);
        this.f27986a = c3839wj;
        this.f27987b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3690qj(this.f27986a, this.f27987b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3690qj(this.f27986a, this.f27987b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3605n9 c3605n9 = this.f27986a.f28459e;
        if (c3605n9 != null) {
            c3605n9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        AbstractC3818vn.a(this.f27986a.f28461g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f27987b.addView(this.f27986a.f28461g, layoutParams);
        return bn.r.f5635a;
    }
}
