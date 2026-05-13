package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ByteStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ByteStringsKt {
    public static final byte get(@NotNull ByteString byteString, int i10) {
        p.k(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(@NotNull ByteString byteString) {
        p.k(byteString, "<this>");
        return !byteString.isEmpty();
    }

    @NotNull
    public static final ByteString plus(@NotNull ByteString byteString, @NotNull ByteString byteString2) {
        p.k(byteString, "<this>");
        p.k(byteString2, "other");
        ByteString byteStringConcat = byteString.concat(byteString2);
        p.j(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull ByteBuffer byteBuffer) {
        p.k(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        p.j(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull byte[] bArr) {
        p.k(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        p.j(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    @NotNull
    public static final ByteString toByteStringUtf8(@NotNull String str) {
        p.k(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        p.j(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }
}
