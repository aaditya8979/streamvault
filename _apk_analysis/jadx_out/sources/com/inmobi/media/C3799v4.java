package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3799v4 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3849x4 f28323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3799v4(C3849x4 c3849x4, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28323c = c3849x4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28322b = obj;
        this.f28324d |= Integer.MIN_VALUE;
        return this.f28323c.a(null, null, null, this);
    }
}
