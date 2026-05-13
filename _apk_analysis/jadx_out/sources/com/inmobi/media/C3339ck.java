package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3339ck extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3365dk f26995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339ck(C3365dk c3365dk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26995b = c3365dk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26994a = obj;
        this.f26996c |= Integer.MIN_VALUE;
        return this.f26995b.b(0, this);
    }
}
