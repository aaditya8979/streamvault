package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class Bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3779u9 f25222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3625o4 f25224c;

    public Bh(C3779u9 c3779u9) {
        tn.p.k(c3779u9, "configClient");
        this.f25222a = c3779u9;
        this.f25223b = Bh.class.getSimpleName();
        this.f25224c = new C3625o4();
    }

    public static void a(int i10, List list, List list2) {
        Map mapO = kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)), bn.h.a("name", list), bn.h.a("lts", list2), bn.h.a("networkType", C3850x5.m()));
        Wj wj2 = Wj.f26549a;
        Wj.b("InvalidConfig", mapO, EnumC3287ak.f26805a);
    }

    public static void a(List list, int i10) {
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3575m4) it.next()).f27598b.getType());
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3575m4) it2.next()).f27598b.getLastUpdateTimeStamp()));
        }
        a(i10, arrayList, arrayList2);
    }

    public static final boolean a(Set set, C3575m4 c3575m4) {
        tn.p.k(c3575m4, "it");
        return set.contains(c3575m4.f27598b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.AbstractC3650p4 a(com.inmobi.media.C3600n4 r6, com.inmobi.media.C3575m4 r7) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(com.inmobi.media.n4, com.inmobi.media.m4):com.inmobi.media.p4");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Ne r7, java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.inmobi.media.Ah
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.Ah r0 = (com.inmobi.media.Ah) r0
            int r1 = r0.f25169e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25169e = r1
            goto L18
        L13:
            com.inmobi.media.Ah r0 = new com.inmobi.media.Ah
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f25167c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25169e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.ArrayList r7 = r0.f25166b
            java.util.List r8 = r0.f25165a
            kotlin.c.b(r9)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            goto L4e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.c.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0.f25165a = r8     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            r0.f25166b = r9     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            r0.f25169e = r4     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            java.lang.Object r7 = r7.a()     // Catch: java.lang.ClassCastException -> L73 org.json.JSONException -> L78
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r5 = r9
            r9 = r7
            r7 = r5
        L4e:
            com.inmobi.media.n4 r9 = (com.inmobi.media.C3600n4) r9     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            if (r9 == 0) goto L6b
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
        L56:
            boolean r1 = r0.hasNext()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            com.inmobi.media.m4 r1 = (com.inmobi.media.C3575m4) r1     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            com.inmobi.media.p4 r1 = r6.a(r9, r1)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            r7.add(r1)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            goto L56
        L6a:
            return r7
        L6b:
            org.json.JSONException r9 = new org.json.JSONException     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            java.lang.String r0 = "Error parsing config response"
            r9.<init>(r0)     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
            throw r9     // Catch: java.lang.ClassCastException -> L74 org.json.JSONException -> L79
        L73:
            r7 = r9
        L74:
            a(r8, r3)
            goto L7c
        L78:
            r7 = r9
        L79:
            a(r8, r3)
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(com.inmobi.media.Ne, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:28:0x00e7, B:39:0x012b], limit reached: 185 */
    /* JADX WARN: Path cross not found for [B:67:0x01f8, B:55:0x01bf], limit reached: 185 */
    /* JADX WARN: Path cross not found for [B:77:0x025f, B:79:0x0262], limit reached: 185 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0401 A[LOOP:4: B:131:0x03fb->B:133:0x0401, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026d  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x04b4 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:154:0x04d4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r27, java.lang.String r28, com.inmobi.media.core.config.models.RootConfig r29, java.util.List r30, fo.m r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 1259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, fo.m, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
