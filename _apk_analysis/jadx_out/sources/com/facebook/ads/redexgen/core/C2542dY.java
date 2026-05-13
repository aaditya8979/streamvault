package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2542dY extends RelativeLayout {
    public static String[] A04 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public static final int A05 = (int) (AbstractC2232Wl.A02 * 4.0f);
    public int A00;
    public C14812p A01;
    public WeakReference<InterfaceC2541dX> A02;
    public final InterfaceC2597eS A03;

    public C2542dY(C2529dL c2529dL, InterfaceC2597eS interfaceC2597eS) {
        super(c2529dL);
        this.A00 = 0;
        this.A03 = interfaceC2597eS;
        XP.A0H((View) this.A03);
        addView(this.A03.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A00(AnimatorSet animatorSet, final int i10, final boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.ads.redexgen.X.dU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.A01.A04(z10, i10, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public final void A01(AnimatorSet animatorSet, boolean z10) {
        if (!z10) {
            this.A03.getView().setClipToOutline(false);
            this.A03.getView().setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            if (this.A01 != null) {
                this.A01.setClipToOutline(false);
                this.A01.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            A00(animatorSet, this.A00, false);
            return;
        }
        this.A03.getView().setClipToOutline(true);
        C2539dV c2539dV = new C2539dV(this);
        this.A03.getView().setOutlineProvider(c2539dV);
        if (this.A01 != null) {
            this.A01.setClipToOutline(true);
            this.A01.setOutlineProvider(c2539dV);
        }
        A00(animatorSet, A05, true);
    }

    public final void A02(AbstractC1736Da abstractC1736Da) {
        addView(abstractC1736Da, new RelativeLayout.LayoutParams(-1, -1));
        this.A01 = (C14812p) abstractC1736Da;
    }

    public final void A03(AbstractC1736Da abstractC1736Da) {
        XP.A0H(abstractC1736Da);
        this.A01 = null;
    }

    public final /* synthetic */ void A04(boolean z10, int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z10) {
            fFloatValue = 1.0f - fFloatValue;
        }
        this.A00 = (int) (i10 * fFloatValue);
        requestLayout();
    }

    public final boolean A05() {
        return this.A03.A9j();
    }

    public int getCurrentPosition() {
        return this.A03.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A03).layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        if (this.A01 != null) {
            this.A01.layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        int videoWidth = this.A03.getVideoWidth() + (this.A00 * 2);
        int videoHeight = this.A03.getVideoHeight() + (this.A00 * 2);
        int defaultSize = getDefaultSize(videoWidth, i10);
        int defaultSize2 = getDefaultSize(videoHeight, i11);
        if (videoWidth > 0 && videoHeight > 0) {
            z10 = true;
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                defaultSize = size;
                defaultSize2 = size2;
                if (videoWidth * defaultSize2 < defaultSize * videoHeight) {
                    int i12 = defaultSize2 * videoWidth;
                    String[] strArr = A04;
                    if (strArr[2].length() == strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    defaultSize = i12 / videoHeight;
                } else if (videoWidth * defaultSize2 > defaultSize * videoHeight) {
                    defaultSize2 = (defaultSize * videoHeight) / videoWidth;
                }
            } else if (mode == 1073741824) {
                defaultSize = size;
                defaultSize2 = (defaultSize * videoHeight) / videoWidth;
                if (mode2 == Integer.MIN_VALUE && defaultSize2 > size2) {
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                defaultSize2 = size2;
                defaultSize = (defaultSize2 * videoWidth) / videoHeight;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                defaultSize = videoWidth;
                defaultSize2 = videoHeight;
                if (mode2 == Integer.MIN_VALUE && defaultSize2 > size2) {
                    defaultSize2 = size2;
                    defaultSize = (defaultSize2 * videoWidth) / videoHeight;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                    defaultSize2 = (defaultSize * videoHeight) / videoWidth;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (!z10 || this.A02 == null) {
            return;
        }
        WeakReference<InterfaceC2541dX> weakReference = this.A02;
        if (A04[6].charAt(8) != 'i') {
            throw new RuntimeException();
        }
        A04[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A02.get().AFj();
        }
    }

    public void setRoundedCornersVideoStyle(float f10) {
        this.A03.getView().setClipToOutline(true);
        this.A03.getView().setOutlineProvider(new C2540dW(this, f10));
    }

    public void setViewImplInflationListener(InterfaceC2541dX interfaceC2541dX) {
        this.A02 = new WeakReference<>(interfaceC2541dX);
    }
}
