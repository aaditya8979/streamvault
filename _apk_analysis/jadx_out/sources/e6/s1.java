package e6;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: PlayerId.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f60799b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f60800a;

    /* JADX INFO: compiled from: PlayerId.java */
    @RequiresApi(31)
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f60801b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f60802a;

        public a(LogSessionId logSessionId) {
            this.f60802a = logSessionId;
        }
    }

    static {
        f60799b = s7.m0.f79487a < 31 ? new s1() : new s1(a.f60801b);
    }

    public s1() {
        this((a) null);
        s7.a.g(s7.m0.f79487a < 31);
    }

    @RequiresApi(31)
    public s1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public s1(@Nullable a aVar) {
        this.f60800a = aVar;
    }

    @RequiresApi(31)
    public LogSessionId a() {
        return ((a) s7.a.e(this.f60800a)).f60802a;
    }
}
