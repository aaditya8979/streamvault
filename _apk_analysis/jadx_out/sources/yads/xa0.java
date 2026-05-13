package yads;

import android.view.View;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class xa0 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya0 f96697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ya0 ya0Var, hn.c cVar) {
        super(cVar);
        this.f96697c = ya0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f96696b = obj;
        this.f96698d |= Integer.MIN_VALUE;
        return this.f96697c.a((View) null, (wa0) null, this);
    }
}
