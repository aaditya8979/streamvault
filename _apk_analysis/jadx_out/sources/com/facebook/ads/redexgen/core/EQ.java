package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EQ extends LinearLayout implements InterfaceC2530dM {
    public final NativeBannerAd A00;
    public final C2529dL A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC2232Wl.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC2232Wl.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC2232Wl.A02 * 8.0f);

    public EQ(C2529dL c2529dL, NativeBannerAd nativeBannerAd, C2189Ur c2189Ur, EnumC2190Us enumC2190Us, MediaView mediaView, AdOptionsView adOptionsView) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super(c2529dL);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c2529dL;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC2190Us);
        C2344aL c2344aL = new C2344aL(this.A01);
        c2344aL.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iA00, iA00);
        layoutParams3.gravity = 16;
        c2344aL.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c2344aL, layoutParams3);
        C2527dJ c2527dJ = new C2527dJ(c2529dL, this.A00, enumC2190Us, c2189Ur, adOptionsView);
        c2527dJ.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c2527dJ, layoutParams4);
        if (enumC2190Us == EnumC2190Us.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c2189Ur.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC2190Us enumC2190Us) {
        switch (enumC2190Us) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
