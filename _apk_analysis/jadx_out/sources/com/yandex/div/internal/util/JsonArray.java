package com.yandex.div.internal.util;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: compiled from: JsonNode.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonArray extends JsonNode {

    @NotNull
    private final JSONArray value;

    public JsonArray(@NotNull JSONArray jSONArray) {
        super(null);
        this.value = jSONArray;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    public String dump() {
        return this.value.toString();
    }
}
