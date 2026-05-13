package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3742sm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28150b;

    public C3742sm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28149a = obj;
        this.f28150b |= Integer.MIN_VALUE;
        return AbstractC3842wm.a(null, null, this);
    }
}
