package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3530k9 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3555l9 f27457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3555l9 f27459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3530k9(C3555l9 c3555l9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27459c = c3555l9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27458b = obj;
        this.f27460d |= Integer.MIN_VALUE;
        return this.f27459c.a(this);
    }
}
