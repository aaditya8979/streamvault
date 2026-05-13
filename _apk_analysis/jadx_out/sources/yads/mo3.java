package yads;

import java.util.Comparator;
import yads.mo3;

/* JADX INFO: loaded from: classes9.dex */
public final class mo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f92490c = new Comparator() { // from class: bt.m6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((mo3) obj).f92491a.f92900b, ((mo3) obj2).f92491a.f92900b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3 f92491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92492b;

    public mo3(no3 no3Var, int i10) {
        this.f92491a = no3Var;
        this.f92492b = i10;
    }
}
