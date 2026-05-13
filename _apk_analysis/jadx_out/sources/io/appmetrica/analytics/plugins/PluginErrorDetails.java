package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f68322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f68323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f68324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f68325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f68326f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f68327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f68329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f68330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f68331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f68332f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f68327a, this.f68328b, (List) WrapUtils.getOrDefault(this.f68329c, new ArrayList()), this.f68330d, this.f68331e, (Map) WrapUtils.getOrDefault(this.f68332f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String str) {
            this.f68327a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String str) {
            this.f68328b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String str) {
            this.f68330d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f68332f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.f68329c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String str) {
            this.f68331e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f68321a = str;
        this.f68322b = str2;
        this.f68323c = new ArrayList(list);
        this.f68324d = str3;
        this.f68325e = str4;
        this.f68326f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i10) {
        this(str, str2, list, str3, str4, map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.f68321a;
    }

    @Nullable
    public String getMessage() {
        return this.f68322b;
    }

    @Nullable
    public String getPlatform() {
        return this.f68324d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f68326f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f68323c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.f68325e;
    }
}
