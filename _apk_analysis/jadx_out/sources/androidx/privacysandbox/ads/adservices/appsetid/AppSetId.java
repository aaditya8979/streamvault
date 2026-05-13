package androidx.privacysandbox.ads.adservices.appsetid;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AppSetId.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppSetId {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f5048id;
    private final int scope;

    /* JADX INFO: compiled from: AppSetId.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AppSetId(@NotNull String str, int i10) {
        p.k(str, "id");
        this.f5048id = str;
        this.scope = i10;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return p.f(this.f5048id, appSetId.f5048id) && this.scope == appSetId.scope;
    }

    @NotNull
    public final String getId() {
        return this.f5048id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.f5048id.hashCode() * 31) + Integer.hashCode(this.scope);
    }

    @NotNull
    public String toString() {
        return "AppSetId: id=" + this.f5048id + ", scope=" + (this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
