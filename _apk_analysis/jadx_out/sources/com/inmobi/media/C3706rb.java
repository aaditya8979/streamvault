package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3706rb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3856xb f28053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3706rb(C3856xb c3856xb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28053b = c3856xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28052a = obj;
        this.f28054c |= Integer.MIN_VALUE;
        return this.f28053b.a(0L, 0, this);
    }
}
