package k6;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.common.collect.r2;
import i6.b0;
import i6.i;
import i6.k;
import i6.l;
import i6.m;
import i6.y;
import i6.z;
import java.io.IOException;
import java.util.ArrayList;
import s7.a0;
import s7.q;
import s7.u;

/* JADX INFO: compiled from: AviExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72963c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k6.c f72965e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f72968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public e f72969i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f72973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f72974n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f72961a = new a0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f72962b = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f72964d = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e[] f72967g = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f72971k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f72972l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72970j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f72966f = -9223372036854775807L;

    /* JADX INFO: renamed from: k6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AviExtractor.java */
    public class C0859b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f72975a;

        public C0859b(long j10) {
            this.f72975a = j10;
        }

        @Override // i6.z
        public long getDurationUs() {
            return this.f72975a;
        }

        @Override // i6.z
        public z.a getSeekPoints(long j10) {
            z.a aVarI = b.this.f72967g[0].i(j10);
            for (int i10 = 1; i10 < b.this.f72967g.length; i10++) {
                z.a aVarI2 = b.this.f72967g[i10].i(j10);
                if (aVarI2.f63945a.f63839b < aVarI.f63945a.f63839b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // i6.z
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: AviExtractor.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f72978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f72979c;

        public c() {
        }

        public void a(a0 a0Var) {
            this.f72977a = a0Var.q();
            this.f72978b = a0Var.q();
            this.f72979c = 0;
        }

        public void b(a0 a0Var) throws ParserException {
            a(a0Var);
            if (this.f72977a == 1414744396) {
                this.f72979c = a0Var.q();
                return;
            }
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.f72977a, null);
        }
    }

    public static void e(l lVar) throws IOException {
        if ((lVar.getPosition() & 1) == 1) {
            lVar.skipFully(1);
        }
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f72963c = 0;
        this.f72964d = mVar;
        this.f72968h = -1L;
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        if (l(lVar, yVar)) {
            return 1;
        }
        switch (this.f72963c) {
            case 0:
                if (!c(lVar)) {
                    throw ParserException.createForMalformedContainer("AVI Header List not found", null);
                }
                lVar.skipFully(12);
                this.f72963c = 1;
                return 0;
            case 1:
                lVar.readFully(this.f72961a.d(), 0, 12);
                this.f72961a.P(0);
                this.f72962b.b(this.f72961a);
                c cVar = this.f72962b;
                if (cVar.f72979c == 1819436136) {
                    this.f72970j = cVar.f72978b;
                    this.f72963c = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.f72962b.f72979c, null);
            case 2:
                int i10 = this.f72970j - 4;
                a0 a0Var = new a0(i10);
                lVar.readFully(a0Var.d(), 0, i10);
                g(a0Var);
                this.f72963c = 3;
                return 0;
            case 3:
                if (this.f72971k != -1) {
                    long position = lVar.getPosition();
                    long j10 = this.f72971k;
                    if (position != j10) {
                        this.f72968h = j10;
                        return 0;
                    }
                }
                lVar.peekFully(this.f72961a.d(), 0, 12);
                lVar.resetPeekPosition();
                this.f72961a.P(0);
                this.f72962b.a(this.f72961a);
                int iQ = this.f72961a.q();
                int i11 = this.f72962b.f72977a;
                if (i11 == 1179011410) {
                    lVar.skipFully(12);
                    return 0;
                }
                if (i11 != 1414744396 || iQ != 1769369453) {
                    this.f72968h = lVar.getPosition() + ((long) this.f72962b.f72978b) + 8;
                    return 0;
                }
                long position2 = lVar.getPosition();
                this.f72971k = position2;
                this.f72972l = position2 + ((long) this.f72962b.f72978b) + 8;
                if (!this.f72974n) {
                    if (((k6.c) s7.a.e(this.f72965e)).a()) {
                        this.f72963c = 4;
                        this.f72968h = this.f72972l;
                        return 0;
                    }
                    this.f72964d.h(new z.b(this.f72966f));
                    this.f72974n = true;
                }
                this.f72968h = lVar.getPosition() + 12;
                this.f72963c = 6;
                return 0;
            case 4:
                lVar.readFully(this.f72961a.d(), 0, 8);
                this.f72961a.P(0);
                int iQ2 = this.f72961a.q();
                int iQ3 = this.f72961a.q();
                if (iQ2 == 829973609) {
                    this.f72963c = 5;
                    this.f72973m = iQ3;
                } else {
                    this.f72968h = lVar.getPosition() + ((long) iQ3);
                }
                return 0;
            case 5:
                a0 a0Var2 = new a0(this.f72973m);
                lVar.readFully(a0Var2.d(), 0, this.f72973m);
                h(a0Var2);
                this.f72963c = 6;
                this.f72968h = this.f72971k;
                return 0;
            case 6:
                return k(lVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        lVar.peekFully(this.f72961a.d(), 0, 12);
        this.f72961a.P(0);
        if (this.f72961a.q() != 1179011410) {
            return false;
        }
        this.f72961a.Q(4);
        return this.f72961a.q() == 541677121;
    }

    @Nullable
    public final e f(int i10) {
        for (e eVar : this.f72967g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    public final void g(a0 a0Var) throws IOException {
        f fVarC = f.c(1819436136, a0Var);
        if (fVarC.getType() != 1819436136) {
            throw ParserException.createForMalformedContainer("Unexpected header list type " + fVarC.getType(), null);
        }
        k6.c cVar = (k6.c) fVarC.b(k6.c.class);
        if (cVar == null) {
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        this.f72965e = cVar;
        this.f72966f = ((long) cVar.f72982c) * ((long) cVar.f72980a);
        ArrayList arrayList = new ArrayList();
        r2<k6.a> it = fVarC.f73002a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            k6.a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                e eVarJ = j((f) next, i10);
                if (eVarJ != null) {
                    arrayList.add(eVarJ);
                }
                i10 = i11;
            }
        }
        this.f72967g = (e[]) arrayList.toArray(new e[0]);
        this.f72964d.endTracks();
    }

    public final void h(a0 a0Var) {
        long jI = i(a0Var);
        while (a0Var.a() >= 16) {
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            long jQ = ((long) a0Var.q()) + jI;
            a0Var.q();
            e eVarF = f(iQ);
            if (eVarF != null) {
                if ((iQ2 & 16) == 16) {
                    eVarF.b(jQ);
                }
                eVarF.k();
            }
        }
        for (e eVar : this.f72967g) {
            eVar.c();
        }
        this.f72974n = true;
        this.f72964d.h(new C0859b(this.f72966f));
    }

    public final long i(a0 a0Var) {
        if (a0Var.a() < 16) {
            return 0L;
        }
        int iE = a0Var.e();
        a0Var.Q(8);
        long jQ = a0Var.q();
        long j10 = this.f72971k;
        long j11 = jQ <= j10 ? 8 + j10 : 0L;
        a0Var.P(iE);
        return j11;
    }

    @Nullable
    public final e j(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            q.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            q.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        com.google.android.exoplayer2.m mVar = gVar.f73004a;
        m.b bVarB = mVar.b();
        bVarB.R(i10);
        int i11 = dVar.f72989f;
        if (i11 != 0) {
            bVarB.W(i11);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.U(hVar.f73005a);
        }
        int i12 = u.i(mVar.f21751m);
        if (i12 != 1 && i12 != 2) {
            return null;
        }
        b0 b0VarTrack = this.f72964d.track(i10, i12);
        b0VarTrack.b(bVarB.E());
        e eVar = new e(i10, i12, jA, dVar.f72988e, b0VarTrack);
        this.f72966f = jA;
        return eVar;
    }

    public final int k(l lVar) throws IOException {
        if (lVar.getPosition() >= this.f72972l) {
            return -1;
        }
        e eVar = this.f72969i;
        if (eVar == null) {
            e(lVar);
            lVar.peekFully(this.f72961a.d(), 0, 12);
            this.f72961a.P(0);
            int iQ = this.f72961a.q();
            if (iQ == 1414744396) {
                this.f72961a.P(8);
                lVar.skipFully(this.f72961a.q() != 1769369453 ? 8 : 12);
                lVar.resetPeekPosition();
                return 0;
            }
            int iQ2 = this.f72961a.q();
            if (iQ == 1263424842) {
                this.f72968h = lVar.getPosition() + ((long) iQ2) + 8;
                return 0;
            }
            lVar.skipFully(8);
            lVar.resetPeekPosition();
            e eVarF = f(iQ);
            if (eVarF == null) {
                this.f72968h = lVar.getPosition() + ((long) iQ2);
                return 0;
            }
            eVarF.n(iQ2);
            this.f72969i = eVarF;
        } else if (eVar.m(lVar)) {
            this.f72969i = null;
        }
        return 0;
    }

    public final boolean l(l lVar, y yVar) throws IOException {
        boolean z10;
        if (this.f72968h != -1) {
            long position = lVar.getPosition();
            long j10 = this.f72968h;
            if (j10 < position || j10 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                yVar.f63944a = j10;
                z10 = true;
            } else {
                lVar.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f72968h = -1L;
        return z10;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f72968h = -1L;
        this.f72969i = null;
        for (e eVar : this.f72967g) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f72963c = 6;
        } else if (this.f72967g.length == 0) {
            this.f72963c = 0;
        } else {
            this.f72963c = 3;
        }
    }
}
