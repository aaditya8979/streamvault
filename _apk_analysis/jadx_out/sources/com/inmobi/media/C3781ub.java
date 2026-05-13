package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3781ub extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3856xb f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3781ub(C3856xb c3856xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28250b = c3856xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28249a = obj;
        this.f28251c |= Integer.MIN_VALUE;
        return this.f28250b.b((String) null, this);
    }
}
