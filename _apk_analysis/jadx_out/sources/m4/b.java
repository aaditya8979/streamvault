package m4;

import a6.j;
import java.io.IOException;
import java.util.Objects;
import k4.a;
import k4.h;
import k4.l;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends k4.a {

    /* JADX INFO: renamed from: m4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0877b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f73965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.a f73967c;

        public C0877b(j jVar, int i10) {
            this.f73965a = jVar;
            this.f73966b = i10;
            this.f73967c = new l.a();
        }

        @Override // k4.a.f
        public a.e a(h hVar, long j10) throws InterruptedException, IOException {
            long position = hVar.getPosition();
            long jB = b(hVar);
            long peekPosition = hVar.getPeekPosition();
            hVar.advancePeekPosition(Math.max(6, this.f73965a.f3561c));
            long jB2 = b(hVar);
            return (jB > j10 || jB2 <= j10) ? jB2 <= j10 ? a.e.f(jB2, hVar.getPeekPosition()) : a.e.d(jB, position) : a.e.e(peekPosition);
        }

        public final long b(h hVar) throws InterruptedException, IOException {
            while (hVar.getPeekPosition() < hVar.getLength() - 6 && !l.h(hVar, this.f73965a, this.f73966b, this.f73967c)) {
                hVar.advancePeekPosition(1);
            }
            if (hVar.getPeekPosition() < hVar.getLength() - 6) {
                return this.f73967c.f72896a;
            }
            hVar.advancePeekPosition((int) (hVar.getLength() - hVar.getPeekPosition()));
            return this.f73965a.f3568j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final j jVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: m4.a
            @Override // k4.a.d
            public final long timeUsToTargetTime(long j12) {
                return jVar.k(j12);
            }
        }, new C0877b(jVar, i10), jVar.h(), 0L, jVar.f3568j, j10, j11, jVar.e(), Math.max(6, jVar.f3561c));
        Objects.requireNonNull(jVar);
    }
}
