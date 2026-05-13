package com.ironsource;

import com.ironsource.C3978d4;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface Z {
    @NotNull
    String a();

    default void a(@NotNull O9 o92, @NotNull Map<String, String> map) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(map, "loadParams");
    }
}
