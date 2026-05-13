package ql;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PipelinePhase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f78339a;

    public g(@NotNull String str) {
        p.k(str, "name");
        this.f78339a = str;
    }

    @NotNull
    public final String a() {
        return this.f78339a;
    }

    @NotNull
    public String toString() {
        return "Phase('" + this.f78339a + "')";
    }
}
