package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3612ng extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3637og f27697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3612ng(C3637og c3637og, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27697b = c3637og;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27696a = obj;
        this.f27698c |= Integer.MIN_VALUE;
        return this.f27697b.a(null, null, 0L, this);
    }
}
