package com.unity3d.ads.core.domain.scar;

import bn.r;
import cn.f0;
import cn.w0;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import go.f;
import go.k;
import go.p;
import go.q;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;

/* JADX INFO: compiled from: CommonScarEventReceiver.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonScarEventReceiver implements IEventSender {

    @NotNull
    private final k<GmaEventData> _gmaEventFlow;

    @NotNull
    private final k<String> _versionFlow;

    @NotNull
    private final p<GmaEventData> gmaEventFlow;

    @NotNull
    private final l0 scope;

    @NotNull
    private final p<String> versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonScarEventReceiver.kt */
    @d(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, c<? super r>, Object> {
        public final /* synthetic */ Enum<?> $eventId;
        public final /* synthetic */ Object[] $params;
        public int label;
        public final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r12, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$eventId = r12;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CommonScarEventReceiver(@NotNull l0 l0Var) {
        tn.p.k(l0Var, "scope");
        this.scope = l0Var;
        k<String> kVarB = q.b(0, 0, null, 7, null);
        this._versionFlow = kVarB;
        this.versionFlow = f.b(kVarB);
        k<GmaEventData> kVarB2 = q.b(0, 0, null, 7, null);
        this._gmaEventFlow = kVarB2;
        this.gmaEventFlow = f.b(kVarB2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    @NotNull
    public final p<GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    @NotNull
    public final p<String> getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(@NotNull Enum<?> r11, @NotNull Enum<?> r12, @NotNull Object... objArr) {
        tn.p.k(r11, "eventCategory");
        tn.p.k(r12, "eventId");
        tn.p.k(objArr, "params");
        if (!f0.i0(w0.j(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), r11)) {
            return false;
        }
        i.d(this.scope, null, null, new AnonymousClass1(r12, objArr, this, null), 3, null);
        return true;
    }
}
