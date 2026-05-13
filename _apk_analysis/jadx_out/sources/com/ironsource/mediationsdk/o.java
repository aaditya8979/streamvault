package com.ironsource.mediationsdk;

import com.ironsource.Y7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f32720a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final void a(@NotNull ISBannerSize iSBannerSize, @NotNull Y7 y72) {
            tn.p.k(iSBannerSize, "bannerSize");
            tn.p.k(y72, "containerParams");
            iSBannerSize.a(y72);
        }
    }
}
