package h7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g7.b;
import g7.i;
import g7.m;
import g7.n;
import h7.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s7.a0;
import s7.q;
import s7.z;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f63042g = new a0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f63043h = new z();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63044i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f63046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b[] f63047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f63048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public List<g7.b> f63049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public List<g7.b> f63050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public C0779c f63051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f63052q;

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Comparator<a> f63053c = new Comparator() { // from class: h7.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.c((c.a) obj, (c.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g7.b f63054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63055b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0768b c0768bN = new b.C0768b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                c0768bN.s(i13);
            }
            this.f63054a = c0768bN.a();
            this.f63055b = i14;
        }

        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f63055b, aVar.f63055b);
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f63056w = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f63057x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f63058y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f63059z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<SpannableString> f63060a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f63061b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f63062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f63063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f63064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f63065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f63066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f63067h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f63068i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f63069j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f63070k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f63071l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f63072m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f63073n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f63074o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f63075p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f63076q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f63077r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f63078s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f63079t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f63080u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f63081v;

        static {
            int iH = h(0, 0, 0, 0);
            f63057x = iH;
            int iH2 = h(0, 0, 0, 3);
            f63058y = iH2;
            f63059z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
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
                s7.a.c(r4, r0, r1)
                s7.a.c(r5, r0, r1)
                s7.a.c(r6, r0, r1)
                s7.a.c(r7, r0, r1)
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
            throw new UnsupportedOperationException("Method not decompiled: h7.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f63061b.append(c10);
                return;
            }
            this.f63060a.add(d());
            this.f63061b.clear();
            if (this.f63075p != -1) {
                this.f63075p = 0;
            }
            if (this.f63076q != -1) {
                this.f63076q = 0;
            }
            if (this.f63077r != -1) {
                this.f63077r = 0;
            }
            if (this.f63079t != -1) {
                this.f63079t = 0;
            }
            while (true) {
                if ((!this.f63070k || this.f63060a.size() < this.f63069j) && this.f63060a.size() < 15) {
                    return;
                } else {
                    this.f63060a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f63061b.length();
            if (length > 0) {
                this.f63061b.delete(length - 1, length);
            }
        }

        @Nullable
        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f63060a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f63060a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f63071l;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f63071l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f63065f) {
                f10 = this.f63067h / 99.0f;
                f11 = this.f63066g / 99.0f;
            } else {
                f10 = this.f63067h / 209.0f;
                f11 = this.f63066g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i12 = this.f63068i;
            return new a(spannableStringBuilder, alignment2, f13, 0, i12 / 3 == 0 ? 0 : i12 / 3 == 1 ? 1 : 2, f12, i12 % 3 == 0 ? 0 : i12 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f63074o != f63057x, this.f63074o, this.f63064e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f63061b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f63075p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f63075p, length, 33);
                }
                if (this.f63076q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f63076q, length, 33);
                }
                if (this.f63077r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f63078s), this.f63077r, length, 33);
                }
                if (this.f63079t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f63080u), this.f63079t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f63060a.clear();
            this.f63061b.clear();
            this.f63075p = -1;
            this.f63076q = -1;
            this.f63077r = -1;
            this.f63079t = -1;
            this.f63081v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f63062c = true;
            this.f63063d = z10;
            this.f63070k = z11;
            this.f63064e = i10;
            this.f63065f = z13;
            this.f63066g = i11;
            this.f63067h = i12;
            this.f63068i = i15;
            int i18 = i13 + 1;
            if (this.f63069j != i18) {
                this.f63069j = i18;
                while (true) {
                    if ((!z11 || this.f63060a.size() < this.f63069j) && this.f63060a.size() < 15) {
                        break;
                    } else {
                        this.f63060a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f63072m != i16) {
                this.f63072m = i16;
                int i19 = i16 - 1;
                q(D[i19], f63058y, C[i19], 0, A[i19], B[i19], f63059z[i19]);
            }
            if (i17 == 0 || this.f63073n == i17) {
                return;
            }
            this.f63073n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, F[i20], E[i20]);
            n(f63056w, G[i20], f63057x);
        }

        public boolean i() {
            return this.f63062c;
        }

        public boolean j() {
            return !i() || (this.f63060a.isEmpty() && this.f63061b.length() == 0);
        }

        public boolean k() {
            return this.f63063d;
        }

        public void l() {
            e();
            this.f63062c = false;
            this.f63063d = false;
            this.f63064e = 4;
            this.f63065f = false;
            this.f63066g = 0;
            this.f63067h = 0;
            this.f63068i = 0;
            this.f63069j = 15;
            this.f63070k = true;
            this.f63071l = 0;
            this.f63072m = 0;
            this.f63073n = 0;
            int i10 = f63057x;
            this.f63074o = i10;
            this.f63078s = f63056w;
            this.f63080u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f63075p != -1) {
                if (!z10) {
                    this.f63061b.setSpan(new StyleSpan(2), this.f63075p, this.f63061b.length(), 33);
                    this.f63075p = -1;
                }
            } else if (z10) {
                this.f63075p = this.f63061b.length();
            }
            if (this.f63076q == -1) {
                if (z11) {
                    this.f63076q = this.f63061b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f63061b.setSpan(new UnderlineSpan(), this.f63076q, this.f63061b.length(), 33);
                this.f63076q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f63077r != -1 && this.f63078s != i10) {
                this.f63061b.setSpan(new ForegroundColorSpan(this.f63078s), this.f63077r, this.f63061b.length(), 33);
            }
            if (i10 != f63056w) {
                this.f63077r = this.f63061b.length();
                this.f63078s = i10;
            }
            if (this.f63079t != -1 && this.f63080u != i11) {
                this.f63061b.setSpan(new BackgroundColorSpan(this.f63080u), this.f63079t, this.f63061b.length(), 33);
            }
            if (i11 != f63057x) {
                this.f63079t = this.f63061b.length();
                this.f63080u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f63081v != i10) {
                a('\n');
            }
            this.f63081v = i10;
        }

        public void p(boolean z10) {
            this.f63063d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f63074o = i10;
            this.f63071l = i15;
        }
    }

    /* JADX INFO: renamed from: h7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class C0779c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f63084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f63085d = 0;

        public C0779c(int i10, int i11) {
            this.f63082a = i10;
            this.f63083b = i11;
            this.f63084c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, @Nullable List<byte[]> list) {
        this.f63046k = i10 == -1 ? 1 : i10;
        this.f63045j = list != null && s7.e.f(list);
        this.f63047l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f63047l[i11] = new b();
        }
        this.f63048m = this.f63047l[0];
    }

    public final void A() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f63047l[i10].l();
        }
    }

    @Override // h7.e
    public i a() {
        List<g7.b> list = this.f63049n;
        this.f63050o = list;
        return new f((List) s7.a.e(list));
    }

    @Override // h7.e
    public void b(m mVar) {
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.e(mVar.f21430d);
        this.f63042g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.f63042g.a() >= 3) {
            int iD = this.f63042g.D() & 7;
            int i10 = iD & 3;
            boolean z10 = (iD & 4) == 4;
            byte bD = (byte) this.f63042g.D();
            byte bD2 = (byte) this.f63042g.D();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        k();
                        int i11 = (bD & 192) >> 6;
                        int i12 = this.f63044i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            A();
                            q.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f63044i + " current=" + i11);
                        }
                        this.f63044i = i11;
                        int i13 = bD & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0779c c0779c = new C0779c(i11, i13);
                        this.f63051p = c0779c;
                        byte[] bArr = c0779c.f63084c;
                        int i14 = c0779c.f63085d;
                        c0779c.f63085d = i14 + 1;
                        bArr[i14] = bD2;
                    } else {
                        s7.a.a(i10 == 2);
                        C0779c c0779c2 = this.f63051p;
                        if (c0779c2 == null) {
                            q.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0779c2.f63084c;
                            int i15 = c0779c2.f63085d;
                            int i16 = i15 + 1;
                            bArr2[i15] = bD;
                            c0779c2.f63085d = i16 + 1;
                            bArr2[i16] = bD2;
                        }
                    }
                    C0779c c0779c3 = this.f63051p;
                    if (c0779c3.f63085d == (c0779c3.f63083b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // h7.e
    @Nullable
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ m dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // h7.e
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ n dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // h7.e, g6.d
    public void flush() {
        super.flush();
        this.f63049n = null;
        this.f63050o = null;
        this.f63052q = 0;
        this.f63048m = this.f63047l[0];
        A();
        this.f63051p = null;
    }

    @Override // h7.e
    public boolean g() {
        return this.f63049n != this.f63050o;
    }

    @Override // h7.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void queueInputBuffer(m mVar) throws SubtitleDecoderException {
        super.queueInputBuffer(mVar);
    }

    public final void k() {
        if (this.f63051p == null) {
            return;
        }
        z();
        this.f63051p = null;
    }

    public final List<g7.b> l() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f63047l[i10].j() && this.f63047l[i10].k() && (aVarC = this.f63047l[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f63053c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f63054a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void m(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f63049n = l();
            }
            if (i10 == 8) {
                this.f63048m.b();
                return;
            }
            switch (i10) {
                case 12:
                    A();
                    break;
                case 13:
                    this.f63048m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        q.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f63043h.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        q.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f63043h.r(16);
                    } else {
                        q.i("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void n(int i10) {
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
                if (this.f63052q != i12) {
                    this.f63052q = i12;
                    this.f63048m = this.f63047l[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f63043h.g()) {
                        this.f63047l[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case TPAT_RETRY_FAILED_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f63043h.g()) {
                        this.f63047l[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f63043h.g()) {
                        this.f63047l[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f63043h.g()) {
                        this.f63047l[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f63043h.g()) {
                        this.f63047l[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f63043h.r(8);
                break;
            case 142:
                break;
            case 143:
                A();
                break;
            case 144:
                if (this.f63048m.i()) {
                    v();
                } else {
                    this.f63043h.r(16);
                }
                break;
            case 145:
                if (this.f63048m.i()) {
                    w();
                } else {
                    this.f63043h.r(24);
                }
                break;
            case 146:
                if (this.f63048m.i()) {
                    x();
                } else {
                    this.f63043h.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case TextFieldImplKt.AnimationDuration /* 150 */:
            default:
                q.i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f63048m.i()) {
                    y();
                } else {
                    this.f63043h.r(32);
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
                q(i15);
                if (this.f63052q != i15) {
                    this.f63052q = i15;
                    this.f63048m = this.f63047l[i15];
                }
                break;
        }
    }

    public final void o(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f63043h.r(8);
        } else if (i10 <= 23) {
            this.f63043h.r(16);
        } else if (i10 <= 31) {
            this.f63043h.r(24);
        }
    }

    public final void p(int i10) {
        if (i10 <= 135) {
            this.f63043h.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f63043h.r(40);
        } else if (i10 <= 159) {
            this.f63043h.r(2);
            this.f63043h.r(this.f63043h.h(6) * 8);
        }
    }

    public final void q(int i10) {
        b bVar = this.f63047l[i10];
        this.f63043h.r(2);
        boolean zG = this.f63043h.g();
        boolean zG2 = this.f63043h.g();
        boolean zG3 = this.f63043h.g();
        int iH = this.f63043h.h(3);
        boolean zG4 = this.f63043h.g();
        int iH2 = this.f63043h.h(7);
        int iH3 = this.f63043h.h(8);
        int iH4 = this.f63043h.h(4);
        int iH5 = this.f63043h.h(4);
        this.f63043h.r(2);
        int iH6 = this.f63043h.h(6);
        this.f63043h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f63043h.h(3), this.f63043h.h(3));
    }

    public final void r(int i10) {
        if (i10 == 127) {
            this.f63048m.a((char) 9835);
        } else {
            this.f63048m.a((char) (i10 & 255));
        }
    }

    @Override // h7.e, g6.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i10) {
        this.f63048m.a((char) (i10 & 255));
    }

    @Override // h7.e, g7.j
    public /* bridge */ /* synthetic */ void setPositionUs(long j10) {
        super.setPositionUs(j10);
    }

    public final void t(int i10) {
        if (i10 == 32) {
            this.f63048m.a(' ');
        }
        if (i10 == 33) {
            this.f63048m.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f63048m.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f63048m.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f63048m.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f63048m.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f63048m.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f63048m.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f63048m.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f63048m.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f63048m.a((char) 9608);
                break;
            case 49:
                this.f63048m.a((char) 8216);
                break;
            case 50:
                this.f63048m.a((char) 8217);
                break;
            case 51:
                this.f63048m.a((char) 8220);
                break;
            case 52:
                this.f63048m.a((char) 8221);
                break;
            case 53:
                this.f63048m.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f63048m.a((char) 8539);
                        break;
                    case 119:
                        this.f63048m.a((char) 8540);
                        break;
                    case 120:
                        this.f63048m.a((char) 8541);
                        break;
                    case 121:
                        this.f63048m.a((char) 8542);
                        break;
                    case 122:
                        this.f63048m.a((char) 9474);
                        break;
                    case 123:
                        this.f63048m.a((char) 9488);
                        break;
                    case 124:
                        this.f63048m.a((char) 9492);
                        break;
                    case 125:
                        this.f63048m.a((char) 9472);
                        break;
                    case 126:
                        this.f63048m.a((char) 9496);
                        break;
                    case 127:
                        this.f63048m.a((char) 9484);
                        break;
                    default:
                        q.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
                break;
        }
    }

    public final void u(int i10) {
        if (i10 == 160) {
            this.f63048m.a((char) 13252);
            return;
        }
        q.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f63048m.a('_');
    }

    public final void v() {
        this.f63048m.m(this.f63043h.h(4), this.f63043h.h(2), this.f63043h.h(2), this.f63043h.g(), this.f63043h.g(), this.f63043h.h(3), this.f63043h.h(3));
    }

    public final void w() {
        int iH = b.h(this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2));
        int iH2 = b.h(this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2));
        this.f63043h.r(2);
        this.f63048m.n(iH, iH2, b.g(this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2)));
    }

    public final void x() {
        this.f63043h.r(4);
        int iH = this.f63043h.h(4);
        this.f63043h.r(2);
        this.f63048m.o(iH, this.f63043h.h(6));
    }

    public final void y() {
        int iH = b.h(this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2));
        int iH2 = this.f63043h.h(2);
        int iG = b.g(this.f63043h.h(2), this.f63043h.h(2), this.f63043h.h(2));
        if (this.f63043h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f63043h.g();
        int iH3 = this.f63043h.h(2);
        int iH4 = this.f63043h.h(2);
        int iH5 = this.f63043h.h(2);
        this.f63043h.r(8);
        this.f63048m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void z() {
        C0779c c0779c = this.f63051p;
        if (c0779c.f63085d != (c0779c.f63083b * 2) - 1) {
            q.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f63051p.f63083b * 2) - 1) + ", but current index is " + this.f63051p.f63085d + " (sequence number " + this.f63051p.f63082a + ");");
        }
        boolean z10 = false;
        z zVar = this.f63043h;
        C0779c c0779c2 = this.f63051p;
        zVar.o(c0779c2.f63084c, c0779c2.f63085d);
        while (true) {
            if (this.f63043h.b() <= 0) {
                break;
            }
            int iH = this.f63043h.h(3);
            int iH2 = this.f63043h.h(5);
            if (iH == 7) {
                this.f63043h.r(2);
                iH = this.f63043h.h(6);
                if (iH < 7) {
                    q.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    q.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f63046k) {
                this.f63043h.s(iH2);
            } else {
                int iE = this.f63043h.e() + (iH2 * 8);
                while (this.f63043h.e() < iE) {
                    int iH3 = this.f63043h.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f63043h.h(8);
                        if (iH4 <= 31) {
                            o(iH4);
                        } else {
                            if (iH4 <= 127) {
                                t(iH4);
                            } else if (iH4 <= 159) {
                                p(iH4);
                            } else if (iH4 <= 255) {
                                u(iH4);
                            } else {
                                q.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        m(iH3);
                    } else {
                        if (iH3 <= 127) {
                            r(iH3);
                        } else if (iH3 <= 159) {
                            n(iH3);
                        } else if (iH3 <= 255) {
                            s(iH3);
                        } else {
                            q.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f63049n = l();
        }
    }
}
