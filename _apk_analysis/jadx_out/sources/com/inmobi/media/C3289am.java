package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3289am extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f26808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f26809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3289am(C3643om c3643om, FrameLayout frameLayout, hn.c cVar) {
        super(2, cVar);
        this.f26808a = c3643om;
        this.f26809b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3289am(this.f26808a, this.f26809b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3289am(this.f26808a, this.f26809b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3605n9 c3605n9 = this.f26808a.f27808e;
        if (c3605n9 != null) {
            c3605n9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        AbstractC3818vn.a(this.f26808a.f27813j);
        this.f26809b.addView(this.f26808a.f27813j);
        return bn.r.f5635a;
    }
}
