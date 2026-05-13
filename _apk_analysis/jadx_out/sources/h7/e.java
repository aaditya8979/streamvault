package h7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g6.f;
import g7.i;
import g7.j;
import g7.m;
import g7.n;
import h7.e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import s7.m0;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f63087a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<n> f63088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f63089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public b f63090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f63091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f63092f;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends m implements Comparable<b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f63093k;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (g() != bVar.g()) {
                return g() ? 1 : -1;
            }
            long j10 = this.f21432f - bVar.f21432f;
            if (j10 == 0) {
                j10 = this.f63093k - bVar.f63093k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class c extends n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f.a<c> f63094g;

        public c(f.a<c> aVar) {
            this.f63094g = aVar;
        }

        @Override // g6.f
        public final void l() {
            this.f63094g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f63087a.add(new b());
        }
        this.f63088b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f63088b.add(new c(new f.a() { // from class: h7.d
                @Override // g6.f.a
                public final void a(g6.f fVar) {
                    this.f63086a.j((e.c) fVar);
                }
            }));
        }
        this.f63089c = new PriorityQueue<>();
    }

    public abstract i a();

    public abstract void b(m mVar);

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m dequeueInputBuffer() throws SubtitleDecoderException {
        s7.a.g(this.f63090d == null);
        if (this.f63087a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f63087a.pollFirst();
        this.f63090d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.f63088b.isEmpty()) {
            return null;
        }
        while (!this.f63089c.isEmpty() && ((b) m0.j(this.f63089c.peek())).f21432f <= this.f63091e) {
            b bVar = (b) m0.j(this.f63089c.poll());
            if (bVar.g()) {
                n nVar = (n) m0.j(this.f63088b.pollFirst());
                nVar.a(4);
                i(bVar);
                return nVar;
            }
            b(bVar);
            if (g()) {
                i iVarA = a();
                n nVar2 = (n) m0.j(this.f63088b.pollFirst());
                nVar2.m(bVar.f21432f, iVarA, Long.MAX_VALUE);
                i(bVar);
                return nVar2;
            }
            i(bVar);
        }
        return null;
    }

    @Nullable
    public final n e() {
        return this.f63088b.pollFirst();
    }

    public final long f() {
        return this.f63091e;
    }

    @Override // g6.d
    public void flush() {
        this.f63092f = 0L;
        this.f63091e = 0L;
        while (!this.f63089c.isEmpty()) {
            i((b) m0.j(this.f63089c.poll()));
        }
        b bVar = this.f63090d;
        if (bVar != null) {
            i(bVar);
            this.f63090d = null;
        }
    }

    public abstract boolean g();

    @Override // g6.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(m mVar) throws SubtitleDecoderException {
        s7.a.a(mVar == this.f63090d);
        b bVar = (b) mVar;
        if (bVar.f()) {
            i(bVar);
        } else {
            long j10 = this.f63092f;
            this.f63092f = 1 + j10;
            bVar.f63093k = j10;
            this.f63089c.add(bVar);
        }
        this.f63090d = null;
    }

    public final void i(b bVar) {
        bVar.b();
        this.f63087a.add(bVar);
    }

    public void j(n nVar) {
        nVar.b();
        this.f63088b.add(nVar);
    }

    @Override // g6.d
    public void release() {
    }

    @Override // g7.j
    public void setPositionUs(long j10) {
        this.f63091e = j10;
    }
}
