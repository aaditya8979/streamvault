package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Fb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f25430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f25432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25432d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25431c = obj;
        this.f25433e |= Integer.MIN_VALUE;
        return this.f25432d.a((Context) null, this);
    }
}
