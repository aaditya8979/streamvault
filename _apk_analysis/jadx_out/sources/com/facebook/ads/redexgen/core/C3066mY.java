package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3066mY extends Thread implements InterfaceC1690Be {
    public static String[] A09 = {"WULC9DYlvQgZjojDU2bdZ9xs7wQbeGsA", "0RzPpdpgLbDOZ8gUAj9sr", "fywSSsB8oN823aa6hQ2avodpE9Fj6EUo", "rQ4mhJZFramri", "thNzrz2pgMkLR", "sKcdOZc1ZRugYqEHWVRtFgFPdRxve1CE", "006dlWDsgbMi7GTsUIBgGpVxQZYkiOjN", "1EnGqdZRllbwfzBFLuDlK"};
    public long A00;
    public Exception A01;
    public final int A02;
    public final BU A03;
    public final DownloadRequest A04;
    public final InterfaceC1691Bf A05;
    public final boolean A06;
    public volatile BQ A07;
    public volatile boolean A08;

    public C3066mY(DownloadRequest downloadRequest, InterfaceC1691Bf interfaceC1691Bf, BU bu, boolean z10, int i10, BQ bq2) {
        this.A04 = downloadRequest;
        this.A05 = interfaceC1691Bf;
        this.A03 = bu;
        this.A06 = z10;
        this.A02 = i10;
        this.A07 = bq2;
        this.A00 = -1L;
    }

    public static int A00(int i10) {
        return Math.min((i10 - 1) * 1000, 5000);
    }

    public final void A05(boolean z10) {
        if (z10) {
            this.A07 = null;
        }
        if (this.A08) {
            return;
        }
        this.A08 = true;
        this.A05.cancel();
        if (A09[5].charAt(29) == 'B') {
            throw new RuntimeException();
        }
        A09[5] = "eeNE7Qy6MuAlBYtV44JqSUiJf46fCooo";
        interrupt();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1690Be
    public final void AEo(long j10, long j11, float f10) {
        this.A03.A01 = j11;
        this.A03.A00 = f10;
        if (j10 != this.A00) {
            this.A00 = j10;
            BQ bq2 = this.A07;
            if (bq2 != null) {
                bq2.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A06) {
                    this.A05.remove();
                } else {
                    int i10 = 0;
                    long j10 = -1;
                    while (!this.A08) {
                        try {
                            this.A05.A5v(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.A08) {
                                long j11 = this.A03.A01;
                                if (A09[2].charAt(8) == 'G') {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A09;
                                strArr[0] = "VpOvMV7lY4vr3Fu5UlYiKKcH9ACGqt7g";
                                strArr[6] = "gAlRMyi1pPzVqBLwURYLCrt7UwpliGsz";
                                if (j11 != j10) {
                                    j10 = j11;
                                    i10 = 0;
                                }
                                i10++;
                                if (i10 > this.A02) {
                                    throw e10;
                                }
                                Thread.sleep(A00(i10));
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                AbstractC2208Vl.A00(th2, this);
                if (A09[5].charAt(29) == 'B') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[0] = "35cAsSHzLcpGFjLAU34RIcGdZnNZcSm1";
                strArr2[6] = "9oN8QLA5AyCkKiMzUX6AKpAi6mTPSF3S";
                return;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.A01 = e11;
        }
        BQ bq2 = this.A07;
        if (bq2 != null) {
            bq2.obtainMessage(9, this).sendToTarget();
        }
    }
}
