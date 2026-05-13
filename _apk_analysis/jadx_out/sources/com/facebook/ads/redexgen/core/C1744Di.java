package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1744Di extends AbstractC2152Tf<C14953d> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C15003i A00;

    public C1744Di(C15003i c15003i) {
        this.A00 = c15003i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C14953d c14953d) {
        int iA00 = c14953d.A00();
        int iA01 = c14953d.A01();
        if (this.A00.A00 <= 0 || iA00 != iA01 || iA01 <= this.A00.A00) {
            if (iA01 < iA00 + 500) {
                if (iA01 == 0) {
                    this.A00.A0j(this.A00.A00);
                    return;
                } else {
                    this.A00.A0j(iA01);
                    return;
                }
            }
            C15003i c15003i = this.A00;
            String[] strArr = A01;
            if (strArr[7].charAt(6) == strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
            strArr2[3] = "ZD2QUH1g";
            c15003i.A0j(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
    public final Class<C14953d> A01() {
        return C14953d.class;
    }
}
