package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SystemBarStyle {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;

    @NotNull
    private final sn.l<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* JADX INFO: compiled from: EdgeToEdge.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i10, int i11, sn.l lVar, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                lVar = new sn.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
                    @Override // sn.l
                    @NotNull
                    public final Boolean invoke(@NotNull Resources resources) {
                        tn.p.k(resources, "resources");
                        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
                    }
                };
            }
            return companion.auto(i10, i11, lVar);
        }

        @NotNull
        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
            return auto$default(this, i10, i11, null, 4, null);
        }

        @NotNull
        public final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, @NotNull sn.l<? super Resources, Boolean> lVar) {
            tn.p.k(lVar, "detectDarkMode");
            return new SystemBarStyle(i10, i11, 0, lVar, null);
        }

        @NotNull
        public final SystemBarStyle dark(@ColorInt int i10) {
            return new SystemBarStyle(i10, i10, 2, new sn.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$dark$1
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull Resources resources) {
                    tn.p.k(resources, "<anonymous parameter 0>");
                    return Boolean.TRUE;
                }
            }, null);
        }

        @NotNull
        public final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
            return new SystemBarStyle(i10, i11, 1, new sn.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$light$1
                @Override // sn.l
                @NotNull
                public final Boolean invoke(@NotNull Resources resources) {
                    tn.p.k(resources, "<anonymous parameter 0>");
                    return Boolean.FALSE;
                }
            }, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i10, int i11, int i12, sn.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = lVar;
    }

    public /* synthetic */ SystemBarStyle(int i10, int i11, int i12, sn.l lVar, tn.i iVar) {
        this(i10, i11, i12, lVar);
    }

    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11) {
        return Companion.auto(i10, i11);
    }

    @NotNull
    public static final SystemBarStyle auto(@ColorInt int i10, @ColorInt int i11, @NotNull sn.l<? super Resources, Boolean> lVar) {
        return Companion.auto(i10, i11, lVar);
    }

    @NotNull
    public static final SystemBarStyle dark(@ColorInt int i10) {
        return Companion.dark(i10);
    }

    @NotNull
    public static final SystemBarStyle light(@ColorInt int i10, @ColorInt int i11) {
        return Companion.light(i10, i11);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    @NotNull
    public final sn.l<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z10) {
        return z10 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z10) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z10 ? this.darkScrim : this.lightScrim;
    }
}
