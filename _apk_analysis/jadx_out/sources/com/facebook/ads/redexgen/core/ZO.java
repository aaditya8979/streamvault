package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZO extends LinearLayout {
    public static byte[] A0F;
    public static String[] A0G = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0H;
    public static final int A0I;
    public static final Uri A0J;
    public static final View.OnTouchListener A0K;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public ZN A05;
    public ZV A06;
    public String A07;
    public final float A08;
    public final WebView A09;
    public final C2529dL A0A;
    public final ZZ A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    static {
        A0A();
        A0H = Color.rgb(224, 224, 224);
        A0J = WQ.A00(A06(90, 23, 25));
        A0K = new ZI();
        A0I = Color.argb(34, 0, 0, 0);
    }

    public ZO(C2529dL c2529dL, WebView webView) {
        this(c2529dL, webView, false, false);
    }

    public ZO(C2529dL c2529dL, WebView webView, boolean z10, boolean z11) {
        super(c2529dL);
        this.A08 = getResources().getDisplayMetrics().density;
        this.A0B = new LQ(this);
        this.A09 = webView;
        this.A0A = c2529dL;
        this.A0C = U8.A06(c2529dL);
        this.A0E = z10;
        this.A0D = z11;
        A08();
        if (z11) {
            A0C(false);
        }
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    private void A08() {
        int i10 = (int) (this.A08 * 50.0f);
        XP.A0K(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A0A);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(XY.A01(XX.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0K);
        this.A01.setOnClickListener(new ZJ(this));
        addView(this.A01, layoutParams);
        if (this.A0C && !U7.A2o(this.A0A)) {
            this.A00 = new ImageView(this.A0A);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(XY.A01(XX.BACK_ARROW));
            this.A00.setOnTouchListener(A0K);
            this.A00.setOnClickListener(new ZK(this));
            addView(this.A00, layoutParams2);
        }
        this.A06 = new ZV(this.A0A);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = (this.A0C || U7.A2o(this.A0A)) ? 0.5f : 1.0f;
        this.A06.setGravity(17);
        if (!U7.A2o(this.A0A) || this.A0E) {
            addView(this.A06, layoutParams3);
        } else {
            this.A04 = new LinearLayout(this.A0A);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, (int) (this.A08 * 2.0f), 0, (int) (this.A08 * 2.0f));
            layoutParams3.setMarginStart(0);
            addView(this.A04, layoutParams3);
            ImageView imageView = new ImageView(this.A0A);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(XY.A01(XX.HANDLER));
            imageView.setPadding(0, (int) (this.A08 * 4.0f), 0, (int) (this.A08 * 4.0f));
            this.A04.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            this.A04.addView(this.A06, new LinearLayout.LayoutParams(-1, -2));
        }
        if (this.A0C && !U7.A2o(this.A0A)) {
            this.A02 = new ImageView(this.A0A);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(XY.A02(XX.BACK_ARROW));
            this.A02.setOnTouchListener(A0K);
            this.A02.setOnClickListener(new ZL(this));
            addView(this.A02, layoutParams4);
        }
        this.A03 = new ImageView(this.A0A);
        ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0K);
        this.A03.setOnClickListener(new ZM(this));
        addView(this.A03, layoutParams5);
        A09();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.ZO.A09():void");
    }

    public static void A0A() {
        A0F = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, 27, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, ExifInterface.MARKER_EOI, -42, -34, -38, -52, ExifInterface.MARKER_EOI, -6, -5, 8, 14, 13, -45, -5, 5, -6, 7, 4, 23, 36, 26, 40, 37, 31, 26, -28, 31, 36, ExifInterface.START_CODE, 27, 36, ExifInterface.START_CODE, -28, 23, 25, ExifInterface.START_CODE, 31, 37, 36, -28, 12, -1, -5, 13, 18, 30, 28, -35, 16, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, 28, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0G[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0G[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    private Bitmap getExternalBrowserBitmap() {
        return this.A0D ? XY.A01(XX.BROWSER_LAUNCH_NATIVE_V2) : XY.A01(XX.BROWSER_LAUNCH_NATIVE);
    }

    public ZZ getBrowserNavigationListener() {
        return this.A0B;
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    public void setListener(ZN zn2) {
        this.A05 = zn2;
    }

    public void setTitle(String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0H, PorterDuff.Mode.SRC_IN));
        } else {
            this.A06.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
