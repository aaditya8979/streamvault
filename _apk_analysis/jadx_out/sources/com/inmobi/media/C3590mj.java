package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3590mj extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3615nj f27639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3590mj(C3615nj c3615nj, hn.c cVar) {
        super(2, cVar);
        this.f27639a = c3615nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3590mj(this.f27639a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3590mj(this.f27639a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        return AbstractC3875y5.a(this.f27639a.f27702a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
