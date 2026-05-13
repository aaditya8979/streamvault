package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f68334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f68335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f68336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f68337e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f68338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f68339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f68340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f68341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f68342e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f68338a, this.f68339b, this.f68340c, this.f68341d, this.f68342e, 0);
        }

        @NonNull
        public Builder withClassName(@Nullable String str) {
            this.f68338a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer num) {
            this.f68341d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String str) {
            this.f68339b = str;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer num) {
            this.f68340c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String str) {
            this.f68342e = str;
            return this;
        }
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f68333a = str;
        this.f68334b = str2;
        this.f68335c = num;
        this.f68336d = num2;
        this.f68337e = str3;
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i10) {
        this(str, str2, num, num2, str3);
    }

    @Nullable
    public String getClassName() {
        return this.f68333a;
    }

    @Nullable
    public Integer getColumn() {
        return this.f68336d;
    }

    @Nullable
    public String getFileName() {
        return this.f68334b;
    }

    @Nullable
    public Integer getLine() {
        return this.f68335c;
    }

    @Nullable
    public String getMethodName() {
        return this.f68337e;
    }
}
