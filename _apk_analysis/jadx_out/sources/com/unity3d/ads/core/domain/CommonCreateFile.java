package com.unity3d.ads.core.domain;

import java.io.File;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonCreateFile.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull File file, @NotNull String str) {
        p.k(file, "parent");
        p.k(str, "child");
        return new File(file, str);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull String str) {
        p.k(str, "pathname");
        return new File(str);
    }
}
