package gq;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import hq.e;
import hq.m;
import java.io.IOException;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpParser.java */
/* JADX INFO: loaded from: classes11.dex */
public class k implements q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final vq.c f62852w = vq.b.a(k.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f62853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Buffers f62854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hq.k f62855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hq.d f62856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hq.d f62857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hq.d f62858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.a f62859g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f62862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62865m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f62868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f62869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f62870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f62871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f62872t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f62873u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62874v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hq.m f62866n = new hq.m();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62867o = -14;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m.a f62860h = new m.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m.a f62861i = new m.a();

    /* JADX INFO: compiled from: HttpParser.java */
    public static abstract class a {
        public abstract void a(hq.d dVar) throws IOException;

        public abstract void b();

        public abstract void c() throws IOException;

        public abstract void d(long j10) throws IOException;

        public abstract void e(hq.d dVar, hq.d dVar2) throws IOException;

        public abstract void f(hq.d dVar, hq.d dVar2, hq.d dVar3) throws IOException;

        public abstract void g(hq.d dVar, int i10, hq.d dVar2) throws IOException;
    }

    public k(Buffers buffers, hq.k kVar, a aVar) {
        this.f62854b = buffers;
        this.f62855c = kVar;
        this.f62853a = aVar;
    }

    @Override // gq.q
    public void a() {
        Buffers buffers;
        Buffers buffers2;
        hq.d dVar = this.f62857e;
        if (dVar != null && !dVar.hasContent() && this.f62857e.i0() == -1 && (buffers2 = this.f62854b) != null) {
            hq.d dVar2 = this.f62858f;
            hq.d dVar3 = this.f62857e;
            if (dVar2 == dVar3) {
                this.f62858f = this.f62856d;
            }
            if (buffers2 != null) {
                buffers2.c(dVar3);
            }
            this.f62857e = null;
        }
        hq.d dVar4 = this.f62856d;
        if (dVar4 == null || dVar4.hasContent() || this.f62856d.i0() != -1 || (buffers = this.f62854b) == null) {
            return;
        }
        hq.d dVar5 = this.f62858f;
        hq.d dVar6 = this.f62856d;
        if (dVar5 == dVar6) {
            this.f62858f = null;
        }
        buffers.c(dVar6);
        this.f62856d = null;
    }

    @Override // gq.q
    public boolean b() throws IOException {
        hq.d dVar;
        boolean z10 = n() > 0;
        while (!isComplete() && (dVar = this.f62858f) != null && dVar.length() > 0 && !this.f62866n.hasContent()) {
            z10 |= n() > 0;
        }
        return z10;
    }

    public int c() throws IOException {
        hq.m mVar = this.f62866n;
        if (mVar != null && mVar.length() > 0) {
            return this.f62866n.length();
        }
        if (this.f62855c.g()) {
            if (this.f62867o <= 0) {
                return 0;
            }
            hq.k kVar = this.f62855c;
            return (!(kVar instanceof iq.b) || ((iq.b) kVar).A().available() <= 0) ? 0 : 1;
        }
        n();
        hq.m mVar2 = this.f62866n;
        if (mVar2 == null) {
            return 0;
        }
        return mVar2.length();
    }

    @Override // gq.q
    public void d(boolean z10) {
        this.f62865m = z10;
        if (z10) {
            return;
        }
        int i10 = this.f62867o;
        if (i10 == 0 || i10 == -14) {
            this.f62867o = 7;
        }
    }

    @Override // gq.q
    public boolean e() {
        return this.f62865m;
    }

    public hq.d f(long j10) throws IOException {
        hq.k kVar;
        if (this.f62866n.length() > 0) {
            return this.f62866n;
        }
        if (j() <= 0 || m(7)) {
            return null;
        }
        try {
            n();
            while (this.f62866n.length() == 0 && !m(0) && !m(7) && (kVar = this.f62855c) != null && kVar.isOpen()) {
                if (!this.f62855c.g()) {
                    if (n() <= 0) {
                        if (!this.f62855c.m(j10)) {
                            this.f62855c.close();
                            throw new EofException("timeout");
                        }
                    }
                }
                n();
            }
            if (this.f62866n.length() > 0) {
                return this.f62866n;
            }
            return null;
        } catch (IOException e10) {
            this.f62855c.close();
            throw e10;
        }
    }

    public int g() throws IOException {
        hq.d dVar;
        hq.d dVar2;
        if (this.f62858f == null) {
            this.f62858f = i();
        }
        if (this.f62867o > 0) {
            hq.d dVar3 = this.f62858f;
            hq.d dVar4 = this.f62856d;
            if (dVar3 == dVar4 && dVar4 != null && !dVar4.hasContent() && (dVar2 = this.f62857e) != null && dVar2.hasContent()) {
                hq.d dVar5 = this.f62857e;
                this.f62858f = dVar5;
                return dVar5.length();
            }
        }
        hq.d dVar6 = this.f62858f;
        hq.d dVar7 = this.f62856d;
        if (dVar6 == dVar7 && this.f62867o > 0 && dVar7.length() == 0 && ((this.f62864l || this.f62870r - this.f62871s > this.f62856d.e0()) && ((dVar = this.f62857e) != null || this.f62854b != null))) {
            if (dVar == null) {
                this.f62857e = this.f62854b.getBuffer();
            }
            this.f62858f = this.f62857e;
        }
        if (this.f62855c == null) {
            return -1;
        }
        hq.d dVar8 = this.f62858f;
        if (dVar8 == this.f62857e || this.f62867o > 0) {
            dVar8.c0();
        }
        if (this.f62858f.L() == 0) {
            f62852w.f("HttpParser Full for {} ", this.f62855c);
            this.f62858f.clear();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request Entity Too Large: ");
            sb2.append(this.f62858f == this.f62857e ? "body" : "head");
            throw new HttpException(TTAdConstant.VIDEO_INFO_CODE, sb2.toString());
        }
        try {
            return this.f62855c.j(this.f62858f);
        } catch (IOException e10) {
            f62852w.b(e10);
            if (e10 instanceof EofException) {
                throw e10;
            }
            throw new EofException(e10);
        }
    }

    public long h() {
        return this.f62870r;
    }

    public hq.d i() {
        if (this.f62856d == null) {
            hq.d dVarB = this.f62854b.b();
            this.f62856d = dVarB;
            this.f62860h.update(dVarB);
            this.f62861i.update(this.f62856d);
        }
        return this.f62856d;
    }

    @Override // gq.q
    public boolean isComplete() {
        return this.f62863k > 0 ? m(0) || m(7) : m(0);
    }

    public int j() {
        return this.f62867o;
    }

    public boolean k() {
        return this.f62870r == -2;
    }

    public boolean l() throws IOException {
        hq.d dVar;
        hq.d dVar2 = this.f62856d;
        return (dVar2 != null && dVar2.hasContent()) || ((dVar = this.f62857e) != null && dVar.hasContent());
    }

    public boolean m(int i10) {
        return this.f62867o == i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x043b, code lost:
    
        r3 = r17.f62863k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x043d, code lost:
    
        if (r3 <= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0441, code lost:
    
        if (r3 == 304) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0445, code lost:
    
        if (r3 == 204) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0449, code lost:
    
        if (r3 >= 200) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x044b, code lost:
    
        r17.f62870r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0456, code lost:
    
        if (r17.f62870r != (-3)) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0458, code lost:
    
        if (r3 == 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x045c, code lost:
    
        if (r3 == 304) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0460, code lost:
    
        if (r3 == 204) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0464, code lost:
    
        if (r3 >= 200) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0467, code lost:
    
        r17.f62870r = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x046c, code lost:
    
        r3 = 0;
        r17.f62870r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0471, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0473, code lost:
    
        r17.f62871s = r3;
        r17.f62868p = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0477, code lost:
    
        if (r9 != 13) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x047f, code lost:
    
        if (r17.f62858f.hasContent() == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0489, code lost:
    
        if (r17.f62858f.peek() != 10) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x048b, code lost:
    
        r17.f62868p = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0493, code lost:
    
        r2 = r17.f62870r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x049a, code lost:
    
        if (r2 <= 2147483647L) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x049c, code lost:
    
        r2 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04a0, code lost:
    
        r2 = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04a2, code lost:
    
        if (r2 == (-2)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04a4, code lost:
    
        if (r2 == (-1)) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04a6, code lost:
    
        if (r2 == 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04a8, code lost:
    
        r17.f62867o = 2;
        r17.f62853a.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04b4, code lost:
    
        if (r17.f62865m != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04b6, code lost:
    
        r2 = r17.f62863k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04ba, code lost:
    
        if (r2 < 100) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04be, code lost:
    
        if (r2 >= 200) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04c1, code lost:
    
        r2 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04c3, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04c4, code lost:
    
        r17.f62867o = r2;
        r17.f62853a.c();
        r17.f62853a.d(r17.f62871s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04d3, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04d4, code lost:
    
        r17.f62867o = 1;
        r17.f62853a.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04dd, code lost:
    
        r17.f62867o = 3;
        r17.f62853a.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04e6, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x06e5, code lost:
    
        r3 = r17.f62863k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x06e7, code lost:
    
        if (r3 <= 0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x06eb, code lost:
    
        if (r17.f62874v == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06ef, code lost:
    
        if (r17.f62865m != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06f3, code lost:
    
        if (r3 < 100) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06f7, code lost:
    
        if (r3 >= 200) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06fa, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06fc, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06fd, code lost:
    
        r17.f62867o = r3;
        r17.f62853a.d(r17.f62870r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0706, code lost:
    
        r3 = r17.f62858f.length();
        r5 = r17.f62867o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x070e, code lost:
    
        r6 = r17.f62867o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0710, code lost:
    
        if (r6 <= 0) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0712, code lost:
    
        if (r3 <= 0) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0714, code lost:
    
        if (r5 == r6) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0716, code lost:
    
        r4 = r4 + 1;
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x071b, code lost:
    
        if (r17.f62868p != 13) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0725, code lost:
    
        if (r17.f62858f.peek() != 10) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0727, code lost:
    
        r17.f62868p = r17.f62858f.get();
        r3 = r17.f62858f.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0737, code lost:
    
        r17.f62868p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x073b, code lost:
    
        switch(r17.f62867o) {
            case 1: goto L564;
            case 2: goto L563;
            case 3: goto L483;
            case 4: goto L439;
            case 5: goto L418;
            case 6: goto L410;
            case 7: goto L398;
            default: goto L394;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0750, code lost:
    
        if (r17.f62858f.length() <= 2) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0752, code lost:
    
        r17.f62867o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0754, code lost:
    
        r17.f62855c.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0760, code lost:
    
        if (r17.f62858f.length() <= 0) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x076c, code lost:
    
        if (java.lang.Character.isWhitespace(r17.f62858f.get()) != false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x076f, code lost:
    
        r17.f62867o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0771, code lost:
    
        r17.f62855c.close();
        r17.f62858f.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x077c, code lost:
    
        r17.f62858f.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0782, code lost:
    
        r6 = r17.f62872t - r17.f62873u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0788, code lost:
    
        if (r6 != 0) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x078a, code lost:
    
        r17.f62867o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0791, code lost:
    
        if (r3 <= r6) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0793, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0794, code lost:
    
        r2 = r17.f62858f.get(r3);
        r17.f62871s += (long) r2.length();
        r17.f62873u += r2.length();
        r17.f62866n.update(r2);
        r17.f62853a.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x07b8, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x07b9, code lost:
    
        r3 = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x07c0, code lost:
    
        if (r3 == 13) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x07c4, code lost:
    
        if (r3 != 10) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x07ce, code lost:
    
        r17.f62868p = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x07d2, code lost:
    
        if (r17.f62872t != 0) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x07d4, code lost:
    
        if (r3 != 13) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x07dc, code lost:
    
        if (r17.f62858f.hasContent() == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x07e6, code lost:
    
        if (r17.f62858f.peek() != 10) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x07e8, code lost:
    
        r17.f62868p = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x07f2, code lost:
    
        if (r17.f62865m == false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x07f4, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x07f6, code lost:
    
        r2 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x07f7, code lost:
    
        r17.f62867o = r2;
        r17.f62853a.d(r17.f62871s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0801, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0802, code lost:
    
        r17.f62867o = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0806, code lost:
    
        r3 = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x080d, code lost:
    
        if (r3 == 13) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0811, code lost:
    
        if (r3 != 10) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0814, code lost:
    
        if (r3 <= 32) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0818, code lost:
    
        if (r3 != 59) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x081d, code lost:
    
        if (r3 < 48) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0821, code lost:
    
        if (r3 > 57) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0823, code lost:
    
        r17.f62872t = (r17.f62872t * 16) + (r3 - 48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0831, code lost:
    
        if (r3 < 97) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0835, code lost:
    
        if (r3 > 102) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0837, code lost:
    
        r17.f62872t = (r17.f62872t * 16) + ((r3 + 10) - 97);
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0845, code lost:
    
        if (r3 < 65) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0849, code lost:
    
        if (r3 > 70) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x084b, code lost:
    
        r17.f62872t = (r17.f62872t * 16) + ((r3 + 10) - 65);
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x086d, code lost:
    
        throw new java.io.IOException("bad chunk char: " + ((int) r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x086e, code lost:
    
        r17.f62867o = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0876, code lost:
    
        r17.f62868p = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x087d, code lost:
    
        if (r17.f62872t != 0) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x087f, code lost:
    
        if (r3 != 13) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0887, code lost:
    
        if (r17.f62858f.hasContent() == false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0891, code lost:
    
        if (r17.f62858f.peek() != 10) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0893, code lost:
    
        r17.f62868p = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x089d, code lost:
    
        if (r17.f62865m == false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x089f, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x08a1, code lost:
    
        r2 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x08a2, code lost:
    
        r17.f62867o = r2;
        r17.f62853a.d(r17.f62871s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x08ac, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x08ad, code lost:
    
        r17.f62867o = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x08b1, code lost:
    
        r3 = r17.f62858f.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x08bd, code lost:
    
        if (r3 == 13) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x08bf, code lost:
    
        if (r3 != 10) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x08c2, code lost:
    
        if (r3 > 32) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x08c4, code lost:
    
        r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x08cb, code lost:
    
        r17.f62872t = 0;
        r17.f62873u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x08d0, code lost:
    
        r17.f62867o = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x08d3, code lost:
    
        r17.f62868p = r17.f62858f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x08de, code lost:
    
        r4 = r17.f62870r;
        r6 = r17.f62871s;
        r4 = r4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x08e7, code lost:
    
        if (r4 != 0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x08eb, code lost:
    
        if (r17.f62865m == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x08ed, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x08ef, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x08f0, code lost:
    
        r17.f62867o = r3;
        r17.f62853a.d(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x08f8, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x08fc, code lost:
    
        if (r3 <= r4) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x08fe, code lost:
    
        r3 = (int) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x08ff, code lost:
    
        r2 = r17.f62858f.get(r3);
        r17.f62871s += (long) r2.length();
        r17.f62866n.update(r2);
        r17.f62853a.a(r2);
        r2 = r17.f62871s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x091f, code lost:
    
        if (r2 != r17.f62870r) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0923, code lost:
    
        if (r17.f62865m == false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0925, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0927, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0928, code lost:
    
        r17.f62867o = r4;
        r17.f62853a.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x092f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0931, code lost:
    
        r2 = r17.f62858f;
        r2 = r2.get(r2.length());
        r17.f62871s += (long) r2.length();
        r17.f62866n.update(r2);
        r17.f62853a.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0950, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0957, code lost:
    
        r3 = r17.f62858f.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x095a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x095b, code lost:
    
        r2 = r0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x095e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be A[Catch: HttpException -> 0x0963, TryCatch #1 {HttpException -> 0x0963, blocks: (B:3:0x0004, B:6:0x0009, B:8:0x000d, B:9:0x0013, B:11:0x0019, B:13:0x0021, B:15:0x0029, B:57:0x00d8, B:59:0x00e1, B:60:0x00e9, B:62:0x00f3, B:65:0x00f9, B:66:0x00fc, B:69:0x010a, B:70:0x010e, B:71:0x0113, B:72:0x0114, B:207:0x03a7, B:407:0x076f, B:491:0x08cb, B:29:0x0069, B:31:0x006f, B:33:0x0077, B:35:0x007b, B:36:0x0099, B:40:0x00a1, B:42:0x00a7, B:43:0x00ac, B:47:0x00c2, B:49:0x00c8, B:52:0x00cf, B:53:0x00d4, B:55:0x00d6, B:44:0x00b4, B:45:0x00be, B:25:0x0059), top: B:531:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196 A[Catch: HttpException -> 0x095f, TryCatch #6 {HttpException -> 0x095f, blocks: (B:80:0x012c, B:81:0x0132, B:83:0x0136, B:85:0x013e, B:86:0x0153, B:88:0x0157, B:89:0x015f, B:90:0x0191, B:91:0x0196, B:96:0x01a1, B:98:0x01a5, B:99:0x01aa, B:100:0x01bd, B:102:0x01c1, B:104:0x01c9, B:105:0x01de, B:107:0x01e2, B:108:0x01ea, B:109:0x021c, B:116:0x022e, B:117:0x0238, B:119:0x023c, B:121:0x0240, B:122:0x0254, B:123:0x025a, B:125:0x025e, B:126:0x0272, B:127:0x0278, B:134:0x0289, B:136:0x0290, B:137:0x0295, B:138:0x02a9, B:140:0x02ad, B:142:0x02b1, B:143:0x02c5, B:144:0x02cb, B:146:0x02cf, B:147:0x02e3, B:152:0x02f1, B:154:0x02f5, B:156:0x02fd, B:158:0x0305, B:224:0x03f4, B:229:0x0400, B:231:0x040d, B:233:0x041f, B:234:0x043b, B:242:0x044b, B:256:0x0473, B:258:0x0479, B:260:0x0481, B:262:0x048b, B:263:0x0493, B:271:0x04a8, B:273:0x04b2, B:275:0x04b6, B:282:0x04c4, B:284:0x04d4, B:285:0x04dd, B:266:0x04a0, B:243:0x0450, B:253:0x0467, B:254:0x046c, B:160:0x0309, B:164:0x0318, B:166:0x031e, B:168:0x0328, B:176:0x033d, B:179:0x0343, B:182:0x034f, B:184:0x0354, B:185:0x0361, B:186:0x0362, B:188:0x036f, B:189:0x0373, B:191:0x037f, B:192:0x0382, B:195:0x038b, B:196:0x0393, B:197:0x0394, B:204:0x03a3, B:209:0x03aa, B:211:0x03b8, B:216:0x03cb, B:223:0x03da, B:167:0x0321, B:163:0x030f, B:287:0x04e7, B:291:0x04f4, B:293:0x04f8, B:295:0x052a, B:299:0x0539, B:294:0x050e, B:304:0x055b, B:306:0x055f, B:307:0x058a, B:311:0x059e, B:313:0x05ae, B:315:0x05ba, B:318:0x05d7, B:322:0x05ef, B:327:0x0605, B:332:0x0626, B:335:0x0636, B:336:0x0660, B:342:0x0671, B:343:0x0678, B:344:0x0679, B:346:0x0682, B:347:0x068c, B:349:0x0694, B:353:0x06b4, B:359:0x06c8, B:360:0x06cf, B:361:0x06d0, B:364:0x06db, B:365:0x06e5, B:367:0x06e9, B:369:0x06ed, B:378:0x06fd, B:379:0x0706, B:380:0x070e, B:384:0x0716, B:385:0x0719, B:387:0x071d, B:389:0x0727, B:518:0x0951, B:401:0x0754, B:409:0x077c, B:402:0x075a, B:404:0x0762, B:408:0x0771, B:410:0x0782, B:412:0x078a, B:416:0x0794, B:418:0x07b9, B:424:0x07ce, B:427:0x07d6, B:429:0x07de, B:431:0x07e8, B:432:0x07f0, B:436:0x07f7, B:438:0x0802, B:439:0x0806, B:452:0x0823, B:458:0x0837, B:463:0x084b, B:464:0x0857, B:465:0x086d, B:466:0x086e, B:468:0x0876, B:471:0x0881, B:473:0x0889, B:475:0x0893, B:476:0x089b, B:480:0x08a2, B:482:0x08ad, B:483:0x08b1, B:488:0x08c4, B:493:0x08d0, B:494:0x08d3, B:496:0x08de, B:498:0x08e9, B:502:0x08f0, B:504:0x08f9, B:506:0x08fe, B:507:0x08ff, B:509:0x0921, B:513:0x0928, B:516:0x0931), top: B:539:0x012c, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int n() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.k.n():int");
    }

    public void o(boolean z10) {
        this.f62874v = z10;
    }

    @Override // gq.q
    public boolean p() {
        return m(-14);
    }

    public void q(int i10) {
        this.f62867o = i10;
        this.f62870r = -3L;
    }

    @Override // gq.q
    public void reset() {
        hq.d dVar;
        hq.m mVar = this.f62866n;
        mVar.l0(mVar.T());
        this.f62867o = this.f62865m ? -14 : this.f62855c.z() ? 0 : 7;
        this.f62870r = -3L;
        this.f62871s = 0L;
        this.f62869q = 0;
        this.f62863k = 0;
        if (this.f62868p == 13 && (dVar = this.f62858f) != null && dVar.hasContent() && this.f62858f.peek() == 10) {
            this.f62868p = this.f62858f.get();
        }
        hq.d dVar2 = this.f62857e;
        if (dVar2 != null && dVar2.hasContent()) {
            hq.d dVar3 = this.f62856d;
            if (dVar3 == null) {
                i();
            } else {
                dVar3.V(-1);
                this.f62856d.c0();
            }
            int iL = this.f62856d.L();
            if (iL > this.f62857e.length()) {
                iL = this.f62857e.length();
            }
            hq.d dVar4 = this.f62857e;
            dVar4.N(dVar4.getIndex(), iL);
            hq.d dVar5 = this.f62857e;
            dVar5.skip(this.f62856d.k0(dVar5.N(dVar5.getIndex(), iL)));
        }
        hq.d dVar6 = this.f62856d;
        if (dVar6 != null) {
            dVar6.V(-1);
            this.f62856d.c0();
        }
        hq.d dVar7 = this.f62857e;
        if (dVar7 != null) {
            dVar7.V(-1);
        }
        this.f62858f = this.f62856d;
        a();
    }

    public String toString() {
        return String.format("%s{s=%d,l=%d,c=%d}", getClass().getSimpleName(), Integer.valueOf(this.f62867o), Integer.valueOf(this.f62869q), Long.valueOf(this.f62870r));
    }
}
