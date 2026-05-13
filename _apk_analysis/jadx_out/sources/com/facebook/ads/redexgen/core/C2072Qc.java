package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.Ad;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2072Qc implements Ad, NativeAdBaseApi, Repairable, InterfaceC2195Ux {
    public static SF A0k;
    public static byte[] A0l;
    public static String[] A0m = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C2072Qc>> A0o;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public NativeAdLayout A07;
    public EnumC1971Mc A08;
    public C2814iC A09;
    public C15926w A0A;
    public C2769hK A0B;
    public SL A0C;
    public TF A0D;
    public EnumC2183Ul A0E;
    public ViewOnClickListenerC2102Rg A0F;
    public QQ A0G;
    public C2189Ur A0H;
    public EnumC2190Us A0I;
    public V6 A0J;
    public YX A0K;
    public C2311Zm A0L;
    public C2440bt A0M;
    public C2505cw A0N;
    public AbstractC2601eW A0O;
    public AbstractC2601eW A0P;
    public C2602eX A0Q;
    public C2602eX A0R;
    public String A0S;
    public String A0T;
    public WeakReference<C2689fx> A0U;
    public WeakReference<AbstractC2601eW> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C2825iN A0a;
    public final SF A0b;
    public final C2529dL A0c;
    public final InterfaceC2186Uo A0d;
    public final C2197Uz A0e;
    public final XH A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    static {
        A0e();
        A0n = C2072Qc.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C2072Qc(Context context, String str, InterfaceC2186Uo interfaceC2186Uo, boolean z10) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = V6.A06;
        this.A0E = EnumC2183Ul.A04;
        this.A08 = EnumC1971Mc.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new XH();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C2529dL) {
            this.A0c = (C2529dL) context;
        } else if (z10) {
            this.A0c = RB.A03(context);
        } else {
            this.A0c = RB.A04(context);
        }
        this.A0c.A0O(this);
        this.A0g = str;
        this.A0d = interfaceC2186Uo;
        if (A0k != null) {
            this.A0b = A0k;
        } else {
            this.A0b = new SF(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new C2197Uz(this.A0c, this);
    }

    public C2072Qc(C2072Qc c2072Qc) {
        this((Context) c2072Qc.A0c, (String) null, c2072Qc.A0d, true);
        this.A0D = c2072Qc.A0D;
        this.A0a = c2072Qc.A0a;
        this.A0B = c2072Qc.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C2072Qc(C2529dL c2529dL, C2825iN c2825iN, TF tf2, InterfaceC2186Uo interfaceC2186Uo) {
        this((Context) c2529dL, (String) null, interfaceC2186Uo, true);
        this.A0a = c2825iN;
        this.A0D = tf2;
        this.A0j = true;
        this.A05 = new View(c2529dL);
    }

    public C2072Qc(C2529dL c2529dL, C2825iN c2825iN, TF tf2, InterfaceC2186Uo interfaceC2186Uo, C2769hK c2769hK) {
        this(c2529dL, c2825iN, tf2, interfaceC2186Uo);
        this.A0B = c2769hK;
    }

    private int A00() {
        if (this.A0D != null) {
            return this.A0D.A04();
        }
        if (this.A0A == null || this.A0A.A0J() == null) {
            return 1;
        }
        TF tfA0J = this.A0A.A0J();
        String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return tfA0J.A04();
    }

    private int A01() {
        if (this.A0D != null) {
            return this.A0D.A07();
        }
        if (this.A0a != null) {
            return this.A0a.A0C();
        }
        if (this.A0A == null || this.A0A.A0J() == null) {
            return 0;
        }
        return this.A0A.A0J().A07();
    }

    private int A02() {
        if (this.A0D != null) {
            return this.A0D.A08();
        }
        if (this.A0a != null) {
            return this.A0a.A0D();
        }
        if (this.A0A == null || this.A0A.A0J() == null) {
            return 1000;
        }
        return this.A0A.A0J().A08();
    }

    private int A03() {
        if (this.A0D != null) {
            return this.A0D.A09();
        }
        C15926w c15926w = this.A0A;
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0m[5] = "Xt";
        if (c15926w == null || this.A0A.A0J() == null) {
            return 0;
        }
        return this.A0A.A0J().A09();
    }

    public static Drawable A05(C2529dL c2529dL, Bitmap bitmap, boolean z10, String str) {
        BitmapDrawable bitmapDrawableA00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c2529dL.getResources(), bitmap);
        return (!z10 || (bitmapDrawableA00 = AbstractC2504cv.A00(c2529dL, str)) == null) ? bitmapDrawable : new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawableA00});
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws V2 {
        V6 v6A00 = VB.A00(str2);
        if (v6A00 == null) {
            throw new V2(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 58), str2));
        }
        if (v6A00 == V6.A05) {
            return new NativeBannerAd(context, str);
        }
        if (v6A00 == V6.A06) {
            return new NativeAd(context, str);
        }
        throw new V2(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 54), v6A00));
    }

    private final C2825iN A0C() {
        C2825iN c2825iN = this.A0a;
        if (c2825iN == null || !c2825iN.A0R()) {
            return null;
        }
        return c2825iN;
    }

    private C2813iB A0F() {
        return A0G(false);
    }

    private C2813iB A0G(boolean z10) {
        if (this.A0a != null) {
            C2825iN c2825iN = this.A0a;
            if (A0m[3].charAt(5) == 'B') {
                String[] strArr = A0m;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c2825iN.A0R()) {
                    if (z10) {
                        C2825iN c2825iN2 = this.A0a;
                        if (A0m[3].charAt(5) == 'B') {
                            A0m[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c2825iN2.A0I();
                        }
                    }
                    return this.A0a.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C2813iB();
    }

    public static S3 A0K() {
        return new S3();
    }

    public static C2072Qc A0L(NativeAdBaseApi nativeAdBaseApi) {
        return nativeAdBaseApi instanceof Proxy ? (C2072Qc) ((C2091Qv) Proxy.getInvocationHandler(nativeAdBaseApi)).A04() : (C2072Qc) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final C2187Up getAdChoicesIcon() {
        return A0F().A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final C2188Uq getAdStarRating() {
        return A0F().A0G();
    }

    private AdPlacementType A0R() {
        return this.A0J == V6.A06 ? AdPlacementType.NATIVE : AdPlacementType.NATIVE_BANNER;
    }

    public static String A0W(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0l, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0a() {
        for (View view : this.A0i) {
            view.setOnClickListener(null);
            if (A0m[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0m[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0b() {
        if (TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            return;
        }
        WN.A0O(new WN(), this.A0c, WQ.A00(getAdChoicesLinkUrl()), A1C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0d() {
        if (this.A0Q != null) {
            this.A0Q.A0V();
            this.A0c.A0F().AC0();
            this.A0Q = null;
        }
    }

    public static void A0e() {
        A0l = new byte[]{-32, 26, 38, 31, 30, -17, -17, 29, 32, -19, -12, 34, -15, -25, 26, -27, 25, 25, -28, 21, -22, -74, -70, -30, -78, -30, -78, -25, -29, 38, 73, 5, 83, 84, 89, 5, 81, 84, 70, 73, 74, 73, -25, 10, -6, 11, 19, 22, 18, 7, 26, 11, -58, -51, -53, 25, -51, -58, 15, 25, -58, 20, 21, 26, -58, 7, -58, 20, 7, 26, 15, 28, 11, -58, 7, 10, -33, -37, -38, 14, -3, 2, -2, 7, -4, -2, -25, -2, 13, 16, 8, 11, 4, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 11, 14, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 25, 12, 30, 11, 19, 24, -54, 30, 15, 23, 26, 22, 11, 30, 15, -54, -13, -18, -54, 16, 28, 25, 23, -54, 12, 19, 14, -54, 26, 11, 35, 22, 25, 11, 14, -54, -47, -49, 29, -47, -23, 14, 20, 5, 18, 14, 1, 12, -64, 5, 18, 18, 15, 18, -50, -86, 30, 67, 75, 54, 65, 62, 57, -11, 72, 58, 73, -11, 68, 59, -11, 56, 65, 62, 56, 64, 54, 55, 65, 58, -11, 75, 62, 58, 76, 72, 0, 24, 23, 28, 20, 9, 28, 24, ExifInterface.START_CODE, -45, 25, 34, 37, -45, 28, 22, 34, 33, -45, 28, 38, -45, 28, 38, -45, 32, 28, 38, 38, 28, 33, 26, ExifInterface.MARKER_APP1, 29, 53, 52, 57, 49, 38, 57, 53, 71, -16, 57, 67, -16, 61, 57, 67, 67, 57, 62, 55, -2, 51, 91, 89, 90, 6, 86, 88, 85, 92, 79, 74, 75, 6, 71, 6, 60, 79, 75, 93, 35, 54, 73, 62, 75, 58, -11, 22, 57, -11, 76, 54, 72, -11, 54, 65, 71, 58, 54, 57, 78, -11, 71, 58, 60, 62, 72, 73, 58, 71, 58, 57, -11, 76, 62, 73, 61, -11, 54, -11, 43, 62, 58, 76, 3, -11, 22, 74, 73, 68, -11, 74, 67, 71, 58, 60, 62, 72, 73, 58, 71, 62, 67, 60, -11, 54, 67, 57, -11, 69, 71, 68, 56, 58, 58, 57, 62, 67, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, ExifInterface.MARKER_EOI, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, 11, -76, -11, 0, 6, -7, -11, -8, 13, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, 11, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, 18, 14, 32, -55, 23, 24, 29, -55, 27, 14, 16, 18, 28, 29, 14, 27, 14, 13, -55, 32, 18, 29, 17, -55, 29, 17, 18, 28, -55, -9, 10, 29, 18, 31, 14, -22, 13, 46, 49, -19, 58, 50, 49, 54, 46, -19, 65, 70, 61, 50, -19, 54, 64, -19, 59, 60, 65, -19, 64, 66, 61, 61, 60, 63, 65, 50, 49, -5, 54, 69, 62, 51, 52, 66, 67, 65, 62, 72, 81, 84, 70, 73, 38, 73, 69, 72, 58, 61, 26, 61, 1, 2, -7, 60, 58, 69, 69, 62, 61, -7, 70, 72, 75, 62, -7, 77, 65, 58, 71, -7, 72, 71, 60, 62, -27, -40, -21, -32, -19, -36};
        String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0m[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    public static void A0f(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0m;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        imageView.setBackground(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0332 A[LOOP:0: B:109:0x032c->B:111:0x0332, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0g(android.view.View r13, android.view.View r14, java.util.List<android.view.View> r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2072Qc.A0g(android.view.View, android.view.View, java.util.List, boolean):void");
    }

    private void A0h(FrameLayout frameLayout, String str) {
        if (this.A0N != null) {
            frameLayout.removeView(this.A0N);
        }
        this.A0N = AbstractC2504cv.A01(RB.A03(this.A0c), str);
        if (this.A0N != null) {
            frameLayout.addView(this.A0N, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0i(C2825iN c2825iN, boolean z10) {
        if (c2825iN == null) {
            return;
        }
        boolean zEquals = this.A0E.equals(EnumC2183Ul.A04);
        String strA0W = A0W(596, 6, 7);
        if (zEquals) {
            C2813iB c2813iBA0E = c2825iN.A0E();
            String strA7G = c2825iN.A7G();
            if (!TextUtils.isEmpty(strA7G)) {
                this.A0b.A0e(new C2172Ua(strA7G, this.A0c.A0A()));
            }
            C2187Up c2187UpA0F = c2813iBA0E.A0F();
            String[] strArr = A0m;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            A0m[3] = "olK6BBrMvSH2F6L4J2jXYHYWLLMocGr7";
            if (c2187UpA0F != null) {
                SD sd2 = new SD(c2813iBA0E.A0F().getUrl(), c2813iBA0E.A0F().getHeight(), c2813iBA0E.A0F().getWidth(), c2825iN.A0G(), A0W(596, 6, 7));
                sd2.A01 = this.A0C;
                this.A0b.A0W();
                this.A0b.A0c(sd2);
            }
            if (!this.A0J.equals(V6.A05)) {
                if (c2813iBA0E.A0E() != null) {
                    this.A0b.A0c(new SD(c2813iBA0E.A0E().getUrl(), c2813iBA0E.A0E().getHeight(), c2813iBA0E.A0E().getWidth(), c2825iN.A0G(), A0W(596, 6, 7)));
                }
                if (c2825iN.A0H() != null) {
                    for (C2072Qc c2072Qc : c2825iN.A0H()) {
                        if (c2072Qc.getAdCoverImage() != null) {
                            this.A0b.A0c(new SD(c2072Qc.getAdCoverImage().getUrl(), c2072Qc.getAdCoverImage().getHeight(), c2072Qc.getAdCoverImage().getWidth(), c2825iN.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                String strA0b = c2813iBA0E.A0b();
                if (!TextUtils.isEmpty(strA0b)) {
                    this.A0b.A0b(new SB(strA0b, c2825iN.A0G(), A0W(596, 6, 7), c2813iBA0E.A0A()));
                }
            }
            AbstractC2804hy abstractC2804hyA0C = c2813iBA0E.A0C();
            if (abstractC2804hyA0C != null && abstractC2804hyA0C.A1Y()) {
                SB sb2 = new SB(abstractC2804hyA0C.A0s(), abstractC2804hyA0C.A17(), strA0W);
                sb2.A04 = true;
                sb2.A03 = A0W(0, 5, 66);
                this.A0b.A0Y(sb2);
            }
        }
        this.A0b.A0X(new T7(this, c2825iN, z10), new S8(c2825iN.A0G(), strA0W));
    }

    private void A0j(InterfaceC1973Me interfaceC1973Me) {
        if (this.A0a == null) {
            return;
        }
        this.A0a.A0K(interfaceC1973Me);
    }

    public static void A0k(NativeAdImageApi nativeAdImageApi, ImageView imageView, C2529dL c2529dL) {
        if (nativeAdImageApi == null || imageView == null) {
            return;
        }
        new KZ(imageView, c2529dL).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
    }

    private final void A0n(QQ qq2) {
        this.A0G = qq2;
    }

    private final void A0o(String str) {
        this.A0S = str;
    }

    private void A0p(List<View> list, View view) {
        if (this.A0d == null || !this.A0d.AJD(view)) {
            if (!(view instanceof ViewGroup)) {
                list.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                A0p(list, viewGroup.getChildAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A19() == EnumC2192Uu.A05 || A19() == EnumC2192Uu.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0r() {
        return A0F().A0e();
    }

    public final long A0y() {
        return this.A00;
    }

    public final C2825iN A0z() {
        return this.A0a;
    }

    public final AbstractC2804hy A10() {
        return A0F().A0C();
    }

    public final SF A11() {
        return this.A0b;
    }

    public final C2529dL A12() {
        return this.A0c;
    }

    public final ViewOnClickListenerC2102Rg A13() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A14, reason: merged with bridge method [inline-methods] */
    public final C2187Up getAdCoverImage() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A15, reason: merged with bridge method [inline-methods] */
    public final C2187Up getAdIcon() {
        return A0F().A0F();
    }

    public final QQ A16() {
        return this.A0G;
    }

    public final C2189Ur A17() {
        return this.A0H;
    }

    public final EnumC2190Us A18() {
        return this.A0I;
    }

    public final EnumC2192Uu A19() {
        return A0F().A0H();
    }

    public final XH A1A() {
        return this.A0f;
    }

    public final C2602eX A1B() {
        return this.A0R;
    }

    public final String A1C() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A7G();
    }

    public final String A1D() {
        return this.A0T;
    }

    public final String A1E() {
        return A0G(true).A0N();
    }

    public final String A1F() {
        return A0G(true).A0O();
    }

    public final String A1G() {
        return A0F().A0a();
    }

    public final String A1H() {
        if (this.A0a == null || TextUtils.isEmpty(this.A0a.A0E().A0b())) {
            return null;
        }
        return this.A0b.A0T(this.A0a.A0E().A0b());
    }

    public final List<C2072Qc> A1I() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1J() {
        if (!O3.A00(this.A0c.A02()).A0O(this.A0c, false)) {
            A0b();
            if (A0m[5].length() == 3) {
                throw new RuntimeException();
            }
            A0m[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        AbstractC2276Yd abstractC2276YdA01 = AbstractC2277Ye.A01(this.A0c, this.A0c.A0A(), A1C(), this.A07);
        if (abstractC2276YdA01 == null) {
            A0b();
        } else {
            ((C2672fg) this.A07.getNativeAdLayoutApi()).A03(abstractC2276YdA01);
            abstractC2276YdA01.A0M();
        }
    }

    public final void A1K(Drawable drawable) {
        this.A01 = drawable;
        A1f(drawable != null, true);
    }

    public final void A1L(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (U7.A1B(view.getContext())) {
            view.setOnLongClickListener(this.A0F);
        }
    }

    public final void A1M(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, imageView, arrayList, true);
    }

    public final void A1N(View view, ImageView imageView, List<View> list) {
        A0g(view, imageView, list, true);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, false);
    }

    public final void A1P(View view, AdNativeComponentView adNativeComponentView, List<View> list) {
        A0g(view, adNativeComponentView, list, false);
    }

    public final void A1Q(View view, AdNativeComponentView adNativeComponentView, List<View> list, boolean z10) {
        A0g(view, adNativeComponentView, list, z10);
    }

    public final void A1R(View view, AdNativeComponentView adNativeComponentView, boolean z10) {
        ArrayList arrayList = new ArrayList();
        A0p(arrayList, view);
        A0g(view, adNativeComponentView, arrayList, z10);
    }

    public final void A1S(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1T(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1U(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0n(new C6I(nativeAdListener, nativeAdBase));
    }

    public final void A1V(NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1W(C2825iN c2825iN) {
        A0i(c2825iN, true);
        if (this.A0G == null || c2825iN.A0H() == null) {
            return;
        }
        T9 t92 = new T9(this);
        for (C2072Qc c2072Qc : c2825iN.A0H()) {
            if (A0m[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A0m;
            strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
            strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
            c2072Qc.A0j(t92);
        }
    }

    public final void A1X(C2689fx c2689fx) {
        this.A0U = new WeakReference<>(c2689fx);
    }

    public final void A1Y(EnumC2183Ul enumC2183Ul, String str, SL sl2) {
        if (str == null) {
            this.A0c.A0F().A3I();
        } else {
            this.A0c.A0F().A3H();
        }
        this.A00 = System.currentTimeMillis();
        boolean z10 = this.A0j;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0m;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z10) {
                AdSettings.IntegrationErrorMode integrationErrorModeA00 = NW.A00(this.A0c);
                String strA0W = A0W(566, 30, 105);
                if (AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.equals(integrationErrorModeA00)) {
                    throw new C1995Nb(strA0W);
                }
                V1 v12 = new V1(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                A12().A0F().A3F(XG.A01(this.A00), v12.A03().getErrorCode(), v12.A04());
                if (this.A0G != null) {
                    this.A0G.ADB(v12);
                } else {
                    Log.e(A0W(76, 17, 41), strA0W);
                }
                C2143Sw c2143Sw = new C2143Sw(strA0W);
                A12().A08().AAy(A0W(550, 3, 101), AbstractC2142Sv.A0c, c2143Sw);
            }
            this.A0j = true;
            this.A0E = enumC2183Ul;
            if (enumC2183Ul.equals(EnumC2183Ul.A05)) {
                EnumC1971Mc enumC1971Mc = EnumC1971Mc.A05;
                if (A0m[3].charAt(5) == 'B') {
                    A0m[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A08 = enumC1971Mc;
                }
            }
            this.A0C = sl2;
            NT nt = new NT(this.A0g, this.A0J, A0R(), null, 1, new C2761hB());
            nt.A05(enumC2183Ul);
            nt.A06(this.A0S);
            nt.A07(this.A0T);
            this.A0A = new C15926w(this.A0c, nt);
            this.A0A.A0S(new TA(this));
            this.A0A.A0W(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1Z(C2189Ur c2189Ur) {
        this.A0H = c2189Ur;
    }

    public final void A1a(EnumC2190Us enumC2190Us) {
        this.A0I = enumC2190Us;
    }

    public final void A1b(V6 v62) {
        if (!A0r()) {
            if (V6.A05.equals(v62)) {
                this.A0c.A0F().A3L(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0F().A3L(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = v62;
    }

    public final void A1c(AbstractC2601eW abstractC2601eW) {
        this.A0V = new WeakReference<>(abstractC2601eW);
    }

    public final void A1d(boolean z10) {
        this.A0W = z10;
    }

    public final void A1e(boolean z10) {
        this.A0X = z10;
    }

    public final void A1f(boolean z10, boolean z11) {
        String strA0W;
        if (z10) {
            if (this.A0E.equals(EnumC2183Ul.A05)) {
                boolean zA0r = A0r();
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!zA0r && this.A0G != null) {
                    this.A0G.AEB();
                }
            }
            if (this.A0R != null) {
                this.A0R.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            C2825iN c2825iNA0z = A0z();
            if (c2825iNA0z != null) {
                strA0W = c2825iNA0z.A0G();
            } else if (A0m[5].length() != 3) {
                String[] strArr2 = A0m;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                strA0W = A0W(0, 0, 121);
            } else {
                String[] strArr3 = A0m;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                strA0W = A0W(0, 0, 121);
            }
            this.A0e.A0C(this.A0c, strA0W);
            this.A0R.A0V();
        }
        if (this.A0G == null || !z11) {
            return;
        }
        V1 v1A01 = V1.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
        A12().A0F().A3F(XG.A01(this.A00), v1A01.A03().getErrorCode(), v1A01.A04());
        this.A0G.ADB(v1A01);
    }

    public final boolean A1g() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2195Ux
    public final int A7V() {
        View view = this.A06;
        if (!(view instanceof AdNativeComponentView)) {
            return -1;
        }
        View adContentsView = ((AdNativeComponentView) view).getAdContentsView();
        if (adContentsView instanceof C2542dY) {
            return ((C2542dY) adContentsView).getCurrentPosition();
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C2193Uv(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(13, 8, 68));
        if (U7.A1u(this.A0c)) {
            A12().A0B().AJj(this.A03);
        }
        if (!A0r()) {
            this.A0c.A0F().A3M();
        }
        if (this.A0A != null) {
            this.A0A.A0Y(true);
            this.A0A.A0K();
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC2183Ul.A05)) {
            this.A08 = EnumC1971Mc.A04;
        }
        this.A0E = EnumC2183Ul.A04;
        A0i(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C2187Up c2187UpA0E;
        if (this.A0a == null || (c2187UpA0E = this.A0a.A0E().A0E()) == null) {
            return 0.0f;
        }
        int width = c2187UpA0E.getWidth();
        int height = c2187UpA0E.getHeight();
        if (height <= 0) {
            return 0.0f;
        }
        float f10 = width;
        float f11 = height;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) == strArr[4].charAt(21)) {
            throw new RuntimeException();
        }
        A0m[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
        return f10 / f11;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (isAdLoaded()) {
            return this.A0h;
        }
        return null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        C2187Up c2187UpA0F;
        Bitmap bitmapA0N;
        if (this.A0a == null || (c2187UpA0F = A0F().A0F()) == null || (bitmapA0N = this.A0b.A0N(c2187UpA0F.getUrl())) == null) {
            return null;
        }
        return A05(A12(), bitmapA0N, A1g(), A1D());
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0a != null && this.A0a.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = true;
        if (this.A0A != null) {
            C15926w c15926w = this.A0A;
            String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            zA0A = c15926w.A0Z();
        } else if (this.A0B != null) {
            zA0A = this.A0B.A0A();
        }
        this.A0c.A0F().A5X(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0a != null && this.A0a.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        A1Y(EnumC2183Ul.A00(NativeAdBase.MediaCacheFlag.ALL), null, new SL(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        VF.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(21, 8, 17));
        ((C2193Uv) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A04 != null) {
            this.A04.post(new TB(this));
        }
        String str = A0W(164, 16, 48) + X7.A03(this.A0c, th2);
        A12().A0F().A3F(XG.A01(this.A00), 2001, str);
        if (this.A0G != null) {
            this.A0G.ADB(new V1(2001, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0o(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unregisterView() {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2072Qc.unregisterView():void");
    }
}
