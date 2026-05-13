package s6;

import com.google.android.exoplayer2.ParserException;
import s6.i0;

/* JADX INFO: compiled from: ElementaryStreamReader.java */
/* JADX INFO: loaded from: classes10.dex */
public interface m {
    void a(s7.a0 a0Var) throws ParserException;

    void b(i6.m mVar, i0.d dVar);

    void packetFinished();

    void packetStarted(long j10, int i10);

    void seek();
}
