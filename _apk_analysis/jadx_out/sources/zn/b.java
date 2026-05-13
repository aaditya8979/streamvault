package zn;

import cn.u;
import java.util.NoSuchElementException;
import tn.p;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98348e;

    public b(char c10, char c11, int i10) {
        this.f98345b = i10;
        this.f98346c = c11;
        boolean z10 = true;
        if (i10 <= 0 ? p.m(c10, c11) < 0 : p.m(c10, c11) > 0) {
            z10 = false;
        }
        this.f98347d = z10;
        this.f98348e = z10 ? c10 : c11;
    }

    @Override // cn.u
    public char a() {
        int i10 = this.f98348e;
        if (i10 != this.f98346c) {
            this.f98348e = this.f98345b + i10;
        } else {
            if (!this.f98347d) {
                throw new NoSuchElementException();
            }
            this.f98347d = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98347d;
    }
}
