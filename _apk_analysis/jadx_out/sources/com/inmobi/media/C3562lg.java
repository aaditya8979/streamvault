package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3562lg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3637og f27572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3562lg(C3637og c3637og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27572b = c3637og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27571a = obj;
        this.f27573c |= Integer.MIN_VALUE;
        return this.f27572b.a(null, null, this);
    }
}
