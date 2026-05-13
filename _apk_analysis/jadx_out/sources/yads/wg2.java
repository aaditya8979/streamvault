package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class wg2 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yg2 f96379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg2 f96380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uu f96381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f96382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yg2 f96383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(yg2 yg2Var, hn.c cVar) {
        super(cVar);
        this.f96383f = yg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96382e = obj;
        this.f96384g |= Integer.MIN_VALUE;
        return this.f96383f.a((Context) null, (sg2) null, this);
    }
}
