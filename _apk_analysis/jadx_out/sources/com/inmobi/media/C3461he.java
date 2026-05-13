package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3461he extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3759te f27301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3461he(C3759te c3759te, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27301b = c3759te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27300a = obj;
        this.f27302c |= Integer.MIN_VALUE;
        return this.f27301b.a(this);
    }
}
