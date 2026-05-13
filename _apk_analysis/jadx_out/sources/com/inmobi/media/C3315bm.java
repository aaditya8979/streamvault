package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3315bm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3643om f26880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3643om f26882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3315bm(C3643om c3643om, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26882c = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26881b = obj;
        this.f26883d |= Integer.MIN_VALUE;
        return this.f26882c.a(this);
    }
}
