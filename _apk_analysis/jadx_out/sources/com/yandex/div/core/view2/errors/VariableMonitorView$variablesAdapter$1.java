package com.yandex.div.core.view2.errors;

import bn.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.q;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class VariableMonitorView$variablesAdapter$1 extends FunctionReferenceImpl implements q<String, String, String, r> {
    public VariableMonitorView$variablesAdapter$1(Object obj) {
        super(3, obj, VariableMonitor.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // sn.q
    public /* bridge */ /* synthetic */ r invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ((VariableMonitor) this.receiver).mutateVariable(str, str2, str3);
    }
}
