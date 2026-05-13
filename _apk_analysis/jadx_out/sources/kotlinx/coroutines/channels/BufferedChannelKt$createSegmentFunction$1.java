package kotlinx.coroutines.channels;

import fo.h;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.p;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements p<Long, h<E>, h<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    public final h<E> invoke(long j10, h<E> hVar) {
        return BufferedChannelKt.x(j10, hVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(Long l10, Object obj) {
        return invoke(l10.longValue(), (h) obj);
    }
}
