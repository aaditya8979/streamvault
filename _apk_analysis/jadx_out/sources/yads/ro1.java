package yads;

import android.content.Context;
import com.ironsource.Z7;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ro1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo1 f94547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs1 f94548b;

    public /* synthetic */ ro1(xo1 xo1Var) {
        this(xo1Var, new hs1());
    }

    public ro1(xo1 xo1Var, hs1 hs1Var) {
        this.f94547a = xo1Var;
        this.f94548b = hs1Var;
    }

    public final com.monetization.ads.mediation.base.a a(Context context, qq1 qq1Var, Class cls) {
        String str;
        com.monetization.ads.mediation.base.a aVar = null;
        try {
            String str2 = qq1Var.f94111b;
            this.f94548b.getClass();
            if (hs1.f90526a.contains(str2) && !pr0.a(context, or0.f93312d)) {
                return null;
            }
            Object objA = om2.a(str2, new Object[0]);
            com.monetization.ads.mediation.base.a aVar2 = (com.monetization.ads.mediation.base.a) cls.cast(objA);
            if (aVar2 == null) {
                try {
                    if (objA == null) {
                        tn.x xVar = tn.x.f85368a;
                        str = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{str2}, 1));
                        tn.p.j(str, "format(...)");
                    } else {
                        tn.x xVar2 = tn.x.f85368a;
                        str = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{objA.getClass().getName(), cls.getName()}, 2));
                        tn.p.j(str, "format(...)");
                    }
                    a(context, qq1Var, str);
                } catch (ClassCastException e10) {
                    e = e10;
                    aVar = aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    a(context, qq1Var, "could_not_create_adapter", th);
                    return aVar;
                }
            }
            return aVar2;
        } catch (ClassCastException e11) {
            e = e11;
        } catch (Throwable th3) {
            th = th3;
        }
        a(context, qq1Var, "does_not_conform_to_protocol", e);
        return aVar;
    }

    public final void a(Context context, qq1 qq1Var, String str) {
        Map mapM = kotlin.collections.a.m(bn.h.a("reason", "could_not_create_adapter"), bn.h.a(UnifiedMediationParams.KEY_DESCRIPTION, str));
        xo1 xo1Var = this.f94547a;
        xo1Var.getClass();
        xo1Var.a(context, co2.f88536f, qq1Var, null, mapM);
    }

    public final void a(Context context, qq1 qq1Var, String str, Throwable th2) {
        Map mapO = kotlin.collections.a.o(bn.h.a("reason", str));
        String message = th2.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        boolean z10 = ad1.f87661a;
        mapO.put(UnifiedMediationParams.KEY_DESCRIPTION, th2.getClass().getName() + Z7.f30794r + message);
        this.f94547a.a(context, qq1Var, mapO);
    }
}
