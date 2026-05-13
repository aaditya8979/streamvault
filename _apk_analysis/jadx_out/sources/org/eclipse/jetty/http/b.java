package org.eclipse.jetty.http;

import gq.m;
import gq.o;
import hq.d;
import hq.g;
import hq.h;
import hq.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;
import vq.c;

/* JADX INFO: compiled from: HttpGenerator.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends gq.a {
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static byte[] I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f76648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f76649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f76650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f76651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f76647z = vq.b.a(b.class);
    public static final C0915b[] A = new C0915b[508];

    /* JADX INFO: renamed from: org.eclipse.jetty.http.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpGenerator.java */
    public static class C0915b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f76652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f76653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f76654c;

        public C0915b() {
        }
    }

    static {
        int length = o.f62897d.length();
        for (int i10 = 0; i10 < A.length; i10++) {
            HttpStatus.Code codeA = HttpStatus.a(i10);
            if (codeA != null) {
                String message = codeA.getMessage();
                int i11 = length + 5;
                int length2 = message.length() + i11 + 2;
                byte[] bArr = new byte[length2];
                o.f62897d.J(0, bArr, 0, length);
                bArr[length + 0] = 32;
                bArr[length + 1] = (byte) ((i10 / 100) + 48);
                bArr[length + 2] = (byte) (((i10 % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i10 % 10) + 48);
                bArr[length + 4] = 32;
                for (int i12 = 0; i12 < message.length(); i12++) {
                    bArr[i11 + i12] = (byte) message.charAt(i12);
                }
                bArr[message.length() + i11] = 13;
                bArr[length + 6 + message.length()] = 10;
                C0915b[] c0915bArr = A;
                C0915b c0915b = new C0915b();
                c0915bArr[i10] = c0915b;
                c0915b.f76652a = new h(bArr, i11, (length2 - length) - 7, 0);
                c0915bArr[i10].f76653b = new h(bArr, 0, i11, 0);
                c0915bArr[i10].f76654c = new h(bArr, 0, length2, 0);
            }
        }
        B = new byte[]{48, 13, 10, 13, 10};
        C = sq.o.c("Content-Length: 0\r\n");
        D = sq.o.c("Connection: keep-alive\r\n");
        E = sq.o.c("Connection: close\r\n");
        F = sq.o.c("Connection: ");
        G = sq.o.c("\r\n");
        H = sq.o.c("Transfer-Encoding: chunked\r\n");
        I = sq.o.c("Server: Jetty(7.0.x)\r\n");
    }

    public b(Buffers buffers, k kVar) {
        super(buffers, kVar);
        this.f76648v = false;
        this.f76649w = false;
        this.f76650x = false;
        this.f76651y = false;
    }

    public static void I(String str) {
        I = sq.o.c("Server: Jetty(" + str + ")\r\n");
    }

    @Override // gq.a
    public int A() throws IOException {
        if (this.f62766m || this.f62764k || this.f62756c == 4) {
            return -1;
        }
        d dVar = this.f62770q;
        if ((dVar != null && dVar.length() > 0) || this.f76651y) {
            l();
            if ((dVar != null && dVar.length() > 0) || this.f76651y) {
                throw new IllegalStateException("FULL");
            }
        }
        if (this.f62769p == null) {
            this.f62769p = this.f62754a.getBuffer();
        }
        this.f62762i -= (long) this.f62769p.length();
        if (this.f62765l) {
            return Integer.MAX_VALUE;
        }
        return this.f62769p.L() - (this.f62763j == -2 ? 12 : 0);
    }

    public final int C() {
        d dVar;
        d dVar2 = this.f62768o;
        int i10 = 0;
        int i11 = (dVar2 == null || dVar2.length() <= 0) ? 0 : 4;
        d dVar3 = this.f62769p;
        int i12 = i11 | ((dVar3 == null || dVar3.length() <= 0) ? 0 : 2);
        if (this.f76648v && (dVar = this.f62770q) != null && dVar.length() > 0) {
            i10 = 1;
        }
        return i12 | i10;
    }

    public boolean D() {
        d dVar;
        d dVar2;
        d dVar3 = this.f62768o;
        return (dVar3 == null || dVar3.length() == 0) && ((dVar = this.f62769p) == null || dVar.length() == 0) && ((dVar2 = this.f62770q) == null || dVar2.length() == 0);
    }

    public boolean E() {
        return this.f62760g == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.b.F():void");
    }

    public void G(int i10) throws IOException {
        if (this.f62756c != 0) {
            return;
        }
        if (i10 < 100 || i10 > 199) {
            throw new IllegalArgumentException("!1xx");
        }
        C0915b c0915b = A[i10];
        if (c0915b == null) {
            throw new IllegalArgumentException(i10 + "?");
        }
        if (this.f62768o == null) {
            this.f62768o = this.f62754a.b();
        }
        this.f62768o.k0(c0915b.f76654c);
        this.f62768o.Y(m.f62877a);
        while (this.f62768o.length() > 0) {
            try {
                int iK = this.f62755b.k(this.f62768o);
                if (iK < 0 || !this.f62755b.isOpen()) {
                    throw new EofException();
                }
                if (iK == 0) {
                    Thread.sleep(100L);
                }
            } catch (InterruptedException e10) {
                f76647z.b(e10);
                throw new InterruptedIOException(e10.toString());
            }
        }
    }

    public void H(d dVar) throws IOException {
        d dVar2;
        if (this.f62766m || this.f62756c != 0 || (((dVar2 = this.f62770q) != null && dVar2.length() > 0) || this.f76651y || this.f62765l)) {
            throw new IllegalStateException();
        }
        this.f62764k = true;
        this.f62770q = dVar;
        this.f76648v = true;
        this.f62756c = 3;
        long length = dVar.length();
        this.f62762i = length;
        this.f62763j = length;
    }

    @Override // gq.a, gq.c
    public void complete() throws IOException {
        if (this.f62756c == 4) {
            return;
        }
        super.complete();
        if (this.f62756c < 3) {
            this.f62756c = 3;
            if (this.f62763j == -2) {
                this.f76650x = true;
            }
        }
        l();
    }

    @Override // gq.c
    public void g(d dVar, boolean z10) throws IOException {
        d dVar2;
        d dVarD;
        if (this.f62766m) {
            throw new IllegalStateException("NO CONTENT");
        }
        if (this.f62764k || this.f62756c == 4) {
            f76647z.f("Ignoring extra content {}", dVar);
            dVar.clear();
            return;
        }
        this.f62764k = z10;
        d dVar3 = this.f62770q;
        if ((dVar3 != null && dVar3.length() > 0) || this.f76651y) {
            if (this.f62755b.x()) {
                throw new EofException();
            }
            l();
            d dVar4 = this.f62770q;
            if (dVar4 != null && dVar4.length() > 0) {
                if (this.f76651y) {
                    dVarD = this.f62754a.d(this.f62770q.length() + 12 + dVar.length());
                    dVarD.k0(this.f62770q);
                    byte[] bArr = m.f62877a;
                    dVarD.Y(bArr);
                    g.e(dVarD, dVar.length());
                    dVarD.Y(bArr);
                    dVarD.k0(dVar);
                } else {
                    dVarD = this.f62754a.d(this.f62770q.length() + dVar.length());
                    dVarD.k0(this.f62770q);
                    dVarD.k0(dVar);
                }
                dVar = dVarD;
            }
        }
        this.f62770q = dVar;
        this.f62762i += (long) dVar.length();
        if (this.f62765l) {
            dVar.clear();
            this.f62770q = null;
            return;
        }
        if (this.f62755b != null && (((dVar2 = this.f62769p) == null || dVar2.length() == 0) && this.f62770q.length() > 0 && (this.f62764k || (b() && this.f62770q.length() > 1024)))) {
            this.f76648v = true;
            return;
        }
        if (this.f76651y) {
            return;
        }
        if (this.f62769p == null) {
            this.f62769p = this.f62754a.getBuffer();
        }
        this.f62770q.skip(this.f62769p.k0(this.f62770q));
        if (this.f62770q.length() == 0) {
            this.f62770q = null;
        }
    }

    @Override // gq.a, gq.c
    public int l() throws IOException {
        d dVar;
        Boolean bool;
        d dVar2;
        d dVar3;
        try {
            if (this.f62756c == 0) {
                throw new IllegalStateException("State==HEADER");
            }
            F();
            if (this.f62755b == null) {
                if (this.f76649w && (dVar3 = this.f62769p) != null) {
                    dVar3.Y(m.f62877a);
                }
                if (this.f76650x && (dVar2 = this.f62769p) != null && !this.f62765l) {
                    dVar2.Y(B);
                }
                this.f76649w = false;
                this.f76650x = false;
                return 0;
            }
            int iK = -1;
            int iC = C();
            int i10 = 0;
            while (true) {
                switch (iC) {
                    case 0:
                        d dVar4 = this.f62768o;
                        if (dVar4 != null) {
                            dVar4.clear();
                        }
                        this.f76648v = false;
                        this.f76651y = false;
                        d dVar5 = this.f62769p;
                        if (dVar5 != null) {
                            dVar5.clear();
                            if (this.f62763j == -2) {
                                this.f62769p.X(12);
                                this.f62769p.l0(12);
                                d dVar6 = this.f62770q;
                                if (dVar6 != null && dVar6.length() < this.f62769p.L() && this.f62756c != 3) {
                                    this.f62769p.k0(this.f62770q);
                                    this.f62770q.clear();
                                    this.f62770q = null;
                                }
                            }
                        }
                        if (this.f76649w || this.f76650x || !((dVar = this.f62770q) == null || dVar.length() == 0)) {
                            F();
                        } else {
                            if (this.f62756c == 3) {
                                this.f62756c = 4;
                            }
                            if (this.f62756c == 4 && (bool = this.f62767n) != null && !bool.booleanValue() && this.f62757d != 100 && this.f62760g == null) {
                                this.f62755b.p();
                            }
                        }
                        iK = 0;
                        break;
                    case 1:
                        iK = this.f62755b.k(this.f62770q);
                        break;
                    case 2:
                        iK = this.f62755b.k(this.f62769p);
                        break;
                    case 3:
                        iK = this.f62755b.r(this.f62769p, this.f62770q, null);
                        break;
                    case 4:
                        iK = this.f62755b.k(this.f62768o);
                        break;
                    case 5:
                        iK = this.f62755b.r(this.f62768o, this.f62770q, null);
                        break;
                    case 6:
                        iK = this.f62755b.r(this.f62768o, this.f62769p, null);
                        break;
                    case 7:
                        throw new IllegalStateException();
                }
                if (iK > 0) {
                    i10 += iK;
                }
                int iC2 = C();
                if (iK > 0 || (iC2 != 0 && iC == 0)) {
                    iC = iC2;
                }
            }
            return i10;
        } catch (IOException e10) {
            f76647z.g(e10);
            if (e10 instanceof EofException) {
                throw e10;
            }
            throw new EofException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02b0 A[Catch: ArrayIndexOutOfBoundsException -> 0x051c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x051c, blocks: (B:21:0x0039, B:23:0x0052, B:26:0x005c, B:28:0x0082, B:30:0x00a4, B:32:0x00a9, B:75:0x0197, B:77:0x019d, B:79:0x01a1, B:82:0x01c7, B:84:0x01dc, B:185:0x035a, B:87:0x01e3, B:95:0x01f6, B:96:0x01fc, B:98:0x0202, B:100:0x020f, B:102:0x021b, B:104:0x0224, B:105:0x022f, B:107:0x023f, B:114:0x024d, B:115:0x0254, B:118:0x0260, B:120:0x026a, B:121:0x026f, B:127:0x027f, B:129:0x0288, B:128:0x0285, B:130:0x0291, B:132:0x0297, B:133:0x029e, B:135:0x02a2, B:137:0x02a8, B:139:0x02b0, B:141:0x02b6, B:142:0x02ba, B:144:0x02c2, B:146:0x02c8, B:148:0x02ce, B:150:0x02d4, B:152:0x02e2, B:154:0x02e5, B:156:0x02f3, B:160:0x02fd, B:162:0x0306, B:184:0x0353, B:161:0x0303, B:163:0x030c, B:165:0x0310, B:167:0x0316, B:169:0x031d, B:171:0x0323, B:172:0x0327, B:174:0x032f, B:176:0x0335, B:178:0x033b, B:181:0x0344, B:183:0x034e, B:182:0x034b, B:188:0x037b, B:234:0x0430, B:237:0x0438, B:239:0x043f, B:241:0x044b, B:242:0x0451, B:243:0x0458, B:244:0x0459, B:245:0x0460, B:247:0x0466, B:249:0x046d, B:251:0x0473, B:254:0x047d, B:256:0x0481, B:258:0x048a, B:260:0x04b1, B:262:0x04ba, B:264:0x04e1, B:266:0x04fe, B:268:0x0504, B:270:0x050a, B:271:0x0511, B:195:0x038c, B:197:0x0392, B:203:0x03a0, B:204:0x03a9, B:205:0x03b5, B:207:0x03bb, B:209:0x03bf, B:210:0x03c7, B:212:0x03cb, B:214:0x03d1, B:216:0x03d7, B:219:0x03e1, B:221:0x03e5, B:222:0x0409, B:224:0x0411, B:229:0x041b, B:231:0x0423, B:233:0x0429, B:31:0x00a7, B:33:0x00b5, B:35:0x00b9, B:37:0x00c2, B:42:0x00cc, B:43:0x00d2, B:45:0x00d9, B:49:0x00e1, B:51:0x0115, B:53:0x013a, B:58:0x0163, B:61:0x0169, B:63:0x0171, B:64:0x0174, B:66:0x017a, B:72:0x018c, B:74:0x0194, B:52:0x0135, B:54:0x0142, B:56:0x0146, B:57:0x014e), top: B:276:0x0039 }] */
    @Override // gq.a, gq.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(org.eclipse.jetty.http.a r28, boolean r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.b.m(org.eclipse.jetty.http.a, boolean):void");
    }

    @Override // gq.a, gq.c
    public void reset() {
        k kVar;
        Boolean bool = this.f62767n;
        if (bool != null && !bool.booleanValue() && (kVar = this.f62755b) != null && !kVar.x()) {
            try {
                this.f62755b.p();
            } catch (IOException e10) {
                f76647z.g(e10);
            }
        }
        super.reset();
        d dVar = this.f62769p;
        if (dVar != null) {
            dVar.clear();
        }
        d dVar2 = this.f62768o;
        if (dVar2 != null) {
            dVar2.clear();
        }
        if (this.f62770q != null) {
            this.f62770q = null;
        }
        this.f76648v = false;
        this.f76649w = false;
        this.f76650x = false;
        this.f76651y = false;
        this.f62760g = null;
        this.f62761h = null;
        this.f62766m = false;
    }

    public String toString() {
        d dVar = this.f62768o;
        d dVar2 = this.f62769p;
        d dVar3 = this.f62770q;
        Object[] objArr = new Object[5];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = Integer.valueOf(this.f62756c);
        objArr[2] = Integer.valueOf(dVar == null ? -1 : dVar.length());
        objArr[3] = Integer.valueOf(dVar2 == null ? -1 : dVar2.length());
        objArr[4] = Integer.valueOf(dVar3 != null ? dVar3.length() : -1);
        return String.format("%s{s=%d,h=%d,b=%d,c=%d}", objArr);
    }

    @Override // gq.a
    public boolean v() {
        d dVar;
        return super.v() || this.f76651y || this.f76648v || (this.f62763j == -2 && (dVar = this.f62769p) != null && dVar.L() < 12);
    }

    @Override // gq.a
    public boolean x() {
        return this.f62760g != null;
    }
}
