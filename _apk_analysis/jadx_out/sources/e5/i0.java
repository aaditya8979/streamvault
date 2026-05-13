package e5;

import java.io.IOException;

/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes11.dex */
public interface i0 {
    int b(e4.f0 f0Var, i4.e eVar, boolean z10);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j10);
}
