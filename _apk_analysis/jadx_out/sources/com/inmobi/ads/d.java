package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3321c2;
import com.inmobi.media.C3372e2;
import com.inmobi.media.Kb;
import com.inmobi.media.Y1;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3321c2 f25109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f25110b;

    public d(InMobiBanner inMobiBanner) {
        this.f25110b = inMobiBanner;
        this.f25109a = new C3321c2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C3372e2 mAdManager$media_release = this.f25110b.getMAdManager$media_release();
            if (mAdManager$media_release != null) {
                mAdManager$media_release.o();
            }
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            p.j(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            Y1 mPubListener$media_release = this.f25110b.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(this.f25110b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f25110b.setEnableAutoRefresh(false);
        this.f25110b.a((PublisherCallbacks) this.f25109a, "Preload", false);
    }
}
