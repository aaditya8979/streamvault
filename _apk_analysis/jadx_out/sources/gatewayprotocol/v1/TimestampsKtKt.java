package gatewayprotocol.v1;

import bn.r;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: TimestampsKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TimestampsKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializetimestamps, reason: not valid java name */
    public static final TimestampsOuterClass.Timestamps m7521initializetimestamps(@NotNull l<? super TimestampsKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builderNewBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final TimestampsOuterClass.Timestamps copy(@NotNull TimestampsOuterClass.Timestamps timestamps, @NotNull l<? super TimestampsKt.Dsl, r> lVar) {
        p.k(timestamps, "<this>");
        p.k(lVar, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builder = timestamps.toBuilder();
        p.j(builder, "this.toBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final Timestamp getTimestampOrNull(@NotNull TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        p.k(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
