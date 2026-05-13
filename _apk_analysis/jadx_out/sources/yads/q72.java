package yads;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class q72 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r72 f93914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f93915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ry1 f93916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f93917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f93918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f93919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f93920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r72 f93921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f93922j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(r72 r72Var, hn.c cVar) {
        super(cVar);
        this.f93921i = r72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f93920h = obj;
        this.f93922j |= Integer.MIN_VALUE;
        return this.f93921i.a(null, null, this);
    }
}
