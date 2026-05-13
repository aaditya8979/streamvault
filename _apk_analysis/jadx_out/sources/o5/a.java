package o5;

import a6.m;
import a6.t;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.h;
import n5.i;

/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f76121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f76122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f76123j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<n5.b> f76126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<n5.b> f76127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f76128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f76129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f76130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f76131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f76132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f76133t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f76135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f76116w = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f76117x = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f76118y = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f76119z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] B = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] C = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f76120g = new t();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<C0904a> f76124k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0904a f76125l = new C0904a(0, 4);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f76134u = 0;

    /* JADX INFO: renamed from: o5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    public static class C0904a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<C0905a> f76136a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<SpannableString> f76137b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f76138c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76142g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f76143h;

        /* JADX INFO: renamed from: o5.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        public static class C0905a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f76144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f76145b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f76146c;

            public C0905a(int i10, boolean z10, int i11) {
                this.f76144a = i10;
                this.f76145b = z10;
                this.f76146c = i11;
            }
        }

        public C0904a(int i10, int i11) {
            j(i10);
            m(i11);
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            this.f76138c.append(c10);
        }

        public void f() {
            int length = this.f76138c.length();
            if (length > 0) {
                this.f76138c.delete(length - 1, length);
                for (int size = this.f76136a.size() - 1; size >= 0; size--) {
                    C0905a c0905a = this.f76136a.get(size);
                    int i10 = c0905a.f76146c;
                    if (i10 != length) {
                        return;
                    }
                    c0905a.f76146c = i10 - 1;
                }
            }
        }

        public n5.b g(int i10) {
            float f10;
            int i11;
            int i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f76137b.size(); i13++) {
                spannableStringBuilder.append((CharSequence) this.f76137b.get(i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i14 = this.f76140e + this.f76141f;
            int length = (32 - i14) - spannableStringBuilder.length();
            int i15 = i14 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f76142g != 2 || (Math.abs(i15) >= 3 && length >= 0)) ? (this.f76142g != 2 || i15 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i14 = 32 - length;
                }
                f10 = ((i14 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            float f11 = f10;
            if (this.f76142g == 1 || (i11 = this.f76139d) > 7) {
                i11 = (this.f76139d - 15) - 2;
                i12 = 2;
            } else {
                i12 = 0;
            }
            return new n5.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i11, 1, i12, f11, i10, -3.4028235E38f);
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f76138c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f76136a.size()) {
                C0905a c0905a = this.f76136a.get(i10);
                boolean z11 = c0905a.f76145b;
                int i16 = c0905a.f76144a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.f76118y[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0905a.f76146c;
                i10++;
                if (i17 != (i10 < this.f76136a.size() ? this.f76136a.get(i10).f76146c : length)) {
                    if (i12 != -1 && !z11) {
                        q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                q(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f76136a.isEmpty() && this.f76137b.isEmpty() && this.f76138c.length() == 0;
        }

        public void j(int i10) {
            this.f76142g = i10;
            this.f76136a.clear();
            this.f76137b.clear();
            this.f76138c.setLength(0);
            this.f76139d = 15;
            this.f76140e = 0;
            this.f76141f = 0;
        }

        public void k() {
            this.f76137b.add(h());
            this.f76138c.setLength(0);
            this.f76136a.clear();
            int iMin = Math.min(this.f76143h, this.f76139d);
            while (this.f76137b.size() >= iMin) {
                this.f76137b.remove(0);
            }
        }

        public void l(int i10) {
            this.f76142g = i10;
        }

        public void m(int i10) {
            this.f76143h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f76136a.add(new C0905a(i10, z10, this.f76138c.length()));
        }
    }

    public a(String str, int i10) {
        this.f76121h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f76123j = 0;
            this.f76122i = 0;
        } else if (i10 == 2) {
            this.f76123j = 1;
            this.f76122i = 0;
        } else if (i10 == 3) {
            this.f76123j = 0;
            this.f76122i = 1;
        } else if (i10 != 4) {
            m.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f76123j = 0;
            this.f76122i = 0;
        } else {
            this.f76123j = 1;
            this.f76122i = 1;
        }
        G(0);
        F();
        this.f76135v = true;
    }

    public static boolean A(byte b10) {
        return (b10 & 247) == 20;
    }

    public static boolean B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean C(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean D(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char j(byte b10) {
        return (char) f76119z[(b10 & 127) - 32];
    }

    public static int k(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char m(byte b10) {
        return (char) B[b10 & 31];
    }

    public static char n(byte b10) {
        return (char) C[b10 & 31];
    }

    public static char o(byte b10, byte b11) {
        return (b10 & 1) == 0 ? m(b11) : n(b11);
    }

    public static char p(byte b10) {
        return (char) A[b10 & 15];
    }

    public static boolean t(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean u(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean v(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean w(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean x(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean y(byte b10) {
        return (b10 & 240) == 16;
    }

    public final void E(byte b10, byte b11) {
        if (D(b10)) {
            this.f76135v = false;
            return;
        }
        if (A(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f76135v = false;
                                break;
                        }
                }
            }
            this.f76135v = true;
        }
    }

    public final void F() {
        this.f76125l.j(this.f76128o);
        this.f76124k.clear();
        this.f76124k.add(this.f76125l);
    }

    public final void G(int i10) {
        int i11 = this.f76128o;
        if (i11 == i10) {
            return;
        }
        this.f76128o = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f76124k.size(); i12++) {
                this.f76124k.get(i12).l(i10);
            }
            return;
        }
        F();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f76126m = Collections.emptyList();
        }
    }

    public final void H(int i10) {
        this.f76129p = i10;
        this.f76125l.m(i10);
    }

    public final boolean I(byte b10) {
        if (t(b10)) {
            this.f76134u = k(b10);
        }
        return this.f76134u == this.f76123j;
    }

    @Override // o5.e
    public n5.e a() {
        List<n5.b> list = this.f76126m;
        this.f76127n = list;
        return new f(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // o5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(n5.h r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.a.b(n5.h):void");
    }

    @Override // o5.e
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ h dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // o5.e
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ i dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // o5.e
    public boolean e() {
        return this.f76126m != this.f76127n;
    }

    @Override // o5.e
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void queueInputBuffer(h hVar) throws SubtitleDecoderException {
        super.queueInputBuffer(hVar);
    }

    @Override // o5.e, i4.c
    public void flush() {
        super.flush();
        this.f76126m = null;
        this.f76127n = null;
        G(0);
        H(4);
        F();
        this.f76130q = false;
        this.f76131r = false;
        this.f76132s = (byte) 0;
        this.f76133t = (byte) 0;
        this.f76134u = 0;
        this.f76135v = true;
    }

    public final List<n5.b> l() {
        int size = this.f76124k.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            n5.b bVarG = this.f76124k.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f75133i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            n5.b bVarG2 = (n5.b) arrayList.get(i11);
            if (bVarG2 != null) {
                if (bVarG2.f75133i != iMin) {
                    bVarG2 = this.f76124k.get(i11).g(iMin);
                }
                arrayList2.add(bVarG2);
            }
        }
        return arrayList2;
    }

    public final void q(byte b10) {
        this.f76125l.e(' ');
        this.f76125l.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void r(byte b10) {
        if (b10 == 32) {
            G(2);
            return;
        }
        if (b10 == 41) {
            G(3);
            return;
        }
        switch (b10) {
            case 37:
                G(1);
                H(2);
                break;
            case 38:
                G(1);
                H(3);
                break;
            case 39:
                G(1);
                H(4);
                break;
            default:
                int i10 = this.f76128o;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f76126m = Collections.emptyList();
                                int i11 = this.f76128o;
                                if (i11 == 1 || i11 == 3) {
                                    F();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f76125l.i()) {
                                    this.f76125l.k();
                                    break;
                                }
                                break;
                            case 46:
                                F();
                                break;
                            case 47:
                                this.f76126m = l();
                                F();
                                break;
                        }
                    } else {
                        this.f76125l.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // o5.e, i4.c
    public void release() {
    }

    public final void s(byte b10, byte b11) {
        int i10 = f76116w[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f76125l.f76139d) {
            if (this.f76128o != 1 && !this.f76125l.i()) {
                C0904a c0904a = new C0904a(this.f76128o, this.f76129p);
                this.f76125l = c0904a;
                this.f76124k.add(c0904a);
            }
            this.f76125l.f76139d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f76125l.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f76125l.f76140e = f76117x[i11];
        }
    }

    @Override // o5.e, n5.f
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public final boolean z(boolean z10, byte b10, byte b11) {
        if (!z10 || !y(b10)) {
            this.f76131r = false;
        } else {
            if (this.f76131r && this.f76132s == b10 && this.f76133t == b11) {
                this.f76131r = false;
                return true;
            }
            this.f76131r = true;
            this.f76132s = b10;
            this.f76133t = b11;
        }
        return false;
    }
}
