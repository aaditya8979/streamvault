package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class Ve extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f26497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ve(C3334cf c3334cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26499d = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26498c = obj;
        this.f26500e |= Integer.MIN_VALUE;
        return this.f26499d.b(this);
    }
}
