package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3737sh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3650p4 f28131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3762th f28133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3737sh(C3762th c3762th, hn.c cVar) {
        super(cVar);
        this.f28133c = c3762th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28132b = obj;
        this.f28134d |= Integer.MIN_VALUE;
        return this.f28133c.emit(null, this);
    }
}
