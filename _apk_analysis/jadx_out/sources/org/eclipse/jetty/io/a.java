package org.eclipse.jetty.io;

import hq.h;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: AbstractBuffers.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements Buffers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Buffers.Type f76656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Buffers.Type f76658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffers.Type f76660e;

    /* JADX INFO: renamed from: org.eclipse.jetty.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractBuffers.java */
    public static /* synthetic */ class C0916a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76661a;

        static {
            int[] iArr = new int[Buffers.Type.values().length];
            f76661a = iArr;
            try {
                iArr[Buffers.Type.BYTE_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76661a[Buffers.Type.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76661a[Buffers.Type.INDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3) {
        this.f76656a = type;
        this.f76657b = i10;
        this.f76658c = type2;
        this.f76659d = i11;
        this.f76660e = type3;
    }

    public int a() {
        return this.f76659d;
    }

    public int e() {
        return this.f76657b;
    }

    public final boolean f(hq.d dVar) {
        if (dVar.e0() != this.f76659d) {
            return false;
        }
        int i10 = C0916a.f76661a[this.f76658c.ordinal()];
        if (i10 == 1) {
            return (dVar instanceof h) && !(dVar instanceof jq.c);
        }
        if (i10 == 2) {
            return dVar instanceof jq.b;
        }
        if (i10 != 3) {
            return false;
        }
        return dVar instanceof jq.c;
    }

    public final boolean g(hq.d dVar) {
        if (dVar.e0() != this.f76657b) {
            return false;
        }
        int i10 = C0916a.f76661a[this.f76656a.ordinal()];
        if (i10 == 1) {
            return (dVar instanceof h) && !(dVar instanceof jq.c);
        }
        if (i10 == 2) {
            return dVar instanceof jq.b;
        }
        if (i10 != 3) {
            return false;
        }
        return dVar instanceof jq.c;
    }

    public final hq.d h() {
        int i10 = C0916a.f76661a[this.f76658c.ordinal()];
        if (i10 == 1) {
            return new h(this.f76659d);
        }
        if (i10 == 2) {
            return new jq.b(this.f76659d);
        }
        if (i10 == 3) {
            return new jq.c(this.f76659d);
        }
        throw new IllegalStateException();
    }

    public final hq.d i(int i10) {
        int i11 = C0916a.f76661a[this.f76660e.ordinal()];
        if (i11 == 1) {
            return new h(i10);
        }
        if (i11 == 2) {
            return new jq.b(i10);
        }
        if (i11 == 3) {
            return new jq.c(i10);
        }
        throw new IllegalStateException();
    }

    public final hq.d j() {
        int i10 = C0916a.f76661a[this.f76656a.ordinal()];
        if (i10 == 1) {
            return new h(this.f76657b);
        }
        if (i10 == 2) {
            return new jq.b(this.f76657b);
        }
        if (i10 == 3) {
            return new jq.c(this.f76657b);
        }
        throw new IllegalStateException();
    }
}
