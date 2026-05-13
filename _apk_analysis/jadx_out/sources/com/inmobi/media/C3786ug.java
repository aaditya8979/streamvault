package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3786ug extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3836wg f28276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3786ug(C3836wg c3836wg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28276b = c3836wg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28275a = obj;
        this.f28277c |= Integer.MIN_VALUE;
        return C3836wg.a(this.f28276b, this);
    }
}
