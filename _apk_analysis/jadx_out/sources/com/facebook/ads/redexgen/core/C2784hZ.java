package com.facebook.ads.redexgen.core;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2784hZ implements S7 {
    public final NB A00;
    public final NP A01;
    public final SF A02;
    public final C2529dL A03;
    public final boolean A04;

    public C2784hZ(C2529dL c2529dL, NP np2, SF sf2, NB nb2, boolean z10) {
        this.A03 = c2529dL;
        this.A01 = np2;
        this.A02 = sf2;
        this.A00 = nb2;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        NQ nq2 = new NQ(this.A00, this.A01, this.A04);
        webView.setWebViewClient(nq2);
        webView.loadUrl(this.A00.A0F());
        nq2.A03();
    }

    private void A01(boolean z10) {
        if (this.A00.A0A() == NC.A05) {
            A00();
            return;
        }
        String strA0F = this.A00.A0F();
        if (z10) {
            strA0F = this.A02.A0S(this.A00.A0F());
        }
        this.A00.A0K(strA0F);
        this.A01.AEa();
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        if (this.A04) {
            this.A01.AEZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A01(true);
    }
}
