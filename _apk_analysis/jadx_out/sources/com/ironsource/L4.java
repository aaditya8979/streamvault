package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class L4 implements W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final L4 f29754a = new L4();

    private L4() {
    }

    @Override // com.ironsource.W3
    @NotNull
    public InputStream a(@NotNull String str) throws IOException {
        tn.p.k(str, "url");
        InputStream inputStreamOpenStream = new URL(str).openStream();
        tn.p.j(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
