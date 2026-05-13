package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3834we extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3884ye f28437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3834we(C3884ye c3884ye, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28437b = c3884ye;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28436a = obj;
        this.f28438c |= Integer.MIN_VALUE;
        return this.f28437b.a(this);
    }
}
