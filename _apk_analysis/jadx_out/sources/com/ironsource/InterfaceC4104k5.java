package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC4104k5<T> extends Oc {
    void b(@NotNull C8 c82);

    @NotNull
    String c();

    @NotNull
    InterfaceC3944b6 d();

    @NotNull
    sn.l<Result<? extends T>, bn.r> i();

    default boolean j() {
        return k().exists();
    }

    @NotNull
    C8 k();

    @NotNull
    C7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            sn.l<Result<? extends T>, bn.r> lVarI = i();
            Result.a aVar = Result.Companion;
            lVarI.invoke(Result.m7533boximpl(Result.m7534constructorimpl(kotlin.c.a(e10))));
        }
    }
}
