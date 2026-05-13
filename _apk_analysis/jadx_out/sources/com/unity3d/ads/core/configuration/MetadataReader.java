package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import tn.p;

/* JADX INFO: compiled from: MetadataReader.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MetadataReader<T> {

    @NotNull
    private final JsonStorage jsonStorage;

    @NotNull
    private final String key;

    public MetadataReader(@NotNull JsonStorage jsonStorage, @NotNull String str) {
        p.k(jsonStorage, "jsonStorage");
        p.k(str, "key");
        this.jsonStorage = jsonStorage;
        this.key = str;
    }

    public static /* synthetic */ Object read$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) throws JSONException {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 == null) {
            return obj;
        }
        p.q(3, "T");
        return obj3;
    }

    public static /* synthetic */ Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) throws JSONException {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        Object obj3 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj3 != null) {
            p.j(obj3, "get(key)");
            p.q(3, "T");
            obj = obj3;
        }
        Object obj4 = metadataReader.getJsonStorage().get(metadataReader.getKey());
        if (obj4 != null) {
            p.j(obj4, "get(key)");
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    @NotNull
    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T t10) {
        T t11 = (T) getJsonStorage().get(getKey());
        if (t11 == null) {
            return t10;
        }
        p.q(3, "T");
        return t11;
    }

    public final /* synthetic */ <T> T readAndDelete(T t10) throws JSONException {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            p.j(obj, "get(key)");
            p.q(3, "T");
            t10 = (T) obj;
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            p.j(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return t10;
    }
}
