package com.moloco.sdk.internal.publisher.nativead.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<AbstractC0574a> f46833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final c f46834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f46835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<b> f46836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f46837f;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 1)
    public static abstract class AbstractC0574a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46839b;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 1)
        public static final class C0575a extends AbstractC0574a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Integer f46840c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Integer f46841d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public final String f46842e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0575a(int i10, boolean z10, @Nullable Integer num, @Nullable Integer num2, @NotNull String str) {
                super(i10, z10, null);
                p.k(str, "value");
                this.f46840c = num;
                this.f46841d = num2;
                this.f46842e = str;
            }

            @NotNull
            public final String c() {
                return this.f46842e;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$b */
        @StabilityInferred(parameters = 1)
        public static final class b extends AbstractC0574a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final Integer f46843c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f46844d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public final Integer f46845e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public final Integer f46846f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, boolean z10, @Nullable Integer num, @NotNull String str, @Nullable Integer num2, @Nullable Integer num3) {
                super(i10, z10, null);
                p.k(str, "url");
                this.f46843c = num;
                this.f46844d = str;
                this.f46845e = num2;
                this.f46846f = num3;
            }

            @NotNull
            public final String c() {
                return this.f46844d;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$c */
        @StabilityInferred(parameters = 1)
        public static final class c extends AbstractC0574a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final String f46847c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final Integer f46848d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i10, boolean z10, @NotNull String str, @Nullable Integer num) {
                super(i10, z10, null);
                p.k(str, "text");
                this.f46847c = str;
                this.f46848d = num;
            }

            @NotNull
            public final String c() {
                return this.f46847c;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$d */
        @StabilityInferred(parameters = 1)
        public static final class d extends AbstractC0574a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final String f46849c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i10, boolean z10, @NotNull String str) {
                super(i10, z10, null);
                p.k(str, "vastTag");
                this.f46849c = str;
            }

            @NotNull
            public final String c() {
                return this.f46849c;
            }
        }

        public AbstractC0574a(int i10, boolean z10) {
            this.f46838a = i10;
            this.f46839b = z10;
        }

        public /* synthetic */ AbstractC0574a(int i10, boolean z10, i iVar) {
            this(i10, z10);
        }

        public final int a() {
            return this.f46838a;
        }

        public final boolean b() {
            return this.f46839b;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f46852c;

        public b(int i10, int i11, @Nullable String str) {
            this.f46850a = i10;
            this.f46851b = i11;
            this.f46852c = str;
        }

        public final int a() {
            return this.f46850a;
        }

        public final int b() {
            return this.f46851b;
        }

        @Nullable
        public final String c() {
            return this.f46852c;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f46853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<String> f46854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f46855c;

        public c(@NotNull String str, @NotNull List<String> list, @Nullable String str2) {
            p.k(str, "url");
            p.k(list, "clickTrackerUrls");
            this.f46853a = str;
            this.f46854b = list;
            this.f46855c = str2;
        }

        @NotNull
        public final List<String> a() {
            return this.f46854b;
        }

        @NotNull
        public final String b() {
            return this.f46853a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Nullable String str, @NotNull List<? extends AbstractC0574a> list, @Nullable c cVar, @NotNull List<String> list2, @NotNull List<b> list3, @Nullable String str2) {
        p.k(list, "assets");
        p.k(list2, "impressionTrackerUrls");
        p.k(list3, "eventTrackers");
        this.f46832a = str;
        this.f46833b = list;
        this.f46834c = cVar;
        this.f46835d = list2;
        this.f46836e = list3;
        this.f46837f = str2;
    }

    @NotNull
    public final List<AbstractC0574a> a() {
        return this.f46833b;
    }

    @NotNull
    public final List<b> b() {
        return this.f46836e;
    }

    @NotNull
    public final List<String> c() {
        return this.f46835d;
    }

    @Nullable
    public final c d() {
        return this.f46834c;
    }
}
