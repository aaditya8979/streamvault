package com.inmobi.unifiedId;

import androidx.annotation.VisibleForTesting;
import bn.r;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.A9;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.I9;
import com.inmobi.media.Ji;
import com.inmobi.media.Jk;
import com.inmobi.media.K9;
import com.inmobi.media.Ok;
import hn.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import mo.a;
import mo.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000do.i;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f28676a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28677b = g.b(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, c cVar) {
        p.j("InMobiUnifiedIdService", "TAG");
        JSONObject jSONObjectB = F9.b();
        if (!Ok.b(jSONObjectB) && jSONObjectB != null && Ok.c(jSONObjectB)) {
            Object objA = Jk.a(inMobiUnifiedIdInterface, cVar);
            return objA == in.a.g() ? objA : r.f5635a;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!Ok.b(jSONObjectB)) {
                Ok.a(inMobiUnifiedIdInterface, jSONObjectB, null);
            } else {
                if (f28676a.get()) {
                    Object objA2 = Jk.a(inMobiUnifiedIdInterface, cVar);
                    return objA2 == in.a.g() ? objA2 : r.f5635a;
                }
                Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r9, hn.c r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUserDataModel, hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$resetInternal(hn.c r7) {
        /*
            boolean r0 = r7 instanceof com.inmobi.media.L9
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.L9 r0 = (com.inmobi.media.L9) r0
            int r1 = r0.f25862b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25862b = r1
            goto L18
        L13:
            com.inmobi.media.L9 r0 = new com.inmobi.media.L9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25861a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25862b
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.c.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.c.b(r7)
            goto L52
        L3a:
            kotlin.c.b(r7)
            java.lang.String r7 = "InMobiUnifiedIdService"
            java.lang.String r2 = "TAG"
            tn.p.j(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.unifiedId.InMobiUnifiedIdService.f28676a
            r7.set(r5)
            r0.f25862b = r4
            java.lang.Object r7 = com.inmobi.media.C3274a7.a(r6, r0)
            if (r7 != r1) goto L52
            goto L6c
        L52:
            com.inmobi.media.Jk r7 = com.inmobi.media.Jk.f25756a
            r0.f25862b = r3
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.f25757b
            com.inmobi.media.Ik r2 = new com.inmobi.media.Ik
            r2.<init>(r6)
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            java.lang.Object r0 = in.a.g()
            if (r7 != r0) goto L68
            goto L6a
        L68:
            bn.r r7 = bn.r.f5635a
        L6a:
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.inmobi.media.F9.b(r6)
            com.inmobi.media.F9.a(r6)
            com.inmobi.media.F9.f25424d = r5
            com.inmobi.media.F9.f25423c = r5
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(hn.c):java.lang.Object");
    }

    public static final void fetchUnifiedIds(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        p.j("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            i.d(A9.f25147c, null, null, new G9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            p.j("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012c, code lost:
    
        if (a(r12, r0) == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(@org.jetbrains.annotations.Nullable com.inmobi.unifiedId.InMobiUnifiedIdInterface r12, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface, hn.c):java.lang.Object");
    }

    @VisibleForTesting(otherwise = 5)
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final void push(@Nullable InMobiUserDataModel inMobiUserDataModel) {
        p.j("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (Ji.d()) {
            i.d(A9.f25147c, null, null, new I9(inMobiUserDataModel, null), 3, null);
        } else {
            p.j("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        p.j("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            i.d(A9.f25147c, null, null, new K9(null), 3, null);
        } else {
            p.j("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return f28676a;
    }
}
