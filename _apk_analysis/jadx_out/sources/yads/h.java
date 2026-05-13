package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90170b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90171c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA;
        int i10 = this.f90170b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA2 = hg0.a(i10);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 == 2) {
            return false;
        }
        this.f90170b = 4;
        u23 u23Var = (u23) this;
        int i11 = u23Var.f95518g;
        while (true) {
            int i12 = u23Var.f95518g;
            if (i12 == -1) {
                u23Var.f90170b = 3;
                string = null;
                break;
            }
            iA = u23Var.f95520i.f95911a.a(u23Var.f95515d, i12);
            if (iA == -1) {
                iA = u23Var.f95515d.length();
                u23Var.f95518g = -1;
            } else {
                u23Var.f95518g = iA + 1;
            }
            int i13 = u23Var.f95518g;
            if (i13 == i11) {
                int i14 = i13 + 1;
                u23Var.f95518g = i14;
                if (i14 > u23Var.f95515d.length()) {
                    u23Var.f95518g = -1;
                }
            } else {
                while (i11 < iA && u23Var.f95516e.a(u23Var.f95515d.charAt(i11))) {
                    i11++;
                }
                while (iA > i11 && u23Var.f95516e.a(u23Var.f95515d.charAt(iA - 1))) {
                    iA--;
                }
                if (!u23Var.f95517f || i11 != iA) {
                    break;
                }
                i11 = u23Var.f95518g;
            }
        }
        int i15 = u23Var.f95519h;
        if (i15 == 1) {
            iA = u23Var.f95515d.length();
            u23Var.f95518g = -1;
            while (iA > i11 && u23Var.f95516e.a(u23Var.f95515d.charAt(iA - 1))) {
                iA--;
            }
        } else {
            u23Var.f95519h = i15 - 1;
        }
        string = u23Var.f95515d.subSequence(i11, iA).toString();
        this.f90171c = string;
        if (this.f90170b == 3) {
            return false;
        }
        this.f90170b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f90170b = 2;
        String str = this.f90171c;
        this.f90171c = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
