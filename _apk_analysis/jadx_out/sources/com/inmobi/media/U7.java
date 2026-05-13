package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class U7 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26420a;

    public U7(String str) {
        tn.p.k(str, "content");
        this.f26420a = str;
    }

    @Override // com.inmobi.media.Gg
    public final Object a(hn.c cVar) {
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f26420a.length() != 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }

    @Override // com.inmobi.media.Gg
    public final Object b() {
        return this.f26420a;
    }
}
