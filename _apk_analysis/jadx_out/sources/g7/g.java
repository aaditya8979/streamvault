package g7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f62175a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f62176b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deque<n> f62177c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62179e;

    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    public class a extends n {
        public a() {
        }

        @Override // g6.f
        public void l() {
            g.this.e(this);
        }
    }

    /* JADX INFO: compiled from: ExoplayerCuesDecoder.java */
    public static final class b implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f62181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImmutableList<g7.b> f62182c;

        public b(long j10, ImmutableList<g7.b> immutableList) {
            this.f62181b = j10;
            this.f62182c = immutableList;
        }

        @Override // g7.i
        public List<g7.b> getCues(long j10) {
            return j10 >= this.f62181b ? this.f62182c : ImmutableList.of();
        }

        @Override // g7.i
        public long getEventTime(int i10) {
            s7.a.a(i10 == 0);
            return this.f62181b;
        }

        @Override // g7.i
        public int getEventTimeCount() {
            return 1;
        }

        @Override // g7.i
        public int getNextEventTimeIndex(long j10) {
            return this.f62181b > j10 ? 0 : -1;
        }
    }

    public g() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f62177c.addFirst(new a());
        }
        this.f62178d = 0;
    }

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m dequeueInputBuffer() throws SubtitleDecoderException {
        s7.a.g(!this.f62179e);
        if (this.f62178d != 0) {
            return null;
        }
        this.f62178d = 1;
        return this.f62176b;
    }

    @Override // g6.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n dequeueOutputBuffer() throws SubtitleDecoderException {
        s7.a.g(!this.f62179e);
        if (this.f62178d != 2 || this.f62177c.isEmpty()) {
            return null;
        }
        n nVarRemoveFirst = this.f62177c.removeFirst();
        if (this.f62176b.g()) {
            nVarRemoveFirst.a(4);
        } else {
            m mVar = this.f62176b;
            nVarRemoveFirst.m(this.f62176b.f21432f, new b(mVar.f21432f, this.f62175a.a(((ByteBuffer) s7.a.e(mVar.f21430d)).array())), 0L);
        }
        this.f62176b.b();
        this.f62178d = 0;
        return nVarRemoveFirst;
    }

    @Override // g6.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(m mVar) throws SubtitleDecoderException {
        s7.a.g(!this.f62179e);
        s7.a.g(this.f62178d == 1);
        s7.a.a(this.f62176b == mVar);
        this.f62178d = 2;
    }

    public final void e(n nVar) {
        s7.a.g(this.f62177c.size() < 2);
        s7.a.a(!this.f62177c.contains(nVar));
        nVar.b();
        this.f62177c.addFirst(nVar);
    }

    @Override // g6.d
    public void flush() {
        s7.a.g(!this.f62179e);
        this.f62176b.b();
        this.f62178d = 0;
    }

    @Override // g6.d
    public void release() {
        this.f62179e = true;
    }

    @Override // g7.j
    public void setPositionUs(long j10) {
    }
}
