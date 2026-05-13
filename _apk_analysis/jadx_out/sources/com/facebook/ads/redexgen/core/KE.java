package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KE extends AbstractC2334aB implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C2529dL A05;
    public C2226Wd A06;
    public KG A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final a5 A0B;
    public final Map<String, String> A0C;

    static {
        A04();
        A0F = (int) (AbstractC2232Wl.A02 * 24.0f);
    }

    public KE(C2529dL c2529dL, AbstractC2804hy abstractC2804hy, C1992My c1992My, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, InterfaceC2242Wv interfaceC2242Wv) {
        this(c2529dL, abstractC2804hy.A0r(), c1992My, abstractC2804hy.A20().A0J().A06(), us2, interfaceC2260Xn, c2602eX, xh2, abstractC2804hy.A21(), interfaceC2242Wv);
        this.A0B.A08(abstractC2804hy);
    }

    public KE(C2529dL c2529dL, String str, C1992My c1992My, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, N3 n32) {
        this(c2529dL, str, c1992My, false, us2, interfaceC2260Xn, c2602eX, xh2, n32);
    }

    public KE(C2529dL c2529dL, String str, C1992My c1992My, boolean z10, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, N3 n32) {
        super(c2529dL, c1992My);
        this.A0C = new HashMap();
        this.A05 = c2529dL;
        this.A0A = z10;
        this.A0B = new a5(c2529dL, str, c2602eX, xh2, us2, n32, interfaceC2260Xn);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public KE(C2529dL c2529dL, String str, C1992My c1992My, boolean z10, US us2, InterfaceC2260Xn interfaceC2260Xn, C2602eX c2602eX, XH xh2, N3 n32, InterfaceC2242Wv interfaceC2242Wv) {
        super(c2529dL, c1992My);
        this.A0C = new HashMap();
        this.A05 = c2529dL;
        this.A0A = z10;
        this.A0B = new a5(c2529dL, str, c2602eX, xh2, us2, n32, interfaceC2260Xn, interfaceC2242Wv);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    private void A02() {
        if (!this.A0A || this.A09 == null) {
            return;
        }
        this.A02 = A00(XY.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? XX.MESSENGER : XX.WHATSAPP));
        this.A03 = new Paint();
        setPadding(A0F, 0, A0F, 0);
    }

    private void A03() {
        if (this.A06 != null) {
            C2226Wd c2226Wd = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c2226Wd.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static void A04() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    public static boolean A05(AbstractC2804hy abstractC2804hy) {
        return ((long) abstractC2804hy.A1w()) > 0 && abstractC2804hy.A1u() >= 0;
    }

    public final ME A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return ME.A09;
        }
        A03();
        this.A0C.put(A01(0, 12, 6), str);
        return this.A0B.A05(this.A08, this.A09, this.A0C);
    }

    public final boolean A0F(AbstractC2804hy abstractC2804hy, AbstractC2259Xm abstractC2259Xm) {
        if (this.A06 != null || !A05(abstractC2804hy) || abstractC2804hy.A24().A01() == null || abstractC2804hy.A24().A00() == null) {
            return false;
        }
        this.A07 = new KG(abstractC2804hy.A1u(), abstractC2804hy.A1w(), abstractC2804hy.A1v(), abstractC2804hy.A24().A01(), abstractC2804hy.A24().A00(), abstractC2259Xm, this);
        this.A06 = new C2226Wd(abstractC2804hy.A1w(), this.A07);
        this.A06.A07();
        return true;
    }

    public a5 getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            A0E(A01(24, 9, 58));
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int i10 = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(i10, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            int width = (int) ((((getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f)) - this.A01) - this.A00);
            int height = (getHeight() / 2) - (this.A01 / 2);
            canvas.drawBitmap(this.A02, this.A04, new Rect(width, height, this.A01 + width, this.A01 + height), this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            return;
        }
        A03();
    }

    public void setCreativeAsCtaLoggingHelper(C2228Wh c2228Wh) {
        this.A0B.A09(c2228Wh);
    }

    public void setCta(C1993Mz c1993Mz, String str, Map<String, String> map) {
        setCta(c1993Mz, str, map, null);
    }

    public void setCta(C1993Mz c1993Mz, String str, Map<String, String> map, InterfaceC2242Wv interfaceC2242Wv, InterfaceC2329a4 interfaceC2329a4) {
        setCta(c1993Mz, str, map, interfaceC2329a4);
        this.A0B.A0A(interfaceC2242Wv);
    }

    public void setCta(C1993Mz c1993Mz, String str, Map<String, String> map, InterfaceC2329a4 interfaceC2329a4) {
        this.A08 = str;
        this.A09 = c1993Mz.A05();
        this.A0C.putAll(map);
        this.A0B.A0B(interfaceC2329a4);
        String strA04 = c1993Mz.A04();
        if (TextUtils.isEmpty(strA04) || TextUtils.isEmpty(this.A09)) {
            setVisibility(8);
        } else {
            setText(strA04);
            A02();
        }
    }

    public void setIsInAppBrowser(boolean z10) {
        this.A0B.A0C(z10);
    }
}
