package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32565a;

        public a(@NotNull String str) {
            tn.p.k(str, "adFormat");
            this.f32565a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h hVar) {
            tn.p.k(hVar, "loadParams");
            h.b bVar = (h.b) hVar;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.f32565a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = bVar.b();
            if ((strB == null || strB.length() == 0) && hVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f32566a;

        public b(@NotNull String str) {
            tn.p.k(str, "adFormat");
            this.f32566a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h.d dVar) {
            tn.p.k(dVar, "loadParams");
            if (dVar.d() == null) {
                return new IronSourceError(1060, this.f32566a + " was initialized and loaded without Activity");
            }
            if (dVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = dVar.b();
            if ((strB == null || strB.length() == 0) && dVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Nullable
    IronSourceError a();
}
