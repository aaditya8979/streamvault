package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Hpack.java */
/* JADX INFO: loaded from: classes9.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f40467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f40468b;

    /* JADX INFO: compiled from: Hpack.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f40469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f40470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f40471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f40473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f40475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40476h;

        public a(int i10, int i11, s sVar) {
            this.f40469a = new ArrayList();
            this.f40473e = new c[8];
            this.f40474f = 7;
            this.f40475g = 0;
            this.f40476h = 0;
            this.f40471c = i10;
            this.f40472d = i11;
            this.f40470b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private int a(int i10) {
            return this.f40474f + 1 + i10;
        }

        private void a() {
            int i10 = this.f40472d;
            int i11 = this.f40476h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void a(int i10, c cVar) {
            this.f40469a.add(cVar);
            int i11 = cVar.f40466c;
            if (i10 != -1) {
                i11 -= this.f40473e[a(i10)].f40466c;
            }
            int i12 = this.f40472d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f40476h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f40475g + 1;
                c[] cVarArr = this.f40473e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f40474f = this.f40473e.length - 1;
                    this.f40473e = cVarArr2;
                }
                int i14 = this.f40474f;
                this.f40474f = i14 - 1;
                this.f40473e[i14] = cVar;
                this.f40475g++;
            } else {
                this.f40473e[i10 + a(i10) + iB] = cVar;
            }
            this.f40476h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f40473e.length;
                while (true) {
                    length--;
                    i11 = this.f40474f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f40473e[length].f40466c;
                    i10 -= i13;
                    this.f40476h -= i13;
                    this.f40475g--;
                    i12++;
                }
                c[] cVarArr = this.f40473e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f40475g);
                this.f40474f += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f40473e, (Object) null);
            this.f40474f = this.f40473e.length - 1;
            this.f40475g = 0;
            this.f40476h = 0;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f40467a[i10].f40464a;
            }
            int iA = a(i10 - d.f40467a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f40473e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f40464a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int d() throws IOException {
            return this.f40470b.readByte() & 255;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f40467a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f40469a.add(d.f40467a[i10]);
                return;
            }
            int iA = a(i10 - d.f40467a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f40473e;
                if (iA < cVarArr.length) {
                    this.f40469a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void g(int i10) throws IOException {
            this.f40469a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f40469a.add(new c(d.a(e()), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f40469a);
            this.f40469a.clear();
            return arrayList;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            return z10 ? com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f40470b.c(iA))) : this.f40470b.b(iA);
        }

        public void f() throws IOException {
            while (!this.f40470b.f()) {
                int i10 = this.f40470b.readByte() & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((i10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((i10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((i10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f40472d = iA;
                    if (iA < 0 || iA > this.f40471c) {
                        throw new IOException("Invalid dynamic table size update " + this.f40472d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Hpack.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f40477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f40478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f40483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f40484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f40485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f40486j;

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f40479c = Integer.MAX_VALUE;
            this.f40483g = new c[8];
            this.f40484h = 7;
            this.f40485i = 0;
            this.f40486j = 0;
            this.f40481e = i10;
            this.f40482f = i10;
            this.f40478b = z10;
            this.f40477a = cVar;
        }

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f40483g.length;
                while (true) {
                    length--;
                    i11 = this.f40484h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f40483g[length].f40466c;
                    i10 -= i13;
                    this.f40486j -= i13;
                    this.f40485i--;
                    i12++;
                }
                c[] cVarArr = this.f40483g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f40485i);
                c[] cVarArr2 = this.f40483g;
                int i15 = this.f40484h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f40484h += i12;
            }
            return i12;
        }

        private void a() {
            int i10 = this.f40482f;
            int i11 = this.f40486j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }

        private void a(c cVar) {
            int i10 = cVar.f40466c;
            int i11 = this.f40482f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f40486j + i10) - i11);
            int i12 = this.f40485i + 1;
            c[] cVarArr = this.f40483g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f40484h = this.f40483g.length - 1;
                this.f40483g = cVarArr2;
            }
            int i13 = this.f40484h;
            this.f40484h = i13 - 1;
            this.f40483g[i13] = cVar;
            this.f40485i++;
            this.f40486j += i10;
        }

        private void b() {
            Arrays.fill(this.f40483g, (Object) null);
            this.f40484h = this.f40483g.length - 1;
            this.f40485i = 0;
            this.f40486j = 0;
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f40477a.writeByte(i10 | i12);
                return;
            }
            this.f40477a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f40477a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f40477a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (!this.f40478b || k.b().a(fVar) >= fVar.j()) {
                a(fVar.j(), 127, 0);
                this.f40477a.a(fVar);
                return;
            }
            com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
            k.b().a(fVar, cVar);
            com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
            a(fVarO.j(), 127, 128);
            this.f40477a.a(fVarO);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.d.b.a(java.util.List):void");
        }

        public void b(int i10) {
            this.f40481e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f40482f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f40479c = Math.min(this.f40479c, iMin);
            }
            this.f40480d = true;
            this.f40482f = iMin;
            a();
        }
    }

    static {
        com.mbridge.msdk.thrid.okio.f fVar = c.f40460f;
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f40461g;
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f40462h;
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f40459e;
        f40467a = new c[]{new c(c.f40463i, ""), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f40468b = a();
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f40467a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f40467a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f40464a)) {
                linkedHashMap.put(cVarArr[i10].f40464a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
