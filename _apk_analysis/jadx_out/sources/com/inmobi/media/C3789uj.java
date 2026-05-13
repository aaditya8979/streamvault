package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3789uj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3839wj f28283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3789uj(C3839wj c3839wj, hn.c cVar) {
        super(2, cVar);
        this.f28283a = c3839wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3789uj(this.f28283a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3789uj(this.f28283a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        return AbstractC3875y5.a(this.f28283a.f27375a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
