package yads;

import android.view.View;
import com.ironsource.C3978d4;
import java.util.Collection;

/* JADX INFO: loaded from: classes12.dex */
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f92366a;

    public /* synthetic */ mj() {
        this(cn.w.m());
    }

    public mj(Collection collection) {
        this.f92366a = collection;
    }

    public final r12 a(View view, iy1 iy1Var) {
        q12 q12Var = new q12(view, q22.f93868c, kotlin.collections.a.j());
        q12Var.f93862e.put("age", iy1Var.h(view));
        q12Var.f93862e.put("body", iy1Var.a(view));
        q12Var.f93862e.put("call_to_action", iy1Var.e(view));
        q12Var.f93862e.put(C3978d4.j.D, iy1Var.n(view));
        q12Var.f93862e.put("favicon", iy1Var.g(view));
        q12Var.f93862e.put("feedback", iy1Var.l(view));
        q12Var.f93862e.put("icon", iy1Var.o(view));
        q12Var.f93862e.put(C3978d4.i.I0, iy1Var.c(view));
        q12Var.f93860c = iy1Var.b(view);
        q12Var.f93861d = iy1Var.k(view);
        q12Var.f93862e.put("price", iy1Var.d(view));
        View viewI = iy1Var.i(view);
        if (!(viewI instanceof tl2)) {
            viewI = null;
        }
        q12Var.f93862e.put("rating", viewI);
        q12Var.f93862e.put("review_count", iy1Var.p(view));
        q12Var.f93862e.put("sponsored", iy1Var.m(view));
        q12Var.f93862e.put("title", iy1Var.j(view));
        q12Var.f93862e.put("warning", iy1Var.f(view));
        for (String str : this.f92366a) {
            View viewA = iy1Var.a(view, str);
            if (viewA != null) {
                q12Var.f93862e.put(str, viewA);
            }
        }
        return new r12(q12Var);
    }
}
