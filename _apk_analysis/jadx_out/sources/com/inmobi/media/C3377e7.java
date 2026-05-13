package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3377e7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3377e7(C3578m7 c3578m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27097d = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27096c = obj;
        this.f27098e |= Integer.MIN_VALUE;
        return this.f27097d.c(this);
    }
}
