package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2082Qm {
    public int A00;
    public QJ A01;
    public QJ A02;
    public static String[] A04 = {"3L5xTrYaZHGbjsCndSxeOQfzJoqaksAO", "yNuit7zcaXLgcR4Esus3jmJQTJqqE", "DjfkS9z5OPUyV9QdiCBZ1KUSwMFmGRPN", "lc54RdKLiwdhlc59ssIRjbGGERTX6o9W", "6o2d", "DSh0O66K0UoAsbtG5khJTMnGYv0IzoNn", "Wt9X6yajIBXU34hiGluB33HbNXSszdRF", "6wPar1yvZmOBSMEilq5oC74eJWuAafP4"};
    public static OZ<C2082Qm> A03 = new C2725ga(20);

    public static C2082Qm A00() {
        C2082Qm c2082QmA33 = A03.A33();
        if (A04[5].charAt(2) == 'q') {
            throw new RuntimeException();
        }
        A04[5] = "RnCaU2E938mENSzRzPrAuXo67ZnkzA8g";
        C2082Qm c2082Qm = c2082QmA33;
        return c2082Qm == null ? new C2082Qm() : c2082Qm;
    }

    public static void A01() {
        while (A03.A33() != null) {
        }
    }

    public static void A02(C2082Qm c2082Qm) {
        c2082Qm.A00 = 0;
        c2082Qm.A02 = null;
        c2082Qm.A01 = null;
        A03.AGv(c2082Qm);
    }
}
