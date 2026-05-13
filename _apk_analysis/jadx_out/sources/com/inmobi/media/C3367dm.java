package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3367dm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3643om f27056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3643om f27058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3367dm(C3643om c3643om, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27058c = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27057b = obj;
        this.f27059d |= Integer.MIN_VALUE;
        return this.f27058c.b(this);
    }
}
