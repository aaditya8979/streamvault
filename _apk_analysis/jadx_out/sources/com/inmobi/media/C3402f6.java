package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3402f6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ak f27138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3325c6 f27139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f27145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3552l6 f27146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3402f6(C3552l6 c3552l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27146i = c3552l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27145h = obj;
        this.f27147j |= Integer.MIN_VALUE;
        return C3552l6.a(this.f27146i, false, (ContinuationImpl) this);
    }
}
