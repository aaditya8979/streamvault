package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3463hg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3487ig f27306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3463hg(AbstractC3487ig abstractC3487ig, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27306c = abstractC3487ig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27305b = obj;
        this.f27307d |= Integer.MIN_VALUE;
        return this.f27306c.a((String) null, this);
    }
}
