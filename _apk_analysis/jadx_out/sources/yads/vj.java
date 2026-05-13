package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vj extends xj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f96119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f96120d;

    public vj(int i10, long j10) {
        super(i10);
        this.f96118b = j10;
        this.f96119c = new ArrayList();
        this.f96120d = new ArrayList();
    }

    public final vj b(int i10) {
        int size = this.f96120d.size();
        for (int i11 = 0; i11 < size; i11++) {
            vj vjVar = (vj) this.f96120d.get(i11);
            if (vjVar.f96784a == i10) {
                return vjVar;
            }
        }
        return null;
    }

    public final wj c(int i10) {
        int size = this.f96119c.size();
        for (int i11 = 0; i11 < size; i11++) {
            wj wjVar = (wj) this.f96119c.get(i11);
            if (wjVar.f96784a == i10) {
                return wjVar;
            }
        }
        return null;
    }

    @Override // yads.xj
    public final String toString() {
        return xj.a(this.f96784a) + " leaves: " + Arrays.toString(this.f96119c.toArray()) + " containers: " + Arrays.toString(this.f96120d.toArray());
    }
}
