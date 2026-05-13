package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3426g4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3476i4 f27200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3426g4(C3476i4 c3476i4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27200b = c3476i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27199a = obj;
        this.f27201c |= Integer.MIN_VALUE;
        return this.f27200b.b(this);
    }
}
