package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3674q3 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S2 f27928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3267a0 f27929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3580m9 f27930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3823w3 f27932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3674q3(C3823w3 c3823w3, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27932e = c3823w3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27931d = obj;
        this.f27933f |= Integer.MIN_VALUE;
        return this.f27932e.a(null, null, null, this);
    }
}
