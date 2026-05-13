package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TD extends R8 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C2529dL A01;
    public InterfaceC2182Uk A02;
    public AnonymousClass64 A04;
    public C14812p A05;
    public C2Z A06;
    public AbstractC2601eW A07;
    public C2602eX A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC2541dX A0C = new UW(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC2192Uu A03 = EnumC2192Uu.A03;

    static {
        A0E();
        A0H = TD.class.getSimpleName();
    }

    private UD A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UD(this, mediaViewVideoRendererApi);
    }

    private U2 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new U2(this, mediaViewVideoRendererApi);
    }

    private C2162Tq A02() {
        return new C2162Tq(this);
    }

    private C2602eX A05() {
        return new C2602eX(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    private void A09() {
        if (this.A04 != null) {
            AnonymousClass64 anonymousClass64 = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C2542dY) anonymousClass64.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new ViewOnTouchListenerC2181Uj(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C2542dY) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC2599eU state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC2599eU.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC2192Uu.A03;
        A0B();
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, ExifInterface.START_CODE, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, 63, 38, 38, 113, 106, 63, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, 64, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, 15, 76, 71, 70, 67, 75, 1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C2072Qc c2072Qc, InterfaceC2182Uk interfaceC2182Uk) {
        String url;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC2182Uk;
        A09();
        C14812p c14812p = this.A05;
        if (c2072Qc == null || c2072Qc.getAdCoverImage() == null) {
            url = null;
        } else {
            C2187Up adCoverImage = c2072Qc.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            url = adCoverImage.getUrl();
        }
        c14812p.setImage(url, new C2167Tv(this));
        this.A03 = c2072Qc.A19();
        this.A06.setPlayAccessibilityLabel(c2072Qc.A1F());
        this.A06.setPauseAccessibilityLabel(c2072Qc.A1E());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC2545db enumC2545db) {
        if (this.A04 != null) {
            this.A04.A0h(enumC2545db, 24);
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC2599eU.A06) {
            return false;
        }
        return this.A03 == EnumC2192Uu.A05 || this.A03 == EnumC2192Uu.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10) {
        InterfaceC2184Um interfaceC2184UmA01;
        ((R8) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i10) {
            case 0:
                interfaceC2184UmA01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                interfaceC2184UmA01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((RH) mediaViewVideoRendererApi).A06(interfaceC2184UmA01);
        this.A01 = RB.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C14812p(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float f10 = AbstractC2232Wl.A02;
        int i11 = (int) (2.0f * f10);
        int i12 = (int) (25.0f * f10);
        this.A06 = new C2Z(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(i11, i12, i12, i11);
        this.A06.setLayoutParams(layoutParams);
        int i13 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i13 < childCount) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AnonymousClass64) {
                    this.A04 = (AnonymousClass64) childAt;
                } else {
                    i13++;
                }
            }
        }
        if (this.A04 != null) {
            this.A04.A0i(this.A05);
            AnonymousClass64 anonymousClass64 = this.A04;
            C2Z c2z = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                anonymousClass64.A0i(c2z);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                anonymousClass64.A0i(c2z);
            }
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.e(A0H, A06(72, 36, 98));
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        interfaceC2184UmA01.AIk();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean zA0s = U7.A0s(this.A01);
        this.A00.setOnTouchListener(new ViewOnTouchListenerC2180Ui(this, zA0s));
        if (zA0s) {
            return;
        }
        A0A();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0C();
    }
}
