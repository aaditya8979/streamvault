package com.yandex.div.internal.util;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonNode.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JsonObject extends JsonNode {

    @NotNull
    private final JSONObject value;

    public JsonObject(@NotNull JSONObject jSONObject) {
        super(null);
        this.value = jSONObject;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @NotNull
    public String dump() {
        return this.value.toString();
    }
}
