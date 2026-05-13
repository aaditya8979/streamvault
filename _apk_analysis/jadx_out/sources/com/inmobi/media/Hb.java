package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Hb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3682qb f25596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3682qb f25597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Jb f25599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25599e = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25598d = obj;
        this.f25600f |= Integer.MIN_VALUE;
        return this.f25599e.b(null, null, this);
    }
}
