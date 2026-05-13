package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3816vl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f28386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816vl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28386c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28385b = obj;
        this.f28387d |= Integer.MIN_VALUE;
        return this.f28386c.a((String) null, (ArrayList) null, this);
    }
}
