package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3693qm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3667pl f27995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pe f27996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27999e;

    public C3693qm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27998d = obj;
        this.f27999e |= Integer.MIN_VALUE;
        return AbstractC3842wm.a(null, 0.0d, null, 0, null, this);
    }
}
