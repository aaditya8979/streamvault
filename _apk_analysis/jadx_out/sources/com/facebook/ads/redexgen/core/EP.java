package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EP extends FrameLayout implements InterfaceC2530dM {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C2531dN A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"1TbW2eCQhsvMTBw6WLgOl0T9uhpIUPzf", "ziTp6gBPmnDALVepebGOFatIHSWtUxBS", "U8KhSuPVLRzWbOpxbAxolTOugcqmOnaD", "0bQh9HQE8V8VC7fBvS6H2cn6s67Amjp4", "9aGEAiUrkMnbIgwzZX43En2EpYymCUz", "e9g0133auHqHsGsSwLriU2UE0E7n3ej0", "gJVbKnLfSb6S0wmfJEV2eyQXUghITZN0", ""};
    public static final int A0E = (int) (AbstractC2232Wl.A02 * 6.0f);
    public static final int A0D = (int) (AbstractC2232Wl.A02 * 8.0f);
    public static final int A0C = (int) (AbstractC2232Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC2232Wl.A02 * 350.0f);
    public static final int A09 = (int) (AbstractC2232Wl.A02 * 250.0f);
    public static final int A0B = (int) (AbstractC2232Wl.A02 * 175.0f);

    public EP(C2529dL c2529dL, NativeAd nativeAd, C2189Ur c2189Ur, EnumC2190Us enumC2190Us, C2343aK c2343aK, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c2529dL);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C2531dN(c2529dL, this.A05, c2189Ur, c2343aK, adOptionsView);
        this.A06.setPadding(A0C, A0C, A0C, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC2190Us == EnumC2190Us.A09 || enumC2190Us == EnumC2190Us.A0B) {
            A07(c2189Ur);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC2190Us != EnumC2190Us.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c2189Ur);
            A04(c2189Ur);
            A05(c2189Ur);
        }
        this.A07.add(c2343aK);
        this.A07.add(mediaView);
    }

    private int A00() {
        int measuredHeight;
        int measuredHeight2 = 0;
        int measuredHeight3 = (this.A03 == null || this.A03.getVisibility() != 0) ? 0 : this.A03.getMeasuredHeight();
        int measuredHeight4 = (this.A02 == null || this.A02.getVisibility() != 0) ? 0 : this.A02.getMeasuredHeight();
        if (this.A00 == null || this.A00.getVisibility() != 0) {
            measuredHeight = 0;
        } else {
            TextView textView = this.A00;
            if (A08[0].charAt(24) != 'u') {
                throw new RuntimeException();
            }
            A08[0] = "HiZrVlulAuiH54vlSWYSbySNuASlYz5G";
            measuredHeight = textView.getMeasuredHeight();
        }
        if (this.A01 != null && this.A01.getVisibility() == 0) {
            measuredHeight2 = this.A01.getMeasuredHeight() + A0C + A0D;
        }
        return ((((getMeasuredHeight() - this.A06.getMeasuredHeight()) - measuredHeight3) - measuredHeight4) - measuredHeight) - measuredHeight2;
    }

    private void A01() {
        if (this.A03 != null) {
            this.A03.setLines(1);
        }
        if (this.A02 != null) {
            this.A02.setLines(1);
        }
        if (this.A00 != null) {
            this.A00.setLines(1);
        }
    }

    private void A02(int i10) {
        XP.A0L(this.A04, i10 > A0B ? 0 : 8);
        XP.A0L(this.A03, i10 > A0A ? 0 : 8);
        XP.A0L(this.A00, i10 <= A09 ? 8 : 0);
    }

    public static void A03(int i10, int i11, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = XP.A04(textView, i11);
                textView.setLines(iA04 + 1);
                textView.measure(i10, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i11 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(C2189Ur c2189Ur) {
        if (this.A05.getAdBodyText() == null || this.A05.getAdBodyText().trim().isEmpty()) {
            return;
        }
        this.A00 = new TextView(getContext());
        c2189Ur.A06(this.A00);
        this.A00.setText(this.A05.getAdBodyText());
        this.A00.setPadding(A0C, 0, A0C, 0);
        addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
    }

    private void A05(C2189Ur c2189Ur) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            XP.A0I(this.A01);
            c2189Ur.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            this.A01.setPadding(A0D, A0D, A0D, A0D);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0D, 0, A0D, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C2189Ur c2189Ur) {
        if (this.A05.getAdHeadline() == null || this.A05.getAdHeadline().trim().isEmpty()) {
            return;
        }
        this.A02 = new TextView(getContext());
        c2189Ur.A07(this.A02);
        this.A02.setText(this.A05.getAdHeadline());
        this.A02.setPadding(A0C, A0D, A0C, 0);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
    }

    private void A07(C2189Ur c2189Ur) {
        if (this.A05.getAdLinkDescription() == null || this.A05.getAdLinkDescription().trim().isEmpty()) {
            return;
        }
        this.A03 = new TextView(getContext());
        c2189Ur.A06(this.A03);
        this.A03.setText(this.A05.getAdLinkDescription());
        this.A03.setPadding(A0C, 0, A0C, A0D);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A06.layout(i10, i11, i12, this.A06.getMeasuredHeight() + i11);
        int measuredHeight = i11 + this.A06.getMeasuredHeight();
        if (this.A03 != null) {
            int visibility = this.A03.getVisibility();
            if (A08[4].length() == 2) {
                throw new RuntimeException();
            }
            A08[4] = "Mpk43iWHaBi74JKA9YKWwwxfR5sOjUPQ";
            if (visibility == 0) {
                int measuredHeight2 = this.A03.getMeasuredHeight();
                this.A03.layout(i10, measuredHeight, i12, measuredHeight + measuredHeight2);
                measuredHeight += measuredHeight2;
            }
        }
        this.A04.layout(i10, measuredHeight, i12, this.A04.getMeasuredHeight() + measuredHeight);
        int measuredHeight3 = measuredHeight + this.A04.getMeasuredHeight();
        if (this.A02 != null) {
            this.A02.layout(i10, measuredHeight3, i12, this.A02.getMeasuredHeight() + measuredHeight3);
            measuredHeight3 += this.A02.getMeasuredHeight();
        }
        if (this.A00 != null && this.A00.getVisibility() == 0) {
            this.A00.layout(i10, measuredHeight3, i12, this.A00.getMeasuredHeight() + measuredHeight3);
        }
        if (this.A01 != null) {
            this.A01.layout(A0C + i10, (i13 - this.A01.getMeasuredHeight()) - A0C, i12 - A0C, i13 - A0C);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        A02(View.MeasureSpec.getSize(i11));
        A01();
        super.onMeasure(i10, i11);
        int iA00 = A00();
        int iMin = (this.A04.getMediaWidth() == 0 || this.A04.getMediaHeight() == 0 || ((C2673fh) this.A04.getMediaViewApi()).A0N()) ? iA00 : Math.min((int) (this.A04.getMeasuredWidth() * (this.A04.getMediaHeight() / this.A04.getMediaWidth())), iA00);
        MediaView mediaView = this.A04;
        if (A08[4].length() == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "bBjhlDCZcebcBoQzUAOgAVf3zFQrapwM";
        strArr[2] = "urvh83LMTjJVKtjaQ5bPrRJiE37dq76T";
        mediaView.measure(i10, View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        if (iMin < iA00) {
            A03(i10, iA00 - iMin, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2530dM
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
