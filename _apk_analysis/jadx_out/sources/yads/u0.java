package yads;

import android.view.View;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f95459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f95460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref$ObjectRef f95461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f95462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f95463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f95464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f95465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, hn.c cVar) {
        super(cVar);
        this.f95464g = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f95463f = obj;
        this.f95465h |= Integer.MIN_VALUE;
        return this.f95464g.a(null, null, this);
    }
}
