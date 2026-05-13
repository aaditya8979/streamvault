package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ri1 extends AbstractMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f94465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient qi1 f94466c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f94465b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l((n) this);
        this.f94465b = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        qi1 qi1Var = this.f94466c;
        if (qi1Var != null) {
            return qi1Var;
        }
        qi1 qi1Var2 = new qi1(this);
        this.f94466c = qi1Var2;
        return qi1Var2;
    }
}
