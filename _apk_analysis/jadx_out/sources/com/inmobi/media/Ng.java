package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ng extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f26041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mo.a f26042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Og f26044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ng(Og og2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26044d = og2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26043c = obj;
        this.f26045e |= Integer.MIN_VALUE;
        return this.f26044d.a((JSONObject) null, this);
    }
}
