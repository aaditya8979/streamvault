package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class jr1 {
    public static fo2 a(qq1 qq1Var) {
        fo2 fo2Var = new fo2(new LinkedHashMap(), 2);
        String str = qq1Var.f94111b;
        fo2Var.b(str, Q6.G1);
        fo2Var.b(qq1Var.f94112c, "adapter_parameters");
        CharSequence charSequence = (CharSequence) qq1Var.f94112c.get("bidding_data");
        boolean z10 = false;
        fo2Var.b(Boolean.valueOf(!(charSequence == null || bo.d0.u0(charSequence))), "mediation_bidder");
        if (bo.d0.a0(str, "LevelPlay", true)) {
            try {
                Class.forName("com.yandex.ads.mobile.ads.mediation.extras.BuildConfig");
                z10 = true;
            } catch (ClassNotFoundException unused) {
            }
            fo2Var.b(Boolean.valueOf(z10), "has_extras");
        }
        return fo2Var;
    }
}
