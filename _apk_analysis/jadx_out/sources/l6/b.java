package l6;

import i6.a;
import i6.l;
import i6.q;
import i6.t;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends i6.a {

    /* JADX INFO: renamed from: l6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class C0871b implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f73689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q.a f73691c;

        public C0871b(t tVar, int i10) {
            this.f73689a = tVar;
            this.f73690b = i10;
            this.f73691c = new q.a();
        }

        @Override // i6.a.f
        public a.e a(l lVar, long j10) throws IOException {
            long position = lVar.getPosition();
            long jB = b(lVar);
            long peekPosition = lVar.getPeekPosition();
            lVar.advancePeekPosition(Math.max(6, this.f73689a.f63923c));
            long jB2 = b(lVar);
            return (jB > j10 || jB2 <= j10) ? jB2 <= j10 ? a.e.f(jB2, lVar.getPeekPosition()) : a.e.d(jB, position) : a.e.e(peekPosition);
        }

        public final long b(l lVar) throws IOException {
            while (lVar.getPeekPosition() < lVar.getLength() - 6 && !q.h(lVar, this.f73689a, this.f73690b, this.f73691c)) {
                lVar.advancePeekPosition(1);
            }
            if (lVar.getPeekPosition() < lVar.getLength() - 6) {
                return this.f73691c.f63917a;
            }
            lVar.advancePeekPosition((int) (lVar.getLength() - lVar.getPeekPosition()));
            return this.f73689a.f63930j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final t tVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: l6.a
            @Override // i6.a.d
            public final long timeUsToTargetTime(long j12) {
                return tVar.i(j12);
            }
        }, new C0871b(tVar, i10), tVar.f(), 0L, tVar.f63930j, j10, j11, tVar.d(), Math.max(6, tVar.f63923c));
        Objects.requireNonNull(tVar);
    }
}
