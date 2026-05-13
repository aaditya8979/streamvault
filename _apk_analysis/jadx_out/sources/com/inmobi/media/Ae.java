package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Ae extends AbstractC3847x2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f25161i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(p000do.l0 l0Var, InterfaceC3580m9 interfaceC3580m9) {
        super(l0Var, interfaceC3580m9);
        tn.p.k(l0Var, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC3371e1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z10) {
        tn.p.k(str, "omsdkScript");
        tn.p.k(list, "omidTrackers");
        tn.p.k(map, "macros");
        tn.p.k(str3, "customReferenceData");
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        P4.a(this.f27073a, new C3909ze(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z10), W0.a(str, list, map, str2, str3), null));
    }
}
