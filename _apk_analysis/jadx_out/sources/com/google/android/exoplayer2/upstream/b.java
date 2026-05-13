package com.google.android.exoplayer2.upstream;

import e7.n;
import e7.o;
import java.io.IOException;

/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f22892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f22893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f22894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f22895d;

        public a(n nVar, o oVar, IOException iOException, int i10) {
            this.f22892a = nVar;
            this.f22893b = oVar;
            this.f22894c = iOException;
            this.f22895d = i10;
        }
    }

    long a(a aVar);

    int getMinimumLoadableRetryCount(int i10);

    default void onLoadTaskConcluded(long j10) {
    }
}
