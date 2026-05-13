package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3714rj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3839wj f28069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3714rj(C3839wj c3839wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28069b = c3839wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28068a = obj;
        this.f28070c |= Integer.MIN_VALUE;
        return this.f28069b.a(this);
    }
}
