package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class xy1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yy1 f96928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f96929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f96930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fy1 f96931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f96932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f96934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f96935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yy1 f96936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy1(List list, yy1 yy1Var, hn.c cVar) {
        super(2, cVar);
        this.f96935i = list;
        this.f96936j = yy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        xy1 xy1Var = new xy1(this.f96935i, this.f96936j, cVar);
        xy1Var.f96934h = obj;
        return xy1Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((xy1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:41:0x00f8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xy1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
