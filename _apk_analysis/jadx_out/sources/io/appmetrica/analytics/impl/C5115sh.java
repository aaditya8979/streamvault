package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5115sh implements InterfaceC5072qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4907k9 f67676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5190vh f67677b;

    public C5115sh(C5190vh c5190vh, C4907k9 c4907k9) {
        this.f67677b = c5190vh;
        this.f67676a = c4907k9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5072qn
    public final void a(Object obj) {
        List list = (List) obj;
        C4907k9 c4907k9 = this.f67676a;
        if (mo.a((Collection) list)) {
            return;
        }
        c4907k9.f67106d = new C4856i9[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4893jl c4893jl = (C4893jl) list.get(i10);
            C4856i9[] c4856i9Arr = c4907k9.f67106d;
            Map map = Qf.f65813a;
            C4856i9 c4856i9 = new C4856i9();
            Integer num = c4893jl.f67041a;
            if (num != null) {
                c4856i9.f66975a = num.intValue();
            }
            Integer num2 = c4893jl.f67042b;
            if (num2 != null) {
                c4856i9.f66976b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c4893jl.f67044d)) {
                c4856i9.f66977c = c4893jl.f67044d;
            }
            c4856i9.f66978d = c4893jl.f67043c;
            c4856i9Arr[i10] = c4856i9;
            this.f67677b.f67842g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c4907k9.f67106d[i10]);
            this.f67677b.f67842g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
