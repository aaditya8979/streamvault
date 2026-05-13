package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3640oj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3665pj f27801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640oj(C3665pj c3665pj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27801b = c3665pj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27800a = obj;
        this.f27802c |= Integer.MIN_VALUE;
        return this.f27801b.a(this);
    }
}
