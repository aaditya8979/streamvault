package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f17851f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17858m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f17860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17862q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f17865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17871z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17852g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17847b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f18786a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17848c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17849d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17850e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f17853h = new byte[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Stack f17854i = new Stack();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList f17855j = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f17846a = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17863r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17864s = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17856k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17859n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f17851f = vVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f17803a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.f18794a;
                UUID uuidA = q.a(bArr);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(uuidA, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, u uVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        nVar.e(i10 + 8);
        int iB = nVar.b();
        int i11 = c.f17753b;
        if ((iB & 1) != 0) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iM = nVar.m();
        if (iM != uVar.f17936e) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM, ", ");
            sbA.append(uVar.f17936e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
        }
        Arrays.fill(uVar.f17944m, 0, iM, z10);
        int i12 = nVar.f18796c - nVar.f18795b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.f17947p;
        if (nVar2 == null || nVar2.f18796c < i12) {
            uVar.f17947p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i12);
        }
        uVar.f17946o = i12;
        uVar.f17943l = true;
        uVar.f17948q = true;
        nVar.a(uVar.f17947p.f18794a, 0, i12);
        uVar.f17947p.e(0);
        uVar.f17948q = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r2 = r27.f17865t;
        r4 = r2.f17839a;
        r8 = r4.f17939h;
        r9 = r2.f17843e;
        r27.f17866u = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r4.f17943l == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r8 = r4.f17947p;
        r10 = r4.f17932a.f17833a;
        r11 = r4.f17945n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r11 = r2.f17841c.f17926h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        r10 = r11.f17930a;
        r4 = r4.f17944m[r9];
        r9 = r27.f17850e;
        r11 = r9.f18794a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.f17840b;
        r2.a(1, r27.f17850e);
        r2.a(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r4 = r8.o();
        r8.e(r8.f18795b - 2);
        r4 = (r4 * 6) + 2;
        r2.a(r4, r8);
        r10 = (r10 + 1) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        r27.f17867v = r10;
        r27.f17866u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
    
        r27.f17867v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r27.f17865t.f17841c.f17925g != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r27.f17866u -= 8;
        r1.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
    
        r27.f17856k = 4;
        r27.f17868w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        r2 = r27.f17865t;
        r4 = r2.f17839a;
        r5 = r2.f17841c;
        r8 = r2.f17840b;
        r2 = r2.f17843e;
        r9 = r5.f17929k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r9 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
    
        r12 = r27.f17848c.f18794a;
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r3 = r9 + 1;
        r9 = 4 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        if (r27.f17867v >= r27.f17866u) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        r13 = r27.f17868w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (r13 != 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011b, code lost:
    
        r1.b(r12, r9, r3, r7);
        r27.f17848c.e(r7 ? 1 : 0);
        r27.f17868w = r27.f17848c.m() - r6;
        r27.f17847b.e(r7 ? 1 : 0);
        r8.a(4, r27.f17847b);
        r8.a(r6, r27.f17848c);
        r27.f17869x = r7;
        r27.f17867v += 5;
        r27.f17866u += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        if (r27.f17869x == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        r27.f17849d.c(r13);
        r1.b(r27.f17849d.f18794a, r7 ? 1 : 0, r27.f17868w, r7);
        r8.a(r27.f17868w, r27.f17849d);
        r13 = r27.f17868w;
        r14 = r27.f17849d;
        r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r14.f18796c, r14.f18794a);
        r27.f17849d.e("video/hevc".equals(r5.f17924f.f18453f) ? 1 : 0);
        r27.f17849d.d(r14);
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r4.f17941j[r2] + ((long) r4.f17940i[r2])) * 1000, r27.f17849d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0195, code lost:
    
        r13 = r8.a(r1, r13, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019a, code lost:
    
        r27.f17867v += r13;
        r27.f17868w -= r13;
        r6 = 1;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a8, code lost:
    
        r3 = r27.f17867v;
        r6 = r27.f17866u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ac, code lost:
    
        if (r3 >= r6) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ae, code lost:
    
        r27.f17867v += r8.a(r1, r6 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        r6 = (r4.f17941j[r2] + ((long) r4.f17940i[r2])) * 1000;
        r1 = r4.f17943l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c7, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c9, code lost:
    
        r3 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cc, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cd, code lost:
    
        r11 = r3 | (r4.f17942k[r2] ? 1 : 0);
        r2 = r4.f17932a.f17833a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d7, code lost:
    
        if (r1 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d9, code lost:
    
        r1 = r4.f17945n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01db, code lost:
    
        if (r1 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01dd, code lost:
    
        r1 = r1.f17931b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e0, code lost:
    
        r1 = r5.f17926h[r2].f17931b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e8, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
    
        r1 = r27.f17851f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01eb, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
    
        r9 = r1.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f3, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        r8.a(r9, r11, r27.f17866u, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0200, code lost:
    
        if (r27.f17855j.isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0202, code lost:
    
        r1 = r27.f17865t;
        r1.f17843e++;
        r2 = r1.f17844f + 1;
        r1.f17844f = r2;
        r4 = r4.f17938g;
        r5 = r1.f17845g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0215, code lost:
    
        if (r2 != r4[r5]) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0217, code lost:
    
        r1.f17845g = r5 + 1;
        r2 = 0;
        r1.f17844f = 0;
        r27.f17865t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0221, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        r27.f17856k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0225, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        r27.f17862q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.f17855j.removeFirst()).f17838b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0236, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r28, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r29) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x06ce, code lost:
    
        r2 = r0;
        r2.f17856k = 0;
        r2.f17859n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x06d4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0605  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r52) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(long):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f17846a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.f17846a.valueAt(i10)).a();
        }
        this.f17855j.clear();
        this.f17862q = 0;
        this.f17854i.clear();
        this.f17856k = 0;
        this.f17859n = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17870y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }
}
