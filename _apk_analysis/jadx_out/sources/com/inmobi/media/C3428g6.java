package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3428g6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3552l6 f27205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3428g6(C3552l6 c3552l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27205c = c3552l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27204b = obj;
        this.f27206d |= Integer.MIN_VALUE;
        return this.f27205c.a(0L, this);
    }
}
