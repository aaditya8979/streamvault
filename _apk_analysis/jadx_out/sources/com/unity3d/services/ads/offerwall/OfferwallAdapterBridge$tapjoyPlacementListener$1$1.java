package com.unity3d.services.ads.offerwall;

import bn.r;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import go.k;
import hn.c;
import java.util.HashMap;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: OfferwallAdapterBridge.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {77, 83}, m = "invokeSuspend")
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ boolean $placementAvailable;
    public final /* synthetic */ String $placementName;
    public int label;
    public final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, c<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$1> cVar) {
        super(2, cVar);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super r> cVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            if (this.$placementAvailable) {
                k kVar = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent = OfferwallEvent.REQUEST_SUCCESS;
                String str = this.$placementName;
                OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str == null ? "" : str, null, null, 12, null);
                this.label = 1;
                if (kVar.emit(offerwallEventData, this) == objG) {
                    return objG;
                }
            } else {
                HashMap map = this.this$0.placementsMap;
                String str2 = this.$placementName;
                if (str2 == null) {
                    str2 = "";
                }
                map.remove(str2);
                k kVar2 = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent2 = OfferwallEvent.REQUEST_FAILED;
                String str3 = this.$placementName;
                OfferwallEventData offerwallEventData2 = new OfferwallEventData(offerwallEvent2, str3 == null ? "" : str3, null, null, 12, null);
                this.label = 2;
                if (kVar2.emit(offerwallEventData2, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
