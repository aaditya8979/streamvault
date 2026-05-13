package yads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes12.dex */
public final class nx1 extends rx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f93036a;

    public nx1(y72 y72Var) {
        this.f93036a = y72Var;
    }

    @Override // yads.rx1
    public final Map b() {
        return new TreeMap(this.f93036a);
    }
}
