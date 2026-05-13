package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3748t3 implements InterfaceC3549l3 {
    @Override // com.inmobi.media.InterfaceC3549l3
    public final void a(S2 s22) {
        tn.p.k(s22, "click");
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        String str = s22.f26275b;
        LinkedHashMap linkedHashMap = C3823w3.f28415j;
        C3267a0 c3267a0 = (C3267a0) linkedHashMap.get(Integer.valueOf(s22.f26274a));
        if (c3267a0 != null) {
            tn.p.k(s22, "click");
            c3267a0.f26728a.a(c3267a0.f26729b);
        }
        linkedHashMap.remove(Integer.valueOf(s22.f26274a));
        p000do.h.b(null, new C3723s3(s22, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC3549l3
    public final void a(S2 s22, EnumC3273a6 enumC3273a6) {
        tn.p.k(s22, "click");
        tn.p.k(enumC3273a6, IronSourceConstants.EVENTS_ERROR_CODE);
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        String str = s22.f26275b;
        if (s22.f26279f == 0) {
            C3823w3.a(s22, enumC3273a6.name());
        }
        C3823w3.b(s22);
        C3823w3.f();
    }
}
