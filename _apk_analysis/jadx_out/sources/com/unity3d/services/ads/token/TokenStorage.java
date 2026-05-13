package com.unity3d.services.ads.token;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface TokenStorage {
    void appendTokens(@NotNull JSONArray jSONArray) throws JSONException;

    void createTokens(@NotNull JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    @NotNull
    r getNativeGeneratedToken();

    @Nullable
    String getToken();

    void setInitToken(@Nullable String str);
}
