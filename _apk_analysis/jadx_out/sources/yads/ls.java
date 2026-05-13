package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f92075a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f92076b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f92077c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f92078d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks f92079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ks f92080f;

    public ls(jn0 jn0Var, File file) {
        is isVar = new is(jn0Var);
        js jsVar = new js(new File(file, "monetization_cached_content_index.exi"));
        this.f92079e = isVar;
        this.f92080f = jsVar;
    }

    public static jc0 a(DataInputStream dataInputStream) {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException(mg2.a("Invalid value size: ", i12));
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = ib3.f90742f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new jc0(map);
    }

    public final hs a(String str) {
        hs hsVar = (hs) this.f92075a.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        SparseArray sparseArray = this.f92076b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        hs hsVar2 = new hs(iKeyAt, str, jc0.f91151c);
        this.f92075a.put(str, hsVar2);
        this.f92076b.put(iKeyAt, str);
        this.f92078d.put(iKeyAt, true);
        this.f92079e.a(hsVar2);
        return hsVar2;
    }

    public final void a() {
        this.f92079e.a(this.f92075a);
        int size = this.f92077c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f92076b.remove(this.f92077c.keyAt(i10));
        }
        this.f92077c.clear();
        this.f92078d.clear();
    }

    public final void a(long j10) {
        ks ksVar;
        this.f92079e.a(j10);
        ks ksVar2 = this.f92080f;
        if (ksVar2 != null) {
            ksVar2.a(j10);
        }
        if (this.f92079e.a() || (ksVar = this.f92080f) == null || !ksVar.a()) {
            this.f92079e.a(this.f92075a, this.f92076b);
        } else {
            this.f92080f.a(this.f92075a, this.f92076b);
            this.f92079e.b(this.f92075a);
        }
        ks ksVar3 = this.f92080f;
        if (ksVar3 != null) {
            ksVar3.b();
            this.f92080f = null;
        }
    }

    public final void b(String str) {
        hs hsVar = (hs) this.f92075a.get(str);
        if (hsVar != null && hsVar.f90522c.isEmpty() && hsVar.f90523d.isEmpty()) {
            this.f92075a.remove(str);
            int i10 = hsVar.f90520a;
            boolean z10 = this.f92078d.get(i10);
            this.f92079e.a(hsVar, z10);
            if (z10) {
                this.f92076b.remove(i10);
                this.f92078d.delete(i10);
            } else {
                this.f92076b.put(i10, null);
                this.f92077c.put(i10, true);
            }
        }
    }
}
