package com.applovin.shadow.okio;

import com.ironsource.C3978d4;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedOkio.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeprecatedOkio {

    @NotNull
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        return Okio.appendingSink(file);
    }

    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        p.k(sink, "sink");
        return Okio.buffer(sink);
    }

    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        p.k(source, "source");
        return Okio.buffer(source);
    }

    @NotNull
    public final Sink sink(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        p.k(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        p.k(socket, "socket");
        return Okio.sink(socket);
    }

    @NotNull
    public final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        p.k(path, "path");
        p.k(openOptionArr, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @NotNull
    public final Source source(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        return Okio.source(file);
    }

    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        p.k(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @NotNull
    public final Source source(@NotNull Socket socket) {
        p.k(socket, "socket");
        return Okio.source(socket);
    }

    @NotNull
    public final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        p.k(path, "path");
        p.k(openOptionArr, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
