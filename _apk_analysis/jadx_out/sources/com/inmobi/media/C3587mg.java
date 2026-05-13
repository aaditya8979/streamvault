package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3587mg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3637og f27628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3587mg(C3637og c3637og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27628b = c3637og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27627a = obj;
        this.f27629c |= Integer.MIN_VALUE;
        return this.f27628b.b(null, null, this);
    }
}
