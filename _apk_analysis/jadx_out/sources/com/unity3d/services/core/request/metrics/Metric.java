package com.unity3d.services.core.request.metrics;

import cn.p0;
import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Metric.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Metric {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String METRIC_NAME = "n";

    @NotNull
    private static final String METRIC_TAGS = "t";

    @NotNull
    private static final String METRIC_VALUE = "v";

    @Nullable
    private final String name;

    @NotNull
    private final Map<String, String> tags;

    @Nullable
    private final Object value;

    /* JADX INFO: compiled from: Metric.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public Metric(@Nullable String str) {
        this(str, null, null, 6, null);
    }

    public Metric(@Nullable String str, @Nullable Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(@Nullable String str, @Nullable Object obj, @NotNull Map<String, String> map) {
        p.k(map, "tags");
        this.name = str;
        this.value = obj;
        this.tags = map;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? a.j() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = metric.name;
        }
        if ((i10 & 2) != 0) {
            obj = metric.value;
        }
        if ((i10 & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final Object component2() {
        return this.value;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.tags;
    }

    @NotNull
    public final Metric copy(@Nullable String str, @Nullable Object obj, @NotNull Map<String, String> map) {
        p.k(map, "tags");
        return new Metric(str, obj, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return p.f(this.name, metric.name) && p.f(this.value, metric.value) && p.f(this.tags, metric.tags);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, String> getTags() {
        return this.tags;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        Map mapD = p0.d();
        String str = this.name;
        if (str != null) {
            mapD.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            mapD.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            mapD.put(METRIC_TAGS, this.tags);
        }
        return p0.c(mapD);
    }

    @NotNull
    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }
}
