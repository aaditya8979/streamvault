package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Gd implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Id f65281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fd f65282b;

    public Gd(@NotNull Id id2, @NotNull Fd fd2) {
        this.f65281a = id2;
        this.f65282b = fd2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(@NotNull File file) {
        byte[] bArrC;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArrC = on.a.c(fileInputStream);
                    mo.a((Closeable) fileInputStream);
                } catch (Throwable unused2) {
                    mo.a((Closeable) fileInputStream);
                    bArrC = null;
                }
            } else {
                bArrC = null;
            }
            if (bArrC == null) {
                return null;
            }
            if (!(!(bArrC.length == 0))) {
                bArrC = null;
            }
            if (bArrC != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f65282b.fromModel(new Ld(bArrC, this.f65281a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
