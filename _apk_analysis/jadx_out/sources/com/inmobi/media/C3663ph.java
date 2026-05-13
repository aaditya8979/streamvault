package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3663ph extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f27877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3688qh f27879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663ph(C3688qh c3688qh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27879c = c3688qh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27878b = obj;
        this.f27880d |= Integer.MIN_VALUE;
        return this.f27879c.a(null, this);
    }
}
