package com.unity3d.mediation;

import cn.w;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class LevelPlayInitRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f53499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f53500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<LevelPlay.AdFormat> f53501c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f53502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f53503b;

        public Builder(@NotNull String str) {
            p.k(str, "appKey");
            this.f53502a = str;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.f53502a, this.f53503b, null, 4, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f53502a;
        }

        @NotNull
        public final Builder withUserId(@NotNull String str) {
            p.k(str, "userId");
            this.f53503b = str;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f53499a = str;
        this.f53500b = str2;
        this.f53501c = list;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i10, i iVar) {
        this(str, str2, (i10 & 4) != 0 ? w.m() : list);
    }

    @NotNull
    public final String getAppKey() {
        return this.f53499a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f53501c;
    }

    @Nullable
    public final String getUserId() {
        return this.f53500b;
    }
}
