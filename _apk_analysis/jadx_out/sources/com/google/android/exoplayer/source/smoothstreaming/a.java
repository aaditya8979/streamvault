package com.google.android.exoplayer.source.smoothstreaming;

import a6.k0;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.BehindLiveWindowException;
import com.google.android.exoplayer.source.smoothstreaming.b;
import com.google.android.exoplayer.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer.upstream.a;
import e4.t0;
import g5.d;
import g5.e;
import g5.i;
import java.io.IOException;
import java.util.List;
import q4.f;
import q4.l;
import q4.m;
import y5.h;
import y5.n;
import y5.q;

/* JADX INFO: compiled from: DefaultSsChunkSource.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements com.google.android.exoplayer.source.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f20677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e[] f20679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f20680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer.trackselection.c f20681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer.source.smoothstreaming.manifest.a f20682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IOException f20684h;

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.smoothstreaming.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class C0292a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0296a f20685a;

        public C0292a(a.InterfaceC0296a interfaceC0296a) {
            this.f20685a = interfaceC0296a;
        }

        @Override // com.google.android.exoplayer.source.smoothstreaming.b.a
        public com.google.android.exoplayer.source.smoothstreaming.b a(n nVar, com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer.trackselection.c cVar, @Nullable q qVar) {
            com.google.android.exoplayer.upstream.a aVarCreateDataSource = this.f20685a.createDataSource();
            if (qVar != null) {
                aVarCreateDataSource.b(qVar);
            }
            return new a(nVar, aVar, i10, cVar, aVarCreateDataSource);
        }
    }

    /* JADX INFO: compiled from: DefaultSsChunkSource.java */
    public static final class b extends g5.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b f20686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20687f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f20755k - 1);
            this.f20686e = bVar;
            this.f20687f = i10;
        }
    }

    public a(n nVar, com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar, int i10, com.google.android.exoplayer.trackselection.c cVar, com.google.android.exoplayer.upstream.a aVar2) {
        this.f20677a = nVar;
        this.f20682f = aVar;
        this.f20678b = i10;
        this.f20681e = cVar;
        this.f20680d = aVar2;
        a.b bVar = aVar.f20739f[i10];
        this.f20679c = new e[cVar.length()];
        int i11 = 0;
        while (i11 < this.f20679c.length) {
            int indexInTrackGroup = cVar.getIndexInTrackGroup(i11);
            Format format = bVar.f20754j[indexInTrackGroup];
            m[] mVarArr = format.f19930m != null ? aVar.f20738e.f20744c : null;
            int i12 = bVar.f20745a;
            int i13 = i11;
            this.f20679c[i13] = new e(new f(3, null, new l(indexInTrackGroup, i12, bVar.f20747c, -9223372036854775807L, aVar.f20740g, format, 0, mVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f20745a, format);
            i11 = i13 + 1;
        }
    }

    public static g5.l h(Format format, com.google.android.exoplayer.upstream.a aVar, Uri uri, String str, int i10, long j10, long j11, long j12, int i11, Object obj, e eVar) {
        return new i(aVar, new h(uri, 0L, -1L, str), format, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, eVar);
    }

    @Override // g5.h
    public long a(long j10, t0 t0Var) {
        a.b bVar = this.f20682f.f20739f[this.f20678b];
        int iD = bVar.d(j10);
        long jE = bVar.e(iD);
        return k0.x0(j10, t0Var, jE, (jE >= j10 || iD >= bVar.f20755k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // com.google.android.exoplayer.source.smoothstreaming.b
    public void b(com.google.android.exoplayer.trackselection.c cVar) {
        this.f20681e = cVar;
    }

    @Override // com.google.android.exoplayer.source.smoothstreaming.b
    public void c(com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar) {
        a.b[] bVarArr = this.f20682f.f20739f;
        int i10 = this.f20678b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f20755k;
        a.b bVar2 = aVar.f20739f[i10];
        if (i11 == 0 || bVar2.f20755k == 0) {
            this.f20683g += i11;
        } else {
            int i12 = i11 - 1;
            long jE = bVar.e(i12) + bVar.c(i12);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f20683g += i11;
            } else {
                this.f20683g += bVar.d(jE2);
            }
        }
        this.f20682f = aVar;
    }

    @Override // g5.h
    public void d(d dVar) {
    }

    @Override // g5.h
    public final void e(long j10, long j11, List<? extends g5.l> list, g5.f fVar) {
        int iE;
        long j12 = j11;
        if (this.f20684h != null) {
            return;
        }
        a.b bVar = this.f20682f.f20739f[this.f20678b];
        if (bVar.f20755k == 0) {
            fVar.f62035b = !r4.f20737d;
            return;
        }
        if (list.isEmpty()) {
            iE = bVar.d(j12);
        } else {
            iE = (int) (list.get(list.size() - 1).e() - ((long) this.f20683g));
            if (iE < 0) {
                this.f20684h = new BehindLiveWindowException();
                return;
            }
        }
        if (iE >= bVar.f20755k) {
            fVar.f62035b = !this.f20682f.f20737d;
            return;
        }
        long j13 = j12 - j10;
        long jI = i(j10);
        int length = this.f20681e.length();
        g5.m[] mVarArr = new g5.m[length];
        for (int i10 = 0; i10 < length; i10++) {
            mVarArr[i10] = new b(bVar, this.f20681e.getIndexInTrackGroup(i10), iE);
        }
        this.f20681e.a(j10, j13, jI, list, mVarArr);
        long jE = bVar.e(iE);
        long jC = jE + bVar.c(iE);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = iE + this.f20683g;
        int selectedIndex = this.f20681e.getSelectedIndex();
        fVar.f62034a = h(this.f20681e.getSelectedFormat(), this.f20680d, bVar.a(this.f20681e.getIndexInTrackGroup(selectedIndex), iE), null, i11, jE, jC, j14, this.f20681e.getSelectionReason(), this.f20681e.getSelectionData(), this.f20679c[selectedIndex]);
    }

    @Override // g5.h
    public boolean f(d dVar, boolean z10, Exception exc, long j10) {
        if (z10 && j10 != -9223372036854775807L) {
            com.google.android.exoplayer.trackselection.c cVar = this.f20681e;
            if (cVar.blacklist(cVar.b(dVar.f62012c), j10)) {
                return true;
            }
        }
        return false;
    }

    @Override // g5.h
    public int getPreferredQueueSize(long j10, List<? extends g5.l> list) {
        return (this.f20684h != null || this.f20681e.length() < 2) ? list.size() : this.f20681e.evaluateQueueSize(j10, list);
    }

    public final long i(long j10) {
        com.google.android.exoplayer.source.smoothstreaming.manifest.a aVar = this.f20682f;
        if (!aVar.f20737d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f20739f[this.f20678b];
        int i10 = bVar.f20755k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // g5.h
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f20684h;
        if (iOException != null) {
            throw iOException;
        }
        this.f20677a.maybeThrowError();
    }
}
