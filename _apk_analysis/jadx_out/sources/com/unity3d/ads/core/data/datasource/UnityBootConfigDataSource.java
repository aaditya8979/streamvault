package com.unity3d.ads.core.data.datasource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnityBootConfigDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface UnityBootConfigDataSource {

    @NotNull
    public static final String BUILD_GUID = "build-guid";

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: UnityBootConfigDataSource.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String BUILD_GUID = "build-guid";

        private Companion() {
        }
    }

    @Nullable
    String getValue(@NotNull String str);
}
