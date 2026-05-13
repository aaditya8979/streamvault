package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2667fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final List<C2825iN> A00;
    public final /* synthetic */ C2666fa A01;

    public C2667fb(C2666fa c2666fa, List<C2825iN> list) {
        this.A01 = c2666fa;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C2825iN> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (!zHasNext) {
                AbstractC2207Vk.A00(new C2668fc(this));
                return;
            }
            C2072Qc c2072Qc = new C2072Qc(this.A01.A01, it.next(), null, C2072Qc.A0K(), this.A01.A00.A01());
            if (c2072Qc.A0z() != null && c2072Qc.A0z().A0F() != null) {
                ((AbstractC2770hL) c2072Qc.A0z().A0F()).A00(c2072Qc);
            }
            this.A01.A00.A04(new NativeAd(this.A01.A01, c2072Qc));
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00();
    }
}
