package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3831wb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3856xb f28427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3831wb(C3856xb c3856xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28427b = c3856xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28426a = obj;
        this.f28428c |= Integer.MIN_VALUE;
        return this.f28427b.b((C3682qb) null, this);
    }
}
