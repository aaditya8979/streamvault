package zk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UserAgent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f98311a;

    /* JADX WARN: Multi-variable type inference failed */
    public m0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public m0(@NotNull String str) {
        tn.p.k(str, "agent");
        this.f98311a = str;
    }

    public /* synthetic */ m0(String str, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? "Ktor http-client" : str);
    }

    @NotNull
    public final String a() {
        return this.f98311a;
    }

    public final void b(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f98311a = str;
    }
}
