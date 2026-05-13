package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C14812p extends AbstractC1736Da {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C2529dL A01;
    public final AbstractC2152Tf<C14953d> A02;
    public final AbstractC2152Tf<DQ> A03;

    public C14812p(C2529dL c2529dL) {
        this(c2529dL, false);
    }

    public C14812p(C2529dL c2529dL, boolean z10) {
        ImageView.ScaleType scaleType;
        int i10;
        super(c2529dL);
        this.A03 = new C1735Cz(this);
        this.A02 = new C1734Cy(this);
        this.A01 = c2529dL;
        this.A00 = new ImageView(c2529dL);
        if (z10) {
            scaleType = ImageView.ScaleType.FIT_START;
            i10 = 0;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            i10 = ViewCompat.MEASURED_STATE_MASK;
        }
        this.A00.setScaleType(scaleType);
        XP.A0K(this.A00, i10);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1736Da
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C2151Te<AbstractC2152Tf, C2150Td> eventBus = getVideoView().getEventBus();
            AbstractC2152Tf[] abstractC2152TfArr = new AbstractC2152Tf[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC2152TfArr[0] = this.A03;
            abstractC2152TfArr[1] = this.A02;
            eventBus.A03(abstractC2152TfArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1736Da
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC2313Zo interfaceC2313Zo) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        KZ kzA04 = new KZ(this.A00, this.A01).A04();
        if (interfaceC2313Zo != null) {
            kzA04.A06(interfaceC2313Zo);
        }
        kzA04.A07(str);
    }
}
