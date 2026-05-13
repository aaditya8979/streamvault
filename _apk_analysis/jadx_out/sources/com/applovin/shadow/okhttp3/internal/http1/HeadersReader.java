package com.applovin.shadow.okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okio.BufferedSource;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HeadersReader {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;

    @NotNull
    private final BufferedSource source;

    /* JADX INFO: compiled from: HeadersReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public HeadersReader(@NotNull BufferedSource bufferedSource) {
        p.k(bufferedSource, "source");
        this.source = bufferedSource;
        this.headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.source;
    }

    @NotNull
    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    @NotNull
    public final String readLine() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
