package t4;

import com.google.android.exoplayer.ParserException;
import t4.h0;

/* JADX INFO: compiled from: ElementaryStreamReader.java */
/* JADX INFO: loaded from: classes4.dex */
public interface m {
    void a(a6.t tVar) throws ParserException;

    void b(k4.i iVar, h0.d dVar);

    void packetFinished();

    void packetStarted(long j10, int i10);

    void seek();
}
