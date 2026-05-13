package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn.p;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements p<SerialDescriptor, Integer, Boolean> {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).e(serialDescriptor, i10));
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Boolean mo2invoke(SerialDescriptor serialDescriptor, Integer num) {
        return invoke(serialDescriptor, num.intValue());
    }
}
