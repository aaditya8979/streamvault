package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3308bf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f26867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3308bf(C3334cf c3334cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26869c = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26868b = obj;
        this.f26870d |= Integer.MIN_VALUE;
        return this.f26869c.d(this);
    }
}
