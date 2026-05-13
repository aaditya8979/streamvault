package yads;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f95265a = kotlin.collections.a.m(bn.h.a(pb3.f93520c, "No ad view"), bn.h.a(pb3.f93521d, "No valid ads in ad unit"), bn.h.a(pb3.f93522e, "Ad is not visible for percent"), bn.h.a(pb3.f93523f, "Required asset %s is not visible in ad view"), bn.h.a(pb3.f93524g, "Ad view is null"), bn.h.a(pb3.f93525h, "Ad view is hidden"), bn.h.a(pb3.f93526i, "Visible area of an ad view is too small"));

    public static String a(tb3 tb3Var) {
        if (!(tb3Var instanceof qb3)) {
            return "Unknown error, that shouldn't happen";
        }
        qb3 qb3Var = (qb3) tb3Var;
        String str = qb3Var.f93980b;
        String str2 = (String) f95265a.get(qb3Var.f93979a);
        if (str2 == null) {
            return "Visibility error";
        }
        tn.x xVar = tn.x.f85368a;
        String str3 = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        tn.p.j(str3, "format(...)");
        return str3;
    }
}
