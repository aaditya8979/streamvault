package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3540kj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cj f27486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3615nj f27488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540kj(C3615nj c3615nj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27488d = c3615nj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27487c = obj;
        this.f27489e |= Integer.MIN_VALUE;
        return C3615nj.a(this.f27488d, null, null, this);
    }
}
