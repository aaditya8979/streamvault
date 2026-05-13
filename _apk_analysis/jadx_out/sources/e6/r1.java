package e6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.i;
import e6.b;

/* JADX INFO: compiled from: PlaybackSessionManager.java */
/* JADX INFO: loaded from: classes2.dex */
public interface r1 {

    /* JADX INFO: compiled from: PlaybackSessionManager.java */
    public interface a {
        void J(b.a aVar, String str, String str2);

        void P(b.a aVar, String str);

        void h(b.a aVar, String str);

        void u(b.a aVar, String str, boolean z10);
    }

    void a(b.a aVar);

    void b(b.a aVar);

    void c(b.a aVar);

    void d(b.a aVar, int i10);

    void e(a aVar);

    String f(com.google.android.exoplayer2.c0 c0Var, i.b bVar);

    @Nullable
    String getActiveSessionId();
}
