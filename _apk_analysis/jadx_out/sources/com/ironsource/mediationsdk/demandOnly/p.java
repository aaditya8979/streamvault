package com.ironsource.mediationsdk.demandOnly;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface p {

    public static class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32564a;

        public a(@NotNull String str) {
            tn.p.k(str, "plumbus");
            this.f32564a = str;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @NotNull
        public String value() {
            return this.f32564a;
        }
    }

    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @NotNull
    String value();
}
