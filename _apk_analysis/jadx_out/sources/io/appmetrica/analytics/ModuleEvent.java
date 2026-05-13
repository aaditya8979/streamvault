package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f64372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f64373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f64374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f64375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f64376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f64377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f64378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f64379h;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f64380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f64381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f64382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f64383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f64384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f64385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f64386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f64387h;

        private Builder(int i10) {
            this.f64383d = 1;
            this.f64384e = Category.GENERAL;
            this.f64380a = i10;
        }

        public /* synthetic */ Builder(int i10, int i11) {
            this(i10);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f64387h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f64384e = category;
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f64385f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f64386g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f64381b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i10) {
            this.f64383d = i10;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f64382c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    private ModuleEvent(Builder builder) {
        this.f64372a = builder.f64380a;
        this.f64373b = builder.f64381b;
        this.f64374c = builder.f64382c;
        this.f64375d = builder.f64383d;
        this.f64376e = builder.f64384e;
        this.f64377f = CollectionUtils.getListFromMap(builder.f64385f);
        this.f64378g = CollectionUtils.getListFromMap(builder.f64386g);
        this.f64379h = CollectionUtils.getListFromMap(builder.f64387h);
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i10) {
        this(builder);
    }

    public static Builder newBuilder(int i10) {
        return new Builder(i10, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f64379h);
    }

    public Category getCategory() {
        return this.f64376e;
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f64377f);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f64378g);
    }

    @Nullable
    public String getName() {
        return this.f64373b;
    }

    public int getServiceDataReporterType() {
        return this.f64375d;
    }

    public int getType() {
        return this.f64372a;
    }

    @Nullable
    public String getValue() {
        return this.f64374c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f64372a + ", name='" + this.f64373b + "', value='" + this.f64374c + "', serviceDataReporterType=" + this.f64375d + ", category=" + this.f64376e + ", environment=" + this.f64377f + ", extras=" + this.f64378g + ", attributes=" + this.f64379h + '}';
    }
}
