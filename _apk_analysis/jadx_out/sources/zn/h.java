package zn;

import cn.k0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ProgressionIterators.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h extends k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98360e;

    public h(int i10, int i11, int i12) {
        this.f98357b = i12;
        this.f98358c = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f98359d = z10;
        this.f98360e = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98359d;
    }

    @Override // cn.k0
    public int nextInt() {
        int i10 = this.f98360e;
        if (i10 != this.f98358c) {
            this.f98360e = this.f98357b + i10;
        } else {
            if (!this.f98359d) {
                throw new NoSuchElementException();
            }
            this.f98359d = false;
        }
        return i10;
    }
}
