package h7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.vungle.ads.internal.protos.Sdk;
import g7.b;
import g7.i;
import g7.m;
import g7.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f63015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f63016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f63017k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public List<g7.b> f63020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public List<g7.b> f63021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f63022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f63023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f63024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f63025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f63026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f63027u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f63029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f63030x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f63011y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f63012z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f63013g = new a0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<C0777a> f63018l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0777a f63019m = new C0777a(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f63028v = 0;

    /* JADX INFO: renamed from: h7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    public static final class C0777a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<C0778a> f63031a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<SpannableString> f63032b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f63033c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f63034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f63035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f63036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f63037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f63038h;

        /* JADX INFO: renamed from: h7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        public static class C0778a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f63040b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f63041c;

            public C0778a(int i10, boolean z10, int i11) {
                this.f63039a = i10;
                this.f63040b = z10;
                this.f63041c = i11;
            }
        }

        public C0777a(int i10, int i11) {
            j(i10);
            this.f63038h = i11;
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
            if (this.f63033c.length() < 32) {
                this.f63033c.append(c10);
            }
        }

        public void f() {
            int length = this.f63033c.length();
            if (length > 0) {
                this.f63033c.delete(length - 1, length);
                for (int size = this.f63031a.size() - 1; size >= 0; size--) {
                    C0778a c0778a = this.f63031a.get(size);
                    int i10 = c0778a.f63041c;
                    if (i10 != length) {
                        return;
                    }
                    c0778a.f63041c = i10 - 1;
                }
            }
        }

        @Nullable
        public g7.b g(int i10) {
            float f10;
            int i11 = this.f63035e + this.f63036f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f63032b.size(); i13++) {
                spannableStringBuilder.append(m0.P0(this.f63032b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m0.P0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f63037g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f63037g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f63034d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f63037g == 1) {
                i15 -= this.f63038h - 1;
            }
            return new b.C0768b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i15, 1).k(f10).l(i10).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f63033c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f63031a.size()) {
                C0778a c0778a = this.f63031a.get(i10);
                boolean z11 = c0778a.f63040b;
                int i16 = c0778a.f63039a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0778a.f63041c;
                i10++;
                if (i17 != (i10 < this.f63031a.size() ? this.f63031a.get(i10).f63041c : length)) {
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
            return this.f63031a.isEmpty() && this.f63032b.isEmpty() && this.f63033c.length() == 0;
        }

        public void j(int i10) {
            this.f63037g = i10;
            this.f63031a.clear();
            this.f63032b.clear();
            this.f63033c.setLength(0);
            this.f63034d = 15;
            this.f63035e = 0;
            this.f63036f = 0;
        }

        public void k() {
            this.f63032b.add(h());
            this.f63033c.setLength(0);
            this.f63031a.clear();
            int iMin = Math.min(this.f63038h, this.f63034d);
            while (this.f63032b.size() >= iMin) {
                this.f63032b.remove(0);
            }
        }

        public void l(int i10) {
            this.f63037g = i10;
        }

        public void m(int i10) {
            this.f63038h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f63031a.add(new C0778a(i10, z10, this.f63033c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f63017k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f63014h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f63016j = 0;
            this.f63015i = 0;
        } else if (i10 == 2) {
            this.f63016j = 1;
            this.f63015i = 0;
        } else if (i10 == 3) {
            this.f63016j = 0;
            this.f63015i = 1;
        } else if (i10 != 4) {
            q.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f63016j = 0;
            this.f63015i = 0;
        } else {
            this.f63016j = 1;
            this.f63015i = 1;
        }
        I(0);
        H();
        this.f63029w = true;
        this.f63030x = -9223372036854775807L;
    }

    public static boolean A(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean C(byte b10) {
        return (b10 & 246) == 20;
    }

    public static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean E(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean F(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char l(byte b10) {
        return (char) B[(b10 & 127) - 32];
    }

    public static int m(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char o(byte b10) {
        return (char) D[b10 & 31];
    }

    public static char p(byte b10) {
        return (char) E[b10 & 31];
    }

    public static char q(byte b10, byte b11) {
        return (b10 & 1) == 0 ? o(b11) : p(b11);
    }

    public static char r(byte b10) {
        return (char) C[b10 & 15];
    }

    public static boolean v(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean w(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean x(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean y(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean z(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public final boolean B(boolean z10, byte b10, byte b11) {
        if (!z10 || !A(b10)) {
            this.f63025s = false;
        } else {
            if (this.f63025s && this.f63026t == b10 && this.f63027u == b11) {
                this.f63025s = false;
                return true;
            }
            this.f63025s = true;
            this.f63026t = b10;
            this.f63027u = b11;
        }
        return false;
    }

    public final void G(byte b10, byte b11) {
        if (F(b10)) {
            this.f63029w = false;
            return;
        }
        if (C(b10)) {
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
                                this.f63029w = false;
                                break;
                        }
                }
            }
            this.f63029w = true;
        }
    }

    public final void H() {
        this.f63019m.j(this.f63022p);
        this.f63018l.clear();
        this.f63018l.add(this.f63019m);
    }

    public final void I(int i10) {
        int i11 = this.f63022p;
        if (i11 == i10) {
            return;
        }
        this.f63022p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f63018l.size(); i12++) {
                this.f63018l.get(i12).l(i10);
            }
            return;
        }
        H();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f63020n = Collections.emptyList();
        }
    }

    public final void J(int i10) {
        this.f63023q = i10;
        this.f63019m.m(i10);
    }

    public final boolean K() {
        return (this.f63017k == -9223372036854775807L || this.f63030x == -9223372036854775807L || f() - this.f63030x < this.f63017k) ? false : true;
    }

    public final boolean L(byte b10) {
        if (v(b10)) {
            this.f63028v = m(b10);
        }
        return this.f63028v == this.f63016j;
    }

    @Override // h7.e
    public i a() {
        List<g7.b> list = this.f63020n;
        this.f63021o = list;
        return new f((List) s7.a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // h7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(g7.m r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.b(g7.m):void");
    }

    @Override // h7.e
    @Nullable
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ m dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // h7.e, g6.d
    @Nullable
    /* JADX INFO: renamed from: d */
    public n dequeueOutputBuffer() throws SubtitleDecoderException {
        n nVarE;
        n nVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (nVarDequeueOutputBuffer != null) {
            return nVarDequeueOutputBuffer;
        }
        if (!K() || (nVarE = e()) == null) {
            return null;
        }
        this.f63020n = Collections.emptyList();
        this.f63030x = -9223372036854775807L;
        nVarE.m(f(), a(), Long.MAX_VALUE);
        return nVarE;
    }

    @Override // h7.e, g6.d
    public void flush() {
        super.flush();
        this.f63020n = null;
        this.f63021o = null;
        I(0);
        J(4);
        H();
        this.f63024r = false;
        this.f63025s = false;
        this.f63026t = (byte) 0;
        this.f63027u = (byte) 0;
        this.f63028v = 0;
        this.f63029w = true;
        this.f63030x = -9223372036854775807L;
    }

    @Override // h7.e
    public boolean g() {
        return this.f63020n != this.f63021o;
    }

    @Override // h7.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void queueInputBuffer(m mVar) throws SubtitleDecoderException {
        super.queueInputBuffer(mVar);
    }

    public final List<g7.b> n() {
        int size = this.f63018l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            g7.b bVarG = this.f63018l.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f62145j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            g7.b bVar = (g7.b) arrayList.get(i11);
            if (bVar != null) {
                if (bVar.f62145j != iMin) {
                    bVar = (g7.b) s7.a.e(this.f63018l.get(i11).g(iMin));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    @Override // h7.e, g6.d
    public void release() {
    }

    public final void s(byte b10) {
        this.f63019m.e(' ');
        this.f63019m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    @Override // h7.e, g7.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public final void t(byte b10) {
        if (b10 == 32) {
            I(2);
            return;
        }
        if (b10 == 41) {
            I(3);
            return;
        }
        switch (b10) {
            case 37:
                I(1);
                J(2);
                break;
            case 38:
                I(1);
                J(3);
                break;
            case 39:
                I(1);
                J(4);
                break;
            default:
                int i10 = this.f63022p;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f63020n = Collections.emptyList();
                                int i11 = this.f63022p;
                                if (i11 == 1 || i11 == 3) {
                                    H();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f63019m.i()) {
                                    this.f63019m.k();
                                    break;
                                }
                                break;
                            case 46:
                                H();
                                break;
                            case 47:
                                this.f63020n = n();
                                H();
                                break;
                        }
                    } else {
                        this.f63019m.f();
                        break;
                    }
                }
                break;
        }
    }

    public final void u(byte b10, byte b11) {
        int i10 = f63011y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f63019m.f63034d) {
            if (this.f63022p != 1 && !this.f63019m.i()) {
                C0777a c0777a = new C0777a(this.f63022p, this.f63023q);
                this.f63019m = c0777a;
                this.f63018l.add(c0777a);
            }
            this.f63019m.f63034d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f63019m.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f63019m.f63035e = f63012z[i11];
        }
    }
}
