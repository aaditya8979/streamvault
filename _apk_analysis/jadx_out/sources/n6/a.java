package n6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import i6.k;
import i6.l;
import i6.m;
import i6.y;
import i6.z;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: JpegExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f75160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75163e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f75165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f75166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f75167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public q6.k f75168j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f75159a = new a0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75164f = -1;

    @Nullable
    public static MotionPhotoMetadata f(String str, long j10) throws IOException {
        b bVarA;
        if (j10 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j10);
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f75160b = mVar;
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        int i10 = this.f75161c;
        if (i10 == 0) {
            i(lVar);
            return 0;
        }
        if (i10 == 1) {
            k(lVar);
            return 0;
        }
        if (i10 == 2) {
            j(lVar);
            return 0;
        }
        if (i10 == 4) {
            long position = lVar.getPosition();
            long j10 = this.f75164f;
            if (position != j10) {
                yVar.f63944a = j10;
                return 1;
            }
            l(lVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f75167i == null || lVar != this.f75166h) {
            this.f75166h = lVar;
            this.f75167i = new c(lVar, this.f75164f);
        }
        int iB = ((q6.k) s7.a.e(this.f75168j)).b(this.f75167i, yVar);
        if (iB == 1) {
            yVar.f63944a += this.f75164f;
        }
        return iB;
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        if (h(lVar) != 65496) {
            return false;
        }
        int iH = h(lVar);
        this.f75162d = iH;
        if (iH == 65504) {
            d(lVar);
            this.f75162d = h(lVar);
        }
        if (this.f75162d != 65505) {
            return false;
        }
        lVar.advancePeekPosition(2);
        this.f75159a.L(6);
        lVar.peekFully(this.f75159a.d(), 0, 6);
        return this.f75159a.F() == 1165519206 && this.f75159a.J() == 0;
    }

    public final void d(l lVar) throws IOException {
        this.f75159a.L(2);
        lVar.peekFully(this.f75159a.d(), 0, 2);
        lVar.advancePeekPosition(this.f75159a.J() - 2);
    }

    public final void e() {
        g(new Metadata.Entry[0]);
        ((m) s7.a.e(this.f75160b)).endTracks();
        this.f75160b.h(new z.b(-9223372036854775807L));
        this.f75161c = 6;
    }

    public final void g(Metadata.Entry... entryArr) {
        ((m) s7.a.e(this.f75160b)).track(1024, 4).b(new m.b().K("image/jpeg").X(new Metadata(entryArr)).E());
    }

    public final int h(l lVar) throws IOException {
        this.f75159a.L(2);
        lVar.peekFully(this.f75159a.d(), 0, 2);
        return this.f75159a.J();
    }

    public final void i(l lVar) throws IOException {
        this.f75159a.L(2);
        lVar.readFully(this.f75159a.d(), 0, 2);
        int iJ = this.f75159a.J();
        this.f75162d = iJ;
        if (iJ == 65498) {
            if (this.f75164f != -1) {
                this.f75161c = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((iJ < 65488 || iJ > 65497) && iJ != 65281) {
            this.f75161c = 1;
        }
    }

    public final void j(l lVar) throws IOException {
        String strX;
        if (this.f75162d == 65505) {
            a0 a0Var = new a0(this.f75163e);
            lVar.readFully(a0Var.d(), 0, this.f75163e);
            if (this.f75165g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.x()) && (strX = a0Var.x()) != null) {
                MotionPhotoMetadata motionPhotoMetadataF = f(strX, lVar.getLength());
                this.f75165g = motionPhotoMetadataF;
                if (motionPhotoMetadataF != null) {
                    this.f75164f = motionPhotoMetadataF.f21956e;
                }
            }
        } else {
            lVar.skipFully(this.f75163e);
        }
        this.f75161c = 0;
    }

    public final void k(l lVar) throws IOException {
        this.f75159a.L(2);
        lVar.readFully(this.f75159a.d(), 0, 2);
        this.f75163e = this.f75159a.J() - 2;
        this.f75161c = 2;
    }

    public final void l(l lVar) throws IOException {
        if (!lVar.peekFully(this.f75159a.d(), 0, 1, true)) {
            e();
            return;
        }
        lVar.resetPeekPosition();
        if (this.f75168j == null) {
            this.f75168j = new q6.k();
        }
        c cVar = new c(lVar, this.f75164f);
        this.f75167i = cVar;
        if (!this.f75168j.c(cVar)) {
            e();
        } else {
            this.f75168j.a(new d(this.f75164f, (i6.m) s7.a.e(this.f75160b)));
            m();
        }
    }

    public final void m() {
        g((Metadata.Entry) s7.a.e(this.f75165g));
        this.f75161c = 5;
    }

    @Override // i6.k
    public void release() {
        q6.k kVar = this.f75168j;
        if (kVar != null) {
            kVar.release();
        }
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f75161c = 0;
            this.f75168j = null;
        } else if (this.f75161c == 5) {
            ((q6.k) s7.a.e(this.f75168j)).seek(j10, j11);
        }
    }
}
