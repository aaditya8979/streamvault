package com.yandex.div.storage.rawjson;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: RawJson.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface RawJson {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: RawJson.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final RawJson invoke(@NotNull String str, @NotNull JSONObject jSONObject) {
            return new Ready(str, jSONObject);
        }
    }

    /* JADX INFO: compiled from: RawJson.kt */
    public static final class Ready implements RawJson {

        @NotNull
        private final JSONObject data;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f54016id;

        public Ready(@NotNull String str, @NotNull JSONObject jSONObject) {
            this.f54016id = str;
            this.data = jSONObject;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return p.f(this.f54016id, ready.f54016id) && p.f(this.data, ready.data);
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.f54016id;
        }

        public int hashCode() {
            return (this.f54016id.hashCode() * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(id=" + this.f54016id + ", data=" + this.data + ')';
        }
    }

    @NotNull
    JSONObject getData();

    @NotNull
    String getId();
}
