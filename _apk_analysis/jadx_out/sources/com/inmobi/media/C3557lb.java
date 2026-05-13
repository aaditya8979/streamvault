package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3557lb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo.a f27556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3582mb f27558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3557lb(C3582mb c3582mb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27558c = c3582mb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27557b = obj;
        this.f27559d |= Integer.MIN_VALUE;
        return this.f27558c.a(this);
    }
}
