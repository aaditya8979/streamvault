package com.unity3d.ads.core.data.repository;

import bn.r;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: compiled from: CacheRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface CacheRepository {

    /* JADX INFO: compiled from: CacheRepository.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, cVar);
        }
    }

    @Nullable
    Object clearCache(@NotNull c<? super r> cVar);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull c<? super Boolean> cVar);

    @Nullable
    Object getCacheSize(@NotNull c<? super Long> cVar);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i10, @NotNull c<? super CacheResult> cVar);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull c<? super CacheResult> cVar);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull c<? super CacheResult> cVar);
}
