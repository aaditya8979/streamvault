package com.inmobi.compliance;

import com.inmobi.media.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes.dex */
public final class InMobiPrivacyCompliance {

    @NotNull
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean z10) {
        X3.f26574a.put(a.f32676a, z10 ? "1" : "0");
    }

    public static final void setUSPrivacyString(@NotNull String str) {
        p.k(str, "privacyString");
        HashMap map = X3.f26574a;
        p.k(str, "privacyString");
        X3.f26574a.put("us_privacy", str);
    }
}
