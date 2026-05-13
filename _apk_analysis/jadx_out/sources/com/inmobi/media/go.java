package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class go extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3580m9 f27258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f27259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ne f27261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f27263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jo f27264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27265i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(jo joVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27264h = joVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27263g = obj;
        this.f27265i |= Integer.MIN_VALUE;
        return this.f27264h.a(null, null, this);
    }
}
