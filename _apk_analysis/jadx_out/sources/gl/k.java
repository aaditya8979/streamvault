package gl;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeaderValueWithParameters.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f62553c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<j> f62555b;

    /* JADX INFO: compiled from: HeaderValueWithParameters.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public k(@NotNull String str, @NotNull List<j> list) {
        tn.p.k(str, "content");
        tn.p.k(list, "parameters");
        this.f62554a = str;
        this.f62555b = list;
    }

    @NotNull
    public final String a() {
        return this.f62554a;
    }

    @NotNull
    public final List<j> b() {
        return this.f62555b;
    }

    @Nullable
    public final String c(@NotNull String str) {
        tn.p.k(str, "name");
        int iO = cn.w.o(this.f62555b);
        if (iO < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            j jVar = this.f62555b.get(i10);
            if (bo.a0.J(jVar.c(), str, true)) {
                return jVar.d();
            }
            if (i10 == iO) {
                return null;
            }
            i10++;
        }
    }

    @NotNull
    public String toString() {
        if (this.f62555b.isEmpty()) {
            return this.f62554a;
        }
        int length = this.f62554a.length();
        int i10 = 0;
        int length2 = 0;
        for (j jVar : this.f62555b) {
            length2 += jVar.c().length() + jVar.d().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.f62554a);
        int iO = cn.w.o(this.f62555b);
        if (iO >= 0) {
            while (true) {
                j jVar2 = this.f62555b.get(i10);
                sb2.append("; ");
                sb2.append(jVar2.c());
                sb2.append("=");
                String strD = jVar2.d();
                if (l.c(strD)) {
                    sb2.append(l.d(strD));
                } else {
                    sb2.append(strD);
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        tn.p.h(string);
        return string;
    }
}
