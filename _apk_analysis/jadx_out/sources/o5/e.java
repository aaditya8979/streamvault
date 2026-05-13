package o5;

import androidx.annotation.NonNull;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n5.h;
import n5.i;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class e implements n5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f76187a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<i> f76188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue<b> f76189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f76190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f76191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f76192f;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class b extends h implements Comparable<b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f76193i;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.f63713e - bVar.f63713e;
            if (j10 == 0) {
                j10 = this.f76193i - bVar.f76193i;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public final class c extends i {
        public c() {
        }

        @Override // n5.i, i4.f
        public final void release() {
            e.this.h(this);
        }
    }

    public e() {
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                break;
            }
            this.f76187a.add(new b());
            i10++;
        }
        this.f76188b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f76188b.add(new c());
        }
        this.f76189c = new PriorityQueue<>();
    }

    public abstract n5.e a();

    public abstract void b(h hVar);

    @Override // i4.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h dequeueInputBuffer() throws SubtitleDecoderException {
        a6.a.f(this.f76190d == null);
        if (this.f76187a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f76187a.pollFirst();
        this.f76190d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // i4.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.f76188b.isEmpty()) {
            return null;
        }
        while (!this.f76189c.isEmpty() && this.f76189c.peek().f63713e <= this.f76191e) {
            b bVarPoll = this.f76189c.poll();
            if (bVarPoll.isEndOfStream()) {
                i iVarPollFirst = this.f76188b.pollFirst();
                iVarPollFirst.addFlag(4);
                g(bVarPoll);
                return iVarPollFirst;
            }
            b(bVarPoll);
            if (e()) {
                n5.e eVarA = a();
                if (!bVarPoll.isDecodeOnly()) {
                    i iVarPollFirst2 = this.f76188b.pollFirst();
                    iVarPollFirst2.a(bVarPoll.f63713e, eVarA, Long.MAX_VALUE);
                    g(bVarPoll);
                    return iVarPollFirst2;
                }
            }
            g(bVarPoll);
        }
        return null;
    }

    public abstract boolean e();

    @Override // i4.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(h hVar) throws SubtitleDecoderException {
        a6.a.a(hVar == this.f76190d);
        if (hVar.isDecodeOnly()) {
            g(this.f76190d);
        } else {
            b bVar = this.f76190d;
            long j10 = this.f76192f;
            this.f76192f = 1 + j10;
            bVar.f76193i = j10;
            this.f76189c.add(this.f76190d);
        }
        this.f76190d = null;
    }

    @Override // i4.c
    public void flush() {
        this.f76192f = 0L;
        this.f76191e = 0L;
        while (!this.f76189c.isEmpty()) {
            g(this.f76189c.poll());
        }
        b bVar = this.f76190d;
        if (bVar != null) {
            g(bVar);
            this.f76190d = null;
        }
    }

    public final void g(b bVar) {
        bVar.clear();
        this.f76187a.add(bVar);
    }

    public void h(i iVar) {
        iVar.clear();
        this.f76188b.add(iVar);
    }

    @Override // i4.c
    public void release() {
    }

    @Override // n5.f
    public void setPositionUs(long j10) {
        this.f76191e = j10;
    }
}
