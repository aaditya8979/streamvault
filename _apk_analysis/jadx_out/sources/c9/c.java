package c9;

import com.google.zxing.NotFoundException;
import k8.j;

/* JADX INFO: compiled from: BoundingBox.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.b f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f6525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f6526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f6527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6531i;

    public c(c cVar) {
        this.f6523a = cVar.f6523a;
        this.f6524b = cVar.f6524b;
        this.f6525c = cVar.f6525c;
        this.f6526d = cVar.f6526d;
        this.f6527e = cVar.f6527e;
        this.f6528f = cVar.f6528f;
        this.f6529g = cVar.f6529g;
        this.f6530h = cVar.f6530h;
        this.f6531i = cVar.f6531i;
    }

    public c(o8.b bVar, j jVar, j jVar2, j jVar3, j jVar4) throws NotFoundException {
        boolean z10 = jVar == null || jVar2 == null;
        boolean z11 = jVar3 == null || jVar4 == null;
        if (z10 && z11) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z10) {
            jVar = new j(0.0f, jVar3.d());
            jVar2 = new j(0.0f, jVar4.d());
        } else if (z11) {
            jVar3 = new j(bVar.j() - 1, jVar.d());
            jVar4 = new j(bVar.j() - 1, jVar2.d());
        }
        this.f6523a = bVar;
        this.f6524b = jVar;
        this.f6525c = jVar2;
        this.f6526d = jVar3;
        this.f6527e = jVar4;
        this.f6528f = (int) Math.min(jVar.c(), jVar2.c());
        this.f6529g = (int) Math.max(jVar3.c(), jVar4.c());
        this.f6530h = (int) Math.min(jVar.d(), jVar3.d());
        this.f6531i = (int) Math.max(jVar2.d(), jVar4.d());
    }

    public static c j(c cVar, c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f6523a, cVar.f6524b, cVar.f6525c, cVar2.f6526d, cVar2.f6527e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c9.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            k8.j r0 = r12.f6524b
            k8.j r1 = r12.f6525c
            k8.j r2 = r12.f6526d
            k8.j r3 = r12.f6527e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            k8.j r13 = new k8.j
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            k8.j r13 = r12.f6525c
            goto L34
        L32:
            k8.j r13 = r12.f6527e
        L34:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            o8.b r14 = r12.f6523a
            int r14 = r14.g()
            if (r0 < r14) goto L4a
            o8.b r14 = r12.f6523a
            int r14 = r14.g()
            int r0 = r14 + (-1)
        L4a:
            k8.j r14 = new k8.j
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            c9.c r13 = new c9.c
            o8.b r7 = r12.f6523a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.c.a(int, int, boolean):c9.c");
    }

    public j b() {
        return this.f6525c;
    }

    public j c() {
        return this.f6527e;
    }

    public int d() {
        return this.f6529g;
    }

    public int e() {
        return this.f6531i;
    }

    public int f() {
        return this.f6528f;
    }

    public int g() {
        return this.f6530h;
    }

    public j h() {
        return this.f6524b;
    }

    public j i() {
        return this.f6526d;
    }
}
