package io.ktor.util.cio;

import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.io.File;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.k0;
import p000do.m1;
import p000do.w0;
import sl.f;
import tn.p;

/* JADX INFO: compiled from: FileChannels.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FileChannelsKt {
    @NotNull
    public static final f a(@NotNull File file, @NotNull d dVar) {
        p.k(file, "<this>");
        p.k(dVar, "coroutineContext");
        return ByteReadChannelOperationsKt.q(m1.f59865b, new k0("file-writer").plus(dVar), true, new FileChannelsKt$writeChannel$1(file, null)).b();
    }

    public static /* synthetic */ f b(File file, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = w0.b();
        }
        return a(file, dVar);
    }
}
