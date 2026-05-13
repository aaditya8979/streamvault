package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3701r6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3776u6 f28034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701r6(C3776u6 c3776u6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28034c = c3776u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28033b = obj;
        this.f28035d |= Integer.MIN_VALUE;
        return C3776u6.a(this.f28034c, this);
    }
}
