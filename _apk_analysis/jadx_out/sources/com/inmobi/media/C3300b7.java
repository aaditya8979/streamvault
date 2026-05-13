package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3300b7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f26838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f26840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3300b7(C3578m7 c3578m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26840d = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26839c = obj;
        this.f26841e |= Integer.MIN_VALUE;
        return this.f26840d.b(this);
    }
}
