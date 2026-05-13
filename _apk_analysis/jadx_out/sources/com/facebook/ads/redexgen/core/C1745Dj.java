package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1745Dj extends AbstractC2152Tf<C3Q> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C15003i A00;

    public C1745Dj(C15003i c15003i) {
        this.A00 = c15003i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3Q c3q) {
        int iA00 = c3q.A00();
        if (this.A00.A00 <= 0 || iA00 != this.A00.A0C.getDuration() || this.A00.A0C.getDuration() <= this.A00.A00) {
            C15003i c15003i = this.A00;
            if (A01[5].length() == 7) {
                throw new RuntimeException();
            }
            A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
            c15003i.A0k(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
    public final Class<C3Q> A01() {
        return C3Q.class;
    }
}
