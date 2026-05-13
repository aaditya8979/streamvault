package com.unity3d.ads.core.domain;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CreateFile.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface CreateFile {
    @NotNull
    File invoke(@NotNull File file, @NotNull String str);

    @NotNull
    File invoke(@NotNull String str);
}
