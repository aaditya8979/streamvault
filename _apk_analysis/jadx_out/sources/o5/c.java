package o5;

import a6.m;
import a6.s;
import a6.t;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.h;
import n5.i;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f76148g = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f76149h = new s();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f76150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a[] f76151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f76152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<n5.b> f76153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<n5.b> f76154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f76155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f76156o;

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f76157w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f76158x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f76159y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f76160z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<SpannableString> f76161a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f76162b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f76164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f76166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f76168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f76169i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f76170j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f76171k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f76172l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f76173m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f76174n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f76175o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f76176p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f76177q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f76178r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f76179s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f76180t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f76181u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f76182v;

        static {
            int iH = h(0, 0, 0, 0);
            f76158x = iH;
            int iH2 = h(0, 0, 0, 3);
            f76159y = iH2;
            f76160z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public a() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                a6.a.c(r4, r0, r1)
                a6.a.c(r5, r0, r1)
                a6.a.c(r6, r0, r1)
                a6.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.c.a.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f76162b.append(c10);
                return;
            }
            this.f76161a.add(d());
            this.f76162b.clear();
            if (this.f76176p != -1) {
                this.f76176p = 0;
            }
            if (this.f76177q != -1) {
                this.f76177q = 0;
            }
            if (this.f76178r != -1) {
                this.f76178r = 0;
            }
            if (this.f76180t != -1) {
                this.f76180t = 0;
            }
            while (true) {
                if ((!this.f76171k || this.f76161a.size() < this.f76170j) && this.f76161a.size() < 15) {
                    return;
                } else {
                    this.f76161a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f76162b.length();
            if (length > 0) {
                this.f76162b.delete(length - 1, length);
            }
        }

        public o5.b c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f76161a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f76161a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f76172l;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f76172l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f76166f) {
                f10 = this.f76168h / 99.0f;
                f11 = this.f76167g / 99.0f;
            } else {
                f10 = this.f76168h / 209.0f;
                f11 = this.f76167g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f76169i;
            return new o5.b(spannableStringBuilder, alignment2, f13, 0, i12 % 3 == 0 ? 0 : i12 % 3 == 1 ? 1 : 2, f12, i12 / 3 == 0 ? 0 : i12 / 3 == 1 ? 1 : 2, -3.4028235E38f, this.f76175o != f76158x, this.f76175o, this.f76165e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f76162b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f76176p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f76176p, length, 33);
                }
                if (this.f76177q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f76177q, length, 33);
                }
                if (this.f76178r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f76179s), this.f76178r, length, 33);
                }
                if (this.f76180t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f76181u), this.f76180t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f76161a.clear();
            this.f76162b.clear();
            this.f76176p = -1;
            this.f76177q = -1;
            this.f76178r = -1;
            this.f76180t = -1;
            this.f76182v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f76163c = true;
            this.f76164d = z10;
            this.f76171k = z11;
            this.f76165e = i10;
            this.f76166f = z13;
            this.f76167g = i11;
            this.f76168h = i12;
            this.f76169i = i15;
            int i18 = i13 + 1;
            if (this.f76170j != i18) {
                this.f76170j = i18;
                while (true) {
                    if ((!z11 || this.f76161a.size() < this.f76170j) && this.f76161a.size() < 15) {
                        break;
                    } else {
                        this.f76161a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f76173m != i16) {
                this.f76173m = i16;
                int i19 = i16 - 1;
                q(D[i19], f76159y, C[i19], 0, A[i19], B[i19], f76160z[i19]);
            }
            if (i17 == 0 || this.f76174n == i17) {
                return;
            }
            this.f76174n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f76157w, G[i20], f76158x);
        }

        public boolean i() {
            return this.f76163c;
        }

        public boolean j() {
            return !i() || (this.f76161a.isEmpty() && this.f76162b.length() == 0);
        }

        public boolean k() {
            return this.f76164d;
        }

        public void l() {
            e();
            this.f76163c = false;
            this.f76164d = false;
            this.f76165e = 4;
            this.f76166f = false;
            this.f76167g = 0;
            this.f76168h = 0;
            this.f76169i = 0;
            this.f76170j = 15;
            this.f76171k = true;
            this.f76172l = 0;
            this.f76173m = 0;
            this.f76174n = 0;
            int i10 = f76158x;
            this.f76175o = i10;
            this.f76179s = f76157w;
            this.f76181u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f76176p != -1) {
                if (!z10) {
                    this.f76162b.setSpan(new StyleSpan(2), this.f76176p, this.f76162b.length(), 33);
                    this.f76176p = -1;
                }
            } else if (z10) {
                this.f76176p = this.f76162b.length();
            }
            if (this.f76177q == -1) {
                if (z11) {
                    this.f76177q = this.f76162b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f76162b.setSpan(new UnderlineSpan(), this.f76177q, this.f76162b.length(), 33);
                this.f76177q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f76178r != -1 && this.f76179s != i10) {
                this.f76162b.setSpan(new ForegroundColorSpan(this.f76179s), this.f76178r, this.f76162b.length(), 33);
            }
            if (i10 != f76157w) {
                this.f76178r = this.f76162b.length();
                this.f76179s = i10;
            }
            if (this.f76180t != -1 && this.f76181u != i11) {
                this.f76162b.setSpan(new BackgroundColorSpan(this.f76181u), this.f76180t, this.f76162b.length(), 33);
            }
            if (i11 != f76158x) {
                this.f76180t = this.f76162b.length();
                this.f76181u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f76182v != i10) {
                a('\n');
            }
            this.f76182v = i10;
        }

        public void p(boolean z10) {
            this.f76164d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f76175o = i10;
            this.f76172l = i15;
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f76185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76186d = 0;

        public b(int i10, int i11) {
            this.f76183a = i10;
            this.f76184b = i11;
            this.f76185c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, @Nullable List<byte[]> list) {
        this.f76150i = i10 == -1 ? 1 : i10;
        this.f76151j = new a[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f76151j[i11] = new a();
        }
        this.f76152k = this.f76151j[0];
        y();
    }

    @Override // o5.e
    public n5.e a() {
        List<n5.b> list = this.f76153l;
        this.f76154m = list;
        return new f(list);
    }

    @Override // o5.e
    public void b(h hVar) {
        this.f76148g.J(hVar.f63711c.array(), hVar.f63711c.limit());
        while (this.f76148g.a() >= 3) {
            int iY = this.f76148g.y() & 7;
            int i10 = iY & 3;
            boolean z10 = (iY & 4) == 4;
            byte bY = (byte) this.f76148g.y();
            byte bY2 = (byte) this.f76148g.y();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (bY & 192) >> 6;
                        int i12 = bY & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        b bVar = new b(i11, i12);
                        this.f76155n = bVar;
                        byte[] bArr = bVar.f76185c;
                        int i13 = bVar.f76186d;
                        bVar.f76186d = i13 + 1;
                        bArr[i13] = bY2;
                    } else {
                        a6.a.a(i10 == 2);
                        b bVar2 = this.f76155n;
                        if (bVar2 == null) {
                            m.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = bVar2.f76185c;
                            int i14 = bVar2.f76186d;
                            int i15 = i14 + 1;
                            bArr2[i14] = bY;
                            bVar2.f76186d = i15 + 1;
                            bArr2[i15] = bY2;
                        }
                    }
                    b bVar3 = this.f76155n;
                    if (bVar3.f76186d == (bVar3.f76184b * 2) - 1) {
                        i();
                    }
                }
            }
        }
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
        return this.f76153l != this.f76154m;
    }

    @Override // o5.e
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void queueInputBuffer(h hVar) throws SubtitleDecoderException {
        super.queueInputBuffer(hVar);
    }

    @Override // o5.e, i4.c
    public void flush() {
        super.flush();
        this.f76153l = null;
        this.f76154m = null;
        this.f76156o = 0;
        this.f76152k = this.f76151j[0];
        y();
        this.f76155n = null;
    }

    public final void i() {
        if (this.f76155n == null) {
            return;
        }
        x();
        this.f76155n = null;
    }

    public final List<n5.b> j() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f76151j[i10].j() && this.f76151j[i10].k()) {
                arrayList.add(this.f76151j[i10].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    public final void k(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f76153l = j();
            }
            if (i10 == 8) {
                this.f76152k.b();
                return;
            }
            switch (i10) {
                case 12:
                    y();
                    break;
                case 13:
                    this.f76152k.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        m.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f76149h.q(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        m.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f76149h.q(16);
                    } else {
                        m.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void l(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case MRAID_JS_WRITE_FAILED_VALUE:
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f76156o != i12) {
                    this.f76156o = i12;
                    this.f76152k = this.f76151j[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f76149h.g()) {
                        this.f76151j[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f76149h.g()) {
                        this.f76151j[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f76149h.g()) {
                        this.f76151j[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f76149h.g()) {
                        this.f76151j[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f76149h.g()) {
                        this.f76151j[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f76149h.q(8);
                break;
            case 142:
                break;
            case 143:
                y();
                break;
            case 144:
                if (this.f76152k.i()) {
                    t();
                } else {
                    this.f76149h.q(16);
                }
                break;
            case 145:
                if (this.f76152k.i()) {
                    u();
                } else {
                    this.f76149h.q(24);
                }
                break;
            case 146:
                if (this.f76152k.i()) {
                    v();
                } else {
                    this.f76149h.q(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case TextFieldImplKt.AnimationDuration /* 150 */:
            default:
                m.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f76152k.i()) {
                    w();
                } else {
                    this.f76149h.q(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                o(i15);
                if (this.f76156o != i15) {
                    this.f76156o = i15;
                    this.f76152k = this.f76151j[i15];
                }
                break;
        }
    }

    public final void m(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f76149h.q(8);
        } else if (i10 <= 23) {
            this.f76149h.q(16);
        } else if (i10 <= 31) {
            this.f76149h.q(24);
        }
    }

    public final void n(int i10) {
        if (i10 <= 135) {
            this.f76149h.q(32);
            return;
        }
        if (i10 <= 143) {
            this.f76149h.q(40);
        } else if (i10 <= 159) {
            this.f76149h.q(2);
            this.f76149h.q(this.f76149h.h(6) * 8);
        }
    }

    public final void o(int i10) {
        a aVar = this.f76151j[i10];
        this.f76149h.q(2);
        boolean zG = this.f76149h.g();
        boolean zG2 = this.f76149h.g();
        boolean zG3 = this.f76149h.g();
        int iH = this.f76149h.h(3);
        boolean zG4 = this.f76149h.g();
        int iH2 = this.f76149h.h(7);
        int iH3 = this.f76149h.h(8);
        int iH4 = this.f76149h.h(4);
        int iH5 = this.f76149h.h(4);
        this.f76149h.q(2);
        int iH6 = this.f76149h.h(6);
        this.f76149h.q(2);
        aVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f76149h.h(3), this.f76149h.h(3));
    }

    public final void p(int i10) {
        if (i10 == 127) {
            this.f76152k.a((char) 9835);
        } else {
            this.f76152k.a((char) (i10 & 255));
        }
    }

    public final void q(int i10) {
        this.f76152k.a((char) (i10 & 255));
    }

    public final void r(int i10) {
        if (i10 == 32) {
            this.f76152k.a(' ');
        }
        if (i10 == 33) {
            this.f76152k.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f76152k.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f76152k.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f76152k.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f76152k.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f76152k.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f76152k.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f76152k.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f76152k.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f76152k.a((char) 9608);
                break;
            case 49:
                this.f76152k.a((char) 8216);
                break;
            case 50:
                this.f76152k.a((char) 8217);
                break;
            case 51:
                this.f76152k.a((char) 8220);
                break;
            case 52:
                this.f76152k.a((char) 8221);
                break;
            case 53:
                this.f76152k.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f76152k.a((char) 8539);
                        break;
                    case 119:
                        this.f76152k.a((char) 8540);
                        break;
                    case 120:
                        this.f76152k.a((char) 8541);
                        break;
                    case 121:
                        this.f76152k.a((char) 8542);
                        break;
                    case 122:
                        this.f76152k.a((char) 9474);
                        break;
                    case 123:
                        this.f76152k.a((char) 9488);
                        break;
                    case 124:
                        this.f76152k.a((char) 9492);
                        break;
                    case 125:
                        this.f76152k.a((char) 9472);
                        break;
                    case 126:
                        this.f76152k.a((char) 9496);
                        break;
                    case 127:
                        this.f76152k.a((char) 9484);
                        break;
                    default:
                        m.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    @Override // o5.e, i4.c
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i10) {
        if (i10 == 160) {
            this.f76152k.a((char) 13252);
            return;
        }
        m.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f76152k.a('_');
    }

    @Override // o5.e, n5.f
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public final void t() {
        this.f76152k.m(this.f76149h.h(4), this.f76149h.h(2), this.f76149h.h(2), this.f76149h.g(), this.f76149h.g(), this.f76149h.h(3), this.f76149h.h(3));
    }

    public final void u() {
        int iH = a.h(this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2));
        int iH2 = a.h(this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2));
        this.f76149h.q(2);
        this.f76152k.n(iH, iH2, a.g(this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2)));
    }

    public final void v() {
        this.f76149h.q(4);
        int iH = this.f76149h.h(4);
        this.f76149h.q(2);
        this.f76152k.o(iH, this.f76149h.h(6));
    }

    public final void w() {
        int iH = a.h(this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2));
        int iH2 = this.f76149h.h(2);
        int iG = a.g(this.f76149h.h(2), this.f76149h.h(2), this.f76149h.h(2));
        if (this.f76149h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f76149h.g();
        int iH3 = this.f76149h.h(2);
        int iH4 = this.f76149h.h(2);
        int iH5 = this.f76149h.h(2);
        this.f76149h.q(8);
        this.f76152k.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void x() {
        b bVar = this.f76155n;
        int i10 = bVar.f76186d;
        if (i10 != (bVar.f76184b * 2) - 1) {
            m.h("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f76155n.f76184b * 2) - 1) + ", but current index is " + this.f76155n.f76186d + " (sequence number " + this.f76155n.f76183a + "); ignoring packet");
            return;
        }
        this.f76149h.n(bVar.f76185c, i10);
        int iH = this.f76149h.h(3);
        int iH2 = this.f76149h.h(5);
        if (iH == 7) {
            this.f76149h.q(2);
            iH = this.f76149h.h(6);
            if (iH < 7) {
                m.h("Cea708Decoder", "Invalid extended service number: " + iH);
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                m.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iH != this.f76150i) {
            return;
        }
        boolean z10 = false;
        while (this.f76149h.b() > 0) {
            int iH3 = this.f76149h.h(8);
            if (iH3 == 16) {
                int iH4 = this.f76149h.h(8);
                if (iH4 <= 31) {
                    m(iH4);
                } else {
                    if (iH4 <= 127) {
                        r(iH4);
                    } else if (iH4 <= 159) {
                        n(iH4);
                    } else if (iH4 <= 255) {
                        s(iH4);
                    } else {
                        m.h("Cea708Decoder", "Invalid extended command: " + iH4);
                    }
                    z10 = true;
                }
            } else if (iH3 <= 31) {
                k(iH3);
            } else {
                if (iH3 <= 127) {
                    p(iH3);
                } else if (iH3 <= 159) {
                    l(iH3);
                } else if (iH3 <= 255) {
                    q(iH3);
                } else {
                    m.h("Cea708Decoder", "Invalid base command: " + iH3);
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f76153l = j();
        }
    }

    public final void y() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f76151j[i10].l();
        }
    }
}
