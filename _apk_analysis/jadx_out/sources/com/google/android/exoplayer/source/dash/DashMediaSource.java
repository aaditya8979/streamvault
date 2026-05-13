package com.google.android.exoplayer.source.dash;

import a6.k0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.offline.StreamKey;
import com.google.android.exoplayer.source.dash.a;
import com.google.android.exoplayer.source.dash.c;
import com.google.android.exoplayer.source.dash.d;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.g;
import com.google.android.material.datepicker.UtcDates;
import e4.e0;
import e4.k;
import e4.v0;
import e5.b0;
import e5.j;
import e5.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y5.m;
import y5.n;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource extends e5.b {

    @Nullable
    public q A;
    public IOException B;
    public Handler C;
    public Uri D;
    public Uri E;
    public i5.b F;
    public boolean G;
    public long H;
    public long I;
    public long J;
    public int K;
    public long L;
    public int M;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0296a f20396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a.InterfaceC0288a f20397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e5.g f20398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f20399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f20400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f20401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f20402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.a f20403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g.a<? extends i5.b> f20404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f20405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f20406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray<com.google.android.exoplayer.source.dash.b> f20407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Runnable f20408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f20409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d.b f20410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f20411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Object f20412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.google.android.exoplayer.upstream.a f20413y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Loader f20414z;

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0288a f20415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final a.InterfaceC0296a f20416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.google.android.exoplayer.drm.a<?> f20417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public g.a<? extends i5.b> f20418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public List<StreamKey> f20419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e5.g f20420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public m f20421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20423i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f20424j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Object f20425k;

        public Factory(a.InterfaceC0288a interfaceC0288a, @Nullable a.InterfaceC0296a interfaceC0296a) {
            this.f20415a = (a.InterfaceC0288a) a6.a.e(interfaceC0288a);
            this.f20416b = interfaceC0296a;
            this.f20417c = com.google.android.exoplayer.drm.a.a();
            this.f20421g = new com.google.android.exoplayer.upstream.f();
            this.f20422h = 30000L;
            this.f20420f = new j();
        }

        public Factory(a.InterfaceC0296a interfaceC0296a) {
            this(new c.a(interfaceC0296a), interfaceC0296a);
        }

        public DashMediaSource a(Uri uri) {
            this.f20424j = true;
            if (this.f20418d == null) {
                this.f20418d = new i5.c();
            }
            List<StreamKey> list = this.f20419e;
            if (list != null) {
                this.f20418d = new b5.e(this.f20418d, list);
            }
            return new DashMediaSource(null, (Uri) a6.a.e(uri), this.f20416b, this.f20418d, this.f20415a, this.f20420f, this.f20417c, this.f20421g, this.f20422h, this.f20423i, this.f20425k);
        }

        @Deprecated
        public Factory b(long j10) {
            return j10 == -1 ? c(30000L, false) : c(j10, true);
        }

        public Factory c(long j10, boolean z10) {
            a6.a.f(!this.f20424j);
            this.f20422h = j10;
            this.f20423i = z10;
            return this;
        }

        public Factory d(m mVar) {
            a6.a.f(!this.f20424j);
            this.f20421g = mVar;
            return this;
        }

        @Deprecated
        public Factory e(int i10) {
            return d(new com.google.android.exoplayer.upstream.f(i10));
        }
    }

    public static final class b extends v0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f20429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f20430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i5.b f20432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Object f20433i;

        public b(long j10, long j11, int i10, long j12, long j13, long j14, i5.b bVar, @Nullable Object obj) {
            this.f20426b = j10;
            this.f20427c = j11;
            this.f20428d = i10;
            this.f20429e = j12;
            this.f20430f = j13;
            this.f20431g = j14;
            this.f20432h = bVar;
            this.f20433i = obj;
        }

        public static boolean t(i5.b bVar) {
            return bVar.f63739d && bVar.f63740e != -9223372036854775807L && bVar.f63737b == -9223372036854775807L;
        }

        @Override // e4.v0
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f20428d) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // e4.v0
        public v0.b g(int i10, v0.b bVar, boolean z10) {
            a6.a.c(i10, 0, i());
            return bVar.p(z10 ? this.f20432h.c(i10).f63767a : null, z10 ? Integer.valueOf(this.f20428d + i10) : null, 0, this.f20432h.f(i10), k.a(this.f20432h.c(i10).f63768b - this.f20432h.c(0).f63768b) - this.f20429e);
        }

        @Override // e4.v0
        public int i() {
            return this.f20432h.d();
        }

        @Override // e4.v0
        public Object m(int i10) {
            a6.a.c(i10, 0, i());
            return Integer.valueOf(this.f20428d + i10);
        }

        @Override // e4.v0
        public v0.c o(int i10, v0.c cVar, long j10) {
            a6.a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = v0.c.f60310n;
            Object obj2 = this.f20433i;
            i5.b bVar = this.f20432h;
            return cVar.e(obj, obj2, bVar, this.f20426b, this.f20427c, true, t(bVar), this.f20432h.f63739d, jS, this.f20430f, 0, i() - 1, this.f20429e);
        }

        @Override // e4.v0
        public int p() {
            return 1;
        }

        public final long s(long j10) {
            h5.c cVarB;
            long j11 = this.f20431g;
            if (!t(this.f20432h)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f20430f) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f20429e + j11;
            long jF = this.f20432h.f(0);
            int i10 = 0;
            while (i10 < this.f20432h.d() - 1 && j12 >= jF) {
                j12 -= jF;
                i10++;
                jF = this.f20432h.f(i10);
            }
            i5.f fVarC = this.f20432h.c(i10);
            int iA = fVarC.a(2);
            return (iA == -1 || (cVarB = fVarC.f63769c.get(iA).f63732c.get(0).b()) == null || cVarB.getSegmentCount(jF) == 0) ? j11 : (j11 + cVarB.getTimeUs(cVarB.getSegmentNum(j12, jF))) - j12;
        }
    }

    public final class c implements d.b {
        public c() {
        }

        @Override // com.google.android.exoplayer.source.dash.d.b
        public void onDashManifestPublishTimeExpired(long j10) {
            DashMediaSource.this.C(j10);
        }

        @Override // com.google.android.exoplayer.source.dash.d.b
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.D();
        }
    }

    public static final class d implements g.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f20435a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer.upstream.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = f20435a.matcher(line);
                if (!matcher.matches()) {
                    throw new ParserException("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * ((((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw new ParserException(e10);
            }
        }
    }

    public final class e implements Loader.b<com.google.android.exoplayer.upstream.g<i5.b>> {
        public e() {
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(com.google.android.exoplayer.upstream.g<i5.b> gVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.E(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(com.google.android.exoplayer.upstream.g<i5.b> gVar, long j10, long j11) {
            DashMediaSource.this.F(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c g(com.google.android.exoplayer.upstream.g<i5.b> gVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.G(gVar, j10, j11, iOException, i10);
        }
    }

    public final class f implements n {
        public f() {
        }

        public final void a() throws IOException {
            if (DashMediaSource.this.B != null) {
                throw DashMediaSource.this.B;
            }
        }

        @Override // y5.n
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.f20414z.maybeThrowError();
            a();
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20440c;

        public g(boolean z10, long j10, long j11) {
            this.f20438a = z10;
            this.f20439b = j10;
            this.f20440c = j11;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[PHI: r12
          0x0040: PHI (r12v4 boolean) = (r12v2 boolean), (r12v1 boolean) binds: [B:27:0x0071, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.google.android.exoplayer.source.dash.DashMediaSource.g a(i5.f r20, long r21) {
            /*
                r0 = r20
                r4 = r21
                java.util.List<i5.a> r1 = r0.f63769c
                int r1 = r1.size()
                r2 = 0
                r3 = r2
            Lc:
                r6 = 1
                if (r3 >= r1) goto L24
                java.util.List<i5.a> r7 = r0.f63769c
                java.lang.Object r7 = r7.get(r3)
                i5.a r7 = (i5.a) r7
                int r7 = r7.f63731b
                if (r7 == r6) goto L22
                r8 = 2
                if (r7 != r8) goto L1f
                goto L22
            L1f:
                int r3 = r3 + 1
                goto Lc
            L22:
                r3 = r6
                goto L25
            L24:
                r3 = r2
            L25:
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = r2
                r12 = r11
                r15 = r12
                r13 = 0
            L2f:
                if (r11 >= r1) goto La5
                java.util.List<i5.a> r6 = r0.f63769c
                java.lang.Object r6 = r6.get(r11)
                i5.a r6 = (i5.a) r6
                if (r3 == 0) goto L44
                int r7 = r6.f63731b
                r8 = 3
                if (r7 != r8) goto L44
            L40:
                r17 = r3
                r2 = r9
                goto L9d
            L44:
                java.util.List<i5.i> r6 = r6.f63732c
                java.lang.Object r6 = r6.get(r2)
                i5.i r6 = (i5.i) r6
                h5.c r6 = r6.b()
                if (r6 != 0) goto L5e
                com.google.android.exoplayer.source.dash.DashMediaSource$g r6 = new com.google.android.exoplayer.source.dash.DashMediaSource$g
                r1 = 1
                r2 = 0
                r0 = r6
                r4 = r21
                r0.<init>(r1, r2, r4)
                return r6
            L5e:
                boolean r7 = r6.isExplicit()
                r12 = r12 | r7
                int r7 = r6.getSegmentCount(r4)
                if (r7 != 0) goto L71
                r17 = r3
                r2 = 0
                r13 = 0
                r15 = 1
                goto L9d
            L71:
                if (r15 != 0) goto L40
                r17 = r3
                long r2 = r6.getFirstSegmentNum()
                r18 = r9
                long r8 = r6.getTimeUs(r2)
                long r13 = java.lang.Math.max(r13, r8)
                r8 = -1
                if (r7 == r8) goto L9b
                long r7 = (long) r7
                long r2 = r2 + r7
                r7 = 1
                long r2 = r2 - r7
                long r7 = r6.getTimeUs(r2)
                long r2 = r6.getDurationUs(r2, r4)
                long r7 = r7 + r2
                r2 = r18
                long r2 = java.lang.Math.min(r2, r7)
                goto L9d
            L9b:
                r2 = r18
            L9d:
                int r11 = r11 + 1
                r9 = r2
                r3 = r17
                r2 = 0
                r6 = 1
                goto L2f
            La5:
                r2 = r9
                com.google.android.exoplayer.source.dash.DashMediaSource$g r0 = new com.google.android.exoplayer.source.dash.DashMediaSource$g
                r11 = r0
                r15 = r2
                r11.<init>(r12, r13, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.source.dash.DashMediaSource.g.a(i5.f, long):com.google.android.exoplayer.source.dash.DashMediaSource$g");
        }
    }

    public final class h implements Loader.b<com.google.android.exoplayer.upstream.g<Long>> {
        public h() {
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void l(com.google.android.exoplayer.upstream.g<Long> gVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.E(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void j(com.google.android.exoplayer.upstream.g<Long> gVar, long j10, long j11) {
            DashMediaSource.this.H(gVar, j10, j11);
        }

        @Override // com.google.android.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c g(com.google.android.exoplayer.upstream.g<Long> gVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.I(gVar, j10, j11, iOException);
        }
    }

    public static final class i implements g.a<Long> {
        public i() {
        }

        @Override // com.google.android.exoplayer.upstream.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(k0.s0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        e0.a("goog.exo.dash");
    }

    public DashMediaSource(@Nullable i5.b bVar, @Nullable Uri uri, @Nullable a.InterfaceC0296a interfaceC0296a, @Nullable g.a<? extends i5.b> aVar, a.InterfaceC0288a interfaceC0288a, e5.g gVar, com.google.android.exoplayer.drm.a<?> aVar2, m mVar, long j10, boolean z10, @Nullable Object obj) {
        this.D = uri;
        this.F = bVar;
        this.E = uri;
        this.f20396h = interfaceC0296a;
        this.f20404p = aVar;
        this.f20397i = interfaceC0288a;
        this.f20399k = aVar2;
        this.f20400l = mVar;
        this.f20401m = j10;
        this.f20402n = z10;
        this.f20398j = gVar;
        this.f20412x = obj;
        boolean z11 = bVar != null;
        this.f20395g = z11;
        this.f20403o = n(null);
        this.f20406r = new Object();
        this.f20407s = new SparseArray<>();
        this.f20410v = new c();
        this.L = -9223372036854775807L;
        if (!z11) {
            this.f20405q = new e();
            this.f20411w = new f();
            this.f20408t = new Runnable() { // from class: h5.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62973b.R();
                }
            };
            this.f20409u = new Runnable() { // from class: h5.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62974b.B();
                }
            };
            return;
        }
        a6.a.f(!bVar.f63739d);
        this.f20405q = null;
        this.f20408t = null;
        this.f20409u = null;
        this.f20411w = new n.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        L(false);
    }

    public final long A() {
        return this.J != 0 ? k.a(SystemClock.elapsedRealtime() + this.J) : k.a(System.currentTimeMillis());
    }

    public void C(long j10) {
        long j11 = this.L;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.L = j10;
        }
    }

    public void D() {
        this.C.removeCallbacks(this.f20409u);
        R();
    }

    public void E(com.google.android.exoplayer.upstream.g<?> gVar, long j10, long j11) {
        this.f20403o.y(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(com.google.android.exoplayer.upstream.g<i5.b> r18, long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.source.dash.DashMediaSource.F(com.google.android.exoplayer.upstream.g, long, long):void");
    }

    public Loader.c G(com.google.android.exoplayer.upstream.g<i5.b> gVar, long j10, long j11, IOException iOException, int i10) {
        long jB = this.f20400l.b(4, j11, iOException, i10);
        Loader.c cVarG = jB == -9223372036854775807L ? Loader.f21019g : Loader.g(false, jB);
        this.f20403o.E(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a(), iOException, !cVarG.c());
        return cVarG;
    }

    public void H(com.google.android.exoplayer.upstream.g<Long> gVar, long j10, long j11) {
        this.f20403o.B(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a());
        K(gVar.c().longValue() - j10);
    }

    public Loader.c I(com.google.android.exoplayer.upstream.g<Long> gVar, long j10, long j11, IOException iOException) {
        this.f20403o.E(gVar.f21150a, gVar.d(), gVar.b(), gVar.f21151b, j10, j11, gVar.a(), iOException, true);
        J(iOException);
        return Loader.f21018f;
    }

    public final void J(IOException iOException) {
        a6.m.d("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        L(true);
    }

    public final void K(long j10) {
        this.J = j10;
        L(true);
    }

    public final void L(boolean z10) {
        boolean z11;
        long j10;
        for (int i10 = 0; i10 < this.f20407s.size(); i10++) {
            int iKeyAt = this.f20407s.keyAt(i10);
            if (iKeyAt >= this.M) {
                this.f20407s.valueAt(i10).B(this.F, iKeyAt - this.M);
            }
        }
        int iD = this.F.d() - 1;
        g gVarA = g.a(this.F.c(0), this.F.f(0));
        g gVarA2 = g.a(this.F.c(iD), this.F.f(iD));
        long jMax = gVarA.f20439b;
        long jMin = gVarA2.f20440c;
        if (!this.F.f63739d || gVarA2.f20438a) {
            z11 = false;
        } else {
            jMin = Math.min((A() - k.a(this.F.f63736a)) - k.a(this.F.c(iD).f63768b), jMin);
            long j11 = this.F.f63741f;
            if (j11 != -9223372036854775807L) {
                long jA = jMin - k.a(j11);
                while (jA < 0 && iD > 0) {
                    iD--;
                    jA += this.F.f(iD);
                }
                jMax = iD == 0 ? Math.max(jMax, jA) : this.F.f(0);
            }
            z11 = true;
        }
        long j12 = jMax;
        long jF = jMin - j12;
        for (int i11 = 0; i11 < this.F.d() - 1; i11++) {
            jF += this.F.f(i11);
        }
        i5.b bVar = this.F;
        if (bVar.f63739d) {
            long j13 = this.f20401m;
            if (!this.f20402n) {
                long j14 = bVar.f63742g;
                if (j14 != -9223372036854775807L) {
                    j13 = j14;
                }
            }
            long jA2 = jF - k.a(j13);
            if (jA2 < 5000000) {
                jA2 = Math.min(5000000L, jF / 2);
            }
            j10 = jA2;
        } else {
            j10 = 0;
        }
        i5.b bVar2 = this.F;
        long j15 = bVar2.f63736a;
        long jB = j15 != -9223372036854775807L ? j15 + bVar2.c(0).f63768b + k.b(j12) : -9223372036854775807L;
        i5.b bVar3 = this.F;
        t(new b(bVar3.f63736a, jB, this.M, j12, jF, j10, bVar3, this.f20412x));
        if (this.f20395g) {
            return;
        }
        this.C.removeCallbacks(this.f20409u);
        if (z11) {
            this.C.postDelayed(this.f20409u, 5000L);
        }
        if (this.G) {
            R();
            return;
        }
        if (z10) {
            i5.b bVar4 = this.F;
            if (bVar4.f63739d) {
                long j16 = bVar4.f63740e;
                if (j16 != -9223372036854775807L) {
                    P(Math.max(0L, (this.H + (j16 != 0 ? j16 : 5000L)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void M(i5.m mVar) {
        String str = mVar.f63812a;
        if (k0.c(str, "urn:mpeg:dash:utc:direct:2014") || k0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            N(mVar);
            return;
        }
        if (k0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || k0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            O(mVar, new d());
        } else if (k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || k0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            O(mVar, new i());
        } else {
            J(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public final void N(i5.m mVar) {
        try {
            K(k0.s0(mVar.f63813b) - this.I);
        } catch (ParserException e10) {
            J(e10);
        }
    }

    public final void O(i5.m mVar, g.a<Long> aVar) {
        Q(new com.google.android.exoplayer.upstream.g(this.f20413y, Uri.parse(mVar.f63813b), 5, aVar), new h(), 1);
    }

    public final void P(long j10) {
        this.C.postDelayed(this.f20408t, j10);
    }

    public final <T> void Q(com.google.android.exoplayer.upstream.g<T> gVar, Loader.b<com.google.android.exoplayer.upstream.g<T>> bVar, int i10) {
        this.f20403o.H(gVar.f21150a, gVar.f21151b, this.f20414z.m(gVar, bVar, i10));
    }

    public final void R() {
        Uri uri;
        this.C.removeCallbacks(this.f20408t);
        if (this.f20414z.h()) {
            return;
        }
        if (this.f20414z.i()) {
            this.G = true;
            return;
        }
        synchronized (this.f20406r) {
            uri = this.E;
        }
        this.G = false;
        Q(new com.google.android.exoplayer.upstream.g(this.f20413y, uri, 4, this.f20404p), this.f20405q, this.f20400l.getMinimumLoadableRetryCount(4));
    }

    @Override // e5.r
    public e5.q b(r.a aVar, y5.b bVar, long j10) {
        int iIntValue = ((Integer) aVar.f60579a).intValue() - this.M;
        com.google.android.exoplayer.source.dash.b bVar2 = new com.google.android.exoplayer.source.dash.b(this.M + iIntValue, this.F, iIntValue, this.f20397i, this.A, this.f20399k, this.f20400l, o(aVar, this.F.c(iIntValue).f63768b), this.J, this.f20411w, bVar, this.f20398j, this.f20410v);
        this.f20407s.put(bVar2.f20443b, bVar2);
        return bVar2;
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return this.f20412x;
    }

    @Override // e5.r
    public void k(e5.q qVar) {
        com.google.android.exoplayer.source.dash.b bVar = (com.google.android.exoplayer.source.dash.b) qVar;
        bVar.x();
        this.f20407s.remove(bVar.f20443b);
    }

    @Override // e5.r
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f20411w.maybeThrowError();
    }

    @Override // e5.b
    public void s(@Nullable q qVar) {
        this.A = qVar;
        this.f20399k.prepare();
        if (this.f20395g) {
            L(false);
            return;
        }
        this.f20413y = this.f20396h.createDataSource();
        this.f20414z = new Loader("Loader:DashMediaSource");
        this.C = new Handler();
        R();
    }

    @Override // e5.b
    public void u() {
        this.G = false;
        this.f20413y = null;
        Loader loader = this.f20414z;
        if (loader != null) {
            loader.k();
            this.f20414z = null;
        }
        this.H = 0L;
        this.I = 0L;
        this.F = this.f20395g ? this.F : null;
        this.E = this.D;
        this.B = null;
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.C = null;
        }
        this.J = 0L;
        this.K = 0;
        this.L = -9223372036854775807L;
        this.M = 0;
        this.f20407s.clear();
        this.f20399k.release();
    }

    public final long z() {
        return Math.min((this.K - 1) * 1000, 5000);
    }
}
