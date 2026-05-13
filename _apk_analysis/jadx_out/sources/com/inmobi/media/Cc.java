package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Cc extends AbstractC3371e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25259h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(p000do.l0 l0Var, C3605n9 c3605n9) {
        super(l0Var, c3605n9);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(l0Var, "coroutineScope");
        this.f25260g = Cc.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC3371e1
    public final void a() {
        if (this.f27077e == null) {
            tn.p.j(this.f25260g, "tag");
        } else {
            P4.a(this.f27073a, new C3449h2(this, null));
        }
    }

    @Override // com.inmobi.media.AbstractC3371e1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z10) {
        tn.p.k(str, "omsdkScript");
        tn.p.k(list, "omidTrackers");
        tn.p.k(map, "macros");
        tn.p.k(str3, "customReferenceData");
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeAdSessionManager", "initializeAdSession");
        }
        P4.a(this.f27073a, new Bc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z10), W0.a(str, list, map, str2, str3), null));
    }
}
