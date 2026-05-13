package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5 f87904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f87905b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5() {
        this(d5.a(), new c5());
        Object obj = e5.f89096c;
    }

    public b5(e5 e5Var, c5 c5Var) {
        this.f87904a = e5Var;
        this.f87905b = c5Var;
    }

    public final String a(Context context) {
        List listG1;
        e5 e5Var = this.f87904a;
        e5Var.getClass();
        synchronized (e5.f89096c) {
            listG1 = cn.f0.g1(e5Var.f89099b);
        }
        return a(context, listG1);
    }

    public final String a(Context context, List list) {
        int i10;
        this.f87905b.getClass();
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (i10 = nt2VarA.f92936a) == 0) {
            i10 = 5;
        }
        return cn.f0.D0(list.subList(list.size() - zn.n.j(i10, list.size()), list.size()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    public final String b(Context context) {
        List listG1;
        e5 e5Var = this.f87904a;
        e5Var.getClass();
        synchronized (e5.f89096c) {
            listG1 = cn.f0.g1(e5Var.f89098a);
        }
        return a(context, listG1);
    }
}
