package okio;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink sink) {
        p.k(sink, "<this>");
        return new GzipSink(sink);
    }
}
