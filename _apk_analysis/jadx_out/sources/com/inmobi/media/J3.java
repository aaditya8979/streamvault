package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class J3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K3 f25680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f25681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3592ml f25682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f25683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K3 f25685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(K3 k32, ArrayList arrayList, hn.c cVar) {
        super(2, cVar);
        this.f25685f = k32;
        this.f25686g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new J3(this.f25685f, this.f25686g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new J3(this.f25685f, this.f25686g, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c A[Catch: cc -> 0x00c4, IllegalArgumentException -> 0x00cc, TryCatch #5 {cc -> 0x00c4, IllegalArgumentException -> 0x00cc, blocks: (B:28:0x008e, B:30:0x009c, B:31:0x00b0), top: B:55:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0052 -> B:21:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:55:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f8 -> B:21:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fa -> B:21:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:37:0x00d4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.J3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
