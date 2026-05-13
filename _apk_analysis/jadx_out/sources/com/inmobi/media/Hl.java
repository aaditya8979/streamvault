package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Hl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3617nl f25619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Il f25621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hl(Il il2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25621c = il2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25620b = obj;
        this.f25622d |= Integer.MIN_VALUE;
        return this.f25621c.a(null, null, null, this);
    }
}
