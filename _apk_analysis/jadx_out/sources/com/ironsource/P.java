package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface P {

    public interface a {
        void a(@NotNull O o10);

        void a(@NotNull EnumC4155n0 enumC4155n0, @NotNull String str);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC4155n0 enumC4155n0, @NotNull String str);
    }

    @Nullable
    O a(@NotNull String str);

    @NotNull
    List<O> a();
}
