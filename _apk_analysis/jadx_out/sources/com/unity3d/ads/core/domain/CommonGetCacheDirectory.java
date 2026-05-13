package com.unity3d.ads.core.domain;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonGetCacheDirectory.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    @NotNull
    public File invoke(@NotNull File file, @NotNull String str) {
        p.k(file, "cacheDirectoryBase");
        p.k(str, "cacheDirectoryPath");
        return new File(file, str);
    }
}
