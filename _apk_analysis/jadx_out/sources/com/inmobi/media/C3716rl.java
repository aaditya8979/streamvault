package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3716rl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Je f28072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f28073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3741sl f28074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3716rl(C3741sl c3741sl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28074d = c3741sl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28073c = obj;
        this.f28075e |= Integer.MIN_VALUE;
        return this.f28074d.a(null, this);
    }
}
