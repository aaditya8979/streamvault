package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2894jY implements KW {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C2893jX A04;
    public final C4I A03 = new C4I(new byte[5]);
    public final SparseArray<InterfaceC1922Kf> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    public C2894jY(C2893jX c2893jX, int i10) {
        this.A04 = c2893jX;
        this.A00 = i10;
    }

    private C1918Kb A00(C4J c4j, int i10) {
        int iA09 = c4j.A09();
        int i11 = iA09 + i10;
        int i12 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c4j.A09() < i11) {
            int iA0I = c4j.A0I();
            int iA092 = c4j.A09() + c4j.A0I();
            if (iA092 > i11) {
                break;
            }
            if (iA0I == 5) {
                long jA0Q = c4j.A0Q();
                if (jA0Q == 1094921523) {
                    i12 = 129;
                } else if (jA0Q == 1161904947) {
                    i12 = 135;
                } else if (jA0Q == 1094921524) {
                    i12 = 172;
                } else if (jA0Q == 1212503619) {
                    i12 = 36;
                }
            } else if (iA0I == 106) {
                i12 = 129;
            } else if (iA0I == 122) {
                i12 = 135;
            } else {
                String[] strArr = A05;
                if (strArr[1].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (iA0I == 127) {
                    if (c4j.A0I() == 21) {
                        i12 = 172;
                    }
                } else if (iA0I == 123) {
                    i12 = 138;
                } else {
                    String[] strArr3 = A05;
                    if (strArr3[1].length() != strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (iA0I == 10) {
                        String strA0W = c4j.A0W(3);
                        String[] strArr5 = A05;
                        if (strArr5[1].length() != strArr5[2].length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (iA0I == 89) {
                        i12 = 89;
                        arrayList = new ArrayList();
                        while (c4j.A09() < iA092) {
                            String strTrim2 = c4j.A0W(3).trim();
                            int iA0I2 = c4j.A0I();
                            byte[] bArr = new byte[4];
                            c4j.A0k(bArr, 0, 4);
                            arrayList.add(new C1917Ka(strTrim2, iA0I2, bArr));
                        }
                    } else if (iA0I == 111) {
                        i12 = 257;
                    }
                }
            }
            c4j.A0g(iA092 - c4j.A09());
        }
        c4j.A0f(i11);
        return new C1918Kb(i12, strTrim, arrayList, Arrays.copyOfRange(c4j.A0l(), iA09, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    @Override // com.facebook.ads.redexgen.core.KW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A52(com.facebook.ads.redexgen.core.C4J r13) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2894jY.A52(com.facebook.ads.redexgen.X.4J):void");
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void AA2(C4R c4r, GY gy, C1921Ke c1921Ke) {
    }
}
