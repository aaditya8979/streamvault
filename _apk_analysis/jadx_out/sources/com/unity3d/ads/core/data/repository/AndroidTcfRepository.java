package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidTcfRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidTcfRepository implements TcfRepository {

    @NotNull
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(@NotNull TcfDataSource tcfDataSource) {
        p.k(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    @NotNull
    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    @Nullable
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
