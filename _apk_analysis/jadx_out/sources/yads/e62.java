package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class e62 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f89121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f89122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z30 f89123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f89125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h62 f89126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f89127h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e62(h62 h62Var, hn.c cVar) {
        super(cVar);
        this.f89126g = h62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f89125f = obj;
        this.f89127h |= Integer.MIN_VALUE;
        return this.f89126g.a(false, (Context) null, (ry1) null, (z30) null, (hn.c) this);
    }
}
