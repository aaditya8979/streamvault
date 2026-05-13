package z8;

import java.util.Objects;

/* JADX INFO: compiled from: ExpandedPair.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.b f98248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y8.b f98249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y8.c f98250c;

    public b(y8.b bVar, y8.b bVar2, y8.c cVar) {
        this.f98248a = bVar;
        this.f98249b = bVar2;
        this.f98250c = cVar;
    }

    public y8.c a() {
        return this.f98250c;
    }

    public y8.b b() {
        return this.f98248a;
    }

    public y8.b c() {
        return this.f98249b;
    }

    public boolean d() {
        return this.f98249b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f98248a, bVar.f98248a) && Objects.equals(this.f98249b, bVar.f98249b) && Objects.equals(this.f98250c, bVar.f98250c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f98248a) ^ Objects.hashCode(this.f98249b)) ^ Objects.hashCode(this.f98250c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f98248a);
        sb2.append(" , ");
        sb2.append(this.f98249b);
        sb2.append(" : ");
        y8.c cVar = this.f98250c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
