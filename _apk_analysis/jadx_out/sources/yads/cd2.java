package yads;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class cd2 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt2 f88411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f88412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k83 f88413c;

    public cd2(String str, nt2 nt2Var, f83 f83Var, k83 k83Var) {
        this.f88411a = nt2Var;
        this.f88412b = f83Var;
        this.f88413c = k83Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        int i10 = ((e82) obj).f89157a;
        boolean z10 = ad1.f87661a;
        Pair pairA = bn.h.a("tracking_result", "success");
        String lowerCase = this.f88413c.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        Map mapO = kotlin.collections.a.o(pairA, bn.h.a("tracking_url_type", lowerCase), bn.h.a("code", Integer.valueOf(i10)));
        f83 f83Var = this.f88412b;
        co2 co2Var = co2.f88533c;
        f83Var.a(mapO, this.f88411a);
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        im3Var.getClass();
        boolean z10 = ad1.f87661a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = bn.h.a("tracking_result", "failure");
        String lowerCase = this.f88413c.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        pairArr[1] = bn.h.a("tracking_url_type", lowerCase);
        String message = im3Var.getMessage();
        if (message == null) {
            message = "Unknown Volley error";
        }
        pairArr[2] = bn.h.a("error_message", message);
        Map mapO = kotlin.collections.a.o(pairArr);
        f83 f83Var = this.f88412b;
        co2 co2Var = co2.f88533c;
        f83Var.a(mapO, this.f88411a);
    }
}
