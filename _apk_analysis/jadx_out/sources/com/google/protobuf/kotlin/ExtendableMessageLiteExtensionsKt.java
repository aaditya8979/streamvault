package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ExtendableMessageLiteExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(@NotNull MorBT morbt, @NotNull ExtensionLite<M, ?> extensionLite) {
        p.k(morbt, "<this>");
        p.k(extensionLite, "extension");
        return morbt.hasExtension(extensionLite);
    }

    @NotNull
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(@NotNull MOrBT morbt, @NotNull ExtensionLite<M, T> extensionLite) {
        p.k(morbt, "<this>");
        p.k(extensionLite, "extension");
        T t10 = (T) morbt.getExtension(extensionLite);
        p.j(t10, "getExtension(extension)");
        return t10;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(@NotNull B b10, @NotNull ExtensionLite<M, T> extensionLite, @NotNull T t10) {
        p.k(b10, "<this>");
        p.k(extensionLite, "extension");
        p.k(t10, "value");
        b10.setExtension(extensionLite, t10);
    }
}
