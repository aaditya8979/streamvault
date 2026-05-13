package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3806vb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3856xb f28358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3806vb(C3856xb c3856xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28358b = c3856xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28357a = obj;
        this.f28359c |= Integer.MIN_VALUE;
        return this.f28358b.a((C3682qb) null, this);
    }
}
