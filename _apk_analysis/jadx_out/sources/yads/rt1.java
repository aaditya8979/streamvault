package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class rt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f94603a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f94604b = new ArrayList();

    public final void a(s61 s61Var) {
        synchronized (this.f94603a) {
            this.f94604b.add(s61Var);
        }
    }
}
